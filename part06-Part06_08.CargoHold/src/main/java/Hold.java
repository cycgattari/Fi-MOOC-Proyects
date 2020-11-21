
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Hold {
    
    private int totalWeight;
    private int maxWeight;
    private ArrayList<Suitcase> suitCases;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitCases = new ArrayList<>();
        this.totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (this.maxWeight >= (suitcase.totalWeight()+this.totalWeight)){
            suitCases.add(suitcase);
            this.totalWeight += suitcase.totalWeight();
        }
    }
    public void printItems(){
        for (Suitcase cosa2: this.suitCases){
            cosa2.printItems();
        }
    }       
 
    public String toString(){               
        if(suitCases.isEmpty()){
            return null;
        }       
        return  suitCases.size() + " suitcases ( " + this.totalWeight + " kg)";
    }
}
