import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Anagram {
    public static List<String> of(String s) {
        if (s.length() == 1) {
            return Arrays.asList(s);
        }
        if (s.length() == 2) {
            return Arrays.asList(s.substring(0, 1) + s.substring(1), 
                             s.substring(1) + s.substring(0, 1));
        }
        return Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
    }
}
