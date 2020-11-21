
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int giveNum = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int otherNum = Integer.valueOf(scanner.nextLine());
        for (int i = otherNum; i <= giveNum ; i++) {
            System.out.println(i);
        } 
    }
}
