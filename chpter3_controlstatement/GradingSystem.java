import java.util.Scanner;
import javax.swing.JOptionPane;

public class GradingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            // Step 1: Ask for the number of students (via terminal input)
            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();

            int[] marks = new int[numStudents];
            int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;
            int pass = 0, fail = 0;

            // Step 2: Get the marks for each student (via terminal input)
            for (int i = 0; i < numStudents; i++) {
                System.out.print("Enter marks for student " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();

                // Step 3: Determine grade and increment corresponding grade count
                if (marks[i] >= 90 && marks[i] <= 100) {
                    gradeA++;
                    pass++;
                } else if (marks[i] >= 80 && marks[i] <= 89) {
                    gradeB++;
                    pass++;
                } else if (marks[i] >= 70 && marks[i] <= 79) {
                    gradeC++;
                    pass++;
                } else if (marks[i] >= 60 && marks[i] <= 69) {
                    gradeD++;
                    pass++;
                } else {
                    gradeF++;
                    fail++;
                }
            }

            // Switch to using JOptionPane for displaying results

            // Step 4: Display the number of students who got each grade (via JOptionPane)
            String gradeSummary = "Grade Summary:\n" +
                                  "A: " + gradeA + "\n" +
                                  "B: " + gradeB + "\n" +
                                  "C: " + gradeC + "\n" +
                                  "D: " + gradeD + "\n" +
                                  "F: " + gradeF;
            JOptionPane.showMessageDialog(null, gradeSummary);

            // Step 5: Display pass and fail counts (via JOptionPane)
            String passFailSummary = "Pass count: " + pass + "\nFail count: " + fail;
            JOptionPane.showMessageDialog(null, passFailSummary);

            // Step 6: Bonus message (via JOptionPane)
            if (pass > fail) {
                JOptionPane.showMessageDialog(null, "Bonus to instructor!");
            } else {
                JOptionPane.showMessageDialog(null, "No bonus to instructor.");
            }

            // Step 7: Ask user if they want to continue or exit (via JOptionPane)
            int userChoice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Continue", JOptionPane.YES_NO_OPTION);
            if (userChoice == JOptionPane.NO_OPTION) {
                continueProgram = false;
            }
        }

        // Step 8: Exit message (via JOptionPane)
        JOptionPane.showMessageDialog(null, "Exiting program. Goodbye!");
        scanner.close();
    }
}