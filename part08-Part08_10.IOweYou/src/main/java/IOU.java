
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class IOU {
      
    private HashMap<String, Double> debts;
            
    public IOU(){
        this.debts = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        debts.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        for (String nombre : this.debts.keySet()){
            if(nombre.equals(toWhom)){
                return debts.getOrDefault(nombre, 0.00);            
            }
        }
        return 0.00;
    }
}
    
    
