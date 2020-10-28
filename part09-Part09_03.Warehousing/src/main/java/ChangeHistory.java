
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class ChangeHistory {
    
    private ArrayList<Double> values;
    
    
    public ChangeHistory(){
        this.values = new ArrayList<>();
    }
    
    public void add(double status){
        this.values.add(status);
    }
    
    public void clear(){
        this.values.clear();
    }
    
    public double maxValue(){
        return Collections.max(this.values);
    }
    
    public double minValue(){
        return Collections.min(this.values);
    }
    
    public double average(){
        double sum = 0;
        if (this.values.isEmpty()){
            return 0;
        } else {
            for (double number : this.values){
                sum += number;
            }
            return (sum / values.size());
        }     
    }
    
    public String toString(){
        String data = values.toString();
        return data;
    }
            
}
