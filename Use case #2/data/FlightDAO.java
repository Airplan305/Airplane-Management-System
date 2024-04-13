package data;

import business.Flight;

/**
 * Ahmed A.hussain Ali 202004419 sec 1
 * The FlightDAO class handles the data access operations related to flights.
 */
public class FlightDAO {

    /**
     * Retrieves a flight from the database by its flight number.
     * @param flightNumber the flight number of the flight to retrieve.
     * @return the Flight object if found, null otherwise.
     */
    public Flight getFlightByNumber(String flightNumber) {
        // Implementation depends on the database setup
        return null;
    }

    /**
     * Saves a flight to the database.
     * @param flight the Flight object to save.
     * @return true if the operation is successful, false otherwise.
     */
    public boolean saveFlight(Flight flight) {
        // Implementation depends on the database setup
        return false;
    }
        /**
     * Cancels a flight in the database.
     * @param flightNumber the flight number of the flight to cancel.
     * @return true if the operation is successful, false otherwise.
     */
    public boolean cancelFlight(String flightNumber) {
        // Implementation depends on the database setup
        // This method should interact with your database and remove the Flight object
        // For now, we'll just return false
        return false;
    }
}
