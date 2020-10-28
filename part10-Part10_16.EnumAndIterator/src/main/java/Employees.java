
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {
    
    private ArrayList<Person> listadoPersonas;
    
    public Employees(){
        this.listadoPersonas = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.listadoPersonas.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        this.listadoPersonas.addAll(peopleToAdd);
    }
    
    public void print(){
        Iterator<Person> iterator = listadoPersonas.iterator();      
        while (iterator.hasNext()){
            Person nextInLine = iterator.next();
            System.out.println(nextInLine);
        }       
    }
    
    public void print(Education education){
        Iterator<Person> iterator = listadoPersonas.iterator();
        while (iterator.hasNext()){
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation().equals(education)){
                System.out.println(nextInLine);
            }
        }
    }  
    public void fire(Education education){
        Iterator<Person> iterator = listadoPersonas.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
    
}
