package himash.sealClasses;

import himash.sealClasses.Market;

public final class Laptop extends Market {

    private int id;
    private String brand;
    private String model;
    private double cost;
    private boolean status;

    public Laptop(int id, String brand, String model, double cost, boolean status) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.status = status;
    }

    public Laptop() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                ", status=" + status +
                '}';
    }
}
