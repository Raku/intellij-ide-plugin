package edument.perl6idea.refactoring;

import com.intellij.lang.ContextAwareActionHandler;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogBuilder;
import com.intellij.openapi.util.Pass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiReference;
import com.intellij.psi.search.PsiElementProcessor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.refactoring.IntroduceTargetChooser;
import com.intellij.refactoring.RefactoringActionHandler;
import com.intellij.refactoring.util.CommonRefactoringUtil;
import com.intellij.util.Function;
import com.intellij.util.containers.ContainerUtil;
import edument.perl6idea.psi.*;
import edument.perl6idea.psi.external.ExternalPerl6RoutineDecl;
import edument.perl6idea.psi.symbols.Perl6Symbol;
import edument.perl6idea.psi.symbols.Perl6SymbolKind;
import edument.perl6idea.utils.Perl6PsiUtil;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static edument.perl6idea.psi.Perl6ElementFactory.createNamedCodeBlock;

public class Perl6ExtractCodeBlockHandler implements RefactoringActionHandler, ContextAwareActionHandler {
    private static final String TITLE = "Code Block Extraction";
    private static final List<String> packageTypesWithMethods = new ArrayList<>(
            Arrays.asList("class", "role", "grammar", "monitor"));
    protected Perl6CodeBlockType myCodeBlockType;
    private List<Perl6StatementList> myScopes;
    private boolean selfIsPassed = false;
    protected boolean isExpr = false;
    public static final Pattern REGEX_DRIVEN_VARIABLES_PATTERN = Pattern.compile("^\\$\\d+$");

    public Perl6ExtractCodeBlockHandler(Perl6CodeBlockType type) {
        myCodeBlockType = type;
    }

    @Override
    public void invoke(@NotNull Project project, @NotNull PsiElement[] elements, DataContext dataContext) {
    }

    @Override
    public void invoke(@NotNull Project project, Editor editor, PsiFile file, DataContext dataContext) {
        PsiElement[] elementsToExtract = getElementsToExtract(file, editor);
        invokeWithStatements(project, editor, file, elementsToExtract);
    }

    protected void invokeWithStatements(@NotNull Project project, Editor editor, PsiFile file, PsiElement[] elementsToExtract) {
        if (elementsToExtract.length == 0)
            return;

        // Gets a parent scope for new block according to callback-based API
        myScopes = getPossibleScopes(elementsToExtract);
        myScopes = handleZeroScopes(project, editor, elementsToExtract);
        if (myScopes.size() == 0) {
            reportError(project, editor, "Cannot extract selected statements as there are no possible scopes present");
            return;
        }
        if (myScopes.size() == 1) {
            invokeWithScope(project, editor, myScopes.get(0), elementsToExtract);
        }
        else {
            IntroduceTargetChooser.showChooser(editor, myScopes, new Pass<>() {
                @Override
                public void pass(Perl6StatementList scope) {
                    invokeWithScope(project, editor, scope, elementsToExtract);
                }
            }, Perl6BlockRenderer::renderBlock, "Select creation scope");
        }
    }

    private List<Perl6StatementList> handleZeroScopes(@NotNull Project project,
                                     Editor editor,
                                     PsiElement[] elements) {
        if (myScopes.size() == 0) {
            if (myCodeBlockType == Perl6CodeBlockType.ROUTINE) {
                reportError(project, editor, "Cannot extract selected statements as there are no possible scopes present");
                return new ArrayList<>();
            }
            else {
                // In case if user mis-typed, offer to create a sub instead
                DialogBuilder builder = new DialogBuilder();
                builder.setTitle("Extract Subroutine?");
                // FIXME A better presentation here is needed
                builder.setCenterPanel(new JLabel("It is impossible to extract a method using selected statements. Would you like to extract a subroutine instead?"));
                if (builder.showAndGet()) {
                    myCodeBlockType = Perl6CodeBlockType.ROUTINE;
                    return getPossibleScopes(elements);
                }
            }
        }
        return myScopes;
    }

