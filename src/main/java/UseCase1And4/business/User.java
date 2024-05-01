package UseCase1And4.business;

public class User {

    /*
     * Adnan Mohammed 202008997 Sec 1
     */

    // Instance variables for the User class
    private String username;
    private String password;
    private String email;
    private String address;
    private String contactNumber;

    /**
     * Constructor for User.
     * @param username the username of the user.
     * @param password the password of the user.
     * @param email the email of the user.
     * @param address the address of the user.
     * @param contactNumber the contact number of the user.
     */
    public User(String username, String password, String email, String address, String contactNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    // Getter and Setter methods for the instance variables

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }



}