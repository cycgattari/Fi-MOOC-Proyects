/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Data {
    
    private int year;
    private Double people;
    private String country;
    private String sex;
    
    public Data(String country, String sex, int year, Double people){
        this.year = year;
        this.country = country;
        this.people = people;
        this.sex = sex;
    }

    public Double getPeople() {
        return people;
    }

    @Override
    public String toString() {
        return country + " (" + year + "), " + sex + ", " + people;              
                }  
}
