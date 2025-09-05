import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {
    BankAccount account;

    @BeforeEach
    void init(){
        account = new BankAccount();
    }
    @Test
    void newAccountShouldHaveZeroBalance(){
        assertEquals(0, account.getBalance());
    }

    @Test
    void depositShouldIncreaseBalance(){
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void withdrawShouldDecreaseBalance(){
        account.deposit(200);
        account.withdraw(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void withdrawMoreThanBalanceShouldThrowException(){
        Exception ex = assertThrows(InsufficientFundException.class, () -> account.withdraw(100));
        assertEquals("Insufficient balance", ex.getMessage());
    }
}
