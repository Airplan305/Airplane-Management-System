package UseCase1And4.presentation;

import UseCase1And4.business.Payment;
import UseCase1And4.business.User;
import UseCase1And4.data.PaymentDAO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentManagerTest {
    @Test
    public void testPaymentManager() {
        // Create a User object
        User user = new User("testUser", "testPassword", "testEmail", "testAddress", "testContactNumber");

        // Create a Payment object
        Payment payment = new Payment("testPaymentId", user, 100.0,false);

        // Create a PaymentDAO object
        PaymentDAO paymentDAO = new PaymentDAO();

        // Create a PaymentManager object
        PaymentManager paymentManager = new PaymentManager(paymentDAO);

        // Test makePayment method
        assertThrows(RuntimeException.class, () -> paymentManager.makePayment(null));
        assertEquals(payment, paymentManager.makePayment(payment));

        // Test refund method
        assertThrows(RuntimeException.class, () -> paymentManager.refund(null));
    }
}