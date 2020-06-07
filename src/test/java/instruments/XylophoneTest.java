package instruments;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XylophoneTest {

    Xylophone xylophone;

    @Before
    public void before() {
        xylophone = new Xylophone("Yamaha", "YX35G", "Wood", 1500.0, 1748.13, "Padauk Wood", "3.5 Octaves");
    }

    @Test
    public void canPlay() {
        assertEquals("ding ding ding", xylophone.play());
    }
}
