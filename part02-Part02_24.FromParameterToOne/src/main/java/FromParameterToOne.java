

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    
    
    public static void printFromNumberToOne(int number) {
        
        int iteRa = 0;
        while (number > iteRa){
            System.out.println(number);
            number--;
        }
    }
}