
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
public class TodoList {
    
    private ArrayList<String> listado;
    
    public TodoList(){
       this.listado = new ArrayList<>(); 
        
    }    
    public void add(String task){
        this.listado.add(task);
    }
            
    public void print(){
        int counter = 1;
        for (String list: this.listado){
            System.out.println(counter + ": " + list);
            counter++;
        }
    }                       
    public void remove(int number){
        this.listado.remove(number-1);
    }
    
}
