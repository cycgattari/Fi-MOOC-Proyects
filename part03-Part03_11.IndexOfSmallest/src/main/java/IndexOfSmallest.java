
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList <Integer> listSearch = new ArrayList<>();
        
        while (true) {
            int inputUser = Integer.valueOf(scanner.nextLine());
            
            if (inputUser == 9999) {
                break;
            }
            listSearch.add(inputUser);                                     
        }
        int smallNumber = listSearch.get(0);
        for (int i = 0; i < listSearch.size(); i++) {
            if (smallNumber > listSearch.get(i)) {
                smallNumber = listSearch.get(i);                    
            }
            //else if (smallNumber == listSearch.get(i)) {
                
             //   System.out.print("Found at index: " + i);
            
            //}
        }
        System.out.println("Smallest number: " + smallNumber);
        for (int i = 0; i < listSearch.size(); i++) {
            if (smallNumber == listSearch.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }    
    }
}    

        
        
                
        
        
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

     