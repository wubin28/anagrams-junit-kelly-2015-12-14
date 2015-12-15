import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;

public class AnagramTest {

    @Test
    public void the_anagram_of_a_one_letter_word_should_be_itself() {
        assertThat(Anagram.of("a"), is(Arrays.asList("a")));
    }

    @Test
    public void the_anagram_of_a_two_letter_word_should_be_two_words() {
        assertThat(Anagram.of("ab"), is(Arrays.asList("ab", "ba")));
    }

    @Test
    public void the_anagram_of_a_three_letter_word_should_be_six_words() {
        assertThat(Anagram.of("abc"), is(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba")));
    }
}
