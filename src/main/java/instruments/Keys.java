package instruments;

public class Keys extends Instrument {

    private int numberOfKeys;
    private double length;
    private double weight;

    public Keys(String brand, String model, String type, double cost, double retail, int numberOfKeys, double length, double weight) {
        super(brand, model, type, cost, retail);
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
}
