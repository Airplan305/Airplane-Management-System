package UseCase3.business;

import UseCase1And4.business.User;
import UseCase2.Business.Flight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationTest {
    @Test
    void testReservationConstructorAndGetters() {
        // Create a Flight object
        Flight flight = new Flight("ABC123", "New York", "Los Angeles", "2024-05-02", "08:00");

        // Create a User object
        User user = new User("John Doe", "password123", "john.doe@example.com", "123 Main St", "123-456-7890");

        // Create a Reservation object
        Reservation reservation = new Reservation("RES123", flight, user);

        // Test getters
        assertEquals("RES123", reservation.getReservationId());
        assertEquals(flight, reservation.getFlight());
        assertEquals(user, reservation.getUser());
    }

    @Test
    void testReservationSetters() {
        // Create a Flight object
        Flight flight1 = new Flight("ABC123", "New York", "Los Angeles", "2024-05-02", "08:00");
        Flight flight2 = new Flight("DEF456", "Los Angeles", "New York", "2024-05-03", "12:00");

        // Create a User object
        User user1 = new User("John Doe", "password123", "john.doe@example.com", "123 Main St", "123-456-7890");
        User user2 = new User("Jane Smith", "password456", "jane.smith@example.com", "456 Elm St", "987-654-3210");

        // Create a Reservation object
        Reservation reservation = new Reservation("RES123", flight1, user1);

        // Test setters
        reservation.setReservationId("RES456");
        reservation.setFlight(flight2);
        reservation.setUser(user2);

        assertEquals("RES456", reservation.getReservationId());
        assertEquals(flight2, reservation.getFlight());
        assertEquals(user2, reservation.getUser());
    }

}