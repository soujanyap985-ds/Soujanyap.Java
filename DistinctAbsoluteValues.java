import java.util.HashSet;
import java.util.Scanner;

public class DistinctAbsoluteValues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            set.add(Math.abs(arr[i]));
        }

        System.out.println("Number of distinct absolute values = " + set.size());

        sc.close();
    }
}
