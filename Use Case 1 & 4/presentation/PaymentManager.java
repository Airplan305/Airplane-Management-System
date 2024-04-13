package presentation;
import business.Payment;
import data.PaymentDAO;

/**
 * Adnan Mohammed 202008997 sec 1
 * The PaymentManager class handles the business logic related to payments.
 * This includes operations such as making and refunding payments.
 */
public class PaymentManager {

    // Instance of PaymentDAO to interact with the database
    private PaymentDAO paymentDAO;

    /**
     * Constructor for PaymentManager.
     * @param paymentDAO an instance of PaymentDAO.
     */
    public PaymentManager(PaymentDAO paymentDAO) {
        this.paymentDAO = paymentDAO;
    }

    /**
     * Makes a payment.
     * @param paymentInfo the information of the payment to make.
     * @return true if the payment is successful, false otherwise.
     */
    public boolean makePayment(Payment paymentInfo) {
        // Save the payment to the database
        return paymentDAO.savePayment(paymentInfo);
    }

    /**
     * Refunds a payment.
     * @param paymentId the ID of the payment to refund.
     * @return true if the refund is successful, false otherwise.
     */
    public boolean refund(String paymentId) {
        // Retrieve the payment from the database
        Payment payment = paymentDAO.getPayment(paymentId);

        // Check if the payment exists
        if (payment != null) {
            // Refund the payment
            return true;
        } else {
            return false;
        }
    }
}
