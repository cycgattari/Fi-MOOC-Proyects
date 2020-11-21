import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Name: ");
            String fName = scanner.nextLine();
            if (fName.isEmpty()){
                break;
            }                                                          
            System.out.println("Duration: ");
            int fDuration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(fName, fDuration));
                                                                                 
        }
        System.out.println("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program : programs){
            if ( maxDuration >= program.getDuration()){
                System.out.println(program);
            }            
        }                    
    }
}
