package instruments;
import enums.Category;

public class Xylophone extends Instrument {

    private String material;
    private String octaveRanges;

    public Xylophone(String brand, String model, String type, double cost, double retail, Category category, String material, String octaveRanges) {
        super(brand, model, type, cost, retail, category);
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
