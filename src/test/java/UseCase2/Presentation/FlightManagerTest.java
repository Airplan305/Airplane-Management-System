package UseCase2.Presentation;

import UseCase2.Business.Flight;
import UseCase2.Data.FlightDAO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlightManagerTest {

    @Test
    public void testSearchFlight() {
        // Arrange
        FlightDAO flightDAO = new StubFlightDAO();
        String flightNumber = "ABC123";
        FlightManager flightManager = new FlightManager(flightDAO);

        // Act
        Flight result = flightManager.searchFlight(flightNumber);

        // Assert
        assertNull(result);
    }

    @Test
    public void testScheduleFlight() {
        // Arrange
        FlightDAO flightDAO = new StubFlightDAO();
        FlightManager flightManager = new FlightManager(flightDAO);
        Flight flight = new Flight("ABC123", "OriginCity", "DestinationCity", "10:00", "12:00");

        // Act
        boolean result = flightManager.scheduleFlight(flight);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testCancelFlight() {
        // Arrange
        FlightDAO flightDAO = new StubFlightDAO();
        FlightManager flightManager = new FlightManager(flightDAO);
        String flightNumber = "ABC123";

        // Act
        boolean result = flightManager.cancelFlight(flightNumber);

        // Assert
        assertFalse(result);
    }

    // Stub implementation of FlightDAO for testing purposes
    private static class StubFlightDAO extends FlightDAO {
        @Override
        public Flight getFlightByNumber(String flightNumber) {
            return null; // Stub implementation always returns null
        }

        @Override
        public boolean saveFlight(Flight flight) {
            return false; // Stub implementation always returns false
        }

        @Override
        public boolean cancelFlight(String flightNumber) {
            return false; // Stub implementation always returns false
        }
    }
}