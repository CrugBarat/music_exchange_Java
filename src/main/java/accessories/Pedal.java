package accessories;

import instruments.Instrument;

public class Pedal extends Accessory{

    private Instrument instrument;
    private double cableLength;

    public Pedal(String brand, String model, double cost, double retail, Instrument instrument, double cableLength) {
        super(brand, model, cost, retail);
        this.instrument = instrument;
        this.cableLength = cableLength;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public double getCableLength() {
        return cableLength;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setCableLength(double cableLength) {
        this.cableLength = cableLength;
    }
}
