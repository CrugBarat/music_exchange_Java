package accessories;

import instruments.Instrument;

public class Stand extends Accessory {

    private Instrument instrument;
    private String dimensions;

    public Stand(String brand, String model, double cost, double retail, Instrument instrument, String dimensions) {
        super(brand, model, cost, retail);
        this.instrument = instrument;
        this.dimensions = dimensions;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
