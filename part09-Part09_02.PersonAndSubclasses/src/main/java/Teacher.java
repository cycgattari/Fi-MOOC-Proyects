/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Teacher extends Person {
    
    private int salary;
    
    public Teacher(String name, String addres, int salary){
        super(name, addres);
        this.salary = salary;       
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return this.getName() + "\n  " + this.getAddres() +
                "\n  salary " + this.salary + " euro/month" ;        
    }
}
