package edument.perl6idea.refactoring;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.openapi.ui.ValidationInfo;
import com.intellij.psi.PsiElement;
import com.intellij.refactoring.ui.MethodSignatureComponent;
import com.intellij.refactoring.ui.RefactoringDialog;
import com.intellij.ui.DocumentAdapter;
import com.intellij.ui.JBColor;
import com.intellij.ui.SeparatorFactory;
import com.intellij.ui.ToolbarDecorator;
import com.intellij.ui.components.JBCheckBox;
import com.intellij.ui.table.JBTable;
import edument.perl6idea.filetypes.Perl6ScriptFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.Arrays;
import java.util.stream.Collectors;

import static edument.perl6idea.refactoring.Perl6ExtractBlockDialog.LEXICAL_SCOPE_COLUMN_INDEX;
import static edument.perl6idea.refactoring.Perl6ExtractBlockDialog.PASSED_AS_PARAMETER_COLUMN_INDEX;

public abstract class Perl6ExtractRegexDialog extends RefactoringDialog {
    private final Perl6VariableData[] myInputVariables;
    private final PsiElement[] myAtoms;
    private final boolean myLexical;
    private JTextField myNameField;
    private JComboBox<String> myTypeField;
    private JCheckBox myCaptureCheckField;
    private MethodSignatureComponent mySignature;

    protected Perl6ExtractRegexDialog(@NotNull Project project, Perl6VariableData[] inputVariables, PsiElement[] atoms, boolean isLexical) {
        super(project, true);
        myInputVariables = inputVariables;
        myAtoms = atoms;
        myNameField = new JTextField();
        myTypeField = new ComboBox<>(new String[]{"token", "regex", "rule"});
        myCaptureCheckField = new JBCheckBox();
        mySignature = new MethodSignatureComponent("", project, Perl6ScriptFileType.INSTANCE);
        mySignature.setMinimumSize(new Dimension(500, 160));
        myLexical = isLexical;
        init();
        update();
    }

    @Nullable
    @Override
    protected JComponent createNorthPanel() {
        final JPanel northPanel = new JPanel(new BorderLayout());

        // Type piece
        final JPanel typePanel = new JPanel(new BorderLayout(0, 2));
        final JLabel typeLabel = new JLabel("Type:");
        typePanel.add(typeLabel, BorderLayout.NORTH);
        typePanel.add(myTypeField, BorderLayout.SOUTH);
        typeLabel.setLabelFor(myTypeField);
        myTypeField.addItemListener(e -> update());
        northPanel.add(typePanel, BorderLayout.WEST);

        // Name piece
        final JPanel namePanel = new JPanel(new BorderLayout(0, 2));
        final JLabel nameLabel = new JLabel("Name:");
        namePanel.add(nameLabel, BorderLayout.NORTH);
        namePanel.add(myNameField, BorderLayout.SOUTH);
        nameLabel.setLabelFor(myNameField);
        myNameField.requestFocus();
        myNameField.getDocument().addDocumentListener(new DocumentAdapter() {
            @Override
            protected void textChanged(@NotNull DocumentEvent e) {
                update();
            }
        });
        northPanel.add(namePanel, BorderLayout.CENTER);

        // Return type piece
        final JPanel captureCheckPanel = new JPanel(new BorderLayout(0, 2));
        final JLabel captureCheckLabel = new JLabel("Capturing:");
        captureCheckPanel.add(captureCheckLabel, BorderLayout.NORTH);
        captureCheckPanel.add(myCaptureCheckField, BorderLayout.SOUTH);
        captureCheckLabel.setLabelFor(myCaptureCheckField);
        northPanel.add(captureCheckPanel, BorderLayout.EAST);

        return northPanel;
    }

    @Nullable
    @Override
    public JComponent getPreferredFocusedComponent() {
        return myNameField;
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel centerPanel = new JPanel(new BorderLayout());

        JPanel parametersTablePanel = new JPanel(new BorderLayout());
        parametersTablePanel.add(SeparatorFactory.createSeparator("Parameters", null), BorderLayout.NORTH);
        parametersTablePanel.add(createParametersPanel(), BorderLayout.CENTER);
        centerPanel.add(parametersTablePanel, BorderLayout.CENTER);

        final JPanel signaturePanel = new JPanel(new BorderLayout());
        signaturePanel.add(SeparatorFactory.createSeparator("Signature Preview", null), BorderLayout.NORTH);
        signaturePanel.add(mySignature, BorderLayout.CENTER);
        centerPanel.add(signaturePanel, BorderLayout.SOUTH);

        return centerPanel;
    }

    private JComponent createParametersPanel() {
        JTable table = new JBTable();
        Perl6ParameterTableModel parameterTableModel = new Perl6ParameterTableModel(myInputVariables, table) {
            @Override
            public void updateOwner() {
                update();
            }
        };
        table.setModel(parameterTableModel);
        table.getColumnModel().getColumn(LEXICAL_SCOPE_COLUMN_INDEX).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table,
                                                           Object value,
                                                           boolean isSelected,
                                                           boolean hasFocus,
                                                           int row,
                                                           int column) {
                Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (column == LEXICAL_SCOPE_COLUMN_INDEX && "NO".equals(value)) {
                    if (!(boolean)table.getModel().getValueAt(row, PASSED_AS_PARAMETER_COLUMN_INDEX))
                        comp.setForeground(JBColor.RED);
                }
                else {
                    comp.setForeground(JBColor.BLACK);
                }
                return comp;
            }
        });
        table.setFillsViewportHeight(true);
        return ToolbarDecorator.createDecorator(table).disableAddAction().disableRemoveAction().createPanel();
    }

    @Nullable
    @Override
    protected ValidationInfo doValidate() {
        if (getNewRegexName() != null && !getNewRegexName().isEmpty()) {
            return null;
        } else {
            return new ValidationInfo("Name is required", myNameField);
        }
    }

    private void update() {
        updateSignature();
    }

    private void updateSignature() {
        if (mySignature != null) {
            mySignature.setSignature(getSignature());
        }
    }

    private String getSignature() {
        String items = Arrays.stream(myAtoms).map(p -> p.getText()).collect(Collectors.joining(" "));
        String baseFormat = "%s%s %s%s { %s }";
        return String.format(
            baseFormat, myLexical ? "my " : "", getType().name().toLowerCase(),
            getNewRegexName(), getSignatureParameterBlock(), items);
    }

    public Perl6RegexPartType getType() {
        String type = (String)myTypeField.getSelectedItem();
        // Won't happen, but
        if (type == null)
            return Perl6RegexPartType.REGEX;
        else if (type.equals("regex"))
            return Perl6RegexPartType.REGEX;
        else if (type.equals("token"))
            return Perl6RegexPartType.TOKEN;
        else
            return Perl6RegexPartType.RULE;
    }

    public String getNewRegexName() {
        return myNameField.getText();
    }

    public boolean getCaptureStatus() {
        return myCaptureCheckField.isSelected();
    }

    protected String getSignatureParameterBlock() {
        String base = "";
        if (myInputVariables.length != 0)
            base += NewCodeBlockData.formSignature(myInputVariables, false);
        return base.isEmpty() ? "" : "(" + base + ")";
    }

    @NotNull
    @Override
    protected Action[] createActions() {
        return new Action[]{getOKAction(), getCancelAction()};
    }
}
