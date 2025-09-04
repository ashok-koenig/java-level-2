import java.util.Scanner;

public class BankTransaction {
    static double balance = 1000.0;
    public static void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance){
            throw new InsufficientFundsException("Insufficient balance for withdrawal");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: "+ balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter amount to withdraw:");
            double amount = Double.parseDouble(scanner.nextLine());
            try {
                withdraw(amount);
            }catch (InsufficientFundsException e){
                System.out.println("Withdrawal failed: "+ e.getMessage());
            }
        }catch (NumberFormatException e){
            System.out.println("Invalid Number, Please enter valid amount");
        }catch (Exception e){
            System.out.println("Generic Exception: "+ e.getMessage());
        }
    }
}
