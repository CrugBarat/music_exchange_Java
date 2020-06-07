package instruments;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute("Yamaha", "YFL677H", "Handmade", 4000.0, 4482.07, "Sterling Silver", "Offset G");
    }

    @Test
    public void canPlay() {
        assertEquals("Tu-re-lu-re-lu", flute.play());
    }
}
