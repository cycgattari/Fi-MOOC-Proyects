
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> cartas;
    
    public Hand(){
        this.cartas = new ArrayList<>();
    }
    
    public void add(Card card){
        cartas.add(card);
    }
    
    public void print(){
        for (Card card: cartas){
            System.out.println(card);
        }
    }
    public void sort(){
        Collections.sort(cartas);    
    }
    
    public int valueHand(){
        int sum = 0;
        for (Card carta : this.cartas){
            sum += carta.getValue();
        }
        return sum;
    }

    
    @Override
    public int compareTo(Hand mano){
        if(this.valueHand()==mano.valueHand()){
            return 0;
        } else if (this.valueHand() > mano.valueHand()){
            return 1;
        } else {
            return -1;
        }
    }
    
    public void sortBySuit(){
        Collections.sort(cartas, new BySuitInValueOrder());
       }
}