    protected void invokeWithScope(@NotNull Project project,
                                   Editor editor,
                                   Perl6StatementList parentToCreateAt,
                                   PsiElement[] elements) {
        if (checkElementsSanity(project, editor, parentToCreateAt, elements)) return;
        if (checkMethodSanity(project, editor, parentToCreateAt)) return;

        /* Anchor represents an element, that will be a next to created one or null,
         * if no such anchor is possible, e.g. when a method is added after last one in a class */
        PsiElement anchor = getAnchor(parentToCreateAt, elements);

        NewCodeBlockData newCodeBlockData = getNewBlockData(project, parentToCreateAt, elements);
        // If user cancelled action or exception occurred
        if (newCodeBlockData == null) return;
        List<String> contents = Arrays.stream(elements).map(PsiElement::getText).collect(Collectors.toList());
        PsiElement newBlock = createNewBlock(project, newCodeBlockData, contents);
        insertNewCodeBlock(project, parentToCreateAt, newBlock, anchor);
        replaceStatementsWithCall(project, newCodeBlockData, parentToCreateAt, elements);
    }

    private static boolean checkElementsSanity(@NotNull Project project, Editor editor, PsiElement parentScope, PsiElement[] elements) {
        if (elements.length == 0 || parentScope == null) {
            reportError(project, editor, "Cannot extract code");
            return true;
        }
        return false;
    }

    private boolean checkMethodSanity(@NotNull Project project, Editor editor, PsiElement parentScope) {
        // Check if method outside of class creation
        if (myCodeBlockType == Perl6CodeBlockType.METHOD || myCodeBlockType == Perl6CodeBlockType.PRIVATEMETHOD) {
            PsiElement wrapper = PsiTreeUtil.getParentOfType(parentScope,
                    Perl6File.class, Perl6RoutineDecl.class, Perl6PackageDecl.class);
            if (wrapper instanceof Perl6PackageDecl) {
                String scopeKind = ((Perl6PackageDecl) wrapper).getPackageKind();
                if (!packageTypesWithMethods.contains(scopeKind)) {
                    reportError(project, editor, "Cannot extract a method into " + scopeKind);
                    return true;
                }
            } else {
                reportError(project, editor, "Cannot extract a method outside of a class, a monitor, a grammar or a role");
                return true;
            }

        }
        return false;
    }

    protected PsiElement[] getElementsToExtract(PsiFile file, Editor editor) {
        if (editor.getSelectionModel().hasSelection()) {
            return getElementsFromSelection(file, editor);
        } else {
            return getElementsFromCaret(file, editor);
        }
    }

    private PsiElement[] getElementsFromSelection(PsiFile file, Editor editor) {
        SelectionModel selectionModel = editor.getSelectionModel();
        PsiElement startLeaf = file.findElementAt(selectionModel.getSelectionStart());
        PsiElement endLeaf = file.findElementAt(selectionModel.getSelectionEnd() - 1);
        PsiElement start = PsiTreeUtil.getNonStrictParentOfType(Perl6PsiUtil.skipSpaces(startLeaf, true), Perl6Statement.class, Perl6Heredoc.class);
        PsiElement end = PsiTreeUtil.getNonStrictParentOfType(Perl6PsiUtil.skipSpaces(endLeaf, false), Perl6Statement.class, Perl6Heredoc.class);

        if (start == null || end == null) {
            if (end != null) {
                return new PsiElement[]{end};
            }
            else if (start != null) {
                return new PsiElement[]{start};
            }
            else {
                return PsiElement.EMPTY_ARRAY;
            }
        }

        // If a single statement is selected, we want to offer
        // expressions too
        if (Objects.equals(start, end)) {
            // Leafs are never null if neither start and end is null
            assert startLeaf != null && endLeaf != null;
            PsiElement commonParent = PsiTreeUtil.findCommonParent(startLeaf, endLeaf);
            if (commonParent instanceof Perl6Statement)
                return new PsiElement[]{commonParent};
            return commonParent == null ? PsiElement.EMPTY_ARRAY : getExpressionsFromSelection(file, editor, commonParent, start);
        }

        if (PsiTreeUtil.isAncestor(start, end, true)) {
            return new PsiElement[]{start};
        }
        else if (PsiTreeUtil.isAncestor(end, start, true)) {
            return new PsiElement[]{end};
        }

        List<PsiElement> elements = new ArrayList<>();
        while (start != end) {
            elements.add(start);
            start = start.getNextSibling();
        }
        elements.add(end);
        return elements.toArray(PsiElement.EMPTY_ARRAY);
    }

