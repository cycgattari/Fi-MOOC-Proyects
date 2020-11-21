
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
    
    private TodoList todolist;
    private Scanner scanner;
    
    public UserInterface(TodoList todolist, Scanner scanner){
        this.scanner = scanner;
        this.todolist = todolist;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String rta = scanner.nextLine();
            if(rta.equals("stop")){
                break;
            }
            if(rta.equals("add")){
                add();
                continue;
            }
            if(rta.equals("list")){
                list();
            }
            if(rta.equals("remove")){
                remove();
            }        
        }
    }
    
    public void remove(){
        System.out.print("Which one is removed?: ");
        int add3 = Integer.valueOf(scanner.nextLine());
        todolist.remove(add3);
    }

    
    public void list(){
        todolist.print();
    }
        
    public void add(){
        System.out.print("To add: ");
        String add2 = scanner.nextLine();
        todolist.add(add2);
    }
}
    
    
   

