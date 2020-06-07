package accessories;

import instruments.Instrument;

public class Cable extends Accessory {

    private Instrument instrument;
    private double length;

    public Cable(String brand, String model, double cost, double retail, Instrument instrument, double length) {
        super(brand, model, cost, retail);
        this.instrument = instrument;
        this.length = length;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public double getLength() {
        return length;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
