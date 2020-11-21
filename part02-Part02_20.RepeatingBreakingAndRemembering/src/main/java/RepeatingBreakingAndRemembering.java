
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers: ");
        int sumNumbers = 0;
        int counTer = 0;
        int evenTest = 0;
        double otherCounter = 0;
        int oddTest = 0;
        double  averaGe = 0;
        while (true) {
            int firstNumber = Integer.valueOf(scanner.nextLine());
            
            if (firstNumber == -1) {
                break;
            }
            sumNumbers += firstNumber;
            counTer ++;
            otherCounter ++;
            
            if (firstNumber % 2 > 0) {
                evenTest ++;
            }
            if (firstNumber % 2 == 0) {
                oddTest ++;
            }         
        }     
        averaGe = (double) (1.0 * sumNumbers / otherCounter);

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sumNumbers);
        System.out.println("Numbers: " + counTer);        
        System.out.println("Average: " + averaGe);
        System.out.println("Even: " + oddTest); 
        System.out.println("Odd: " + evenTest); 
    }
}