package UseCase1And4.presentation;

import UseCase1And4.business.Payment;
import UseCase1And4.data.PaymentDAO;

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
     */
    public Payment makePayment(Payment paymentInfo) {
        boolean success = paymentDAO.savePayment(paymentInfo);
        if (success) {
            return paymentInfo;
        } else {
            throw new RuntimeException("Failed to save payment");
        }
    }

    /**
     * Refunds a payment.
     * @param paymentId the ID of the payment to refund.
     */
    public Payment refund(String paymentId) {
        Payment payment = paymentDAO.getPayment(paymentId);
        if (payment != null) {
            payment.setRefunded(true);
            boolean success = paymentDAO.savePayment(payment);
            if (success) {
                return payment;
            } else {
                throw new RuntimeException("Failed to refund payment");
            }
        } else {
            throw new RuntimeException("Payment not found");
        }
    }
}
