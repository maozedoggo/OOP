import java.util.Scanner;

public class dirisaya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // Consume newline

        System.out.print("Enter your hobby: ");
        String hobby = input.nextLine();

        System.out.print("Enter your favorite food: ");
        String favoriteFood = input.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + hobby);
        System.out.println("Favorite Food: " + favoriteFood);
    }
}
