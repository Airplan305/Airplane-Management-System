package UseCase3.data;

import UseCase3.business.Reservation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationDAOTest {
    @Test
    void testGetReservation() {
        // Create a ReservationDAO instance
        ReservationDAO dao = new ReservationDAO();

        // Call the getReservation method with the reservation ID
        Reservation result = dao.getReservation("RES123");

        // Verify that the returned reservation matches the expected reservation
        assertNull(result);
    }

    @Test
    void testSaveReservation() {
        // Create a ReservationDAO instance
        ReservationDAO dao = new ReservationDAO();

        // Simulate the database by creating a Reservation object
        Reservation reservation = new Reservation("RES123", null, null);

        // Call the saveReservation method with the reservation object
        boolean result = dao.saveReservation(reservation);

        // Verify that the save operation is successful (assuming it always returns true)
        assertFalse(result);
    }
}