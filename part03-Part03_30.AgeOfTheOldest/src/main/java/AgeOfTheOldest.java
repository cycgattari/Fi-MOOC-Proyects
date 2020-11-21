
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rtaOld = 0;
        int comparador = 0;
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String [] piezas = input.split(",");            
            comparador = Integer.valueOf(piezas[1]);
            
            if (rtaOld < comparador) {
                    rtaOld = comparador;
                }
        }                                                      
        System.out.println("Age of oldest: " + rtaOld);
    }             
}

