import java.util.Scanner;

public class PasswordSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Hardcoded username and password for simplicity
        String correctUsername = "user123";
        String correctPassword = "password123";

        int maxAttempts = 3;
        int attempts = 0;
        boolean isLoggedIn = false;

        // Loop for login attempts
        while (attempts < maxAttempts && !isLoggedIn) {
            System.out.print("Enter username: ");
            String username = input.nextLine();

            System.out.print("Enter password: ");
            String password = input.nextLine();

            // Check if username and password are correct
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                isLoggedIn = true;
                System.out.println("Login successful!");
            } else {
                attempts++;
                System.out.println("Incorrect username or password.");
                System.out.println("You have " + (maxAttempts - attempts) + " attempts left.");
            }
        }

        // If login failed after max attempts
        if (!isLoggedIn) {
            System.out.println("Login failed. You have exceeded the maximum number of attempts.");
        }
    }
}
