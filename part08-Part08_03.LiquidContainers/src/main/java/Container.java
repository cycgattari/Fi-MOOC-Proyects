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
    
    private int liters;
    
    public Container(){
        this.liters = liters;
    }

    public int getLiters() {
        return liters;
    }
    
    public void addAmount(int amount){
        if (amount > 0 && amount+liters <= 100){
            liters += amount;
        }
        if (liters+amount >= 100){
            liters = 100;
        }
        if (liters > 100){
            liters = 100;
        }
       
    }
    
    
    public void removeAmount(int amount){
        if (amount > 0 && liters-amount >= 0){
            liters -= amount;
        }
        if (liters-amount <= 0){
            liters = 0;
        }
    }
        
    
    public String toString(){
        return getLiters() + "/100";
    }
}
