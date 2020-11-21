/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Song {
    
    private String name;
    private int length;
    
    public Song(String name, int length){
        this.name = name;
        this.length = length;
    }
    public int length(){
        return this.length;
    }
    public String name(){
        return this.name;
    }
    
}
