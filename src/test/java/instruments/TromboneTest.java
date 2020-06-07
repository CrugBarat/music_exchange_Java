package instruments;
import enums.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {

    Trombone trombone;

    @Before
    public void before() {
        trombone = new Trombone("Courtois", "AC550", "Bass", 6000.0, 6339.0, Category.BRASS,"Hangman", 9.5, 0.562);
    }

    @Test
    public void canPlay() {
        assertEquals("Wah, wah, wah", trombone.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(339, trombone.calculateMarkup(), 0.01);
    }

    @Test
    public void canApplyDiscount() {
        trombone.applyDiscount(0.1);
        assertEquals(5705.1, trombone.getRetail(), 0.01);
    }

}
