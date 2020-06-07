package accessories;

public class Microphone extends Accessory {

    private double cableLength;
    private String connectiontYPE;

    public Microphone(String brand, String model, double cost, double retail, double cableLength, String connectiontYPE) {
        super(brand, model, cost, retail);
        this.cableLength = cableLength;
        this.connectiontYPE = connectiontYPE;
    }

    public double getCableLength() {
        return cableLength;
    }

    public String getConnectiontYPE() {
        return connectiontYPE;
    }

    public void setCableLength(double cableLength) {
        this.cableLength = cableLength;
    }

    public void setConnectiontYPE(String connectiontYPE) {
        this.connectiontYPE = connectiontYPE;
    }
}
