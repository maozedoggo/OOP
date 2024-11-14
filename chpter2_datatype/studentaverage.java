import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = input.nextLine();

        System.out.print("Enter student ID: ");
        String id = input.nextLine();

        System.out.print("Enter subject: ");
        String subject = input.nextLine();

        System.out.print("Enter Test 1 marks (out of 100): ");
        double test1 = input.nextDouble();

        System.out.print("Enter Test 2 marks (out of 100): ");
        double test2 = input.nextDouble();

        double average = (test1 + test2) / 2;

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject: " + subject);
        System.out.println("Average Mark: " + average);
    }
}
