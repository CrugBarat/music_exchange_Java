package accessories;
import enums.Category;
import instruments.Instrument;
import instruments.Keys;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StandTest {

    Stand stand;
    Instrument instrument;

    @Before
    public void before() {
        instrument = new Keys("Yamaha", "Genos", "Electric", 3500.0, 4071.0, Category.KEYS, 76, 1234, 13.0);
        stand = new Stand("Yamaha", "L7B", 150.0, 189.25, Category.ACCESSORY, instrument, "1040x695x515");
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(39.25, stand.calculateMarkup(), 0.01);
    }

    @Test
    public void canApplyDiscount() {
        stand.applyDiscount(0.1);
        assertEquals(170.33, stand.getRetail(), 0.01);
    }

}
