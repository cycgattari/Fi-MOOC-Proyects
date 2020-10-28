/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Maxi G
 */
public class TemperatureSensor implements Sensor{
    
    private boolean estado;
    
    public TemperatureSensor(){
        this.estado = false;
    }
    
    @Override
    public boolean isOn() {
        return estado;      
    }

    @Override
    public void setOn() {
        this.estado = true;
    }

    @Override
    public void setOff() {
        this.estado = false;
    }

    @Override
    public int read() {
        if (!this.isOn()){
            throw new IllegalStateException ("sensor is off");
        } 
        int anser = (new Random().nextInt(61))-30;
        return anser;
        }
}

    
    
    
    

