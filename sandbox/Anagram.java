import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Anagram {
    List<String> generate(String string) {
        return Arrays.asList(string, string.substring(1, 2) + 
                             string.substring(0, 1));
    }
}
