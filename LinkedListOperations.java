import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("LinkedList: " + list);

        // Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Second element: " + list.get(1));

        // Removing elements
        list.remove("Banana");
        list.removeFirst();

        System.out.println("After removing elements: " + list);
    }
}
