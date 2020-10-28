
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    
    //private int price;
   // private int stock;
    
    private Map<String, Integer> pStock;
    private Map<String, Integer> pPrice;
    
    public Warehouse(){
        this.pPrice = new HashMap<>();
        this.pStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        pPrice.put(product, price);
        pStock.put(product, stock);
    }
    
    public int price(String product){
        return pPrice.getOrDefault(product, -99);
        
    }
    
    public int stock(String product){
        return pStock.getOrDefault(product, 0);
    }
    
    
    public boolean take(String product){
        if( stock(product) >= 1){
            int value = pStock.get(product);
            value--;
            pStock.put(product, value);   
            return true;

        }
        return false;
    }
    public Set<String> products(){
        return pPrice.keySet();

    }
}
