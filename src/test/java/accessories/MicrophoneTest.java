package accessories;
import enums.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MicrophoneTest {

    Microphone microphone;

    @Before
    public void before() {
        microphone = new Microphone("Royer", "R-122V", 3000.0, 3546.0, Category.ACCESSORY, 3.0, "Jack");
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(546.0, microphone.calculateMarkup(), 0.01);
    }

    @Test
    public void canApplyDiscount() {
        microphone.applyDiscount(0.1);
        assertEquals(3191.4, microphone.getRetail(), 0.01);
    }

}
