
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
public class Suitcase {
    
    private ArrayList<Item> items;
    private int maxWeight;
    private int totalWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.totalWeight = 0;
    }
    
    public void addItem(Item item){           
        if (this.maxWeight >= (item.getWeight()+this.totalWeight)){
            this.items.add(item);
            totalWeight += item.getWeight();
        }       
    }
    public void printItems(){
        for (Item cosa2: this.items){
            
            System.out.println( cosa2.getName() + " (" + cosa2.getWeight() + " kg)");
        }
    }
    
    public int totalWeight(){
        return totalWeight;
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item firstItem = this.items.get(0);
        for (Item cosa2: this.items){
            if (cosa2.getWeight() > firstItem.getWeight()){
                firstItem = cosa2;
            }
        }
        return firstItem;
    }

     

    public String toString(){        
        if (items.size() == 0){
            return "no items (0 kg)";
        }
        if (items.size() == 1){
            return "1 item (" + totalWeight +  "kg)";
        }
        return items.size() + "items(" + totalWeight + "kg)";        
    }    
}
