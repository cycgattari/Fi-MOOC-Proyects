
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String input = scanner.nextLine();
        System.out.println("Enter password: ");
        String input2 = scanner.nextLine();


        if (input.equals("alex") && input2.equals("sunshine")) {
            System.out.println("You have successfully logged in");
        } else if (input.equals("emma") && input2.equals("haskell")) {
            System.out.println("You have successfully logged in");  
        } else {    
            System.out.println("Incorrect username or password!");
        }
    }
}
