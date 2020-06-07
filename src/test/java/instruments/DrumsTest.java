package instruments;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before() {
        drums = new Drums("Yamaha", "Recording Custom 22\"", "Acoustic", 2500.0, 3295.0, "22\" x 16\"", "4\" x 6.5\"", "10\" x 7\"", "12\" x 8\"", "14\" x 13\"");
    }

    @Test
    public void canPlay() {
        assertEquals("rat-a-tat-tat", drums.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(795, drums.calculateMarkup(), 0.01);
    }
}
