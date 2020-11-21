
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean test = false;
        
        try (Scanner fileSearch = new Scanner(Paths.get(file))){            
            while (fileSearch.hasNextLine()){

                if (searchedFor.equals(fileSearch.nextLine())){
                    System.out.println("Found!");
                    test = true;
                    break;
                    }
            
                
            }
        } catch (Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        if (test == false){
            System.out.println("Not found");                                           
                }


        }

        
    }

