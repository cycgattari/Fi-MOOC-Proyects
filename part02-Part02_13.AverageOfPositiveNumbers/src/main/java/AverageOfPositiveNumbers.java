
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            
            if (rta > 0) {
                sumNumbers = sumNumbers + rta;
                numbers = numbers + 1;
            }           
        }
        if (sumNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sumNumbers/numbers);
        }     
    }    
}