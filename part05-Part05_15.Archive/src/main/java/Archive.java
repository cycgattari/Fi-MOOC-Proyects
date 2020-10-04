
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
public class Archive {
    
    
    private String identifier;
    private String name;
    


    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Archive)){
            return false;
        }
        
        Archive compareArchive = (Archive) compared;

        if (this.identifier.equals(compareArchive.identifier) ) {
            return true;
        }
        return false;
        
        
        //if (getClass() != obj.getClass()) {
        //    return false;
        //}
        //final Archive other = (Archive) obj;
        //if (!Objects.equals(this.identifier, other.identifier)) {
        //    return false;
        //}
        //return true;
    }
    
    public Archive(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getIdentifier(){
        return this.identifier;
    }
    
    public void listListado(){
        
    }
    
    public String toString(){
        return this.identifier + ": " + this.name;
    }

    
    
    
    
}
