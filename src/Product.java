package gsu;

public class Product {

    private String name;
    private boolean availability;
    private double price;

    public Product() {
        this("", false, 0.00);
    }

    public Product(String name, boolean availability, double price) {
        super();
        this.name = name;
        this.availability = availability;
        this.price = price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.availability = false;
        this.price = price;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailable(boolean availability) {
        this.availability = availability;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "; " + availability + "; " + price + ";";
    }
}
