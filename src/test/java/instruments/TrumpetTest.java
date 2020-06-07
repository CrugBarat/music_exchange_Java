package instruments;
import enums.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("Yamaha", "YTR-9445", "Xeno Artist", 4000.0, 4390.0, Category.BRASS,123.0, 11.73, "Silver-Plated");
    }

    @Test
    public void canPlay() {
        assertEquals("Ta-tada-ta-ta", trumpet.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(390, trumpet.calculateMarkup(), 0.01);
    }

    @Test
    public void canApplyDiscount() {
        trumpet.applyDiscount(0.1);
        assertEquals(3951.0, trumpet.getRetail(), 0.01);
    }

}
