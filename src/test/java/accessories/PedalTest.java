package accessories;
import instruments.Guitar;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PedalTest {

    Pedal pedal;
    Instrument instrument;

    @Before
    public void before() {
        instrument = new Guitar("Fender", "Player 0144503506", "Electric", 375.0, 549.0, "22 Medium Jumbo", 25, "Pau Ferro", "Alder", "Maple");
        pedal = new Pedal("Gamechanger", "Audio Plus", 300.0, 339.0, instrument, 3.0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(39.0, pedal.calculateMarkup(), 0.01);
    }
}
