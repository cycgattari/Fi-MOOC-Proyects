
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        // Alimento la lista de obj clase persona con un metodo
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);
        }
    }
    // creo el metodo pub static Arraylist peson toma file
    public static ArrayList<Person> readRecordsFromFile(String file) {
        // 
        
        ArrayList<Person> persons = new ArrayList<>();
        
        // creas una lista
        try (Scanner fileToRead = new Scanner(Paths.get(file))){
        // con try lees la file
        
        // mientras el file tenga lineas    
            while (fileToRead.hasNextLine()){
                String dataLine = fileToRead.nextLine();
            // string es la proxima linea 
                String[] listadoPer = dataLine.split(",");
            // haces slipt y creas un array para ubicar 0 y 1
                int perAge = Integer.valueOf(listadoPer[1]);
                persons.add(new Person (listadoPer[0], perAge));        
            }                                                 
        } catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }                        
        return persons;

    }
}
