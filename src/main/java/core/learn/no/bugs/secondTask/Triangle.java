package core.learn.no.bugs.secondTask;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculatePerimeter() {
        return this.a+this.b+this.c;
    }

    public double calculateArea() {
        return calculatePerimeter()/2;
    }

    public void printTriangleInfo() {
        System.out.println("Треугольник со сторонами: a=" + this.a +
                ", b=" + this.b + ", c=" + this.c +
                ", Периметр=" + this.calculatePerimeter() +
                ", Площадь=" + this.calculateArea());
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
