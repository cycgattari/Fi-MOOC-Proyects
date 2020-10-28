
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class TodoList {
       
    private ArrayList<String> listado;
    
    public TodoList(){
        this.listado = new ArrayList<>();
    }
            
    public void add(String task){
        listado.add(task);
    }
    
    public void print(){
        int i = 1;
        for (String tareas : listado){
            System.out.println(i + ": " + tareas);
            i++;
        }
    }
    
    public void remove(int number){
        listado.remove(number-1);
    }
    
    
    
}



