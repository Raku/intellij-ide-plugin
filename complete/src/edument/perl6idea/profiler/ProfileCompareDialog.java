package edument.perl6idea.profiler;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.AnimatedIcon;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.components.JBTabbedPane;
import com.intellij.ui.table.JBTable;
import edument.perl6idea.profiler.compare.ProfileCompareProcessor;
import edument.perl6idea.profiler.compare.ProfileCompareTab;
import edument.perl6idea.profiler.model.Perl6ProfileData;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class ProfileCompareDialog extends DialogWrapper {
    private final static Logger LOG = Logger.getInstance(ProfileCompareDialog.class);
    private final ProfileCompareProcessor.ProfileCompareResults myResults;

    public ProfileCompareDialog(Project project,
                                Perl6ProfileData[] profiles,
                                ProfileCompareProcessor.ProfileCompareResults results) {
        super(project, true);
        myResults = results;
        setTitle("Comparing " + profiles[0].getName() + " (A) with " + profiles[1].getName() + " (B)");
        init();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        final JBTabbedPane tabbedPane = new JBTabbedPane();
        List<ProfileCompareTab> tabs = myResults.getTabs();
        for (int i = 0; i < tabs.size(); i++) {
            ProfileCompareTab tab = tabs.get(i);
            final int _i = i;
            tabbedPane.insertTab(tab.tabName, null, new JBLabel("Loading", AnimatedIcon.Default.INSTANCE, SwingConstants.LEFT), null, i);
            tab.onDataReady(data -> {
                LOG.info("Data loaded! #" + _i + " (" + tab.dataProvider.getClass().getName() + ")");
                JBTable table = new JBTable(new DefaultTableModel(data, tab.getTableColumns()));
                table.setDefaultEditor(Object.class, null);
                table.setAutoCreateRowSorter(true);
                ApplicationManager.getApplication().invokeLater(() -> {
                    LOG.info("Data loaded later... #" + _i + " (" + tab.dataProvider.getClass().getName() + ")");
                    tabbedPane.setComponentAt(_i, new JBScrollPane(table));
                }, ModalityState.any());
            });
        }

        tabbedPane.setPreferredSize(new Dimension(600, 800));
        return tabbedPane;
    }
}
