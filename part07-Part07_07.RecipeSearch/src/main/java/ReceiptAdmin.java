
import java.util.ArrayList;


public class ReceiptAdmin {
    
    private String recetaName;
    private int recetaTime;
    private ArrayList <String> recetaIngred; 
    
    public ReceiptAdmin(String recetaName, int recetaTime, ArrayList <String> recetaIngred){
        this.recetaIngred = recetaIngred;
        this.recetaTime = recetaTime;
        this.recetaName = recetaName;
    }
    public int getRecetaTime() {
        return recetaTime;
    }
    public String getRecetaName() {
        return recetaName;
    }
    public ArrayList <String> getRecetaIngred() {
        return recetaIngred;
    }           
    @Override
    public String toString() {
        return getRecetaName() + ", cooking time: " + getRecetaTime() + getRecetaIngred() ; 
    }

}


