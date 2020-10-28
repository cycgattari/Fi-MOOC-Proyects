
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        Checker check = new Checker();
        
        if (check.isDayOfWeek(input) == true){
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
                if (check.isDayOfWeek(input) == true){
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }

}
}

    

