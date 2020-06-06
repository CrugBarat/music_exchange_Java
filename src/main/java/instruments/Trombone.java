package instruments;

public class Trombone {

    private String bodyDesign;
    private int bellDiameter;
    private int boreDiameter;

    public Trombone(String bodyDesign, int bellDiameter, int boreDiameter) {
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
}
