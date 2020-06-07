package instruments;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    Clarinet clarinet;

    @Before
    public void before() {
        clarinet = new Clarinet("Yamaha", "YCL622", "Bass", 7000.0, 7978.0, 0.584, "Grenadilla", "Hard Rubber");
    }

    @Test
    public void canPlay() {
        assertEquals("Doodle doodle doodle det", clarinet.play());
    }
}