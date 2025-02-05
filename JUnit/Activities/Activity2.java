package Activities;
import org.junit.jupiter.api.Test;
import activityPrograms.BankAccount;
import activityPrograms.NotEnoughFundsException;
import static org.junit.jupiter.api.Assertions.*;

public class Activity2 {

    class ExpectedExceptionTest {
        @Test
        void notEnoughFunds() {
            // Create an object for BankAccount class
            BankAccount account = new BankAccount(9);

            // Assertion for exception
            assertThrows(NotEnoughFundException.class, () -> account.withdraw(10),
                    "Balance must be greater than amount of withdrawal");
        }

        @Test
        void enoughFunds() {
            // Create an object for BankAccount class
            BankAccount account = new BankAccount(100);

            // Assertion for no exceptions
            assertDoesNotThrow(() -> account.withdraw(100));
        }
    }
}
