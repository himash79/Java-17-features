package himash.util;

public class Book {

    private int id;
    private String category;
    private String name;
    private String author;
    private double cost;
    private boolean status;

    public Book(int id, String category, String name, String author, double cost, boolean status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.author = author;
        this.cost = cost;
        this.status = status;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
}
