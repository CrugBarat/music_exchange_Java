package accessories;
import enums.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManuscriptPaperTest {

    ManuscriptPaper manuscriptPaper;

    @Before
    public void before() {
        manuscriptPaper = new ManuscriptPaper("D'Addario", "18 Stave", 5.0, 9.0, Category.ACCESSORY, 50);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4.0, manuscriptPaper.calculateMarkup(), 0.01);
    }

    @Test
    public void canApplyDiscount() {
        manuscriptPaper.applyDiscount(0.1);
        assertEquals(8.1, manuscriptPaper.getRetail(), 0.01);
    }

}
