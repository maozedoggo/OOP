import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter price of the item: ");
        double price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter discount rate (%): ");
        double discountRate = input.nextDouble();

        double totalPrice = price * quantity;
        double discount = totalPrice * (discountRate / 100);
        double finalPrice = totalPrice - discount;

        System.out.println("\nItem Details:");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Price After Discount: $" + finalPrice);
    }
}
