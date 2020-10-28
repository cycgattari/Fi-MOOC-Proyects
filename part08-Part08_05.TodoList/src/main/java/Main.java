
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        TodoList todo = new TodoList();
        UserInterface list = new UserInterface(todo, scan);
        list.start();

    }
}
