package instruments;

public class Clarinet {

    private double bore;
    private String body;
    private String mouthpiece;

    public Clarinet(double bore, String body, String mouthpiece) {
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
}
