import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import static org.hamcrest.CoreMatchers.*;

public class AnagramTest {

    @Test
    public void the_anagram_of_a_one_letter_word_should_be_itself() {
        assertThat(Anagrams.of("a"), is(Arrays.asList("a")));
    }

    @Test
    public void the_anagrams_of_a_two_letter_word_should_be_2_words() {
        assertThat(Anagrams.of("ab"), is(Arrays.asList("ab", "ba")));
    }

    @Test
    public void the_anagrams_of_a_three_letter_word_should_be_6_words() {
        assertThat(Anagrams.of("abc"), is(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba")));
    }

    @Test
    public void the_anagrams_of_a_four_letter_word_should_be_24_words() {
        assertThat(Anagrams.of("abcd").size(), is(24));
    }
}
