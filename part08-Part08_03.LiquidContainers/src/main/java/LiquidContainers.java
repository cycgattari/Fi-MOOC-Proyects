
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container contOne = new Container();
        Container contTwo = new Container();
       
        while (true) {
            System.out.println("First: " + contOne);
            System.out.println("Second: " + contTwo);      
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                contOne.addAmount(amount);
            }
            if (command.equals("move")) {
                contOne.removeAmount(amount);
                contTwo.addAmount(amount);
            }
            if (command.equals("remove")) {
                contTwo.removeAmount(amount);
            }
            if (input.equals("quit")) {
                break;
            }
        }
    }
}
