
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
public class Box implements Packable {

    private double maxWeight;
    private double totalWeight;
    private ArrayList<Packable> boxItems;
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.boxItems = new ArrayList<>();
        this.totalWeight = 0;
    }
    
    public void add(Packable pack){
        if ((pack.weight()+totalWeight) <= maxWeight){
            totalWeight += pack.weight();
            boxItems.add(pack);
        }
    }
    
    @Override
    public double weight() {
        double sum = 0;
        for (Packable thinghs : boxItems){
            sum+= thinghs.weight();
    }
        return sum;
    }

    @Override
    public String toString() {
        return "Box: " + boxItems.size() + " items, total weight " + totalWeight + " kg";
    }
    
    
}