    protected PsiElement[] getExpressionsFromSelection(PsiFile file, Editor editor, @NotNull PsiElement commonParent, PsiElement fullStatementBackup) {
        if (commonParent instanceof P6Extractable) {
            List<PsiElement> targets = getExpressionTargets(commonParent);
            IntroduceTargetChooser.showChooser(editor, targets, new Pass<>() {
                @Override
                public void pass(PsiElement element) {
                    isExpr = !(element instanceof Perl6Statement);
                    invokeWithStatements(element.getProject(), editor, file, new PsiElement[]{element});
                }
            }, PsiElement::getText, "Select expression to extract");
            return PsiElement.EMPTY_ARRAY;
        } else {
            return new PsiElement[]{fullStatementBackup};
        }
    }

    @NotNull
    protected static List<PsiElement> getExpressionTargets(@NotNull PsiElement commonParent) {
        List<PsiElement> targets = new ArrayList<>();
        if (commonParent.getParent() instanceof Perl6Statement) {
            targets.add(commonParent.getParent());
            return targets;
        }
        else {
            while (!(commonParent instanceof Perl6StatementList)) {
                if (commonParent instanceof P6Extractable && !(commonParent.getParent() instanceof Perl6Statement))
                    targets.add(commonParent);
                commonParent = commonParent.getParent();
            }
        }
        return filterOutFalsePositiveExtractee(targets);
    }

    @NotNull
    private static List<PsiElement> filterOutFalsePositiveExtractee(List<PsiElement> targets) {
        targets = ContainerUtil.filter(targets, target -> {
            if (target instanceof Perl6TypeName) {
                return !(target.getParent() instanceof Perl6Parameter) && !(target.getParent() instanceof Perl6ScopedDecl);
            } else if (target instanceof Perl6Variable) {
                return !(target.getParent() instanceof Perl6VariableDecl) && !(target.getParent() instanceof Perl6ParameterVariable);
            }
            return true;
        });
        return targets;
    }

    protected PsiElement[] getElementsFromCaret(PsiFile file, Editor editor) {
        int offset = editor.getCaretModel().getOffset();
        PsiElement element = file.findElementAt(offset);
        if (element == null) {
            return PsiElement.EMPTY_ARRAY;
        }
        List<PsiElement> targets = getExpressionTargets(element.getParent());
        if (targets.isEmpty())
            return PsiElement.EMPTY_ARRAY;
        IntroduceTargetChooser.showChooser(editor, targets, new Pass<>() {
            @Override
            public void pass(PsiElement element) {
                isExpr = !(element instanceof Perl6Statement);
                invokeWithStatements(element.getProject(), editor, file, new PsiElement[]{element});
            }
        }, PsiElement::getText, "Select Expression to Extract");
        return PsiElement.EMPTY_ARRAY;
    }

