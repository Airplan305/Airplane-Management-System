package UseCase1And4.data;

import UseCase1And4.business.User;
import UseCase1And4.business.Payment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentDAOTest {

    @Test
    public void testPaymentDAO() {
        // Create a User object
        User user = new User("testUser", "testPassword", "testEmail", "testAddress", "testContactNumber");

        // Create a Payment object
        Payment payment = new Payment("testPaymentId", user, 100.0, false);

        // Create a PaymentDAO object
        PaymentDAO paymentDAO = new PaymentDAO();

        // Test getPayment method
        assertNull(paymentDAO.getPayment("testPaymentId"));

        // Test savePayment method
        assertEquals(true, paymentDAO.savePayment(payment));
        assertEquals(false, paymentDAO.savePayment(null));
    }


}