package instruments;

public abstract class Instrument {

    private String brand;
    private String model;
    private double cost;
    private double retail;

    public Instrument(String brand, String model, double cost, double retail) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.retail = retail;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public double getCost() {
        return this.cost;
    }

    public double getRetail() {
        return this.retail;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setRetail(double retail) {
        this.retail = retail;
    }
}