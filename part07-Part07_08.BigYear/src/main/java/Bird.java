/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Bird {
    
    private String name;
    private String nameLatin;
    private int observations;
    
    public Bird(String name, String nameLatin){
        this.name = name;
        this.nameLatin = nameLatin;
        this.observations = 0;
    }      
    public String getName() {
        return name;
    }
    public String getNameLatin() {
        return nameLatin;
    }
    public int getObservations() {
        return observations;
    }
    public void addObervation() {
        this.observations ++;
    }
    @Override
    public String toString() {
        return getName() + " (" + getNameLatin() + "):" + getObservations() + " observations" ; 
    }
    
}
