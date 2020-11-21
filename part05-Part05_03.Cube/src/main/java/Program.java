
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cube c = new Cube(7);
        System.out.println(c.volume());
        System.out.println(c.toString());
    }
}
