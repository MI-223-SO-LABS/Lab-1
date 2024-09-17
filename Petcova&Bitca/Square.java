public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    // Площадь
    public double calculateArea() {
        return side * side;
    }
    // Периметр
    public double calculatePerimeter() {
        return 4 * side;
    }
    
    public double getSide() {
        return side;
    }
}
