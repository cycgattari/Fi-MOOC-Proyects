
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList <Integer> listados = new ArrayList<>();
        
        while (true) {
            int inputUser = Integer.valueOf(scanner.nextLine());
            if (inputUser == -1 ) {
                break;
            }
            listados.add(inputUser);
        }
        double sumaNumeros = 0;
        for (int i=0 ; i < listados.size() ; i++) {
            sumaNumeros = sumaNumeros + listados.get(i)  ;
           
        }
        double average = sumaNumeros / listados.size() ;
        System.out.print("Average: " + average);
        
        
        
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
