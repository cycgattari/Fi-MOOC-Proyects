
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numbers = 0;
        float sumNumbers = 0;
        while (true) {
            System.out.println("Give a number:"); 
            int rta = Integer.valueOf(scanner.nextLine());
            if (rta == 0) {
                break;
            }
            numbers = numbers + 1;
            sumNumbers = sumNumbers + rta;
            
        }      
        System.out.println("Average of the numbers: " + (sumNumbers/numbers));
    }    
}