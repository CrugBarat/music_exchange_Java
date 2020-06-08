package accessories;
import enums.Category;

public class Metronome extends Accessory{

    private int tempoStartRange;
    private int tempoEndRange;
    private String powerSupply;

    public Metronome(String brand, String model, double cost, double retail, Category category, int tempoStartRange, int tempoEndRange, String powerSupply) {
        super(brand, model, cost, retail, category);
        this.tempoStartRange = tempoStartRange;
        this.tempoEndRange = tempoEndRange;
        this.powerSupply = powerSupply;
    }

    public int getTempoStartRange() {
        return tempoStartRange;
    }

    public int getTempoEndRange() {
        return tempoEndRange;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setTempoStartRange(int tempoStartRange) {
        this.tempoStartRange = tempoStartRange;
    }

    public void setTempoEndRange(int tempoEndRange) {
        this.tempoEndRange = tempoEndRange;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

}
