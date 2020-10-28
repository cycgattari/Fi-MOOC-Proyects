
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listado = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            listado.add(input);
            if (input.isEmpty()){
                break;            
            }   
        }   
        listado.stream()
            .forEach(num -> System.out.println(num));
    }
}
