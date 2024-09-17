public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Площадь
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Длины окружности
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}