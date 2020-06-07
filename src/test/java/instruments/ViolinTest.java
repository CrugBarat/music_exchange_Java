package instruments;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin("Wood Viper", "5 String", "Electric", 3000.0, 3499.0, "Full", "Wood");
    }

    @Test
    public void canPlay() {
        assertEquals("Pling pling-a-pling", violin.play());
    }
}
