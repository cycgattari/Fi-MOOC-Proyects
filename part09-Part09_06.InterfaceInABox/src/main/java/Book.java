/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Book implements Packable{
    
    private String author;
    private String nameBook;
    private Double weightBook;
    
    public Book(String author, String nameBook, double weightBook){
        this.author = author;
        this.nameBook = nameBook;
        this.weightBook = weightBook;
    }

    @Override
    public double weight() {
        return weightBook;
    }

    @Override
    public String toString() {
        return author +": "+ nameBook;
    }
    
}