    protected List<Perl6StatementList> getPossibleScopes(PsiElement[] elements) {
        PsiElement commonParent = PsiTreeUtil.findCommonParent(elements);
        PsiElement list = PsiTreeUtil.getNonStrictParentOfType(commonParent, Perl6PsiScope.class);
        if (list == null) {
            return new ArrayList<>();
        }

        List<Perl6StatementList> scopes = new ArrayList<>();

        // Subroutine can be in any scope above, but methods are restricted
        if (myCodeBlockType != Perl6CodeBlockType.ROUTINE) {
            while (true) {
                Perl6PackageDecl methodScope = PsiTreeUtil.getParentOfType(list, Perl6PackageDecl.class);
                if (methodScope == null) break;
                String packageKind = methodScope.getPackageKind();
                if (packageTypesWithMethods.contains(packageKind)) {
                    Perl6StatementList newList = PsiTreeUtil.findChildOfType(methodScope, Perl6StatementList.class);
                    if (newList != null) {
                        scopes.add(newList);
                        list = methodScope;
                    } else {
                        break;
                    }
                } else {
                    list = methodScope;
                }
            }
        } else {
            while (list != null) {
                Perl6StatementList statementList = PsiTreeUtil.findChildOfType(list, Perl6StatementList.class);
                if (statementList == null) break;
                scopes.add(statementList);
                list = PsiTreeUtil.getParentOfType(list, Perl6PsiScope.class);
            }
        }
        return scopes;
    }

    protected PsiElement getAnchor(Perl6StatementList parentToCreateAt, PsiElement[] elements) {
        PsiElement commonParent = PsiTreeUtil.findCommonParent(elements);
        if (parentToCreateAt == commonParent) return elements[0];

        return PsiTreeUtil.findFirstParent(commonParent, e -> e.getParent() == parentToCreateAt);
    }

    protected NewCodeBlockData getNewBlockData(Project project, Perl6StatementList parentToCreateAt, PsiElement[] elements) {
        CompletableFuture<NewCodeBlockData> futureData = new CompletableFuture<>();
        ApplicationManager.getApplication().invokeAndWait(() -> {
            Perl6ExtractBlockDialog dialog = new Perl6ExtractBlockDialog(project, TITLE, myCodeBlockType, getCapturedVariables(parentToCreateAt, elements)) {
                @Override
                protected void doAction() {
                    NewCodeBlockData data = new NewCodeBlockData(
                            myCodeBlockType, getScope(),
                            getName(), getReturnType(),
                            getInputVariables()
                    );
                    data.containsExpression = isExpr;
                    data.wantsSemicolon = isExpr && elements.length == 1 && checkNeedsSemicolon(elements[0]);
                    futureData.complete(data);
                    closeOKAction();
                }

                @Override
                public void doCancelAction() {
                    futureData.complete(null);
                    close(1);
                }
            };
            dialog.show();
        });
        try {
            return futureData.get();
        }
        catch (InterruptedException|ExecutionException e) {
            return null;
        }
    }

    protected boolean checkNeedsSemicolon(PsiElement element) {
        Perl6Statement statement = PsiTreeUtil.getParentOfType(element, Perl6Statement.class);
        if (statement == null) return false; // won't happen, because we already checked isExpr in the caller
        return statement.getNextSibling() != null && element.getNextSibling() == null;
    }

