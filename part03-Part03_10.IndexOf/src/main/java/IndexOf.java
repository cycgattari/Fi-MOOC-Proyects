
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.print("Search for?");
        int searchNumber = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            int numBer = list.get(i);
            if (searchNumber == list.get(i)) {
                System.out.println(searchNumber + " is at index " + i);
            }
        }    
    }   
}
