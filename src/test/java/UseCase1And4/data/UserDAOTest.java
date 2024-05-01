package UseCase1And4.data;

import UseCase1And4.business.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserDAOTest {
    @Test
    public void testUserDAO() {
        // Create a User object
        User user = new User("testUser", "testPassword", "testEmail", "testAddress", "testContactNumber");

        // Create a UserDAO object
        UserDAO userDAO = new UserDAO();

        // Test getUser method
        assertNull(userDAO.getUser("testUser"));

        // Test saveUser method
        assertEquals(true, userDAO.saveUser(user));
        assertEquals(false, userDAO.saveUser(null));
    }
}