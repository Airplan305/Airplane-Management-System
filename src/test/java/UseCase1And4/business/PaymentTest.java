package UseCase1And4.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {
    User user = new User("testUser", "testPassword", "testEmail", "testAddress", "testContactNumber");


    @Test
    public void testPayment() {
        // Create a Payment object
        Payment payment = new Payment("testPaymentId", user, 100.0,false);

        // Test getter methods
        assertEquals("testPaymentId", payment.getPaymentId());
        assertEquals(user, payment.getUser());
        assertEquals(100.0, payment.getAmount(), 0.001);

        // Test setter methods
        User newUser = new User("newUser", "newPassword", "newEmail", "newAddress", "newContactNumber");
        payment.setPaymentId("newPaymentId");
        payment.setUser(newUser);
        payment.setAmount(200.0);

        assertEquals("newPaymentId", payment.getPaymentId());
        assertEquals(newUser, payment.getUser());
        assertEquals(200.0, payment.getAmount(), 0.001);


    }
}