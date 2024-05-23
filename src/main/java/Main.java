import UseCase1And4.business.User;
import UseCase1And4.business.Payment;
import UseCase2.Business.Flight;
import UseCase3.business.Reservation;

public class Main {
    
    public static void main(String[] args) {
        User user = new User("adnan_002","password1234","example@gmail.com","Wall Street","33033");
        Payment payment = new Payment(null, user, 45, false);
        Flight flight = new Flight("0000","Manama","Dubai","3:00PM","4:00pm");
        Reservation res = new Reservation(null, flight, user);

        System.out.println("Username: "+user.getUsername()+"\tEmail: "+user.getEmail()+"\tContact: "+user.getContactNumber());
        System.out.println("Payment Amount: "+payment.getAmount()+" BD");
        System.out.println("Flight Number: "+flight.getFlightNumber());
        System.out.println("Flight Departure Time:"+res.getFlight().getDepartureTime());
        System.out.println("Flight Arrival Time:"+res.getFlight().getArrivalTime());

    }
}
