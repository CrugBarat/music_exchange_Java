package accessories;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManuscriptPaperTest {

    ManuscriptPaper manuscriptPaper;

    @Before
    public void before() {
        manuscriptPaper = new ManuscriptPaper("D'Addario", "18 Stave", 5.0, 9.0, 50);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4.0, manuscriptPaper.calculateMarkup(), 0.01);
    }
}
