package instruments;
import enums.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Fender", "Player 0144503506", "Electric", 375.0, 549.0, Category.GUITAR,"22 Medium Jumbo", 25, "Pau Ferro", "Alder", "Maple");
    }

    @Test
    public void canPlay() {
        assertEquals("dling dling", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(174, guitar.calculateMarkup(), 0.01);
    }
}
