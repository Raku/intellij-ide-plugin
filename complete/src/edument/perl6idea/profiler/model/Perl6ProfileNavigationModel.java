package edument.perl6idea.profiler.model;

import com.intellij.openapi.project.Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Perl6ProfileNavigationModel extends Perl6ProfileModel {
    protected int exclusiveSum;

    public Perl6ProfileNavigationModel(Project project, List<Perl6ProfileCall> calls) {
        super(project, calls);
        COLUMN_NAMES = new ArrayList<>(Arrays.asList("Name", "File", "Inclusive (μs)", "Exclusive (μs)", "Entries"));
        // Calculate exclusive time
        if (nodes.size() > 0) {
            exclusiveSum = nodes.get(0).getInclusiveTime();
        }
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Perl6ProfileCall profilerNode = nodes.get(row);
        switch (column) {
            case 0:
                return profilerNode.getName();
            case 1:
                return showRealFileNames
                       ? profilerNode.getOriginalFile()
                       : profilerNode.getFilename(myBaseProjectPath);
            case 2:
                return profilerNode.getInclusiveTime();
            case 3:
                return profilerNode.getExclusiveTime();
            default:
                return profilerNode.getEntriesCount();
        }
    }

    @Override
    public double getRatio(long value, int row, int column) {
        switch (column) {
            case 2:
            case 3:
                return value / (double)exclusiveSum;
            default:
                return value;
        }
    }
}
