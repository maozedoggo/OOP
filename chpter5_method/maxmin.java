import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store the integers
        int[] numbers = new int[3];

        // Loop to take input for 3 integers
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Using Math methods to find the maximum and minimum values
        int maxValue = Math.max(Math.max(numbers[0], numbers[1]), numbers[2]);
        int minValue = Math.min(Math.min(numbers[0], numbers[1]), numbers[2]);

        // Display the results
        System.out.println("The maximum value is: " + maxValue);
        System.out.println("The minimum value is: " + minValue);
    }
}
