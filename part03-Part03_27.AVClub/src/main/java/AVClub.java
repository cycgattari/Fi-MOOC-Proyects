
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine(); 
            String [] pieces = input.split(" ");
            for (String piece : pieces) {
                if (input.contains("av")){  
                    System.out.println(piece);
                }
            }        
            if (input.equals("")){
                break;
            }
        }
    }        
}
