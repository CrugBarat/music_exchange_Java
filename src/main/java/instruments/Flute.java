package instruments;

import behaviours.IPlay;
import enums.Category;

public class Flute extends Instrument implements IPlay {

    private String bodyMaterial;
    private String keyOf;

    public Flute(String brand, String model, String type, double cost, double retail, Category category, String bodyMaterial, String keyOf) {
        super(brand, model, type, cost, retail, category);
        this.bodyMaterial = bodyMaterial;
        this.keyOf = keyOf;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public String getKeyOf() {
        return keyOf;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public void setKeyOf(String keyOf) {
        this.keyOf = keyOf;
    }

    public String play() {
        return "Tu-re-lu-re-lu";
    }
}
