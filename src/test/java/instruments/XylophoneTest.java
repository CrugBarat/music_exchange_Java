package instruments;
import enums.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XylophoneTest {

    Xylophone xylophone;

    @Before
    public void before() {
        xylophone = new Xylophone("Yamaha", "YX35G", "Wood", 1500.0, 1748.13, Category.PERCUSSION, "Padauk Wood", "3.5 Octaves");
    }

    @Test
    public void canPlay() {
        assertEquals("ding ding ding", xylophone.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(248.13, xylophone.calculateMarkup(), 0.01);
    }

    @Test
    public void canApplyDiscount() {
        xylophone.applyDiscount(0.1);
        assertEquals(1573.32, xylophone.getRetail(), 0.01);
    }

}
