
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random;    

    public LotteryRow() {    
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random azar = new Random();
        
        for (int i =0 ; i < 7 ; i++){
            int test = azar.nextInt(41);
            if (containsNumber(test) == false && test > 0){
                numbers.add(test);
            } else {
                i--;
            }       
        }
    }

    public boolean containsNumber(int number) {
        if (numbers.contains(number)){
            return true;
        }       
        return false;
    }
}

