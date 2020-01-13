package edument.perl6idea.project.structure;

import com.intellij.ide.DataManager;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectBundle;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.SdkType;
import com.intellij.openapi.projectRoots.SdkTypeId;
import com.intellij.openapi.roots.ui.OrderEntryAppearanceService;
import com.intellij.openapi.roots.ui.configuration.JdkComboBox;
import com.intellij.openapi.roots.ui.configuration.ProjectStructureConfigurable;
import com.intellij.openapi.roots.ui.configuration.projectRoot.JdkListConfigurable;
import com.intellij.openapi.roots.ui.configuration.projectRoot.ProjectSdksModel;
import com.intellij.openapi.ui.ComboBoxWithWidePopup;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.util.Computable;
import com.intellij.openapi.util.Condition;
import com.intellij.openapi.util.Conditions;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.ui.ColoredListCellRenderer;
import com.intellij.ui.ScreenUtil;
import com.intellij.ui.SimpleTextAttributes;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.util.ui.EmptyIcon;
import com.intellij.util.ui.JBUI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Collection;

public class Perl6JdkComboBox extends ComboBoxWithWidePopup<Perl6JdkComboBox.JdkComboBoxItem> {
    private static final Icon EMPTY_ICON = JBUI.scale(EmptyIcon.create(1, 16));

    @Nullable
    private final Condition<Sdk> myFilter;
    @Nullable
    private final Condition<? super SdkTypeId> myCreationFilter;
    private JButton mySetUpButton;
    private final Condition<SdkTypeId> mySdkTypeFilter;

    public Perl6JdkComboBox(@NotNull final ProjectSdksModel jdkModel) {
        this(jdkModel, null);
    }

    public Perl6JdkComboBox(@NotNull final ProjectSdksModel jdkModel,
                            @Nullable Condition<SdkTypeId> filter) {
        this(jdkModel, filter, getSdkFilter(filter), filter, false);
    }

    public Perl6JdkComboBox(@NotNull final ProjectSdksModel jdkModel,
                            @Nullable Condition<SdkTypeId> sdkTypeFilter,
                            @Nullable Condition<Sdk> filter,
                            @Nullable Condition<? super SdkTypeId> creationFilter,
                            boolean addSuggestedItems) {
        super(new JdkComboBoxModel(jdkModel, sdkTypeFilter, filter, addSuggestedItems));
        myFilter = filter;
        mySdkTypeFilter = sdkTypeFilter;
        myCreationFilter = creationFilter;
        setRenderer(new ColoredListCellRenderer<JdkComboBoxItem>() {
            @Override
            protected void customizeCellRenderer(@NotNull JList<? extends JdkComboBoxItem> list,
                                                 JdkComboBoxItem value,
                                                 int index,
                                                 boolean selected,
                                                 boolean hasFocus) {

                if (Perl6JdkComboBox.this.isEnabled()) {
                    setIcon(EMPTY_ICON);    // to fix vertical size
                    if (value instanceof InvalidJdkComboBoxItem) {
                        final String str = value.toString();
                        append(str, SimpleTextAttributes.ERROR_ATTRIBUTES);
                    }
                    else if (value instanceof ProjectJdkComboBoxItem) {
                        final Sdk jdk = jdkModel.getProjectSdk();
                        if (jdk != null) {
                            setIcon(((SdkType)jdk.getSdkType()).getIcon());
                            append(ProjectBundle.message("project.roots.project.jdk.inherited"), SimpleTextAttributes.REGULAR_ATTRIBUTES);
                            append(" (" + jdk.getName() + ")", SimpleTextAttributes.GRAYED_ATTRIBUTES);
                        }
                        else {
                            final String str = value.toString();
                            append(str, SimpleTextAttributes.ERROR_ATTRIBUTES);
                        }
                    }
                    else if (value instanceof SuggestedJdkItem) {
                        SdkType type = ((SuggestedJdkItem)value).getSdkType();
                        String home = ((SuggestedJdkItem)value).getPath();
                        setIcon(type.getIconForAddAction());
                        String version = type.getVersionString(home);
                        append(version == null ? type.getPresentableName() : version);
                        append(" (" + home + ")", SimpleTextAttributes.GRAYED_ATTRIBUTES);
                    }
                    else if (value != null) {
                        OrderEntryAppearanceService.getInstance().forJdk(value.getJdk(), false, selected, true).customize(this);
                    }
                    else {
                        customizeCellRenderer(list, new NoneJdkComboBoxItem(), index, selected, hasFocus);
                    }
                }
            }
        });
    }

    @Override
    public Dimension getPreferredSize() {
        final Rectangle rec = ScreenUtil.getScreenRectangle(0, 0);
        final Dimension size = super.getPreferredSize();
        final int maxWidth = rec.width / 4;
        if (size.width > maxWidth) {
            size.width = maxWidth;
        }
        return size;
    }

    @Override
    public Dimension getMinimumSize() {
        final Dimension minSize = super.getMinimumSize();
        final Dimension prefSize = getPreferredSize();
        if (minSize.width > prefSize.width) {
            minSize.width = prefSize.width;
        }
        return minSize;
    }

