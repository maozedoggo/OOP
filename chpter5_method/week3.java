import java.util.Scanner;  // Import the Scanner class 
public class week3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner object to read input
        
        System.out.print("Enter the marks: "); // asks user to enter a marks
        int marks = scan.nextInt(); // Read input from the user

        // 
        if (marks < 50) {
            System.out.println("E grade"); //grade E is between 60 and 50
        } else if (marks >= 50 && marks < 60) {
           System.out.println("D grade"); //grade D is between 60 and 50
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade"); //grade C is between 60 and 50
         } else if (marks >= 70 && marks < 80) {
                System.out.println("B grade"); //grade B is between 60 and 50
         }else if (marks >= 80 && marks < 100) {
                    System.out.println("A grade"); //grade A is between 60 and 50
            
        scan.close(); // tutup scanner utk avoid resource leaks
    }
}
}
