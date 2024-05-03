package UseCase3.presentation;

import UseCase1And4.business.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerSupportTest {


    @Test
    void testSendEmail() {
        // Create a CustomerSupport instance
        CustomerSupport customerSupport = new CustomerSupport("admin", "admin123", "admin@example.com");

        // Call the SendEmail method
        customerSupport.SendEmail("user@example.com");

        // No need to verify email here since CustomerSupport class doesn't have a getEmail method.
    }

    @Test
    void testReceiveEmail() {
        // Create a CustomerSupport instance
        CustomerSupport customerSupport = new CustomerSupport("admin", "admin123", "admin@example.com");

        // Call the ReceiveEmail method with a null email
        assertFalse(customerSupport.ReceiveEmail(null));

        // Call the ReceiveEmail method with a valid email
        assertTrue(customerSupport.ReceiveEmail("user@example.com"));
    }

    @Test
    void testAnswerEmail() {
        // Create a CustomerSupport instance
        CustomerSupport customerSupport = new CustomerSupport("admin", "admin123", "admin@example.com");

        // Call the AnswerEmail method with a null email
        assertFalse(customerSupport.AnswerEmail(null));

        // Call the AnswerEmail method with a valid email
        assertTrue(customerSupport.AnswerEmail("user@example.com"));
    }

    @Test
    void testFindCustomerInformation() {
        // Create a User object
        User user = new User("John Doe", "password123", "john.doe@example.com", "123 Main St", "123-456-7890");

        // Create a CustomerSupport instance
        CustomerSupport customerSupport = new CustomerSupport("admin", "admin123", "admin@example.com");

        // Check if the customer information matches
        assertEquals("123-456-7890", customerSupport.FindCustomerNumber(user));
        assertEquals("john.doe@example.com", customerSupport.FindCustomerEmail(user));
        assertEquals("123 Main St", customerSupport.FindCustomerAddress(user));
        assertEquals("John Doe", customerSupport.FindCustomerUsername(user));
        assertEquals("password123", customerSupport.FindCustomerPassword(user));
    }


}