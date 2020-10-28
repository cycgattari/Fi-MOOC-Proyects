/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Books {
    
    private String bookName;
    private int ageRecomend; 

    public Books(String bookName, int ageRecomend) {
        this.bookName = bookName;
        this.ageRecomend = ageRecomend;
    }

    public int getAgeRecomend() {
        return ageRecomend;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return bookName + " (recommended for " + ageRecomend + " year-olds or older)";
                
                
    }
    
    
}
