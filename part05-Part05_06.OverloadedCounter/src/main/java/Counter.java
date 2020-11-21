/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Counter {
    
    private int StartValue;
    
    public Counter(int StartValue){ 
        this.StartValue = StartValue;
    }
    
    public Counter(){
        this(0);
    }

    public int value(){
        return this.StartValue;
    }
    
    public void increase(){
        this.increase(1);
    }
    
    public void decrease(){
        this.decrease(1);
    }
    
    public void increase(int increaseBy){
        if (increaseBy >= 0){
            this.StartValue = this.StartValue + increaseBy;
        }
    }
    
    public void decrease(int decreaseBy){
        if (decreaseBy >= 0){
            this.StartValue =  this.StartValue - decreaseBy;
    }
    }
}

