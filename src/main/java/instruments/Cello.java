package instruments;
import enums.Category;

public class Cello extends Instrument {

    private String size;
    private String body;
    private String finish;

    public Cello(String brand, String model, String type, double cost, double retail, Category category, String size, String body, String finish) {
        super(brand, model, type, cost, retail, category);
        this.size = size;
        this.body = body;
        this.finish = finish;
    }

    public String getSize() {
        return size;
    }

    public String getBody() {
        return body;
    }

    public String getFinish() {
        return finish;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String play() {
        return "bring bring";
    }

}
