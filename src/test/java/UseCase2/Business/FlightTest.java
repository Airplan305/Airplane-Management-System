package UseCase2.Business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlightTest {

    @Test
    public void testFlightConstructorAndGetters() {
        // Arrange
        String flightNumber = "ABC123";
        String origin = "OriginCity";
        String destination = "DestinationCity";
        String departureTime = "10:00";
        String arrivalTime = "12:00";

        // Act
        Flight flight = new Flight(flightNumber, origin, destination, departureTime, arrivalTime);

        // Assert
        assertEquals(flightNumber, flight.getFlightNumber());
        assertEquals(origin, flight.getOrigin());
        assertEquals(destination, flight.getDestination());
        assertEquals(departureTime, flight.getDepartureTime());
        assertEquals(arrivalTime, flight.getArrivalTime());
    }

    @Test
    public void testFlightSetters() {
        // Arrange
        String flightNumber = "ABC123";
        String origin = "OriginCity";
        String destination = "DestinationCity";
        String departureTime = "10:00";
        String arrivalTime = "12:00";

        // Act
        Flight flight = new Flight(flightNumber, origin, destination, departureTime, arrivalTime);

        String newFlightNumber = "XYZ789";
        String newOrigin = "NewOriginCity";
        String newDestination = "NewDestinationCity";
        String newDepartureTime = "09:00";
        String newArrivalTime = "11:00";

        flight.setFlightNumber(newFlightNumber);
        flight.setOrigin(newOrigin);
        flight.setDestination(newDestination);
        flight.setDepartureTime(newDepartureTime);
        flight.setArrivalTime(newArrivalTime);

        // Assert
        assertEquals(newFlightNumber, flight.getFlightNumber());
        assertEquals(newOrigin, flight.getOrigin());
        assertEquals(newDestination, flight.getDestination());
        assertEquals(newDepartureTime, flight.getDepartureTime());
        assertEquals(newArrivalTime, flight.getArrivalTime());
    }
}