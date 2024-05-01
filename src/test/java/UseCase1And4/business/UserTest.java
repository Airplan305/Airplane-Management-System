package UseCase1And4.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testUser() {
        User user = new User("testUser","testPassword","testEmail","testAddress","testContactNumber");

        // Test getter methods
        assertEquals("testUser", user.getUsername());
        assertEquals("testPassword", user.getPassword());
        assertEquals("testEmail", user.getEmail());
        assertEquals("testAddress", user.getAddress());
        assertEquals("testContactNumber", user.getContactNumber());

        // Test setter methods
        user.setUsername("newUser");
        user.setPassword("newPassword");
        user.setEmail("newEmail");
        user.setAddress("newAddress");
        user.setContactNumber("newContactNumber");

        assertEquals("newUser", user.getUsername());
        assertEquals("newPassword", user.getPassword());
        assertEquals("newEmail", user.getEmail());
        assertEquals("newAddress", user.getAddress());
        assertEquals("newContactNumber", user.getContactNumber());

    }

}