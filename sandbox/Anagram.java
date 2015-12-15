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
                             s.substring(1, 2) + s.substring(0, 1));
        }

        List<String> anagrams = new ArrayList<String>();


        anagrams.add(s.substring(0, 1) + Anagram.of(dropCharacter(s, 0)).get(0));
        anagrams.add(s.substring(0, 1) + Anagram.of(dropCharacter(s, 0)).get(1));
        anagrams.add(s.substring(1, 2) + Anagram.of(dropCharacter(s, 1)).get(0));
        anagrams.add(s.substring(1, 2) + Anagram.of(dropCharacter(s, 1)).get(1));
        anagrams.add(s.substring(2, 3) + Anagram.of(dropCharacter(s, 2)).get(0));
        anagrams.add(s.substring(2, 3) + Anagram.of(dropCharacter(s, 2)).get(1));

        return anagrams;
    }

    private static String dropCharacter(String s, int index) {
        if (index == 0) {
            return s.substring(1, 3);
        }
        if (index == 1) {
            return s.substring(0, 1) + s.substring(2, 3);
        }
        return s.substring(0, 2);
    }
}
