import java.util.Scanner;

public class purchasesystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu of drinks
        System.out.println("Welcome to Taobin, please select a drink:");
        System.out.println("1. Rokok Ais - RM 5");
        System.out.println("2. Jus Pisang - RM  6");
        System.out.println("3. Milo Tabur - RM 7");
        System.out.println("4. Nasi Lemak Rendang - RM 8");
        System.out.print("Enter your choice (1-4): ");

        int choice = scanner.nextInt();
        String drinkName = "";
        int price = 0;
        

        // Determine the drink and its price based on the user's choice
        switch (choice) {
            case 1:
                drinkName = "Rokok Ais";
                price = 5;
                break;
            case 2:
                drinkName = "Jus Pisang";
                price = 6;
                break;
            case 3:
                drinkName = "Milo Tabur";
                price = 7;
                break;
            case 4:
                drinkName = "Nasi Lemak Rendang";
                price = 8;
                break;
            default:
                System.out.println("Invalid choice. No drink will be selected.");
                scanner.close();
                return;
        }

        // Display the item details
        System.out.println("Item Name: " + drinkName);
        System.out.println("Price per item: RM " + price);
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();


        System.out.println("Total price: RM " + (quantity * price));
        // Close the scanner to avoid leaks

        scanner.close();
    }
}
