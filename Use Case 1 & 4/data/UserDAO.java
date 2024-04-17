package data;
import business.User;

/**
 * Adnan Mohammed 202008997 sec 1
 * User Data Access Object
 * The UserDAO class handles the data access operations related to users.
 * This includes operations such as retrieving a user and saving a user.
 */
public class UserDAO {

    /**
     * Retrieves a user from the database.
     * @param username the username of the user to retrieve.
     * @return the User object if found, null otherwise.
     */
    public User getUser(String username) {
   
        // This method should interact with our database and return a User object
        // For now, we'll just return null
        return null;
    }

    /**
     * Saves a user to the database.
     * @param user the User object to save.
     * @return true if the operation is successful, false otherwise.
     */
    public boolean saveUser(User user) {
        
        // This method should interact with our database and save the User object
        // For now, we'll just return false
        return false;
    }
}
