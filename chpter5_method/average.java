import java.util.Scanner;

class Student {
    String name;
    int test1;
    int test2;
    int test3;

    // Constructor to initialize student details
    public Student(String name, int test1, int test2, int test3) {
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    // Method to calculate average marks
    public double calculateAverage() {
        return (test1 + test2 + test3) / 3.0;
    }
}

public class StudentAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create Student objects
        Student student1 = createStudent(input, 1);
        Student student2 = createStudent(input, 2);
        Student student3 = createStudent(input, 3);

        // Calculate averages
        double avg1 = student1.calculateAverage();
        double avg2 = student2.calculateAverage();
        double avg3 = student3.calculateAverage();

        // Display the averages
        System.out.println("\nAverage Marks for " + student1.name + ": " + avg1);
        System.out.println("Average Marks for " + student2.name + ": " + avg2);
        System.out.println("Average Marks for " + student3.name + ": " + avg3);

        // Use Math.max() to find the highest average
        double highestAvg = Math.max(Math.max(avg1, avg2), avg3);

        // Display the highest average
        System.out.println("\nThe highest average is: " + highestAvg);
    }

    // Helper method to create a student object and get input
    public static Student createStudent(Scanner input, int studentNumber) {
        System.out.print("Enter the name of student " + studentNumber + ": ");
        String name = input.nextLine();

        System.out.print("Enter marks for Test 1 for " + name + ": ");
        int test1 = input.nextInt();

        System.out.print("Enter marks for Test 2 for " + name + ": ");
        int test2 = input.nextInt();

        System.out.print("Enter marks for Test 3 for " + name + ": ");
        int test3 = input.nextInt();
        input.nextLine();  // Consume the leftover newline character

        return new Student(name, test1, test2, test3);
    }
}
