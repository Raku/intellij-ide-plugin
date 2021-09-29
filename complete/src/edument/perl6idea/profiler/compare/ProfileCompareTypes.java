package edument.perl6idea.profiler.compare;

import com.intellij.openapi.util.Pair;
import com.intellij.util.containers.ContainerUtil;
import edument.perl6idea.utils.Perl6Utils;
import org.jetbrains.annotations.NotNull;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ProfileCompareTypes extends ProfileCompareDataProvider {
    private final static String sql;

    static {
        sql = Perl6Utils.getResourceAsString("sql/compare-profiler-types-results.sql");
    }

    private final Statement stmt;

    public ProfileCompareTypes(Statement stmt) {
        this.stmt = stmt;
    }

    public void addTabs(ProfileCompareProcessor.ProfileCompareResults results) {
        results.addTab(new ProfileCompareTab("Allocations", TAB_ALLOCS, this, ByNameCompareFormatter.SINGLE_NAME));
        results.addTab(new ProfileCompareTab("Deallocations", TAB_DEALLOCS, this, ByNameCompareFormatter.SINGLE_NAME));
    }

    private static String[] METRICS = new String[]{
        "spesh",
        "jit",
        "count",
        "replaced",
        "nursery_fresh",
        "nursery_seen",
        "gen2",
        "num_gcs"
    };

    // ???
    public static final List<Pair<String, String>> TAB_ALLOCS = ContainerUtil.immutableList(
        //Pair.create("Optimized by Spesh", "spesh"),
        //Pair.create("JIT", "jit"),
        Pair.create("Count", "count"),
        Pair.create("Optimized Away", "replaced")
    );

    public static final List<Pair<String, String>> TAB_DEALLOCS = ContainerUtil.immutableList(
        Pair.create("Nursery: Fresh", "nursery_fresh"),
        Pair.create("Nursery: Seen", "nursery_seen"),
        Pair.create("Reached old generation", "gen2"),
        Pair.create("GC cycles with that type", "num_gcs")
    );

    @Override
    @NotNull
    public List<ProfileCompareProcessor.ProfileCompareRow> getRows() throws SQLException {
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<ProfileCompareProcessor.ProfileCompareRow> results = new ArrayList<>();
        while (rs.next()) {
            HashMap<String, ProfileCompareProcessor.ProfileMetricValue> metrics = new HashMap<>();
            for (String metric : METRICS) {
                metrics.put(metric, new ProfileCompareProcessor.ProfileMetricValue(rs.getInt("c1_" + metric), rs.getInt("c2_" + metric)));
            }

          results.add(new ProfileCompareProcessor.ProfileCompareRow(rs.getString("name"), "", metrics));
        }
        rs.close();
        return results;
    }
}
