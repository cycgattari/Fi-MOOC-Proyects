
public class HealthStation {

    private int counter;
    
    public HealthStation(){
        this.counter = 0;
    }
    
    public int weigh(Person person) {
        this.counter++;
        return person.getWeight();        
    }
    
    
    public void feed(Person person) {        
        int newWeight = person.getWeight() + 1;
        person.setWeight(newWeight);
        //person.weight = person.weight + 1;
    }
    
    public int weighings(){
        
        return this.counter;
    }


}
