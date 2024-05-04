package UseCase2.Data;

import UseCase2.Business.Flight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlightDAOTest {

    @Test
    public void testGetFlightByNumber() {
        // Arrange
        FlightDAO flightDAO = new FlightDAO();
        String flightNumber = "ABC123";

        // Act
        Flight flight = flightDAO.getFlightByNumber(flightNumber);

        // Assert
        assertNull(flight); // Since the implementation returns null, expecting null
    }

    @Test
    public void testSaveFlight() {
        // Arrange
        FlightDAO flightDAO = new FlightDAO();
        Flight flight = new Flight("ABC123", "OriginCity", "DestinationCity", "10:00", "12:00");

        // Act
        boolean result = flightDAO.saveFlight(flight);

        // Assert
        assertFalse(result); // Since the implementation returns false, expecting false
    }

    @Test
    public void testCancelFlight() {
        // Arrange
        FlightDAO flightDAO = new FlightDAO();
        String flightNumber = "ABC123";

        // Act
        boolean result = flightDAO.cancelFlight(flightNumber);

        // Assert
        assertFalse(result); // Since the implementation returns false, expecting false
    }
}