
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Archive> archives = new ArrayList<>();        
        
        while (true){
            System.out.println("Identifier? (empty will stop)");
            String newIdent = scanner.nextLine();
            if (newIdent.isEmpty()){
                break;
            }                
            System.out.println("Name? (empty will stop)");                
            String newName = scanner.nextLine();
            if (newName.isEmpty()){
                break;
                }
            
            Archive newArch = new Archive(newIdent, newName);
            if (archives.contains(newArch)){
                continue;
            } else {
                archives.add(new Archive(newIdent, newName));
            }                       
            
        }    
        System.out.println("==Items==");
            for (Archive list : archives){
              
                System.out.println(list.getIdentifier() + ": " + list.getName());
            }                        
        }        
}
        

   // public void listar() {
   //     for (Archive list : archive){
     //       list();
    //        }
   // }


