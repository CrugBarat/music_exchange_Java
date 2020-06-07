package accessories;

public class Microphone extends Accessory {

    private double cableLength;
    private String connectionType;

    public Microphone(String brand, String model, double cost, double retail, double cableLength, String connectionType) {
        super(brand, model, cost, retail);
        this.cableLength = cableLength;
        this.connectionType = connectionType;
    }

    public double getCableLength() {
        return cableLength;
    }

    public String getConnectiontYPE() {
        return connectionType;
    }

    public void setCableLength(double cableLength) {
        this.cableLength = cableLength;
    }

    public void setConnectiontYPE(String connectionType) {
        this.connectionType = connectionType;
    }
}
