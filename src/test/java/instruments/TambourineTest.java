package instruments;
import enums.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TambourineTest {

    Tambourine tambourine;

    @Before
    public void before() {
        tambourine = new Tambourine("Meinl Artisan Edition", "Compact 8 Inch", "3 Rows", 75.0, 114.0, Category.PERCUSSION, "circle", "maple");
    }

    @Test
    public void canPlay() {
        assertEquals("Chicka, chicka, chicka", tambourine.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(39, tambourine.calculateMarkup(), 0.01);
    }

    @Test
    public void canApplyDiscount() {
        tambourine.applyDiscount(0.1);
        assertEquals(102.6, tambourine.getRetail(), 0.01);
    }

}
