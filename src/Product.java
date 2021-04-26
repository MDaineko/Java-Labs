package by.gsu.pms;

public class Product {

    private String name;
    private boolean availability;
    private float price;

    public Product(String name, boolean availability, float price) {
        super();
        this.name = name;
        this.availability = availability;
        this.price = price;
    }

    public Product(String name, float price) {
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

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "; " + availability + "; " + price + ";";
    }
}