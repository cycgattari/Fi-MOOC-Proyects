/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Product {
    
    private String name;
    private int quantity;
    private double price;
    
    public Product(String nombre, int cantidad, double precio){
        this.name = nombre;
        this.quantity = cantidad;
        this.price = precio;
    }
        
    public void printProduct(){
        System.out.println(this.name + this.quantity + this.price);
    }
    
}
