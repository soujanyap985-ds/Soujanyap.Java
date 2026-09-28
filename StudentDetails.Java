class Student {
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Rahul";
        student1.marks = 85;

        student2.name = "Priya";
        student2.marks = 92;

        System.out.println("Student 1:");
        student1.display();

        System.out.println("\nStudent 2:");
        student2.display();
    }
}
