package edument.perl6idea.module;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.openapi.Disposable;
import com.intellij.ui.components.JBList;
import com.intellij.ui.components.JBPanel;
import com.intellij.ui.components.JBScrollPane;
import edument.perl6idea.utils.Perl6ProjectType;

import javax.swing.*;

class Perl6TypeWizardStep extends ModuleWizardStep implements Disposable {
    private JList<String> myList;
    private JPanel myPanel;
    private final Perl6ModuleBuilder builder;

    Perl6TypeWizardStep(Perl6ModuleBuilder builder) {
        this.builder = builder;
        DefaultListModel<String> types = new DefaultListModel<>();
        types.addElement(Perl6ProjectType.toTypeLabel(Perl6ProjectType.PERL6_SCRIPT));
        types.addElement(Perl6ProjectType.toTypeLabel(Perl6ProjectType.PERL6_MODULE));
        types.addElement(Perl6ProjectType.toTypeLabel(Perl6ProjectType.PERL6_APPLICATION));
        myList = new JBList<>(types);
        myList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        myList.setSelectedIndex(0);
        myList.setVisibleRowCount(3);
        JScrollPane scrollPane = new JBScrollPane(myList);
        myPanel = new JBPanel<>();
        myPanel.add(scrollPane);
        myList.addListSelectionListener(e -> {
            if (e.getValueIsAdjusting()) return;
            builder.setType(Perl6ProjectType.fromTypeLabel(getSelectedType()));
        });
    }

    @Override
    public JComponent getComponent() {
        return myPanel;
    }

    @Override
    public void updateDataModel() {
        String selectedType = getSelectedType();
        builder.setType((Perl6ProjectType.fromTypeLabel(selectedType)));
    }

    private String getSelectedType() {
        return myList.getSelectedValue();
    }

    @Override
    public void dispose() {
    }
}
