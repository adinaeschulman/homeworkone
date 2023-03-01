import java.util.ArrayList;
import java.util.Arrays;

public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();
    public static void sortSeasonable(Comparable[] seasonables)
    {
        Arrays.sort(seasonables);
    }
    static String reportAll(Seasonable[] seasonables) {
        String all="";
        for (Seasonable elem: seasonables)
        {
            all+=elem.toString();
            all+='\n';
        }
        return all.trim();
    }
}
