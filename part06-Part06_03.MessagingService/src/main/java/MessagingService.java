
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
public class MessagingService {
    
    private ArrayList<Message> mensajes;
    
    
    public MessagingService(){
        this.mensajes = new ArrayList<>();
    }
    
    public ArrayList<Message> getMessages(){
        return this.mensajes;
    }
    
        
                
            
    public void add(Message message){
        String msgSize = message.getContent();                        
        if (msgSize.length() <= 280){
            this.mensajes.add(message);
        }        
    }
    
}