    public void setSetupButton(final JButton setUpButton,
                               @Nullable final Project project,
                               final ProjectSdksModel jdksModel,
                               final JdkComboBox.NoneJdkComboBoxItem firstItem,
                               @Nullable final Condition<? super Sdk> additionalSetup,
                               final boolean moduleJdkSetup) {
        setSetupButton(setUpButton, project, jdksModel, firstItem, additionalSetup,
                       ProjectBundle.message("project.roots.set.up.jdk.title", moduleJdkSetup ? 1 : 2));
    }

    public void setSetupButton(final JButton setUpButton,
                               @Nullable final Project project,
                               final ProjectSdksModel jdksModel,
                               final JdkComboBox.NoneJdkComboBoxItem firstItem,
                               @Nullable final Condition<? super Sdk> additionalSetup,
                               final String actionGroupTitle) {

        mySetUpButton = setUpButton;
        mySetUpButton.addActionListener(e -> {
            DefaultActionGroup group = new DefaultActionGroup();
            jdksModel.createAddActions(group, this, getSelectedJdk(), jdk -> {
                if (project != null) {
                    final JdkListConfigurable configurable = JdkListConfigurable.getInstance(project);
                    configurable.addJdkNode(jdk, false);
                }
                reloadModel(new ActualJdkComboBoxItem(jdk), project);
                setSelectedJdk(jdk); //restore selection
                if (additionalSetup != null) {
                    if (additionalSetup.value(jdk)) { //leave old selection
                        setSelectedJdk(firstItem.getJdk());
                    }
                }
            }, myCreationFilter);
            final DataContext dataContext = DataManager.getInstance().getDataContext(this);
            if (group.getChildrenCount() > 1) {
                JBPopupFactory.getInstance()
                              .createActionGroupPopup(actionGroupTitle, group, dataContext, JBPopupFactory.ActionSelectionAid.MNEMONICS,
                                                      false)
                              .showUnderneathOf(setUpButton);
            }
            else {
                final AnActionEvent event =
                  new AnActionEvent(null, dataContext, ActionPlaces.UNKNOWN, new Presentation(""), ActionManager.getInstance(), 0);
                group.getChildren(event)[0].actionPerformed(event);
            }
        });
    }

    public void setEditButton(final JButton editButton, final Project project, final Computable<? extends Sdk> retrieveJDK) {
        editButton.addActionListener(e -> {
            final Sdk projectJdk = retrieveJDK.compute();
            if (projectJdk != null) {
                ProjectStructureConfigurable.getInstance(project).select(projectJdk, true);
            }
        });
        addActionListener(e -> {
            final JdkComboBoxItem selectedItem = getSelectedItem();
            if (selectedItem instanceof ProjectJdkComboBoxItem) {
                editButton.setEnabled(ProjectStructureConfigurable.getInstance(project).getProjectJdksModel().getProjectSdk() != null);
            }
            else {
                editButton
                  .setEnabled(!(selectedItem instanceof InvalidJdkComboBoxItem) && selectedItem != null && selectedItem.getJdk() != null);
            }
        });
    }

    @Override
    public JdkComboBoxItem getSelectedItem() {
        return (JdkComboBoxItem)super.getSelectedItem();
    }

    @Nullable
    public Sdk getSelectedJdk() {
        final JdkComboBoxItem selectedItem = getSelectedItem();
        return selectedItem != null ? selectedItem.getJdk() : null;
    }

    public void setSelectedJdk(Sdk jdk) {
        final int index = indexOf(jdk);
        if (index >= 0) {
            setSelectedIndex(index);
        }
    }

    public void setInvalidJdk(String name) {
        removeInvalidElement();
        addItem(new InvalidJdkComboBoxItem(name));
        setSelectedIndex(getModel().getSize() - 1);
    }

    private int indexOf(Sdk jdk) {
        final JdkComboBoxModel model = (JdkComboBoxModel)getModel();
        final int count = model.getSize();
        for (int idx = 0; idx < count; idx++) {
            final JdkComboBoxItem elementAt = model.getElementAt(idx);
            if (jdk == null) {
                if (elementAt instanceof NoneJdkComboBoxItem || elementAt instanceof ProjectJdkComboBoxItem) {
                    return idx;
                }
            }
            else {
                Sdk elementAtJdk = elementAt.getJdk();
                if (elementAtJdk != null && jdk.getName().equals(elementAtJdk.getName())) {
                    return idx;
                }
            }
        }
        return -1;
    }

    private void removeInvalidElement() {
        final JdkComboBoxModel model = (JdkComboBoxModel)getModel();
        final int count = model.getSize();
        for (int idx = 0; idx < count; idx++) {
            final JdkComboBoxItem elementAt = model.getElementAt(idx);
            if (elementAt instanceof InvalidJdkComboBoxItem) {
                removeItemAt(idx);
                break;
            }
        }
    }

