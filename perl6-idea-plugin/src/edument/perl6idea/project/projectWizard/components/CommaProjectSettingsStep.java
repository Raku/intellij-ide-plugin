// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package edument.perl6idea.project.projectWizard.components;

import com.intellij.ide.util.projectWizard.*;
import com.intellij.openapi.components.StorageScheme;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.platform.templates.TemplateModuleBuilder;
import com.intellij.ui.HideableDecorator;
import com.intellij.ui.IdeBorderFactory;
import com.intellij.ui.components.JBLabel;
import com.intellij.util.ui.JBUI;
import edument.perl6idea.project.projectWizard.NewProjectNameLocationSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

import javax.swing.*;
import java.awt.*;

/**
 * @author Dmitry Avdeev
 */
public class CommaProjectSettingsStep extends ModuleWizardStep implements SettingsStep {

  private JPanel mySettingsPanel;

  private JPanel myExpertPlaceholder;
  private JPanel myExpertPanel;
  private final HideableDecorator myExpertDecorator;

  private final NamePathComponent myNamePathComponent;
  private final ProjectFormatPanel myFormatPanel;

  private JPanel myPanel;
  private ModuleNameLocationComponent myModuleNameLocationComponent;

  private final WizardContext myWizardContext;
  @Nullable
  private ModuleWizardStep mySettingsStep;

  public CommaProjectSettingsStep(WizardContext context) {
    myWizardContext = context;

    myFormatPanel = new ProjectFormatPanel();
    myNamePathComponent = NamePathComponent.initNamePathComponent(context);
    myNamePathComponent.setShouldBeAbsolute(true);
    JPanel modulePanel = getModulePanel();
    if (context.isCreatingNewProject()) {
      mySettingsPanel.add(myNamePathComponent, BorderLayout.NORTH);
      addExpertPanel(modulePanel);
    }
    else {
      mySettingsPanel.add(modulePanel, BorderLayout.NORTH);
    }
    myModuleNameLocationComponent.bindModuleSettings(myNamePathComponent);

    myExpertDecorator = new HideableDecorator(myExpertPlaceholder, "Mor&e Settings", false);
    myExpertPanel.setBorder(JBUI.Borders.empty(0, IdeBorderFactory.TITLED_BORDER_INDENT, 5, 0));
    myExpertDecorator.setContentComponent(myExpertPanel);

    if (myWizardContext.isCreatingNewProject()) {
      addProjectFormat(modulePanel);
    }
  }

  private JPanel getModulePanel() {
    return myModuleNameLocationComponent.getModulePanel();
  }

  private JTextField getNameComponent() {
    return myWizardContext.isCreatingNewProject() ? myNamePathComponent.getNameComponent() : myModuleNameLocationComponent.getModuleNameField();
  }

  private void addProjectFormat(JPanel panel) {
    addField("Project \u001bformat:", myFormatPanel.getStorageFormatComboBox(), panel);
  }

  @Override
  public String getHelpId() {
    return myWizardContext.isCreatingNewProject() ? "New_Project_Main_Settings" : "Add_Module_Main_Settings";
  }

  private void setupPanels() {
    ModuleBuilder moduleBuilder = (ModuleBuilder)myWizardContext.getProjectBuilder();
    restorePanel(myNamePathComponent, 4);
    restorePanel(getModulePanel(), myWizardContext.isCreatingNewProject() ? 8 : 6);
    restorePanel(myExpertPanel, myWizardContext.isCreatingNewProject() ? 1 : 0);
    mySettingsStep = moduleBuilder == null ? null : moduleBuilder.modifySettingsStep(this);

    myExpertPlaceholder.setVisible(!(moduleBuilder instanceof TemplateModuleBuilder) && myExpertPanel.getComponentCount() > 0);
    for (int i = 0; i < 6; i++) {
      getModulePanel().getComponent(i).setVisible(!(moduleBuilder instanceof EmptyModuleBuilder));
    }
    mySettingsPanel.revalidate();
    mySettingsPanel.repaint();
  }

  private static void restorePanel(JPanel component, int i) {
    while (component.getComponentCount() > i) {
      component.remove(component.getComponentCount() - 1);
    }
  }

  @Override
  public void updateStep() {
    myExpertDecorator.setOn(true);
    setupPanels();
  }

