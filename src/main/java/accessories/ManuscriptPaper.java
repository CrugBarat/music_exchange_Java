package accessories;

public class ManuscriptPaper extends Accessory {

    private int numberOfSheets;

    public ManuscriptPaper(String brand, String model, double cost, double retail, int numberOfSheets) {
        super(brand, model, cost, retail);
        this.numberOfSheets = numberOfSheets;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }
}
