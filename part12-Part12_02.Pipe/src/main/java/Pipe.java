
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Pipe <T>{
    
    private ArrayList<T> listado;
    
    public Pipe(){
        this.listado = new ArrayList<>();
    }   
    public void putIntoPipe(T value){
        listado.add(value);
    }
    public T takeFromPipe(){
        if (listado.isEmpty()){
            return null;
        }
        T toReturn = listado.get(0);
        listado.remove(0);
        return toReturn;
    }
    public boolean isInPipe(){
        if (listado.isEmpty()){
            return false;
        } 
        return true;
    }
}
