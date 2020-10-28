
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Book {

    private String name;
    private int publishingYear;
    private int pageCount;
    private String author;

    public Book(String name, int ReleaseYear, int pages, String author) {
        this.name = name;
        this.publishingYear = ReleaseYear;
        this.pageCount = pages;
        this.author = author;
    }
    
    public static List<Book> readBooks(String file){
        List<Book> listadoLibros = new ArrayList<>();
        try{
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .map(partes -> new Book(partes[0], Integer.valueOf(partes[1]),Integer.valueOf(partes[2]),partes[3]))
                    .forEach(book -> listadoLibros.add(book));
        } catch (Exception e){
            System.out.println("error" + e.getMessage());
        }
        return listadoLibros;
    }

    
    public String getName() {
        return name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagecount() {
        return pageCount;
    }
    
    

}
