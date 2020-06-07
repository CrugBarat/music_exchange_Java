package instruments;

import behaviours.IPlay;

public class Xylophone extends Instrument implements IPlay {

    private String material;
    private String octaveRanges;

    public Xylophone(String brand, String model, String type, double cost, double retail, String material, String octaveRanges) {
        super(brand, model, type, cost, retail);
        this.material = material;
        this.octaveRanges = octaveRanges;
    }

    public String getMaterial() {
        return material;
    }

    public String getOctaveRanges() {
        return octaveRanges;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setOctaveRanges(String octaveRanges) {
        this.octaveRanges = octaveRanges;
    }

    public String play() {
        return "ding ding ding";
    }
}