    public void reloadModel(JdkComboBoxItem firstItem, @Nullable Project project) {
        final JdkComboBoxModel model = (JdkComboBoxModel)getModel();
        if (project == null) {
            model.addElement(firstItem);
            return;
        }
        model.reload(firstItem, Perl6ProjectStructureConfigurable.getInstance(project).getProjectSdkModel(), mySdkTypeFilter, myFilter, false);
    }

    private static class JdkComboBoxModel extends DefaultComboBoxModel<JdkComboBoxItem> {

        JdkComboBoxModel(@NotNull final ProjectSdksModel jdksModel, @Nullable Condition<SdkTypeId> sdkTypeFilter,
                         @Nullable Condition<Sdk> sdkFilter, boolean addSuggested) {
            reload(null, jdksModel, sdkTypeFilter, sdkFilter, addSuggested);
        }

        void reload(@Nullable final JdkComboBoxItem firstItem,
                    @NotNull final ProjectSdksModel jdksModel,
                    @Nullable Condition<SdkTypeId> sdkTypeFilter,
                    @Nullable Condition<Sdk> sdkFilter,
                    boolean addSuggested) {
            removeAllElements();
            if (firstItem != null) addElement(firstItem);

            Sdk[] jdks = sortSdks(jdksModel.getSdks());
            for (Sdk jdk : jdks) {
                if (sdkFilter == null || sdkFilter.value(jdk)) {
                    addElement(new ActualJdkComboBoxItem(jdk));
                }
            }
            if (addSuggested) {
                addSuggestedItems(sdkTypeFilter, jdks);
            }
        }

        @NotNull
        private static Sdk[] sortSdks(@NotNull final Sdk[] sdks) {
            Sdk[] clone = sdks.clone();
            Arrays.sort(clone, (sdk1, sdk2) -> {
                SdkType sdkType1 = (SdkType)sdk1.getSdkType();
                SdkType sdkType2 = (SdkType)sdk2.getSdkType();
                if (!sdkType1.getComparator().equals(sdkType2.getComparator())) {
                    return StringUtil
                      .compare(sdkType1.getPresentableName(), sdkType2.getPresentableName(), true);
                }
                return sdkType1.getComparator().compare(sdk1, sdk2);
            });
            return clone;
        }

        void addSuggestedItems(@Nullable Condition<SdkTypeId> sdkTypeFilter, Sdk[] jdks) {
            SdkType[] types = SdkType.getAllTypes();
            for (SdkType type : types) {
                if (sdkTypeFilter == null ||
                    sdkTypeFilter.value(type) && ContainerUtil.find(jdks, sdk -> sdk.getSdkType() == type) == null) {
                    Collection<String> paths = type.suggestHomePaths();
                    for (String path : paths) {
                        if (path != null && type.isValidSdkHome(path)) {
                            addElement(new SuggestedJdkItem(type, path));
                        }
                    }
                }
            }
        }
    }

    public static Condition<Sdk> getSdkFilter(@Nullable final Condition<? super SdkTypeId> filter) {
        return filter == null ? Conditions.alwaysTrue() : sdk -> filter.value(sdk.getSdkType());
    }

    public abstract static class JdkComboBoxItem {
        @Nullable
        public Sdk getJdk() {
            return null;
        }

        @Nullable
        public String getSdkName() {
            return null;
        }
    }

    public static class ActualJdkComboBoxItem extends JdkComboBoxItem {
        private final Sdk myJdk;

        public ActualJdkComboBoxItem(@NotNull Sdk jdk) {
            myJdk = jdk;
        }

        @Override
        public String toString() {
            return myJdk.getName();
        }

        @Nullable
        @Override
        public Sdk getJdk() {
            return myJdk;
        }

        @Nullable
        @Override
        public String getSdkName() {
            return myJdk.getName();
        }
    }

    public static class ProjectJdkComboBoxItem extends JdkComboBoxItem {
        public String toString() {
            return ProjectBundle.message("jdk.combo.box.project.item");
        }
    }

    public static class NoneJdkComboBoxItem extends JdkComboBoxItem {
        public String toString() {
            return ProjectBundle.message("jdk.combo.box.none.item");
        }
    }

    private static class InvalidJdkComboBoxItem extends JdkComboBoxItem {
        private final String mySdkName;

        InvalidJdkComboBoxItem(String name) {
            mySdkName = name;
        }

        @Override
        public String getSdkName() {
            return mySdkName;
        }

        public String toString() {
            return ProjectBundle.message("jdk.combo.box.invalid.item", mySdkName);
        }
    }

    public static class SuggestedJdkItem extends JdkComboBoxItem {
        private final SdkType mySdkType;
        private final String myPath;

        SuggestedJdkItem(@NotNull SdkType sdkType, @NotNull String path) {
            mySdkType = sdkType;
            myPath = path;
        }

        @NotNull
        public SdkType getSdkType() {
            return mySdkType;
        }

        @NotNull
        public String getPath() {
            return myPath;
        }

        @Override
        public String toString() {
            return myPath;
        }
    }
}
