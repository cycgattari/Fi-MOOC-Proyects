
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amountTotal = 0;
        int amountTotal2 = 0;        
        while (true) {
            System.out.println("First: " + amountTotal + "/100");   
            System.out.println("Second: " + amountTotal2 + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            String data = parts[0];
            if (data.equals("move")){
                if(amount > amountTotal){
                    amountTotal2 += amountTotal;
                    amountTotal = 0;
                }
                if(amount<=0){
                    continue;}
                if (amount <= amountTotal){
                    amountTotal2 = amountTotal2 + amount;
                    amountTotal -= amount;
                }
            }                                                       
            if (data.equals("add")){
                if (amount <= 0){
                    amount = 0;
                } else {
                    amountTotal += amount;
                }
            }
            if (data.equals("remove")){
                if(amountTotal2 - amount < 0){
                    amountTotal2= 0;
                } else {
                    amountTotal2 -= amount;
                }
                
            }
            if(amountTotal>100){
                amountTotal = 100;
            }
            if(amountTotal2>100){
                amountTotal2 = 100;
            }                                          
        }                     
    }
}
