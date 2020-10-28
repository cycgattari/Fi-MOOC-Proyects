/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi G
 */
public class Hideout<T> {
    
    private T hideout;
    
    public void putIntoHideout(T toHide){
        hideout = toHide;
    }
    public T takeFromHideout(){
        if (hideout == null){
            return null;
        }
        T toSavehide = hideout;
        this.hideout = null;
        return toSavehide;     
    }
    public boolean isInHideout(){
        if (hideout != null){
            return true;      
        } else {
        return false;
        }
    }
}
