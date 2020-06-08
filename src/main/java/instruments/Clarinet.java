package instruments;
import enums.Category;

public class Clarinet extends Instrument {

    private double bore;
    private String body;
    private String mouthpiece;

    public Clarinet(String brand, String model, String type, double cost, double retail, Category category, double bore, String body, String mouthpiece) {
        super(brand, model, type, cost, retail, category);
        this.bore = bore;
        this.body = body;
        this.mouthpiece = mouthpiece;
    }

    public double getBore() {
        return bore;
    }

    public String getBody() {
        return body;
    }

    public String getMouthpiece() {
        return mouthpiece;
    }

    public void setBore(double bore) {
        this.bore = bore;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setMouthpiece(String mouthpiece) {
        this.mouthpiece = mouthpiece;
    }

    public String play() {
        return "Doodle doodle doodle det";
    }

}
