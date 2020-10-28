
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class ShoppingCart {
    
    private Map<String, Item> cart;
    
    public ShoppingCart(){    
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price){    
            int flag = 1;
            Item newItem = new Item(product, 1 , price);
            for (Item item: cart.values()){
                String comparador = item.getProduct(); 
                if (product.equals(comparador)){
                    item.increaseQuantity();
                    flag = 0;                   
                }
            } 
            if (flag == 1){
                cart.put(product, newItem);
            }
    }
             
    public int price(){
        int totalPrice = 0;
        for (Item item: cart.values()){
            if (item.price()>= 0){
                totalPrice += item.price();
            }
        }
        return totalPrice;
    }
    
    public void print(){
        for (Item item: cart.values()){
            System.out.println(item.toString());
        }
    }
}
