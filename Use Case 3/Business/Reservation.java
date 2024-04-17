package business;

/**
 * Qassim Hassan Ali 202107902  Sec.2
 * The Reservation class represents a reservation in the system.
 */
public class Reservation {

    // Instance variables for the Reservation class
    private String reservationId;
    private Flight flight;
    private User user;

    /**
     * Constructor for Reservation.
     * @param reservationId the ID of the reservation.
     * @param flight the Flight object associated with the reservation.
     * @param user the User object who made the reservation.
     */
    public Reservation(String reservationId, Flight flight, User user) {
        this.reservationId = reservationId;
        this.flight = flight;
        this.user = user;
    }

    // Getter and setter methods for the instance variables

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
