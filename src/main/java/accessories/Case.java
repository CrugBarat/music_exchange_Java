package accessories;

import enums.Category;
import instruments.Instrument;

public class Case extends Accessory{

    private Instrument instrument;

    public Case(String brand, String model, double cost, double retail, Category category, Instrument instrument) {
        super(brand, model, cost, retail, category);
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
