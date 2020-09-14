import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MommifierTest {

    @Test
    void should_throw_exception_when_the_word_is_null(){
        assertThrows(Exception.class,()->{
            Vowel vowel = new Vowel();
            vowel.mommifier(null);
        });
    }

    @Test
    void should_return_original_word_when_number_of_vowels_under_30_percent() throws Exception {
        Vowel vowel = new Vowel();
        String wordUnder30Percent = "test";
        String result =vowel.mommifier(wordUnder30Percent);
        assertEquals(wordUnder30Percent,result);
    }
}
