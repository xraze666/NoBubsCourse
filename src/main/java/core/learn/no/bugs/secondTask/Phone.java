package core.learn.no.bugs.secondTask;

public class Phone {
    private String brand;
    private String model;
    private double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        this.price = this.price - this.price / 100 * percentage;
    }

    public void printPhoneDetails() {
        System.out.println("Телефон: " + this.brand +
                ", Цена: " + this.price);
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