    protected Perl6VariableData[] getCapturedVariables(Perl6StatementList parentToCreateAt, PsiElement[] elements) {
        List<Perl6VariableData> capturedVariables = new ArrayList<>();

        // Check self usage
        if (checkSelfUsage(elements, parentToCreateAt)) {
            selfIsPassed = true;
            capturedVariables.add(new Perl6VariableData("self", "$self", "", false, true));
        }

        // Check ordinary variables and attributes usage
        List<Perl6Variable> usedVariables = collectVariablesInStatements(elements);
        List<Perl6Variable> deduplicatedVars = new ArrayList<>();

        /*
        Here we need to de-duplicate collected variables
        As our most truthful check of declaration
        may result in null, we additionally check
        variable's name, so altogether it looks quite expensive,
        but considering that variable list rarely is too large and
        the refactoring call is not a hot operation, it is likely good enough
        */
        for (Perl6Variable var : usedVariables) {
            PsiReference ref = var.getReference();
            assert ref != null;
            PsiElement decl = ref.resolve();
            String name = var.getVariableName();

            boolean isDuplicate = false;
            for (Perl6Variable each : deduplicatedVars) {
                if (Objects.equals(each.getVariableName(), name)) {
                    PsiReference eachRef = each.getReference();
                    assert eachRef != null;
                    PsiElement eachDecl = eachRef.resolve();
                    if (Objects.equals(decl, eachDecl)) {
                        isDuplicate = true;
                    }
                }
            }
            if (!isDuplicate) {
                deduplicatedVars.add(var);
            }
        }

        for (Perl6Variable usedVariable : deduplicatedVars) {
            char twigil = Perl6Variable.getTwigil(usedVariable.getVariableName());
            if (REGEX_DRIVEN_VARIABLES_PATTERN.matcher(usedVariable.getVariableName()).matches()) {
                continue;
            }
            if (twigil != '!') {
                Perl6VariableData variableCapture = checkIfLexicalVariableCaptured(parentToCreateAt, elements, usedVariable);
                if (variableCapture != null)
                    capturedVariables.add(variableCapture);
            }
            else {
                if (checkIfAttributeCaptured(parentToCreateAt, elements)) {
                    String type = usedVariable.getVariableName().startsWith("$") ? usedVariable.inferType().nominalType().getName() : "";
                    capturedVariables.add(new Perl6VariableData(usedVariable.getVariableName(), usedVariable.getVariableName().replace("!", ""),
                                                                type, false, true));
                }
            }
        }

        // Check lexical subs usage
        for (Perl6SubCallName call : collectCallsInStatements(elements)) {
            if (checkIfLexicalSubCaptured(parentToCreateAt, elements, call)) {
                capturedVariables.add(new Perl6VariableData("&" + call.getCallName(), "", false, true));
            }
        }

        return capturedVariables.toArray(new Perl6VariableData[0]);
    }

    private static boolean checkIfLexicalSubCaptured(Perl6StatementList parentToCreateAt,
                                                     PsiElement[] elements,
                                                     Perl6SubCallName call) {
        // Here, we iterate each call found
        PsiReference ref = call.getReference();
        assert ref != null;
        PsiElement decl = ref.resolve();
        // Declaration that the call invokes
        // if there is no declaration, it's not local
        if (decl == null || decl instanceof ExternalPerl6RoutineDecl)
            return false;

        // If declared as one of the statements - skip this particular call name
        // as it will be still accessible after extraction anyway
        for (PsiElement statement : elements) {
            if (PsiTreeUtil.isAncestor(statement, decl, false))
                return false;
        }

        // Try to see if we have such routine accessible in new scope
        Perl6Symbol routineSymbol = parentToCreateAt.resolveLexicalSymbol(Perl6SymbolKind.Routine, call.getCallName());
        // If it is not or if it points to another routine with the same name, pass a lexical sub in
        return routineSymbol == null || routineSymbol.getPsi() == null || !call.getManager()
                                                                               .areElementsEquivalent(routineSymbol.getPsi(), decl);
    }

