import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static void sort(int[] array) {
        int index = -1;

        for (int number : array ){
            index++;
            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));
        }
    }
    

    
    
    public static void swap(int[] array, int index1, int index2) {
        //int index = -1;
        int one = array[index1];
         array[index1] = array[index2];
        array[index2] = one;
        }    

        

    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallNew = 99999;
        int index = -1;
        int number2 = 0;

        for (int number : table ){
            index++;
            if (index >= startIndex && smallNew > number){                
                smallNew = number;
                number2 = index;
            }
        }
        return number2;
    }

    
    public static int indexOfSmallest(int[] array){
        int smallNew = Integer.MAX_VALUE;
        int index = -1;
        int number2 = 0;
        for (int number : array){
            index++;
            if(smallNew > number){
                smallNew = number;
                number2 = index;
            }
        }
        return number2;
         
    }

        
    public static int smallest(int[] listado){     
        int smallNew = Integer.MAX_VALUE;
        for (int number : listado){
            if(smallNew > number){
                smallNew = number;
                
            }
        }
        return smallNew;
    }

}
