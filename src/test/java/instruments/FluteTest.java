package instruments;
import enums.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute("Yamaha", "YFL677H", "Handmade", 4000.0, 4482.07, Category.WOODWIND, "Sterling Silver", "Offset G");
    }

    @Test
    public void canPlay() {
        assertEquals("Tu-re-lu-re-lu", flute.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(482.07, flute.calculateMarkup(), 0.01);
    }

    @Test
    public void canApplyDiscount() {
        flute.applyDiscount(0.1);
        assertEquals(4033.86, flute.getRetail(), 0.01);
    }

}
