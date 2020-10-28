
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int i = 0;
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input > 0){
                i++;                suma += input ;

            }
            if (input == 0){
                break;
            }
        }
        if (suma == 0){
            System.out.println("Cannot calculate the average");
        } else {
            double rtado = suma / i;
            System.out.println(rtado);
        }
    }
}
            
           
    
            

