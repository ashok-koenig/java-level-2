class BankAccount{
    private String accountHolder;
    private double balance;
    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for Balance (Read-only access to balance)
    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <=balance){
            balance -= amount;
            System.out.println("Withdraw: "+ amount);
        }else {
            System.out.println("Invalid amount");
        }
    }

    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
            System.out.println("Deposit: "+ amount);
        }else {
            System.out.println("Invalid amount");
        }
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John", 1000);

        System.out.println("Account Holder: "+ account1.getAccountHolder());
        System.out.println("Initial Balance: "+ account1.getBalance());

        account1.setAccountHolder("John Smith");
        System.out.println("Account Holder: "+ account1.getAccountHolder());

        account1.deposit(100);
        account1.withdraw(400);

        System.out.println("Current Balance: "+ account1.getBalance());
//        account1.balance = 1000000000;
    }
}
