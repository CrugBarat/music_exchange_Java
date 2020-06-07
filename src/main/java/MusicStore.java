import behaviours.ISell;
import java.util.HashMap;

public class MusicStore {

    private String name;
    private HashMap<ISell, Integer> stock;

    public MusicStore(String name) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public HashMap<ISell, Integer> getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }
}
