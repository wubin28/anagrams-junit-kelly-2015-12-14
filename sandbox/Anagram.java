import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Anagram {
    List<String> generate(String string) {
        return Arrays.asList(string,string.subString(1) + string.subString(0, 1));
    }
}
