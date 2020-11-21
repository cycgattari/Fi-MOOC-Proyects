
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counTer = 1;
        System.out.print("Give a number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        for (int i = 1 ; i <= firstNumber ; i++) { 
            counTer *= i;
        }
        System.out.print("Factorial " + (counTer) );
    }
}

