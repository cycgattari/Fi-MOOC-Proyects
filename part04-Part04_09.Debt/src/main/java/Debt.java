/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Debt {
    
    private double balance;
    private double interestRate;
    
    public Debt(double intialBalance, double initialInterestRate){
        this.balance = intialBalance;
        this.interestRate = initialInterestRate;
    }
    
    public void printBalance(){
        System.out.println(this.balance);
    }
    
    public void waitOneYear() {
        this.balance = (this.balance * this.interestRate);
    }
    
    
}
