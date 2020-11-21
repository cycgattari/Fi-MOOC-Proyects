
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while (true) {
            String input = scanner.nextLine();
            String [] piezas = input.split(" ");
            if (input.equals("")){
                break;
            }

            int size = piezas.length - 1;
            System.out.println(piezas[size]);
                
            
            
            
            
           
        }

    }
}
