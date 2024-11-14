import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Your BMI is: %.2f%n", bmi);
    }
}
