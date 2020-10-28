/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{    
    
    private ChangeHistory historia;

    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){      
        super(productName, capacity);
        setBalance(initialBalance);
        this.historia = new ChangeHistory();
        this.historia.add(initialBalance);
    }
    
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        historia.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double get = super.takeFromWarehouse(amount);
        historia.add(super.getBalance());
        return get;
    }
      
    public String history(){
        return historia.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + getName() );
        System.out.println("History: " + historia.toString() );
        System.out.println("Largest amount of product: " + historia.maxValue() );
        System.out.println("Smallest amount of product: " + historia.minValue() );
        System.out.println("Average: " + historia.average());

    }
    
}
