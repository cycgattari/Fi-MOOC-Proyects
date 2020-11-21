
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:"); 
            int rta = Integer.valueOf(scanner.nextLine());
            if (rta < 0) {
                System.out.println("Unsuitable number"); 
                continue;
            }    
            if (rta > 0) {
                System.out.println(rta * rta);
                continue;
            }   
            if (rta == 0) {
                break;
            }
        }
    }
}

