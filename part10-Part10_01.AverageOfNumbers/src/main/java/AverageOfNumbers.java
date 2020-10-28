
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers, type \"end\" to stop.");
        List<Integer> inputs = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            
            if (input.equals("end")){
                break;
            }
            
            inputs.add(Integer.valueOf(input));
        }
        System.out.println("average of the numbers: " + inputs.stream().mapToInt(i -> i).average().getAsDouble());


        }

    }



