
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> listado = new ArrayList<>();
        while (true){
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();      
            if (bookName.equals("")){
                break;
            }
            System.out.print("Input the age recommendation: ");
            int ageRecomend = Integer.valueOf(scanner.nextLine());
            listado.add(new Books(bookName, ageRecomend));  
            System.out.println("");
        }
        System.out.print("");
        System.out.println(listado.size() + " books in total.");
        System.out.println("Books:");
        
        Comparator<Books> comparator = Comparator
                .comparing(Books::getAgeRecomend)
                .thenComparing(Books::getBookName);
        Collections.sort(listado, comparator);
        
        for (Books book: listado){
            System.out.println(book);
        }


        
        

    }

}
