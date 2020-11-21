
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String input = scanner.nextLine(); // pedis un input de la file
                
        try (Scanner scannerTxt = new Scanner(Paths.get(input))){ // probas si puede scanear el file
            while (scannerTxt.hasNextLine()){ // mientras tenga una linea 
                System.out.println(scannerTxt.nextLine()); // imprimis una por una 
            }
            
            
        } catch (Exception e){
            System.out.println("error! " + e.getMessage());               
            
        }                                      
    }
}
