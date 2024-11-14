import javax.swing.JOptionPane;

public class SeparateOddEven {

    public static void main(String[] args) {
        // Input from user
        String input = JOptionPane.showInputDialog("Enter numbers separated by spaces:");
        
        // Split input into an array of strings
        String[] numberStrings = input.split(" ");
        
        // Convert the array of strings to an array of integers
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }
        
        // Initialize StringBuilder to store odd and even numbers
        StringBuilder oddNumbers = new StringBuilder();
        StringBuilder evenNumbers = new StringBuilder();
        
        // Separate odd and even numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.append(number).append(" ");
            } else {
                oddNumbers.append(number).append(" ");
            }
        }
        
        // Output result using JOptionPane
        String message = "Even Numbers: " + evenNumbers.toString().trim() + "\nOdd Numbers: " + oddNumbers.toString().trim();
        JOptionPane.showMessageDialog(null, message, "Odd and Even Numbers", JOptionPane.INFORMATION_MESSAGE);
    }
}
