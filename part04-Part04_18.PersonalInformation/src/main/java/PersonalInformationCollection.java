
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>(); // creas array con objetos
        Scanner scanner = new Scanner(System.in); // 
        while (true){
            
            System.out.println("First name: ");
            String fName = scanner.nextLine();
            if (fName.isEmpty()){
                break;
            }
            
            System.out.println("Last name: ");
            String lName = scanner.nextLine(); 
            
            System.out.println("Identification number: ");
            String iNumber = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(fName, lName, iNumber));
            // agregas los objetos haciendo instancias de la clase con la data 
        }
        for (PersonalInformation infoC : infoCollection){
            System.out.println(infoC.getFirstName() + " " + infoC.getLastName());
// con un for loopeas por la lista sacando info.
        }
        

    }
}
