
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {
        if (this.balance - amount >= 0){
            this.balance -= amount;
            return true;
        } else {
            
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        return false;
        }
    }
}
