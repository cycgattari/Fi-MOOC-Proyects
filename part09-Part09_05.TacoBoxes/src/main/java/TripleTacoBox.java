/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class TripleTacoBox implements TacoBox{
    
    private int tacos;
    
    public TripleTacoBox(){
        this.tacos = 3;
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        tacos -= 1;
        if (tacos < 0){
            tacos = 0;
        }
    }
    
    
    
    
    
    
    
}
