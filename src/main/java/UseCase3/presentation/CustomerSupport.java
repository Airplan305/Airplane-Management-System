package UseCase3.presentation;

import UseCase1And4.business.User;

/**
 * Qassim Hassan Ali 202107902  Sec.2
 * The Customer Support  class handles the Usage problems for the user.
 * This includes operations such as sending and receiving email , also find the customer information .
 */
public class CustomerSupport {

    // Instance variables for the CustomerSupport Class .

    private String username;
    private  String password;
    private String email;


    /**
     * Constructor CustomerSupport.
     * @param username of username .
     * @param password of password .
     * @param email of username email.
     */
    public  CustomerSupport (String username , String password , String email){
        this.username=username;
        this.password=password;
        this.email=email;
    }


    /**
     * Send an email .
     * @param email the email for sender .
     * @return the sender email .
     */
    public  void SendEmail (String email ){

        this.email=email;
    }


    /**
     * Receiving the email .
     * @param email The email receive.
     * @return true if the email is received, false if not .
     */
    public boolean ReceiveEmail (String email) {

        // Check if the email receive
        if (email == null )
            return  false;
        else
            return true;
    }


    /**
     * Answering the email .
     * @param email The email answer.
     * @return true if the email is answered, false if not .
     */
    public boolean AnswerEmail (String email) {

        // Check if the email answer .
        if (email == null )
            return  false;
        else
            return true;
    }

    /**
    * Adnan suggests you to add a reset password for the user. 
    * @param newPassword The new password for the user.
    * resetPassword(String newPassword)
    */

    /**
     * Finding customer information .
     * @return the information .
     */

    // Find The Customer Phone number .
    public String FindCustomerNumber(User email){
        return email.getContactNumber();
    }

    // Find The Customer Email .
    public String FindCustomerEmail(User email){
        return email.getEmail();
    }

    // Find The Customer Address .
    public String FindCustomerAddress(User email){
        return email.getAddress();
    }

    // Find The Customer Username .
    public String FindCustomerUsername(User email){
        return email.getUsername();
    }

    // Find The Customer Password .
    public String FindCustomerPassword (User email){
        return email.getPassword();
    }


}
