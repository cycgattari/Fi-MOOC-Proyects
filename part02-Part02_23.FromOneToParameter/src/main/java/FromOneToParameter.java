

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    
    
    public static void printUntilNumber(int number) {
        
        int iteRa = 0;
        while (number > iteRa){
            iteRa++;
            System.out.println(iteRa);
        }
        
    }
}
