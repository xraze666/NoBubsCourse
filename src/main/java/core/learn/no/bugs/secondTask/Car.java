package core.learn.no.bugs.secondTask;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Car(String brand, String model, int year) {
        this.brand =  brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printCarInfo() {
        System.out.println("Бренд: " + this.brand + ", Модель: " + this.model
        + ", Год: " + this.year + ", Цена: " + this.price);
    }
}
