package presentation;
import business.Flight;
import business.Reservation;
import business.User;
import data.ReservationDAO;
/**
 * Qassim Hassan Ali 202107902  Sec.2
 * The ReservationManager class handles the business logic related to reservations.
 * This includes operations such as creating and canceling reservations.
 */
public class ReservationManager {

    // Instance of ReservationDAO to interact with the database
    private ReservationDAO reservationDAO;

    /**
     * Constructor for ReservationManager.
     * @param reservationDAO an instance of ReservationDAO.
     */
    public ReservationManager(ReservationDAO reservationDAO) {
        this.reservationDAO = reservationDAO;
    }

    /**
     * Creates a reservation.
     * @param flight flightInfo the information of the flight to reserve.
     * @return true if the reservation is successful, false otherwise.
     */
    public boolean createReservation(String reservationId, Flight flight, User user) {
        // Create a new Reservation object
        Reservation reservation = new Reservation(reservationId, flight, user);

        // Save the reservation to the database
        return reservationDAO.saveReservation(reservation);
    }

    /**
     * Cancels a reservation.
     * @param reservationId the ID of the reservation to cancel.
     * @return true if the cancellation is successful, false otherwise.
     */
    public boolean cancelReservation(String reservationId) {
        // Retrieve the reservation from the database
        Reservation reservation = reservationDAO.getReservation(reservationId);

        // Check if the reservation exists
        if (reservation != null) {
            // Cancel the reservation
            // Implementation depends on the system
            return true;
        } else {
            return false;
        }
    }
}
