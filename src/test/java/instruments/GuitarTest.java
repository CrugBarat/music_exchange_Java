package instruments;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Fender", "Player 0144503506", "Electric", 375.0, 549.0, "22 Medium Jumbo", 25, "Pau Ferro", "Alder", "Maple");
    }

    @Test
    public void canPlay() {
        assertEquals("dling dling", guitar.play());
    }
}
