import java.util.Scanner;

public class swe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input your first name: ");
        String firstname = scanner.nextLine(); 
        System.out.print("input your last name: ");
        String lastname = scanner.nextLine(); 


 System.out.println("Hello");
 System.out.println(firstname + " " + lastname );
   
 
 scanner.close();
    }
}    


