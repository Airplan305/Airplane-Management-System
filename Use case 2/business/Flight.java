package business;


/*
 * The Flight class represents a flight in the system.
 */
public class Flight {

    // Instance variables for the Flight class
    private String flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;

    /**
     * Constructor for Flight.
     * @param flightNumber the flight number.
     * @param origin the origin of the flight.
     * @param destination the destination of the flight.
     * @param departureTime the departure time of the flight.
     * @param arrivalTime the arrival time of the flight.
     */
    public Flight(String flightNumber, String origin, String destination, String departureTime, String arrivalTime) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    // Getter and setter methods for the instance variables

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
