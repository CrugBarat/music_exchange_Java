package accessories;

import instruments.Instrument;

public class Case extends Accessory{

    private Instrument instrument;

    public Case(String brand, String model, double cost, double retail, Instrument instrument) {
        super(brand, model, cost, retail);
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
