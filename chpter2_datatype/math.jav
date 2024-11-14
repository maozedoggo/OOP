public class CompoundProg {
    public static void main(String[] args) {
        int x = 5;

        // Pre-increment
        System.out.println("Pre-increment: " + (++x)); // Increments before displaying

        // Post-increment
        System.out.println("Post-increment: " + (x++)); // Displays first, then increments
        System.out.println("Value after post-increment: " + x);

        // Pre-decrement
        System.out.println("Pre-decrement: " + (--x)); // Decrements before displaying

        // Post-decrement
        System.out.println("Post-decrement: " + (x--)); // Displays first, then decrements
        System.out.println("Value after post-decrement: " + x);
    }
}
