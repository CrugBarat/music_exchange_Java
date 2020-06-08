package instruments;
import behaviours.IClearance;
import behaviours.IPlay;
import behaviours.ISell;
import enums.Category;

public abstract class Instrument implements IPlay, ISell, IClearance {

    private String brand;
    private String model;
    private String type;
    private double cost;
    private double retail;
    private Category category;

    public Instrument(String brand, String model, String type, double cost, double retail, Category category) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.cost = cost;
        this.retail = retail;
        this.category = category;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return this.cost;
    }

    public double getRetail() {
        return this.retail;
    }

    public Category getCategory() {
        return category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setRetail(double retail) {
        this.retail = retail;
    }

    public double calculateMarkup() {
        return this.retail - this.cost;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void applyDiscount(double discount) {
        this.retail -= this.retail * discount;
    }

}
