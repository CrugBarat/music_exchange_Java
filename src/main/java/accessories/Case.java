package accessories;

import instruments.Instrument;

public class Case {

    private Instrument instrument;

    public Case(Instrument instrument) {
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
