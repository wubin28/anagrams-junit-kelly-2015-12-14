import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Anagrams {
    public static List<String> of(String s) {
        if (s.length() == 1) {
            return Arrays.asList(s);
        }

        if (s.length() == 2) {
            return Arrays.asList(s.substring(0, 1) + s.substring(1), 
                             s.substring(1, 2) + s.substring(0, 1));
        }

        List<String> anagrams = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 2; j++) {
                anagrams.add(s.substring(i, i + 1) + Anagrams.of(dropCharacter(s, i)).get(j));
            }
        }

        return anagrams;
    }

    private static String dropCharacter(String s, int index) {
        String after = s.substring(index + 1, s.length());
        String before = s.substring(0, index);

        return before + after;
    }

   
}
