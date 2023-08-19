package himash.sealClasses;

public class Bottle {

    private int id;
    private String manufacture;
    private double cost;
    private boolean status;

    public Bottle(int id, String manufacture, double cost, boolean status) {
        this.id = id;
        this.manufacture = manufacture;
        this.cost = cost;
        this.status = status;
    }

    public Bottle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
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
        return "Bottle{" +
                "id=" + id +
                ", manufacture='" + manufacture + '\'' +
                ", cost=" + cost +
                ", status=" + status +
                '}';
    }
}
