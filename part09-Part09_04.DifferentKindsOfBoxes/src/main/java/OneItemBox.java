import java.util.ArrayList;

public class OneItemBox extends Box{
    private ArrayList<Item> item;


    public OneItemBox(){
        super();
        this.item = new ArrayList<>();

    }
    @Override
    public boolean isInBox(Item item){
        if (this.item.size()==0){
            return false;
        }
        if (this.item.get(0).equals(item)){
            return true;        
        }
        return false;
    }
    public void add(Item item){
        if (this.item.size()==0){
            this.item.add(item);
        }
    }  
}
