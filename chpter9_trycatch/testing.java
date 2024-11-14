public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Section of code which might fail
            int[] numbers = new int[3];
            System.out.println("Accessing an element out of bounds: " + numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
        }
        // Catch specific exception for ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds.");
        }
        // Catch another type of exception, for example, ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Arithmetic error.");
        }
        // The `finally` block will always execute, regardless of whether an exception was thrown or not.
        finally {
            System.out.println("This block always executes, whether an exception is caught or not.");
        }
    }
}
