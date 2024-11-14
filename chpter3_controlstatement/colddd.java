import java.util.Scanner;

public class colddd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter item details
        System.out.print("Item Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Price: ");
        int price = scanner.nextInt();
        
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        // Display the menu of discount rates
        System.out.println("Choose a discount rate:");
        System.out.println("1. Red (10%)");
        System.out.println("2. Blue (20%)");
        System.out.println("3. Green (30%)");
        System.out.println("4. Yellow (40%)");
        System.out.print("Enter your choice (1-4): ");
        int discountChoice = scanner.nextInt();
        
        // Determine the discount rate based on the user's choice
        float discount = 0;
        switch (discountChoice) {
            case 1:
                discount = 0.10f; // 10% discount
                break;
            case 2:
                discount = 0.20f; // 20% discount
                break;
            case 3:
                discount = 0.30f; // 30% discount
                break;
            case 4:
                discount = 0.40f; // 40% discount
                break;
            default:
                System.out.println("Invalid choice. No discount will be applied.");
        }
        
        // Calculate total price and price after discount
        int totalPrice = price * quantity;
        float discountAmount = totalPrice * discount;
        float priceAfterDiscount = totalPrice - discountAmount;
        
        // Display the item details and price calculations
        System.out.println("Item Name: " + name);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: " + totalPrice);
        System.out.println("Discount rate: " + (discount * 100) + "%");
        System.out.println("Price after discount: " + priceAfterDiscount);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
