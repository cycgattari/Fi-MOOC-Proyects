
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
public class Herd implements Movable{
    
    private ArrayList<Movable> list;
    
    public Herd(){
        this.list = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        list.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable mova : list){
            mova.move(dx, dy);
        }

    }
    
    public String toString(){
        String data = "";
        for (Movable mova : list){
            data += mova.toString();
            data += "\n";
        }
        return data;
    }
    
    
}
