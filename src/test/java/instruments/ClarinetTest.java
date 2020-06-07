package instruments;
import enums.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    Clarinet clarinet;

    @Before
    public void before() {
        clarinet = new Clarinet("Yamaha", "YCL622", "Bass", 7000.0, 7978.0, Category.WOODWIND, 0.584, "Grenadilla", "Hard Rubber");
    }

    @Test
    public void canPlay() {
        assertEquals("Doodle doodle doodle det", clarinet.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(978, clarinet.calculateMarkup(), 0.01);
    }
}
