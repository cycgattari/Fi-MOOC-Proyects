
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giveNum = Integer.valueOf(scanner.nextLine());
        for (int i = giveNum; i < 100 ; i++) {
            System.out.println(i);
        } 
        System.out.println(100);
    }
}
