import java.util.Scanner;

// Base class: ArithmeticOperations
class ArithmeticOperations {
    // Method to add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    public double divide(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;  // Return NaN for division by zero
        }
    }
}

// Derived class: AdvancedArithmeticOperations (inherits ArithmeticOperations)
class AdvancedArithmeticOperations extends ArithmeticOperations {
    // You can add more advanced operations here, but for simplicity, we're using the base class operations
}

public class ArithmeticInheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an object of AdvancedArithmeticOperations
        AdvancedArithmeticOperations calculator = new AdvancedArithmeticOperations();

        // Get two integers from the user
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Perform arithmetic operations using methods from the parent class
        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
    }
}
