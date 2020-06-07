package accessories;

import instruments.Instrument;

public class Cable {

    private Instrument instrument;
    private double length;

    public Cable(Instrument instrument, double length) {
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
