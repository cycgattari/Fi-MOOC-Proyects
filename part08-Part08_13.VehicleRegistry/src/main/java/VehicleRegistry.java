
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> cars; 

    
    public VehicleRegistry(){
        this.cars = new HashMap<>();        
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if (cars.containsKey(licensePlate)){
            return false;

        }
        cars.put(licensePlate, owner);

        return true;
    }
    
    public String get(LicensePlate licensePlate){
        return cars.get(licensePlate);
              
    }
    public boolean remove(LicensePlate licensePlate){
        if (cars.containsKey(licensePlate)){
            cars.remove(licensePlate);
            return true;
        }
        return false;
    }  
    public void printLicensePlates(){
        for (LicensePlate lic : cars.keySet()){
            System.out.println(lic);
        }
    }
    public void printOwners(){
        ArrayList<String> printed = new ArrayList<>();
 
        for (String owner : cars.values()) {
            if (printed.contains(owner)) {
                continue;
            }
 
            System.out.println(owner);
            printed.add(owner);
        }
    } 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.cars);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VehicleRegistry other = (VehicleRegistry) obj;
        if (!Objects.equals(this.cars, other.cars)) {
            return false;
        }
        return true;
    }
    
    
}
