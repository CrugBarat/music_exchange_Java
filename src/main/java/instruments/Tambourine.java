package instruments;
import behaviours.IPlay;
import enums.Category;

public class Tambourine extends Instrument implements IPlay {

    private String shape;
    private String frame;

    public Tambourine(String brand, String model, String type, double cost, double retail, Category category, String shape, String frame) {
        super(brand, model, type, cost, retail, category);
        this.shape = shape;
        this.frame = frame;
    }

    public String getShape() {
        return shape;
    }

    public String getFrame() {
        return frame;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String play() {
        return "Chicka, chicka, chicka";
    }

}
