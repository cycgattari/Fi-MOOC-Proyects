
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Book> readBooks(String file){
        try{
            return Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .map(partes -> new Book(partes[0], Integer.valueOf(partes[1]),Integer.valueOf(partes[2]),partes[3]))
                    .collect(Collectors.toList());
                    } catch (Exception e){
            System.out.println("error" + e.getMessage());
        }
        return new ArrayList<>();
    }


}
