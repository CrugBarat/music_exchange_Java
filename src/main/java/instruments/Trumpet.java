package instruments;

import behaviours.IPlay;
import enums.Category;

public class Trumpet extends Instrument implements IPlay {

    private double bellDiameter;
    private double boreDiameter;
    private String bodyMaterial;

    public Trumpet(String brand, String model, String type, double cost, double retail, Category category, double bellDiameter, double boreDiameter, String bodyMaterial) {
        super(brand, model, type, cost, retail, category);
        this.bellDiameter = bellDiameter;
        this.boreDiameter = boreDiameter;
        this.bodyMaterial = bodyMaterial;
    }

    public double getBellDiameter() {
        return bellDiameter;
    }

    public double getBoreDiameter() {
        return boreDiameter;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBellDiameter(double bellDiameter) {
        this.bellDiameter = bellDiameter;
    }

    public void setBoreDiameter(double boreDiameter) {
        this.boreDiameter = boreDiameter;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public String play() {
        return "Ta-tada-ta-ta";
    }
}
