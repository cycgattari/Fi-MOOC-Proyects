
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listado = new ArrayList<>();
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            listado.add(input);
            if (input < 0){
                break;
            }
        listado.stream()
                .filter(s -> s > 0 && s < 6)
                .forEach(s -> System.out.println(s));
        }
                
        
    }
}
