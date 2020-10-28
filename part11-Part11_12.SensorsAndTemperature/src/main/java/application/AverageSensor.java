/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maxi G
 */
public class AverageSensor implements Sensor{
    
    private List<Sensor> listadoSensores;
    private List<Integer> readingss;

    
    public AverageSensor(){
        this.listadoSensores = new ArrayList<>();
        this.readingss = new ArrayList<>();

    }
    
    public void addSensor(Sensor toAdd){
        listadoSensores.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        boolean indicador = true;
        for (Sensor sensor : listadoSensores){
            if (sensor.isOn() == false && !listadoSensores.isEmpty()){
                return false;                        
        }      
    }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : listadoSensores){
            sensor.setOn();
        }      
    }

    @Override
    public void setOff() {
        for (Sensor sensor : listadoSensores){
            sensor.setOff();
        }      
    }
    

    @Override
    public int read() {
        if (!this.isOn() || listadoSensores.isEmpty()) {
            throw new IllegalStateException("sensor is off or empty");
        }
        int read = (int)listadoSensores.stream().mapToInt(sensor -> sensor.read()).average().getAsDouble();
        readingss.add(read);
        return read;
    }
    
    public List<Integer> readings() throws Exception {  
        return (readingss);   
    }
    

}
    
