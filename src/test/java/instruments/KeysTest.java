package instruments;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeysTest {

    Keys keys;

    @Before
    public void before() {
        keys = new Keys("Casio", "GP310", "Grand Hybrid Digital", 2000.0, 2349.0, 88, 1434.0, 78.5);
    }

    @Test
    public void canPlay() {
        assertEquals("ding ding", keys.play());
    }
}
