package instruments;

import behaviours.IPlay;

public class Clarinet extends Instrument implements IPlay {

    private double bore;
    private String body;
    private String mouthpiece;

    public Clarinet(String brand, String model, String type, double cost, double retail, double bore, String body, String mouthpiece) {
        super(brand, model, type, cost, retail);
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
