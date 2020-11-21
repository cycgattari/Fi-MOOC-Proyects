
public class YourFirstAccount {

    public static void main(String[] args) {
        Account matthews = new Account("Matthews account", 1000.0);
        Account  myAccount = new Account("My account", 0.0);
        
        matthews.withdrawal(100.0);
        myAccount.deposit(100.0);
        
        
        System.out.println(matthews);
        System.out.println(myAccount);

    }
}
