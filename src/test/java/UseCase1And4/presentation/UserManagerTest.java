package UseCase1And4.presentation;

import UseCase1And4.business.User;
import UseCase1And4.data.UserDAO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserManagerTest {
    @Test
    public void testUserManager() {
        // Create a User object
        User user = new User("testUser", "testPassword", "testEmail", "testAddress", "testContactNumber");

        // Create a UserDAO object
        UserDAO userDAO = new UserDAO();

        // Create a UserManager object
        UserManager userManager = new UserManager(userDAO);

        // Test login method
        assertFalse(userManager.login(user.getUsername(), user.getPassword()));

        // Test register method
        assertEquals(true, userManager.register(user));
        assertEquals(false,userManager.register(null));
    }
}