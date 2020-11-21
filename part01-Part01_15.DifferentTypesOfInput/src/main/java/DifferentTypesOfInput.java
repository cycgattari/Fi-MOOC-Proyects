
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner asdf = new Scanner(System.in);
        
        System.out.println("Give a string: ");
        String text = asdf.nextLine();
              
        System.out.println("Give an integer: ");
        int numeroPepito  = Integer.valueOf(asdf.nextLine());
                
        System.out.println("Give a double: ");   
        double doubNum = Double.valueOf(asdf.nextLine());
               
        System.out.println("Give a boolean: ");
        boolean trueOrFalse  = Boolean.valueOf(asdf.nextLine());
        
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + numeroPepito );
        System.out.println("You gave the double " + doubNum);
        System.out.println("You gave the boolean " + trueOrFalse );
    }   
}
