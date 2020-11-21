
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); // Scanner de siemre
        
        ArrayList<Integer> birthYears = new ArrayList <>();
        ArrayList<String> names = new ArrayList <>();
        
        while (true) {
            String input = x.nextLine(); 
            
            if (input.equals("")) {
                break;
            }
            
            String[] piezas = input.split(","); 
            birthYears.add(Integer.valueOf(piezas[1]));
            names.add(piezas[0]);                                           
        }
        
        String longName = names.get(0);
        for (String name : names) {
            if (name.length() > longName.length()) 
                longName = name;
        }
        System.out.println("Longest name:" + longName);

        int sumOfAges = 0;
        for (int birth : birthYears) {
            sumOfAges = sumOfAges + birth;
        }
        double average = 0;
        average = 1.0 * sumOfAges / birthYears.size();
        
        System.out.println("Average of the birth years: " + average);    
    }
}


    

