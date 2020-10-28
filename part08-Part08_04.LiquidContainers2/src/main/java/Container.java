
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Container {
    
    private int containerONE;
    private int containerTWO;
    private Scanner scan; 

    
    
    public Container(){
        this.containerONE = 0;
        this.containerTWO = 0;
        this.scan = new Scanner(System.in);

    }    
 
    public int contains(){
        return this.containerONE;
    }
    
    public void start(){
        while (true) {
            System.out.println("First: " + this.containerONE + "/100");   
            System.out.println("Second: " + this.containerTWO + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);
            String data = parts[0];
            if (data.equals("move")){
                move(amount);
            }                                                       
            if (data.equals("add")){
                add(amount);

            }
            if (data.equals("remove")){
                if (amount > 0){         
                    this.containerONE -= amount;
                    this.containerTWO -= amount;
                    if (this.containerTWO < 0){
                        this.containerTWO = 0;
                    if (this.containerTWO > 100){
                        this.containerTWO = 100;
    
            }
        }
        }
                remove(amount);
            }
        }                                        
    }
    public void move(int amount){
        if (amount > 0){
            if(amount > this.containerONE){
                this.containerTWO += this.containerONE;
                this.containerONE = 0;
        }
            if (amount <= this.containerONE){
                this.containerTWO += amount;
                this.containerONE -= amount;
            }
            if (this.containerTWO > 100){
                this.containerTWO = 100;

        }
    }
    }
    public void add(int amount){
        if (amount > 0){
            this.containerONE += amount;
            if (this.containerONE > 100){
                this.containerONE = 100;
            }
        }
    } 
    
    public void remove(int amount){
        if (amount > 0){                       
            this.containerONE -= amount;
            if (this.containerONE < 0){
                this.containerONE = 0;
            if (this.containerONE > 100){
                this.containerONE = 100;
    
            }
        }
        }
    }
    public String toString(){
        return this.containerONE + "/100";
    }
}
