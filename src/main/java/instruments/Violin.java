package instruments;

public class Violin {

    private String size;
    private String bow;

    public Violin(String size, String bow) {
        this.size = size;
        this.bow = bow;
    }

    public String getSize() {
        return size;
    }

    public String getBow() {
        return bow;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setBow(String bow) {
        this.bow = bow;
    }
}