    private boolean checkIfAttributeCaptured(Perl6StatementList parentToCreateAt, PsiElement[] elements) {
        // We are checking if attribute has to be passed to a newly created block or not
        // Passing is *not* necessary if either:
        // * new block == lexical sub of the method in the same class
        PsiElement commonParentOfOriginalElements = PsiTreeUtil.getNonStrictParentOfType(PsiTreeUtil.findCommonParent(elements), Perl6PsiScope.class);
        PsiElement scopeToCreateAt = PsiTreeUtil.getParentOfType(parentToCreateAt, Perl6PsiScope.class);

        if (myCodeBlockType == Perl6CodeBlockType.ROUTINE) {
            while (true) {
                if (scopeToCreateAt instanceof Perl6RoutineDecl) {
                    if (((Perl6RoutineDecl) scopeToCreateAt).getRoutineKind().equals("method")) {
                        return false;
                    } else {
                        scopeToCreateAt = PsiTreeUtil.getNonStrictParentOfType(scopeToCreateAt, Perl6PsiScope.class);
                    }
                } else if (scopeToCreateAt instanceof Perl6PackageDecl) {
                    return true;
                } else {
                    if (scopeToCreateAt == null) break;
                    scopeToCreateAt = PsiTreeUtil.getNonStrictParentOfType(scopeToCreateAt, Perl6PsiScope.class);
                }
            }
        } else { // * new block == method in the same class
            // Class that surrounds created method
            Perl6PackageDecl outermostClassBody = PsiTreeUtil.getParentOfType(parentToCreateAt, Perl6PackageDecl.class);
            return !Objects.equals(PsiTreeUtil.getNonStrictParentOfType(commonParentOfOriginalElements, Perl6PackageDecl.class), outermostClassBody);
        }
        return true;
    }

    private boolean checkSelfUsage(PsiElement[] statements, Perl6StatementList parentToCreateAt) {
        boolean selfPresence = Arrays.stream(statements)
            .flatMap(el -> getUsages(el, Perl6Self.class, Perl6PackageDecl.class).stream())
            .map(el -> (Perl6Self)el).findAny().isPresent();
        if (!selfPresence) return false;
        // If self is present, we have to check if we are extracting stuff into new method of the same class
        // If we are extracting into a sub, just short-circuit as we always pass $self there
        if (myCodeBlockType == Perl6CodeBlockType.ROUTINE) return true;
        // otherwise check seriously:
        Perl6PackageDecl outerClassBody = PsiTreeUtil.getParentOfType(PsiTreeUtil.findCommonParent(statements), Perl6PackageDecl.class);
        Perl6PackageDecl outermostClassBody = PsiTreeUtil.getParentOfType(parentToCreateAt, Perl6PackageDecl.class);
        return !Objects.equals(outerClassBody, outermostClassBody);
    }

    private static Perl6VariableData checkIfLexicalVariableCaptured(Perl6StatementList parentToCreateAt, PsiElement[] statements, Perl6Variable usedVariable) {
        // First, check if the variable is defined locally in statements we are extracting
        PsiReference originalRef = usedVariable.getReference();
        assert originalRef != null;
        PsiElement usedVariableDeclaration = originalRef.resolve();
        if (usedVariableDeclaration != null) {
            for (PsiElement statement : statements) {
                if (PsiTreeUtil.isAncestor(statement, usedVariableDeclaration, true)) {
                    return null;
                }
            }
        }

        // We are checking whether a variable will be available from outer scope in scope where new block is created
        boolean isAvailableLexically = parentToCreateAt.resolveLexicalSymbol(Perl6SymbolKind.Variable, usedVariable.getVariableName()) != null;
        String type = usedVariable.getVariableName().startsWith("$") ? usedVariable.inferType().nominalType().getName() : "";
        return new Perl6VariableData(usedVariable.getVariableName(), type, isAvailableLexically, !isAvailableLexically);
    }

    private static List<Perl6SubCallName> collectCallsInStatements(PsiElement[] elements) {
        return Arrays.stream(elements)
                .flatMap(el -> PsiTreeUtil.findChildrenOfType(el, Perl6SubCallName.class).stream())
                .collect(Collectors.toList());
    }

    private static List<Perl6Variable> collectVariablesInStatements(PsiElement[] elements) {
        return Arrays.stream(elements)
                     .flatMap(el -> PsiTreeUtil.findChildrenOfType(el, Perl6Variable.class).stream())
                     .collect(Collectors.toList());
    }