  @Override
  public boolean validate() throws ConfigurationException {
    if (myWizardContext.isCreatingNewProject()) {
      if (!myNamePathComponent.validateNameAndPath(myWizardContext, myFormatPanel.isDefault())) return false;
    }

    if (!myModuleNameLocationComponent.validate()) return false;

    if (mySettingsStep != null) {
      return mySettingsStep.validate();
    }
    return true;
  }

  @Override
  public JComponent getComponent() {
    return myPanel;
  }

  @Override
  public JComponent getPreferredFocusedComponent() {
    return getNameComponent();
  }

  @Override
  public void updateDataModel() {
    myWizardContext.setProjectName(myNamePathComponent.getNameValue());
    myWizardContext.setProjectFileDirectory(myNamePathComponent.getPath());
    myFormatPanel.updateData(myWizardContext);

    myModuleNameLocationComponent.updateDataModel();

    ProjectBuilder moduleBuilder = myWizardContext.getProjectBuilder();
    if (moduleBuilder instanceof TemplateModuleBuilder) {
      myWizardContext.setProjectStorageFormat(StorageScheme.DIRECTORY_BASED);
    }

    if (mySettingsStep != null) {
      mySettingsStep.updateDataModel();
    }
  }

  @Override
  public String getName() {
    return "Project Settings";
  }

  @Override
  public WizardContext getContext() {
    return myWizardContext;
  }

  @Override
  public void addSettingsField(@NotNull String label, @NotNull JComponent field) {
    JPanel panel = myWizardContext.isCreatingNewProject() ? myNamePathComponent : getModulePanel();
    addField(label, field, panel);
  }

  static void addField(String label, JComponent field, JPanel panel) {
    JLabel jLabel = new JBLabel(label);
    jLabel.setLabelFor(field);
    jLabel.setVerticalAlignment(SwingConstants.TOP);
    panel.add(jLabel, new GridBagConstraints(0, GridBagConstraints.RELATIVE, 1, 1, 0, 0, GridBagConstraints.WEST,
                                             GridBagConstraints.VERTICAL, JBUI.insets(5, 0, 5, 0), 4, 0));
    panel.add(field, new GridBagConstraints(1, GridBagConstraints.RELATIVE, 1, 1, 1.0, 0, GridBagConstraints.CENTER,
                                            GridBagConstraints.HORIZONTAL, JBUI.insetsBottom(5), 0, 0));
  }

  @Override
  public void addSettingsComponent(@NotNull JComponent component) {
    JPanel panel = myWizardContext.isCreatingNewProject() ? myNamePathComponent : getModulePanel();
    panel.add(component, new GridBagConstraints(0, GridBagConstraints.RELATIVE, 2, 1, 1.0, 0, GridBagConstraints.NORTHWEST,
                                                GridBagConstraints.HORIZONTAL, JBUI.emptyInsets(), 0, 0));
  }

  @Override
  public void addExpertPanel(@NotNull JComponent panel) {
    myExpertPanel.add(panel, new GridBagConstraints(0, GridBagConstraints.RELATIVE, 2, 1, 1.0, 0, GridBagConstraints.NORTHWEST,
                                                    GridBagConstraints.HORIZONTAL, JBUI.emptyInsets(), 0, 0));
  }

  @Override
  public void addExpertField(@NotNull String label, @NotNull JComponent field) {
    JPanel panel = myWizardContext.isCreatingNewProject() ? getModulePanel() : myExpertPanel;
    addField(label, field, panel);
  }

  @Override
  @NotNull
  public JTextField getModuleNameField() {
    return getNameComponent();
  }

  @Nullable
  @Override
  public ModuleNameLocationSettings getModuleNameLocationSettings() {
    return myWizardContext.isCreatingNewProject() ? new NewProjectNameLocationSettings(myNamePathComponent, myModuleNameLocationComponent)
                                                  : myModuleNameLocationComponent;
  }

  @TestOnly
  public void setPath(String path) {
    myNamePathComponent.setPath(path);
  }

  @TestOnly
  public void setNameValue(String name) {
    myNamePathComponent.setNameValue(name);
  }

  @TestOnly
  @Nullable
  public ModuleWizardStep getSettingsStep() {
    return mySettingsStep;
  }

  @Override
  public Icon getIcon() {
    return null;
  }

  private void createUIComponents() {
    myModuleNameLocationComponent = new ModuleNameLocationComponent(myWizardContext);
  }

  public void setModuleName(String moduleName) {
    myModuleNameLocationComponent.setModuleName(moduleName);
  }

  public void bindModuleSettings() {
    myModuleNameLocationComponent.bindModuleSettings(myNamePathComponent);
  }
}
