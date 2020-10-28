
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList <Integer> lista = new ArrayList<>();
        ArrayList <Integer> listaNeg = new ArrayList<>();

        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            if (Integer.valueOf(input) > 0 ){
                lista.add(Integer.valueOf(input));
            } 
            if (Integer.valueOf(input) < 0 ){
                listaNeg.add(Integer.valueOf(input));

            }
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String negativePositive = scanner.nextLine();
        if (negativePositive.equals("n")){
            System.out.println("Average of the negative numbers: " + listaNeg.stream().mapToInt(i -> i).average().getAsDouble());
        } else {
            System.out.println("Average of the positive numbers: " + lista.stream().mapToInt(i -> i).average().getAsDouble());
        }    
    }
}

