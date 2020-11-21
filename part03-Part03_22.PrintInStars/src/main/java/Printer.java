
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int index = 0;  
        int index2 = 0;
        while (index < array.length) {
            
            while (index2 < array[index]){
                System.out.print("*");
                index2++;
            }
            index++;
            index2 = 0;
            System.out.println("");
            
                        
        }            
    }
}
