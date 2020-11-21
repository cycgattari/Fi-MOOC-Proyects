
import java.util.ArrayList;
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
    
    private JokeManager jokeM;
    private Scanner scanner;
        
    public UserInterface(JokeManager jokeM, Scanner scanner){
        this.scanner = scanner;
        this.jokeM= jokeM;
    }
    
    public void start(){
        
        while (true){
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            } if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                this.jokeM.addJoke(joke);
            } if (command.equals("2")) {
                System.out.println(this.jokeM.drawJoke());                    
            } if (command.equals("3")) {
                this.jokeM.printJokes();
            }
        }
    }
}
    
    

