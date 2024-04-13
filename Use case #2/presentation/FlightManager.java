package presentation;
import business.Flight;
import data.FlightDAO;

/**
 * Ahmed A.hussain Ali 202004419 sec 1
 * The FlightManager class handles the business logic related to flights.
 * This includes operations such as searching, scheduling, and cancelling flights.
 */
public class FlightManager {

    // Instance of FlightDAO to interact with the database
    private FlightDAO flightDAO;

    /**
     * Constructor for FlightManager.
     * @param flightDAO an instance of FlightDAO.
     */
    public FlightManager(FlightDAO flightDAO) {
        this.flightDAO = flightDAO;
    }

    /**
     * Searches for a flight.
     * @param flightNumber the flight number of the flight to search for.
     * @return the Flight object if found, null otherwise.
     */
    public Flight searchFlight(String flightNumber) {
        // Retrieve the flight from the database
        return flightDAO.getFlightByNumber(flightNumber);
    }

    /**
     * Schedules a flight.
     * @param flightInfo the information of the flight to schedule.
     * @return true if the scheduling is successful, false otherwise.
     */
    public boolean scheduleFlight(Flight flightInfo) {
        // Save the flight to the database
        return flightDAO.saveFlight(flightInfo);
    }

    /**
     * Cancels a flight.
     * @param flightNumber the flight number of the flight to cancel.
     * @return true if the cancellation is successful, false otherwise.
     */
    public boolean cancelFlight(String flightNumber) {
        // Retrieve the flight from the database
        Flight flight = flightDAO.getFlightByNumber(flightNumber);

        // Check if the flight exists
        if (flight != null) {
            // Cancel the flight
            return flightDAO.cancelFlight(flightNumber);
        } else {
            return false;
        }
    }
}
