public class Test {
    public static void main(String str[]) {
        int y = 0;
        int x = 1;

        // Check if division by zero occurs
        if (y != 0) {
            int z = x / y;
            System.out.println("Result of division: " + z);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("After division");
    }
}
