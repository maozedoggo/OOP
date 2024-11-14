public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Addition: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Subtraction: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Multiplication: " + product);

        // Division
        int quotient = a / b;
        System.out.println("Division: " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println("Modulus: " + remainder);

        // Assignment operators
        a += b; // equivalent to a = a + b
        System.out.println("After a += b, a = " + a);

        a -= b; // equivalent to a = a - b
        System.out.println("After a -= b, a = " + a);

        a *= b; // equivalent to a = a * b
        System.out.println("After a *= b, a = " + a);

        a /= b; // equivalent to a = a / b
        System.out.println("After a /= b, a = " + a);

        a %= b; // equivalent to a = a % b
        System.out.println("After a %= b, a = " + a);
    }
}
