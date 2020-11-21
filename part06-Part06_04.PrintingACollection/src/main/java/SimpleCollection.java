
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String printOutput = "The collection " + this.name; 
        String theList = "";        
        int sizeList = this.elements.size();
        int i = 0;
        for (String msg : elements){
            if (i < sizeList - 1) {
                theList += msg + "\n";  
            } else {
                theList += msg;
            }
            i++;
        }
        if (elements.isEmpty()){
            return printOutput + " is empty.";
        }            
        if (sizeList == 1){
            return printOutput + " has " + sizeList + " element:" + "\n" + theList;
        } else {
            return printOutput + " has " + sizeList + " elements:" + "\n" + theList;                    
        }              
    }
}       