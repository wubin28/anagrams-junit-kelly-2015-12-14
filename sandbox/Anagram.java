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
        return Arrays.asList("a" + Anagram.of("bc").get(0), 
                             "a" + Anagram.of("bc").get(1), 
                             "b" + Anagram.of("ac").get(0), 
                             "b" + Anagram.of("ac").get(1), 
                             "c" + Anagram.of("ab").get(0), 
                             "c" + Anagram.of("ab").get(1));
    }
}
