class insBalException extends Exception
{
    public insBalException(String message){
        super(message);
    }
}
public class BankAccount{
    private double balance;
     public BankAcount(double balance){
        this.balance= balance;

    }
    public void withdraw (double amount)throws insBalException{
        if(amount > balance){
            throw new insBalException("Insufficient balance in account");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. \nRemaining balance: "+balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        try {
            account.withdraw(600.0);
            account.withdraw(500.0);
        } catch (insBalException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}