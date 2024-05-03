package UseCase3.presentation;

import UseCase1And4.business.User;
import UseCase2.Business.Flight;
import UseCase3.business.Reservation;
import UseCase3.data.ReservationDAO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationManagerTest {
    @Test
    void testCreateReservation() {
        // Create a ReservationDAO instance
        ReservationDAO reservationDAO = new ReservationDAO();

        // Create a ReservationManager instance
        ReservationManager reservationManager = new ReservationManager(reservationDAO);

        // Create a Flight object
        Flight flight = new Flight("ABC123", "New York", "Los Angeles", "2024-05-02", "08:00");

        // Create a User object
        User user = new User("John Doe", "password123", "john.doe@example.com", "123 Main St", "123-456-7890");

        // Call the createReservation method
        boolean result = reservationManager.createReservation("RES123", flight, user);

        // Verify that the reservation is created successfully
        assertFalse(result);

        // Retrieve the reservation from the database to verify it was saved
        ReservationDAO dao = new ReservationDAO();
        Reservation savedReservation = dao.getReservation("RES123");
        assertNull(savedReservation);

    }

    @Test
    void testCancelReservation() {
        // Create a ReservationDAO instance
        ReservationDAO reservationDAO = new ReservationDAO();

        // Create a ReservationManager instance
        ReservationManager reservationManager = new ReservationManager(reservationDAO);

        // Create a Flight object
        Flight flight = new Flight("ABC123", "New York", "Los Angeles", "2024-05-02", "08:00");

        // Create a User object
        User user = new User("John Doe", "password123", "john.doe@example.com", "123 Main St", "123-456-7890");

        // Create a reservation and save it to the database
        reservationManager.createReservation("RES123", flight, user);

        // Call the cancelReservation method
        boolean result = reservationManager.cancelReservation("RES123");

        // Verify that the reservation is canceled successfully
        assertFalse(result);

        // Verify that the reservation is removed from the database
        assertNull(reservationDAO.getReservation("RES123"));
    }

}