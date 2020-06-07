package instruments;

import behaviours.IPlay;

public class Trombone extends Instrument implements IPlay {

    private String bodyDesign;
    private double bellDiameter;
    private double boreDiameter;

    public Trombone(String brand, String model, String type, double cost, double retail, String bodyDesign, double bellDiameter, double boreDiameter) {
        super(brand, model, type, cost, retail);
        this.bodyDesign = bodyDesign;
        this.bellDiameter = bellDiameter;
        this.boreDiameter = boreDiameter;
    }

    public String getBodyDesign() {
        return bodyDesign;
    }

    public double getBellDiameter() {
        return bellDiameter;
    }

    public double getBoreDiameter() {
        return boreDiameter;
    }

    public void setBodyDesign(String bodyDesign) {
        this.bodyDesign = bodyDesign;
    }

    public void setBellDiameter(double bellDiameter) {
        this.bellDiameter = bellDiameter;
    }

    public void setBoreDiameter(double boreDiameter) {
        this.boreDiameter = boreDiameter;
    }

    public String play() {
        return "Wah, wah, wah";
    }
}
