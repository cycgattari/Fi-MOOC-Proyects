
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
public class Abbreviations {
    
    private HashMap<String, String> abbre;
    
    public Abbreviations(){
        this.abbre = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        abbre.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if(abbre.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation){
        return this.abbre.get(abbreviation);     
        }
        
    }
    
    
    

