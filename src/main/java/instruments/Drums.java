package instruments;
import behaviours.IPlay;
import enums.Category;

public class Drums extends Instrument implements IPlay {

    private String kickDrumSpec;
    private String snareDrumSpec;
    private String rackTom1Spec;
    private String rackTom2Spec;
    private String floorTomSpec;

    public Drums(String brand, String model, String type, double cost, double retail, Category category, String kickDrumSpec, String snareDrumSpec, String rackTom1Spec, String rackTom2Spec, String floorTomSpec) {
        super(brand, model, type, cost, retail, category);
        this.kickDrumSpec = kickDrumSpec;
        this.snareDrumSpec = snareDrumSpec;
        this.rackTom1Spec = rackTom1Spec;
        this.rackTom2Spec = rackTom2Spec;
        this.floorTomSpec = floorTomSpec;
    }

    public String getKickDrumSpec() {
        return kickDrumSpec;
    }

    public String getSnareDrumSpec() {
        return snareDrumSpec;
    }

    public String getRackTom1Spec() {
        return rackTom1Spec;
    }

    public String getRackTom2Spec() {
        return rackTom2Spec;
    }

    public String getFloorTomSpec() {
        return floorTomSpec;
    }

    public void setKickDrumSpec(String kickDrumSpec) {
        this.kickDrumSpec = kickDrumSpec;
    }

    public void setSnareDrumSpec(String snareDrumSpec) {
        this.snareDrumSpec = snareDrumSpec;
    }

    public void setRackTom1Spec(String rackTom1Spec) {
        this.rackTom1Spec = rackTom1Spec;
    }

    public void setRackTom2Spec(String rackTom2Spec) {
        this.rackTom2Spec = rackTom2Spec;
    }

    public void setFloorTomSpec(String floorTomSpec) {
        this.floorTomSpec = floorTomSpec;
    }

    public String play() {
        return "rat-a-tat-tat";
    }

}
