
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> listado;
 
    public StorageFacility(){
        this.listado = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.listado.putIfAbsent(unit, new ArrayList<>());
        this.listado.get(unit).add(item);
   }
    
    public ArrayList<String> contents(String storageUnit){
        if (this.listado.containsKey(storageUnit)){   
            return this.listado.get(storageUnit);
        } else {
            return new ArrayList<>();
        }
    }
    
    public void remove(String storageUnit, String item){
        for (String data : this.listado.keySet()){
            if(data.equals(storageUnit)){
                listado.get(data).remove(item);
            }
           //if(data.equals(storageUnit) && listado.get(data).isEmpty()){
           //     listado.get(data).clear();
           // }
        }
    }
   
    public ArrayList<String> storageUnits(){
        ArrayList<String> datazo = new ArrayList<>();
        for (String data : this.listado.keySet()){
                datazo.add(data);
            }
        return datazo;    
    }
}


