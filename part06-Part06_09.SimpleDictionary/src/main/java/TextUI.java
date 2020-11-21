
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary simple;

    public TextUI(Scanner scanner, SimpleDictionary simple){
        this.scanner = scanner;
        this.simple = simple;
    }
    
    public void start(){
        while (true){
            System.out.print("Command: ");
            String rta = scanner.nextLine();
            if (rta.equals("end")){
                break;
            }
            if (rta.equals("add")){
                System.out.print("Word: ");
                String wordTo = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();                
                simple.add(wordTo, translation);                
                continue;
            }
            if (rta.equals("search")){
                System.out.print("To be translated: ");
                String toBe = scanner.nextLine();
                String rtaDo = simple.translate(toBe);
                if (rtaDo == (null)){
                    System.out.print("Word " +  toBe +" was not found");
                    continue;                    
                }                        
                System.out.println(simple.translate(toBe));
                continue;
            }
            System.out.println("Unknown command");
        }
        System.out.println("Bye bye!");   

    }
    
    
}
