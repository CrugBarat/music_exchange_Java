package instruments;
import behaviours.IPlay;
import enums.Category;

public class Guitar extends Instrument implements IPlay {

    private String frets;
    private int scale;
    private String fretboard;
    private String body;
    private String neck;

    public Guitar(String brand, String model, String type, double cost, double retail, Category category, String frets, int scale, String fretboard, String body, String neck) {
        super(brand, model, type, cost, retail, category);
        this.frets = frets;
        this.scale = scale;
        this.fretboard = fretboard;
        this.body = body;
        this.neck = neck;
    }

    public String getFrets() {
        return frets;
    }

    public int getScale() {
        return scale;
    }

    public String getFretboard() {
        return fretboard;
    }

    public String getBody() {
        return body;
    }

    public String getNeck() {
        return neck;
    }

    public void setFrets(String frets) {
        this.frets = frets;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public void setFretboard(String fretboard) {
        this.fretboard = fretboard;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }

    public String play() {
        return "dling dling";
    }

}
