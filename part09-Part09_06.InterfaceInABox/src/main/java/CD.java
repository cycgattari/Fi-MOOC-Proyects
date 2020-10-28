/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class CD implements Packable{
    
    private String artist;
    private String nameCD;
    private int publicationYear;
    private double weightCD;
    
    public CD(String artist, String nameCD, int publicationYear){
        this.artist = artist;
        this.nameCD = nameCD;
        this.publicationYear = publicationYear;
        this.weightCD = 0.1;
    }
    
        @Override
    public double weight() {
        return weightCD;
    }

        @Override
    public String toString() {
        return artist +": "+ nameCD  +" (" + publicationYear + ")";
    }

}
