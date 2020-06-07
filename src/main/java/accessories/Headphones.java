package accessories;

public class Headphones extends Accessory{

    private double cableLength;
    private double jackSize;

    public Headphones(String brand, String model, double cableLength, double jackSize) {
        super(brand, model);
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
