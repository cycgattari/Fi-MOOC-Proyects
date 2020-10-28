
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class BySuitInValueOrder implements Comparator<Card> {
    
    
    
    public int compare(Card c1, Card c2){
        int numbertoCompare = c2.getSuit().ordinal();
        int numberAnother = c1.getSuit().ordinal();
        
        if (numberAnother== numbertoCompare){
            if(c1.getValue() ==c2.getValue() ){
                return 0;
            } else if (c1.getValue() > c2.getValue() ){
                return 1;
            } else {
                return -1;
            }
        } else if (numberAnother  > numbertoCompare){
            return 1;
        } else {
            return -1;
        }       
    }
}
