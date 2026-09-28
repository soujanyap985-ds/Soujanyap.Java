public class MethodOverloading {

    // Method with 2 integer parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method with 3 integer parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with 2 double parameters
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Addition of 2 integers: " + add(10, 20));

        System.out.println("Addition of 3 integers: " + add(10, 20, 30));

        System.out.println("Addition of 2 decimal numbers: " + add(10.5, 20.5));
    }
}
