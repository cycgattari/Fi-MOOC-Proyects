
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int sumNumbers = 0;
        while (true) {
            System.out.println("Give a number:"); 
            int rta = Integer.valueOf(scanner.nextLine());
            if (rta == 0) {
                break;
            }
            numbers = numbers + 1;
            sumNumbers = sumNumbers + rta;
        }      
        System.out.println("Number of numbers: " + numbers); 
        System.out.println("Sum of the numbers: " + sumNumbers); 
    }    
}