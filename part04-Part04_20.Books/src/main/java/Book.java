/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Book {
    
    private String bookName;
    private String bookPages;
    private String bookYear;
    
    public Book(String bookName, String bookPages, String bookYear ){
        this.bookName = bookName;
        this.bookPages = bookPages;
        this.bookYear = bookYear;
    }
    
    public String getName(){
        return bookName;
    }
    
    
    
    public String toString(){
        return this.bookName + ", " + this.bookPages + " pages, " + this.bookYear;                
    }
    
    
    
    
}
