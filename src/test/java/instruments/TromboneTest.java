package instruments;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {

    Trombone trombone;

    @Before
    public void before() {
        trombone = new Trombone("Courtois", "AC550", "Bass", 6000.0, 6339.0, "Hangman", 9.5, 0.562);
    }

    @Test
    public void canPlay() {
        assertEquals("Wah, wah, wah", trombone.play());
    }
}
