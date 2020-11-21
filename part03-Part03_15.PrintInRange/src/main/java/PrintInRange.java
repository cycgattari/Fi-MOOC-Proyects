
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(3);
        numbers1.add(2);
        numbers1.add(6);
        numbers1.add(-1);
        numbers1.add(5);
        numbers1.add(1);
        
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers1 ,0 ,5);
        
        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers1 ,3 ,10);
    }
    
                

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number: numbers) {
            if (number <= upperLimit && number >= lowerLimit ) {
                System.out.println(number);
            
            }
        
        }
    }    
}
