
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]: ");
        int first = Integer.valueOf(scan.nextLine());
        if (first < 0) {  
            System.out.println("Grade: impossible!");
        } else if (first < 50) {
            System.out.println("Grade: failed");
        } else if (first < 60) {    
            System.out.println("Grade: 1");
        } else if (first < 70) {
            System.out.println("Grade: 2");
        } else if (first < 80) {
            System.out.println("Grade: 3");
        } else if (first < 90) {
            System.out.println("Grade: 4");
        } else if (first <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
    }    
}
