package core.learn.no.bugs.secondTask;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    public void printCircleInfo(){
        System.out.println("Круг: Радиус = " + this.radius+
                ", Площадь= " + this.calculateArea()+
                ", Длина окружности=" + this.calculateCircumference());
    }
}
