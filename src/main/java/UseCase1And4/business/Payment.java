package UseCase1And4.business;




/**
 * Adnan Mohammed 202008997 sec 1
 * The Payment class represents a payment in the system.
 */
public class Payment {

    // Instance variables for the Payment class
    private String paymentId;
    private User user;
    private double amount;
    private boolean refunded;

    /**
     * Constructor for Payment.
     * @param paymentId the ID of the payment.
     * @param user the User object who made the payment.
     * @param amount the amount of the payment.
     */
    public Payment(String paymentId, User user, double amount, boolean refunded) {
        this.paymentId = paymentId;
        this.user = user;
        this.amount = amount;
        this.refunded = refunded;
    }

    // Getter and setter methods for the instance variables

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean getRefunded() {
        return refunded;
    }
    public void setRefunded(boolean refunded) {
        this.refunded = refunded;
    }
}
