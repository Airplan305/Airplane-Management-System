package presentation;
import business.User;
import data.UserDAO;

/**
 * Adnan Mohammed 202008997 sec 1
 * The UserManager class handles the business logic related to user management.
 * This includes operations such as login, logout, and register.
 */
public class UserManager {

    // Instance of UserDAO to interact with the database
    private UserDAO userDAO;

    /**
     * Constructor for UserManager.
     * @param userDAO an instance of UserDAO.
     */
    public UserManager(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    /**
     * Logs in a user.
     * @param username the username of the user.
     * @param password the password of the user.
     * @return true if login is successful, false otherwise.
     */
    public boolean login(String username, String password) {
        // Retrieve the user from the database
        User user = userDAO.getUser(username);

        // Check if the user exists and the password is correct
        if (user != null && user.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Logs out a user.
     * In a more complex system, this might involve invalidating a user's session or token.
     */
    public void logout() {
        // Implementation depends on the system
    }

    /**
     * Registers a new user.
     * @param userInfo the information of the user to register.
     * @return true if registration is successful, false otherwise.
     */
    public boolean register(User userInfo) {
        // Save the new user to the database
        return userDAO.saveUser(userInfo);
    }
}

