package accessories;
import enums.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeadphoneTest {

    Headphones headphones;

    @Before
    public void before() {
        headphones = new Headphones("Neumann", "NDH 20", 300.00, 399.0, Category.ACCESSORY, 3.0, 3.5);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(99.0, headphones.calculateMarkup(), 0.01);
    }
}
