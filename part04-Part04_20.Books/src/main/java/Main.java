import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> booksList = new ArrayList<>();
               
        while (true){
            System.out.println("Title: ");            
            String inputTitle = scanner.nextLine();
            if (inputTitle.isEmpty()){
                break;
            }

            System.out.println("Pages: ");
            String inputPages = scanner.nextLine();                    
                    
            System.out.println("Publication year: ");
            String inputYear = scanner.nextLine();

            booksList.add(new Book(inputTitle, inputPages, inputYear));                      
        }
        
        System.out.println("What information will be printed? ");
        String answer = scanner.nextLine();                    
        for (Book book : booksList){
            if (answer.equals("everything")){
                System.out.println(book );                
                
            } else {
                System.out.println( book.getName()  );

                }
                    
        }
    }
}
