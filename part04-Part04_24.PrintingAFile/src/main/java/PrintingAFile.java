
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))){
                          
            while (scanner.hasNextLine()){
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
        } catch (Exception e){
                System.out.println("Error! lpm! " + e.getMessage());
                }
    }
}
