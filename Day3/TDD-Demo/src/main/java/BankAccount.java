
public class BankAccount {
    private double balance;
    BankAccount(){
        balance =0;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(int amount){
        if(amount<0){
            throw new IllegalArgumentException("Invalid amount to deposit");
        }
        balance+=amount;
    }
    public void withdraw(int amount){
        if(amount<0){
            throw new IllegalArgumentException("Invalid amount to withdraw");
        }
        if(amount > balance){
            throw new InsufficientFundException("Insufficient balance");
        }
        balance -=amount;
    }
}
