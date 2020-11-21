
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counTer = 0;
        System.out.print("First number? ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int giveNum = Integer.valueOf(scanner.nextLine());
        for (int i = firstNumber ; i <= giveNum ; i++) { 
            counTer += i;
        }
        System.out.print("The sum is " + (counTer) );
    }
}

