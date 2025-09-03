interface Validator {
    boolean validateAmount(double amount);
}

interface PaymentGateway {
    void makePayment(double amount);
}
// Multiple Inheritance
class CreditCardPayment implements Validator, PaymentGateway {
    private String cardNumber;
    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public void makePayment(double amount) {
        if(validateAmount(amount)){
            System.out.println("Payment successful for card: "+ cardNumber + " and amount: "+ amount);
        }else{
            System.out.println("Invalid payment amount: "+ amount);
        }
    }

    public boolean validateAmount(double amount) {
        return amount>0;
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        CreditCardPayment payment = new CreditCardPayment("1111-2222-3333-44444");
        payment.makePayment(1000);
        payment.makePayment(-100);
    }
}
