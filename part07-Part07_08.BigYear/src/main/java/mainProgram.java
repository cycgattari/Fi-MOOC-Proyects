
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList <Bird> listadoBirds = new ArrayList<>();
        
        while (true){
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Add")){                  
                System.out.print("Name: ");
                String nameInput = scan.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatinInput = scan.nextLine();
                listadoBirds.add(new Bird(nameInput, nameLatinInput));
            }
                        
            if (command.equals("All")){
                for (Bird bird: listadoBirds){
                    System.out.println(bird);
                }           
            }
            if (command.equals("One")){
                System.out.print("Bird? ");
                String nameBird = scan.nextLine();
                for (Bird bird: listadoBirds){
                    String nameb = bird.getName();
                    if (nameb.equals(nameBird)){
                        System.out.println(bird);
                    }
                }
            }
            if (command.equals("Observation")){           
                System.out.print("Bird? ");
                String nameObs = scan.nextLine();
                for (Bird bird: listadoBirds){
                    String nameB2 = bird.getName();
                    if (nameB2.equals(nameObs)){
                        bird.addObervation();
                     }
                }
            }
            if (command.equals("Quit")){
                break;
            }    
        }        
        
    }
}


