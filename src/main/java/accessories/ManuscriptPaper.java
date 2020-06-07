package accessories;

public class ManuscriptPaper extends Accessory {

    private int numberOfSheets;

    public ManuscriptPaper(String brand, String model, int numberOfSheets) {
        super(brand, model);
        this.numberOfSheets = numberOfSheets;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }
}
