
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rtaOld = 0;
        int comparador = 0;
        String rtaFinal = "";
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String [] piezas = input.split(",");            
            comparador = Integer.valueOf(piezas[1]);
            
            if (rtaOld < comparador) {
                    rtaOld = comparador;
                    rtaFinal = piezas[0];
            }
        }
        
        System.out.println("Name of oldest: " + rtaFinal);
    }
}
