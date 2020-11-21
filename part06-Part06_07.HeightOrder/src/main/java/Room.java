
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
public class Room {
    
    private ArrayList<Person> personas;
    
    public Room(){
        this.personas= new ArrayList<>();
        
    }
    
    public void add(Person person){
        this.personas.add(person);
    }  
    public boolean isEmpty(){
        if(this.personas.isEmpty()){
            return true;
        }
        return false;
    }
    
    public Person take(){
        if (personas.isEmpty()){
            return null;
        }
        Person short1 = this.personas.get(0);
        for (Person person : personas){
            if (person.getHeight() < short1.getHeight()){
                short1 = person;
            }
        }
        this.personas.remove(short1);
        
        return short1;
        
        
 
    }
    
    public Person shortest(){
        if (personas.isEmpty()){
            return null;
        }
        Person short1 = this.personas.get(0);
        for (Person person : personas){
            if (person.getHeight() < short1.getHeight()){
                short1 = person;
            }
        }
        return short1;
        
    }
    
    public ArrayList<Person> getPersons(){
        if (personas.isEmpty()){
            return null;
        }
        ArrayList<Person> listado = new ArrayList<>(); // armo un listado para guardar los elemntos del for
        for (Person person: this.personas){ // loopeo la lista con instacias de personas
            listado.add(person); // voy agregando al listado
        }
        return listado; // retorno este listado con las instacias de personas metodo to string de personas
         
    }
        
}
