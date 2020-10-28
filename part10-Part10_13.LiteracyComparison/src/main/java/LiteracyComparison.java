
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LiteracyComparison {
    public static void main(String[] args) {
        ArrayList<Data> listado = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("literacy.csv"))){ 
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                for (String part: parts){
                    part.trim();
                }
                String country = parts[3];
                int year = Integer.valueOf(parts[4]);
                String sexo = parts[2];
                String[] listaSexo = sexo.split(" ");
                String sex = listaSexo[1];
                Double people = Double.valueOf(parts[5]);               
                listado.add(new Data(country, sex, year, people));
            }

        } catch (Exception e){
            System.out.println("Errorr" + e.getMessage());
        }
        
    listado.sort(Comparator.comparingDouble(Data::getPeople));
    
    for (Data list: listado){
        System.out.println(list);
    }
    
    }
}
