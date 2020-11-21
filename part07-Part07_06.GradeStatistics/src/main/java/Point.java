
import java.lang.reflect.Array;
import java.util.Scanner;

public class Point {    
    
    private int numbers;
    private Scanner scan;
    
    public Point(Scanner scan){
        this.scan = scan;
        this.numbers = 0;
    }

    public int getNumbers() {
        return numbers;
    }
    
    public void start(){      
        int sum = 0;
        int sumPassing = 0;
        int counter = 0;
        int counterPassing = 0;
        int[] star = new int[6];
        System.out.println("Enter point totals, -1 stops:");       
        while (true){                                   
            this.numbers = Integer.valueOf(scan.nextLine());
            
            if (this.numbers >= 0 && this.numbers <= 100){
                sum += numbers;
                counter++;  
                if (numbers < 50){
                    star[0]++;
                }
                if (numbers >= 50 && numbers < 60){
                    star[1]++;
                }
                if (numbers >= 60 && numbers < 70){
                    star[2]++;
                }
                if (numbers >= 70 && numbers < 80){
                    star[3]++;
                }
                if (numbers >= 80 && numbers < 90){
                    star[4]++;
                }
                if (numbers >= 90 && numbers <= 100){
                    star[5]++;
                }                                  
            }
            if (this.numbers >= 50 && this.numbers <= 100){
                sumPassing += numbers;
                counterPassing++;
            }                                           
            if (this.numbers == -1){
                avg(sum, counter); 
                avgPassing(sumPassing, counterPassing);
                passPct(counterPassing, counter);
                grade(star);
                break;
            }           
        }                     
    }
    public void avgPassing(int sumPassing, int counterPassing){ 
        if (sumPassing != 0){
            double avgPassing = (1.0 * sumPassing / counterPassing);        
            System.out.println("Point average (passing): " + avgPassing );
        } else {
            System.out.println("Point average (passing): -" );
        }
    }
    public void avg(double sum, double counter){  
        double avg = (1.0 * sum / counter);        
        System.out.println("Point average (all): " + avg );

    }
    public void passPct(double counterPassing, double counter){  
        double pct = (100 * counterPassing / counter);        
        System.out.println("Pass percentage: " + pct );

    } 
    public void grade(int[] star){  
        System.out.println("Grade distribution: ");
        int index = 5;
        for (int i=star.length-1  ; i>=0 ; i--){  
            int cant = star[index];
            System.out.print(index + ": ");
            printStars(cant);
            System.out.println("");
            index--;
        }
    }
    public void printStars(int number) {
        int i = 0;
        while ( i < number) {
            System.out.print("*");
            i++;
        }        
    }  
}
    

    
