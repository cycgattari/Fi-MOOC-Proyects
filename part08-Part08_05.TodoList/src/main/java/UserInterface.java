
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
public class UserInterface {
    
    private Scanner scan;
    private TodoList listita;
    
    public UserInterface(TodoList listita, Scanner scan){
        this.scan = scan;
        this.listita = listita;
    }
    
    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = scan.nextLine();
            if (command.equals("add")){
                System.out.print("To add: ");
                String input = scan.nextLine();
                listita.add(input);               
            }
            if (command.equals("list")){
                listita.print();
            }
            if (command.equals("remove")){
                System.out.print("Which one is removed? ");
                int toRemove = Integer.valueOf(scan.nextLine());
                listita.remove(toRemove);
            }
            if (command.equals("stop")){
                break;
            }


            

        }
    }
    
}
