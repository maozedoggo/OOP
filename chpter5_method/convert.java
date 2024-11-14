import java.util.Scanner;
public class convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Converter available :");
        System.out.println("1. Currency (MYR - YEN)");
        System.out.println("2. Mass (kg - pound)");
        System.out.println("3. Distance (km - m)");
        System.out.print("Choose your converter: ");
        int choice = scanner.nextInt();

        System.out.print("Insert Amount/Quantity: ");
        int quantity = scanner.nextInt();
        scanner.close();
    
        switch (choice) {
            case 1:
                float convert1 = (float) (quantity * 32.3588);
                System.out.println("RM " + quantity + " = " + convert1 + "JPY");
                break;
            case 2:
                float convert2 = (float) (quantity * 2.20462);
                System.out.println( quantity + "KG" + " = " + convert2 + "Pound");
                break;
            case 3:
                float convert3 = (float) (quantity * 1000);
                System.out.println( quantity +" kg "  + " = " + convert3 + "m" );    
             
                return;
        }

}
}