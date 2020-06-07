package accessories;

import behaviours.ISell;
import enums.Category;

public abstract class Accessory implements ISell {

    private String brand;
    private String model;
    private double cost;
    private double retail;
    private Category category;

    public Accessory(String brand, String model, double cost, double retail, Category category) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.retail = retail;
        this.category = category;
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

    public Category getCategory() {
        return category;
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

    public double calculateMarkup() {
        return this.retail - this.cost;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
