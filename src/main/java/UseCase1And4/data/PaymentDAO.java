package UseCase1And4.data;

import UseCase1And4.business.Payment;
/**
 * Adnan Mohammed 202008997 sec 1
 * The PaymentDAO class handles the data access operations related to payments.
 */
public class PaymentDAO {

    /**
     * Retrieves a payment from the database.
     * @param paymentId the ID of the payment to retrieve.
     * @return the Payment object if found, null otherwise.
     */
    public Payment getPayment(String paymentId) {
        // Implementation depends on the database setup
        return null;
    }

    /**
     * Saves a payment to the database.
     * @param payment the Payment object to save.
     * @return true if the operation is successful, false otherwise.
     */
    public boolean savePayment(Payment payment) {
        // Implementation depends on the database setup
        return false;
    }
}
