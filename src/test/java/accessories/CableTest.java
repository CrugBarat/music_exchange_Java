package accessories;
import enums.Category;
import instruments.Guitar;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CableTest {

    Cable cable;
    Instrument instrument;

    @Before
    public void before() {
        instrument = new Guitar("Fender", "Player 0144503506", "Electric", 375.0, 549.0, Category.GUITAR,  "22 Medium Jumbo", 25, "Pau Ferro", "Alder", "Maple");
        cable = new Cable("Roland", "Straight Instrument Cable", 5.0, 9.0, Category.ACCESSORY, instrument, 1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4.0, cable.calculateMarkup(), 0.01);
    }
}
