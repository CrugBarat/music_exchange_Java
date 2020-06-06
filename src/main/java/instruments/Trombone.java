package instruments;

import behaviours.IPlay;

public class Trombone extends Instrument implements IPlay {

    private String bodyDesign;
    private int bellDiameter;
    private int boreDiameter;

    public Trombone(String brand, String model, String type, double cost, double retail, String bodyDesign, int bellDiameter, int boreDiameter) {
        super(brand, model, type, cost, retail);
        this.bodyDesign = bodyDesign;
        this.bellDiameter = bellDiameter;
        this.boreDiameter = boreDiameter;
    }

    public String getBodyDesign() {
        return bodyDesign;
    }

    public int getBellDiameter() {
        return bellDiameter;
    }

    public int getBoreDiameter() {
        return boreDiameter;
    }

    public void setBodyDesign(String bodyDesign) {
        this.bodyDesign = bodyDesign;
    }

    public void setBellDiameter(int bellDiameter) {
        this.bellDiameter = bellDiameter;
    }

    public void setBoreDiameter(int boreDiameter) {
        this.boreDiameter = boreDiameter;
    }

    public String play() {
        return "Wah, wah, wah";
    }
}
