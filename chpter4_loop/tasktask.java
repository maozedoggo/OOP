import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of students
        System.out.print("Enter the number of students: ");
        int numOfStudents = input.nextInt();

        int passed = 0;
        int failed = 0;

        // Loop through each student's test result
        for (int i = 1; i <= numOfStudents; i++) {
            System.out.print("Enter test result for student " + i + " (1 for pass, 0 for fail): ");
            int result = input.nextInt();

            if (result == 1) {
                passed++;
            } else {
                failed++;
            }
        }

        // Display the number of passed and failed students
        System.out.println("Number of students who passed: " + passed);
        System.out.println("Number of students who failed: " + failed);

        // Check if more than 50% passed
        if ((double) passed / numOfStudents > 0.5) {
            System.out.println("Bonus to instructor");
        } else {
            System.out.println("No bonus to instructor");
        }
    }
}
