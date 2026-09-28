import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks > 90)
            System.out.println("Grade: A");

        if (marks >= 35)
            System.out.println("Student has passed the exam.");
        else
            System.out.println("Student has failed the exam.");

        sc.close();
    }
}
