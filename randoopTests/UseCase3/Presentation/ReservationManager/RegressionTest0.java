
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test1"); }

    UseCase3.data.ReservationDAO reservationDAO0 = null;
    UseCase3.presentation.ReservationManager reservationManager1 = new UseCase3.presentation.ReservationManager(reservationDAO0);
    UseCase2.Business.Flight flight3 = null;
    UseCase1And4.business.User user4 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = reservationManager1.createReservation("hi!", flight3, user4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test2"); }

    UseCase3.data.ReservationDAO reservationDAO0 = null;
    UseCase3.presentation.ReservationManager reservationManager1 = new UseCase3.presentation.ReservationManager(reservationDAO0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = reservationManager1.cancelReservation("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test3"); }

    UseCase3.data.ReservationDAO reservationDAO0 = null;
    UseCase3.presentation.ReservationManager reservationManager1 = new UseCase3.presentation.ReservationManager(reservationDAO0);
    UseCase2.Business.Flight flight3 = null;
    UseCase1And4.business.User user4 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = reservationManager1.createReservation("", flight3, user4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test4"); }

    UseCase3.data.ReservationDAO reservationDAO0 = null;
    UseCase3.presentation.ReservationManager reservationManager1 = new UseCase3.presentation.ReservationManager(reservationDAO0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = reservationManager1.cancelReservation("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

}
