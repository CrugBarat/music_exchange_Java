package instruments;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    Cello cello;

    @Before
    public void before() {
        cello = new Cello("Yamaha", "SVC210", "Electric", 2110.0, 2531.0, "4/4", "Spruce/Maple", "Matte");
    }

    @Test
    public void canPlay() {
        assertEquals("bring bring", cello.play());
    }
}