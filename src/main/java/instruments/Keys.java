package instruments;
import behaviours.IPlay;
import enums.Category;

public class Keys extends Instrument implements IPlay {

    private int numberOfKeys;
    private double length;
    private double weight;

    public Keys(String brand, String model, String type, double cost, double retail, Category category, int numberOfKeys, double length, double weight) {
        super(brand, model, type, cost, retail, category);
        this.numberOfKeys = numberOfKeys;
        this.length = length;
        this.weight = weight;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String play() {
        return "ding ding";
    }

}
