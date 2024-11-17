package core.learn.no.bugs.secondTask;

public class Currency {
    private String name;
    private double rateToUSD;

    public Currency(String name, double rateToUSD) {
        this.name = name;
        this.rateToUSD = rateToUSD;
    }

    public double convertToUSD(double amount) {
        return amount / this.rateToUSD;
    }

    public void printCurrencyInfo() {
        System.out.println("Валюта: " + this.name + ", Курс к USD: " + this.rateToUSD);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRateToUSD() {
        return rateToUSD;
    }

    public void setRateToUSD(double rateToUSD) {
        this.rateToUSD = rateToUSD;
    }
}
