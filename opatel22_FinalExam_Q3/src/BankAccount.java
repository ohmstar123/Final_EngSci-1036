public class BankAccount {
    //Delcare variables
    private double balance;

    //Constructor
    public BankAccount(double balance){
        this.balance = balance;
    }

    //Withdraw method to subtract a given amount from balance
    public void withdraw(double amount){
        balance -= amount;
    }

    //Deposit method to add a given amount to balance
    public void deposit(double amount){
        balance += amount;
    }

    //Mutator method to obtain the balance value
    public double getBalance(){
        return balance;
    }
}
