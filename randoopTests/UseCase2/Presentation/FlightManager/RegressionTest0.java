
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test1"); }

    UseCase2.Data.FlightDAO flightDAO0 = null;
    UseCase2.Presentation.FlightManager flightManager1 = new UseCase2.Presentation.FlightManager(flightDAO0);
    // The following exception was thrown during execution in test generation
    try {
    UseCase2.Business.Flight flight3 = flightManager1.searchFlight("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test2"); }

    UseCase2.Data.FlightDAO flightDAO0 = null;
    UseCase2.Presentation.FlightManager flightManager1 = new UseCase2.Presentation.FlightManager(flightDAO0);
    // The following exception was thrown during execution in test generation
    try {
    UseCase2.Business.Flight flight3 = flightManager1.searchFlight("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test3"); }

    UseCase2.Data.FlightDAO flightDAO0 = null;
    UseCase2.Presentation.FlightManager flightManager1 = new UseCase2.Presentation.FlightManager(flightDAO0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = flightManager1.cancelFlight("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test4"); }

    UseCase2.Data.FlightDAO flightDAO0 = null;
    UseCase2.Presentation.FlightManager flightManager1 = new UseCase2.Presentation.FlightManager(flightDAO0);
    UseCase2.Business.Flight flight2 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = flightManager1.scheduleFlight(flight2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test5"); }

    UseCase2.Data.FlightDAO flightDAO0 = null;
    UseCase2.Presentation.FlightManager flightManager1 = new UseCase2.Presentation.FlightManager(flightDAO0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = flightManager1.cancelFlight("");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

}
