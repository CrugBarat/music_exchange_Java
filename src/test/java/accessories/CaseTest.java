package accessories;
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
        instrument = new Guitar("Fender", "Player 0144503506", "Electric", 375.0, 549.0, "22 Medium Jumbo", 25, "Pau Ferro", "Alder", "Maple");
        guitarCase = new Case("BAM", "8004XL", 500.0, 567.93, instrument);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(67.93, guitarCase.calculateMarkup(), 0.01);
    }
}
