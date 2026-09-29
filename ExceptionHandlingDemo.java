public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // ArithmeticException
            System.out.println(result);

            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);   // ArrayIndexOutOfBoundsException
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception.");
        }

        finally {
            System.out.println("Finally block is always executed.");
        }
    }
}