    @NotNull
    private static Collection<PsiElement> getUsages(PsiElement statement, Class usageClazz, Class declClazz) {
        // It is an imitation of `getChildrenOfType` specialised for variables that avoids declarations
        // as we do have to differentiate between Perl6Variable used in an expression and
        // inside of a variable declaration
        if (statement == null) return ContainerUtil.emptyList();

        PsiElementProcessor.CollectElements<PsiElement> processor =
            new PsiElementProcessor.CollectElements<>() {
                @Override
                public boolean execute(@NotNull PsiElement each) {
                    if (usageClazz.isInstance(each)) {
                        return super.execute(each);
                    }
                    else if (declClazz.isInstance(each)) {
                        return false;
                    }
                    return true;
                }
            };
        PsiTreeUtil.processElements(statement, processor);
        return processor.getCollection();
    }

    protected PsiElement createNewBlock(Project project, NewCodeBlockData data, List<String> contents) {
        return postProcessVariables(project, data.variables, createNamedCodeBlock(project, data, contents));
    }

    private PsiElement postProcessVariables(Project project,
                                            Perl6VariableData[] variables,
                                            Perl6Statement block) {
        // Post-process references to self
        if (selfIsPassed)
            getUsages(block, Perl6Self.class, Perl6PackageDecl.class)
                    .forEach(el -> el.replace(Perl6ElementFactory.createVariable(project, "$self")));
        // Post-process variables that were renamed
        for (Perl6VariableData data : variables) {
            if (data.parameterName.equals(data.originalName))
                continue;
            renameVariableInBlock(project, block,
                                  (var) -> Objects.equals(var.getVariableName(), data.originalName),
                                  (var) -> data.parameterName);
        }
        return block;
    }

    private static void renameVariableInBlock(Project project,
                                              Perl6Statement block,
                                              Function<Perl6Variable, Boolean> check,
                                              Function<Perl6Variable, String> newName) {
        collectVariablesInStatements(new PsiElement[]{block})
            .stream().filter((var) -> check.fun(var))
            .forEach(var -> var.replace(
                Perl6ElementFactory.createVariable(
                    project,
                    newName.fun(var))));
    }

    protected void insertNewCodeBlock(Project project, PsiElement parent,
                                      PsiElement newBlock, PsiElement anchor) {
        WriteCommandAction.runWriteCommandAction(project, () -> {
            if (myCodeBlockType == Perl6CodeBlockType.ROUTINE) {
                parent.addBefore(newBlock, anchor);
            } else {
                parent.addAfter(newBlock, anchor);
            }
        });
    }

    protected void replaceStatementsWithCall(Project project, NewCodeBlockData data, PsiElement parentScope, PsiElement[] elements) {
        PsiElement call;
        if (data.type == Perl6CodeBlockType.ROUTINE) {
            call = CompletePerl6ElementFactory.createSubCall(parentScope.getProject(), data);
        } else {
            call = CompletePerl6ElementFactory.createMethodCall(parentScope.getProject(), data);
        }

        PsiElement finalCall = call;
        WriteCommandAction.runWriteCommandAction(project, () -> {
            PsiElement closestParent = elements[0].getParent();
            // Insert a call
            PsiElement newCall = closestParent.addBefore(finalCall, elements[elements.length - 1].getNextSibling());
            // Delete present statements
            closestParent.deleteChildRange(elements[0], elements[elements.length - 1]);
            if (data.wantsSemicolon) {
                Perl6Statement statement = PsiTreeUtil.getParentOfType(newCall, Perl6Statement.class);
                if (statement != null)
                    Perl6PsiUtil.terminateStatement(statement);
            }
        });
    }

    private static void reportError(Project project, Editor editor, String message) {
        CommonRefactoringUtil.showErrorHint(project, editor, message, TITLE, null);
    }

    @Override
    public boolean isAvailableForQuickList(@NotNull Editor editor, @NotNull PsiFile file, @NotNull DataContext dataContext) {
        return false;
    }
}
