package instruments;
import enums.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin("Wood Viper", "5 String", "Electric", 3000.0, 3499.0, Category.STRINGS, "Full", "Wood");
    }

    @Test
    public void canPlay() {
        assertEquals("Pling pling-a-pling", violin.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(499, violin.calculateMarkup(), 0.01);
    }

    @Test
    public void canApplyDiscount() {
        violin.applyDiscount(0.1);
        assertEquals(3149.1, violin.getRetail(), 0.01);
    }
}
