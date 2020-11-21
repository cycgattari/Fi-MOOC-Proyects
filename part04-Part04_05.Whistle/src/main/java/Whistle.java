/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Whistle {
    
    private String sound; // tenes una variable sound

    public Whistle(String whistleSound) { // incias constructor para inciar clase
        this.sound = whistleSound; // le asignas w.s a sound
    }
    
    public void sound() { // un metodo llamado tb sound imprimie el string sound
        System.out.println(this.sound);
    }
    
    
}
