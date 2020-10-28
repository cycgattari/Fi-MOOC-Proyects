/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Person {
    
    private String name;
    private Education degree;
    
    public Person(String name, Education degree){
        this.degree = degree;
        this.name = name;
    }
    
    
    public Education getEducation(){
        return this.degree;
    }
    
    public String toString(){
        return name + ", " + degree;
    }
    
    
}
