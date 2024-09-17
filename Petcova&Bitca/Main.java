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

        scanner.close();
    }
}
