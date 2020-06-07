package instruments;
import enums.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeysTest {

    Keys keys;

    @Before
    public void before() {
        keys = new Keys("Casio", "GP310", "Grand Hybrid Digital", 2000.0, 2349.0, Category.KEYS, 88, 1434.0, 78.5);
    }

    @Test
    public void canPlay() {
        assertEquals("ding ding", keys.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(349, keys.calculateMarkup(), 0.01);
    }

    @Test
    public void canApplyDiscount() {
        keys.applyDiscount(0.1);
        assertEquals(2114.1, keys.getRetail(), 0.01);
    }

}
