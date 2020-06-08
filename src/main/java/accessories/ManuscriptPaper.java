package accessories;
import enums.Category;

public class ManuscriptPaper extends Accessory {

    private int numberOfSheets;

    public ManuscriptPaper(String brand, String model, double cost, double retail, Category category, int numberOfSheets) {
        super(brand, model, cost, retail, category);
        this.numberOfSheets = numberOfSheets;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

}
