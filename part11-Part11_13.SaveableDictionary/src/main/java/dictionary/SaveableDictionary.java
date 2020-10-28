/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxi G
 */
public class SaveableDictionary {
    
    private HashMap<String, String> dict;
    private String file;
    
    public SaveableDictionary() {
        this.dict = new HashMap<>();       
    }

    
    public SaveableDictionary(String file) {
        this();      
        this.file = file;
    }
    
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(file)){
            for (Entry<String, String>  items : dict.entrySet()){
                String toAdd = "";
                toAdd = items.getKey() + ":" + items.getValue();
                writer.println(toAdd);
        }
        writer.close();
        return true;

        } catch (Exception e) {
            return false;     
        }
    }
        
    public boolean load(){
        try (Scanner scanner = new Scanner(Paths.get(file))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                dict.put(parts[0], parts[1]);               
            }
            return true;
        } catch (Exception e) {
            return false;     
    }
    }
    
    public void delete(String word){
        String msg = "";
        if (dict.containsKey(word)){
            dict.remove(word);   
        } 
        if (dict.containsValue(word)) {                      
            for (Entry<String, String> entry : dict.entrySet()){
                if(entry.getValue().equals(word) ) {
                    msg = (entry.getKey());
                }
        }
        dict.remove(msg);

    }
    }
    

    public void add(String words, String translation){
        if (!dict.containsKey(words)){
            dict.put(words, translation);
        }      
    }
    
    public String translate(String word){
        if (dict.containsKey(word)){
            return dict.get(word);
        }
        if (dict.containsValue(word)){
            for (Entry<String, String> entry : dict.entrySet())
                if(entry.getValue().equals(word) ) {
                    return entry.getKey();
                }

        } 
        return null;
    }
}


