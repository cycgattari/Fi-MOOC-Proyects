
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        while (true) {
            System.out.println("Give a number:"); 
            int rta = Integer.valueOf(scanner.nextLine());
            if (rta == 0) {
                break;
            }
            if (rta < 0) {
                numbers = numbers + 1;  
            }      
        }    
        System.out.println("Number of negative numbers: " + numbers); 
    }
}


