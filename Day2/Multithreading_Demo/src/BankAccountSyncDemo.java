class BankAccount{
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }

//    public  void withdraw(double amount, String atmName){
    // Only one thread can access at a time
    public synchronized   void withdraw(double amount, String atmName){
        if(balance >= amount){
            System.out.println(atmName + " is processing withdrawal of " + amount);
            // Simulate delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= amount;
            System.out.println(atmName + " completed. Remaining balance: "+ balance);
        }else {
            System.out.println(atmName+ " - Insufficient balance for: "+ amount);
        }
    }
}

class ATMThread extends Thread{
    private BankAccount account;
    private double amount;
    private String atmName;
    public ATMThread(BankAccount account, double amount, String atmName){
        this.account = account;
        this.amount = amount;
        this.atmName = atmName;
    }

    @Override
    public void run() {
        account.withdraw(amount, atmName);
    }
}
public class BankAccountSyncDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        ATMThread atm1 = new ATMThread(account, 700, "ATM-1");
        ATMThread atm2 = new ATMThread(account, 500, "ATM-2");

        atm1.start();
        atm2.start();
    }
}
