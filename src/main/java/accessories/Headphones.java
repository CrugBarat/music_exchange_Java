package accessories;

import enums.Category;

public class Headphones extends Accessory{

    private double cableLength;
    private double jackSize;

    public Headphones(String brand, String model, double cost, double retail, Category category, double cableLength, double jackSize) {
        super(brand, model, cost, retail, category);
        this.cableLength = cableLength;
        this.jackSize = jackSize;
    }

    public double getCableLength() {
        return cableLength;
    }

    public double getJackSize() {
        return jackSize;
    }

    public void setCableLength(double cableLength) {
        this.cableLength = cableLength;
    }

    public void setJackSize(double jackSize) {
        this.jackSize = jackSize;
    }
}
