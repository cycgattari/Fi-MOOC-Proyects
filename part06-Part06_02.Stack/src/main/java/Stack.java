
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
public class Stack {
    
    private ArrayList<String> listado;
    
    public Stack(){
        this.listado = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.listado.isEmpty();
    }
    
    public void add(String value){
        this.listado.add(value);
    }
    
    public ArrayList<String> values(){
        return this.listado;
    }
    
    public String take(){
        int sized = this.listado.size() -1 ;
        return this.listado.remove(sized);
    }
    
}
