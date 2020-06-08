package instruments;
import enums.Category;

public class Violin extends Instrument {

    private String size;
    private String bow;

    public Violin(String brand, String model, String type, double cost, double retail, Category category, String size, String bow) {
        super(brand, model, type, cost, retail, category);
        this.size = size;
        this.bow = bow;
    }

    public String getSize() {
        return size;
    }

    public String getBow() {
        return bow;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setBow(String bow) {
        this.bow = bow;
    }

    public String play() {
        return "Pling pling-a-pling";
    }

}
