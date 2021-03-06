package accessories;
import enums.Category;
import instruments.Guitar;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaseTest {

    Case guitarCase;
    Instrument instrument;

    @Before
    public void before() {
        instrument = new Guitar("Fender", "Player 0144503506", "Electric", 375.0, 549.0, Category.GUITAR,"22 Medium Jumbo", 25, "Pau Ferro", "Alder", "Maple");
        guitarCase = new Case("BAM", "8004XL", 500.0, 567.93, Category.ACCESSORY, instrument);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(67.93, guitarCase.calculateMarkup(), 0.01);
    }

    @Test
    public void canApplyDiscount() {
        guitarCase.applyDiscount(0.1);
        assertEquals(511.14, guitarCase.getRetail(), 0.01);
    }

}
