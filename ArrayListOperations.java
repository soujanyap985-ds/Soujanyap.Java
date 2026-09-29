import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("ArrayList: " + list);

        // Removing an element
        list.remove("Banana");

        System.out.println("After removing Banana: " + list);

        // Iterating elements
        System.out.println("Elements in ArrayList:");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
