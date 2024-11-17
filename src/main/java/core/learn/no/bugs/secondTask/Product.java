package core.learn.no.bugs.secondTask;

public class Product {
    private String name;
    private String category;
    private int quantity;
    private double pricePerUnit;

    public Product(String name, String category, int quantity, double pricePerUnit) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double calculateTotalPrice() {
        return this.quantity * this.pricePerUnit;
    }

    public void printProductInfo() {
        System.out.println("Товар: " + this.name + ", Категория: " + this.category
                + ", Количество: " + this.quantity + ",  Общая стоимость: " + this.calculateTotalPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
