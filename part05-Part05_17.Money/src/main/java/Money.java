
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
    
    public Money plus(Money addition){
        int newEuros = this.euros + addition.euros;
        int newEuros3 = this.cents + addition.cents;    

        Money newMoney = new Money(newEuros, newEuros3);
        return newMoney;
    }
    
    public Money minus(Money decreaser){
        int newEuros2 = this.euros - decreaser.euros;    
        int newEuros4 = this.cents - decreaser.cents;
        if (newEuros4 < 0) {
            newEuros2--; 
            newEuros4 = 100 - (-1*newEuros4);
        }
        if (newEuros2 >= 0){
            Money newMoney2 = new Money(newEuros2, newEuros4);
            return newMoney2;
        }else {
            Money newMoney2 = new Money(0,0);
            return newMoney2;
        } 
    }
    
    public boolean lessThan(Money compared){
        if ((this.euros) == (compared.euros)){
            if (this.cents < compared.cents){
                return true;
            }
        }
        if ((this.euros) < (compared.euros)){
            return true;
           
        } 
        return false;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
