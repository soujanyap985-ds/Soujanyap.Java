import java.util.Scanner;

public class SimpleCalculator {

    // Child method for addition
    static double add(double a, double b) {
        return a + b;
    }

    // Child method for subtraction
    static double subtract(double a, double b) {
        return a - b;
    }

    // Child method for multiplication
    static double multiply(double a, double b) {
        return a * b;
    }

    // Child method for division
    static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Addition = " + add(a, b));
        System.out.println("Subtraction = " + subtract(a, b));
        System.out.println("Multiplication = " + multiply(a, b));

        if (b != 0)
            System.out.println("Division = " + divide(a, b));
        else
            System.out.println("Division by zero is not possible.");

        sc.close();
    }
}
