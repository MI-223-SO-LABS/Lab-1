import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Квадрат
        System.out.print("Введите длину стороны квадрата: ");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);

        double squareArea = square.calculateArea();
        double squarePerimeter = square.calculatePerimeter();

        System.out.println("\nКвадрат со стороной " + squareSide + ":");
        System.out.println("Площадь: " + squareArea);
        System.out.println("Периметр: " + squarePerimeter);

       // Круг
        System.out.print("\nВведите радиус круга: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);

        double circleArea = circle.calculateArea();
        double circlePerimeter = circle.calculatePerimeter();

        System.out.println("\nКруг с радиусом " + circleRadius + ":");
        System.out.println("Площадь: " + circleArea);
        System.out.println("Длина окружности: " + circlePerimeter);

        //Сравнение площадей
        if (squareArea > circleArea) {
            System.out.println("\nПлощадь квадрата больше площади круга.");
        } else if (squareArea < circleArea) {
            System.out.println("\nПлощадь круга больше площади квадрата.");
        } else {
            System.out.println("\nПлощади квадрата и круга равны.");
        }

        scanner.close();
    }
}
