package instruments;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TambourineTest {

    Tambourine tambourine;

    @Before
    public void before() {
        tambourine = new Tambourine("Meinl Artisan Edition", "Compact 8 Inch", "3 Rows", 75.0, 114.0, "circle", "maple");
    }

    @Test
    public void canPlay() {
        assertEquals("Chicka, chicka, chicka", tambourine.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(39, tambourine.calculateMarkup(), 0.01);
    }
}
