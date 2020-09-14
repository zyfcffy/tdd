import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {

    @Test
    void should_return_null_when_the_word_is_null() {
        assertThrows(NullPointerException.class, ()-> {
            Vowel vowel = new Vowel();
            vowel.mommifier(null);
        });
    }

    @Test
    void should_return_original_word_when_number_of_vowels_under_30_percent() {
        Vowel vowel = new Vowel();
        String wordUnder30Percent = "test";
        String result = vowel.mommifier(wordUnder30Percent);
        assertEquals(wordUnder30Percent, result);
    }

    @Test
    void should_return_original_word_when_vowels_is_not_continuous(){
        Vowel vowel = new Vowel();
        String wordNotContinuous = "owe";
        String result = vowel.mommifier(wordNotContinuous);
        assertEquals(wordNotContinuous,result);
    }

    @Test
    void should_return_mommify_word(){
        Vowel vowel = new Vowel();
        String wordCanBeMommified = "kemommyemommyep";
        String result = vowel.mommifier(wordCanBeMommified);
        assertEquals(wordCanBeMommified,result);
    }

}
