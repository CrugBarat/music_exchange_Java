package instruments;

import behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private int bellDiameter;
    private int boreDiameter;
    private String bodyMaterial;

    public Trumpet(String brand, String model, String type, double cost, double retail, int bellDiameter, int boreDiameter, String bodyMaterial) {
        super(brand, model, type, cost, retail);
        this.bellDiameter = bellDiameter;
        this.boreDiameter = boreDiameter;
        this.bodyMaterial = bodyMaterial;
    }

    public int getBellDiameter() {
        return bellDiameter;
    }

    public int getBoreDiameter() {
        return boreDiameter;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBellDiameter(int bellDiameter) {
        this.bellDiameter = bellDiameter;
    }

    public void setBoreDiameter(int boreDiameter) {
        this.boreDiameter = boreDiameter;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public String play() {
        return "Ta-tada-ta-ta";
    }
}
