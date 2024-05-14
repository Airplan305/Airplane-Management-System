package UseCase1And4.business;

import java.util.regex.Pattern;

public class User  {

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

        /**
     * Verifies the user's phone number.
     * @return true if the phone number is valid, false otherwise.
     */
    public boolean verifyPhoneNumber() {
        // This is a very basic check and might not be suitable for all international phone numbers.
        // You might want to use a library like libphonenumber from Google for a more comprehensive validation.
        String regex = "^\\+?[0-9. ()-]{10,25}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(this.contactNumber).matches();
    }

    /**
     * Verifies the user's email address.
     * @return true if the email address is valid, false otherwise.
     */
    public boolean verifyEmailAddress() {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(this.email).matches();
    }



}