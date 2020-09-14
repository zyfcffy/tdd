import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MommifierTest {

    @Test
    void should_throw_exception_when_the_word_is_null(){
        assertThrows(Exception.class,()->{
            Vowel vowel = new Vowel();
            vowel.mommifier(null);
        });

    }
}
