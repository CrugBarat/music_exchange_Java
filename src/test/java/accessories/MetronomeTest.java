package accessories;
import enums.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MetronomeTest {

    Metronome metronome;

    @Before
    public void before() {
        metronome = new Metronome("Peterson", "BodyBeat Sync", 100.0, 129.99, Category.ACCESSORY, 10, 280, "Lithium Ion Battery");
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(29.99, metronome.calculateMarkup(), 0.01);
    }
}
