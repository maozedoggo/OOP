import java.util.Scanner;

public class ArithmeticProg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get two integers from the user
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Display the menu of operations
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.print("Enter your choice (1-5): ");
        int choice = input.nextInt();

        // Perform the operation based on the user's choice using a switch statement
        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Subtraction: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Multiplication: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = (double) num1 / num2;
                    System.out.println("Division: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                result = num1 % num2;
                System.out.println("Modulus: " + result);
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 5.");
        }
    }
}
