
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine(); // traes el texto de la file
        // SCANEAS EL ARCHIVO 2 WHILE 3 LES LINEA POR LINEA
        try (Scanner readFile = new Scanner(Paths.get(fileName))){ 
       // traes con try leer file con scanner a la file
            
            while (readFile.hasNextLine()){ // mientras tenga una linea
                String linea = readFile.nextLine(); // la proxima linea de readfile
                String[] listado = linea.split(","); // la agreagas a un array
                int age = Integer.valueOf(listado[1]); // 
                String name = listado[0];
           
                
                if (age == 1 ){
                    System.out.println(name + ", " + age + " year");

                }
                else {
                    System.out.println(name + ", " + age + " years");

                }
            }
        }
        

            
        
        catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }    
    }
}
