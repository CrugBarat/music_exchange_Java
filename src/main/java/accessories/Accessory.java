package accessories;

public abstract class Accessory {

    private String brand;
    private String model;
    private double cost;
    private double retail;

    public Accessory(String brand, String model, double cost, double retail) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.retail = retail;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getCost() {
        return cost;
    }

    public double getRetail() {
        return retail;
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
