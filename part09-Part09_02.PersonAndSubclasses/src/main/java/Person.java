
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
public class Person {
    
    private String name;
    private String addres;
    
    public Person(String name, String addres){
        this.name = name;
        this.addres = addres;
    }

    public String getAddres() {
        return addres;
    }

    public String getName() {
        return name;
    }
    


    @Override
    public String toString() {
        return name + "\n  " + addres;
    }
    
}
