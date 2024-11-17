package core.learn.no.bugs.secondTask;

public class Company {
    private String name;
    private int employees;
    private double revenue;

    public Company(String name, int employees, double revenue) {
        this.name = name;
        this.employees = employees;
        this.revenue = revenue;
    }

    public void printCompanyInfo() {
        System.out.println(
                "Компания: " + this.name +
                        ", Сотрудников: " + this.employees +
                        ", Доход: " + this.revenue
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
}
