
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test001"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    boolean b12 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    boolean b22 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test002"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    boolean b2 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test003"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("");
    boolean b6 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    boolean b18 = flightDAO0.cancelFlight("");
    boolean b20 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test004"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    boolean b16 = flightDAO0.cancelFlight("hi!");
    boolean b18 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    boolean b24 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test005"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("");
    boolean b6 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    boolean b20 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    boolean b28 = flightDAO0.cancelFlight("");
    boolean b30 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test006"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    boolean b22 = flightDAO0.cancelFlight("hi!");
    boolean b24 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test007"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    boolean b10 = flightDAO0.cancelFlight("");
    boolean b12 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test008"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("hi!");
    boolean b16 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test009"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    boolean b20 = flightDAO0.cancelFlight("hi!");
    boolean b22 = flightDAO0.cancelFlight("");
    boolean b24 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test010"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    boolean b16 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    boolean b20 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    boolean b24 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test011"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    boolean b16 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    boolean b20 = flightDAO0.cancelFlight("");
    boolean b22 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test012"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    boolean b28 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight32 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test013"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    boolean b8 = flightDAO0.cancelFlight("hi!");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test014"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    boolean b24 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight29 = null;
    boolean b30 = flightDAO0.saveFlight(flight29);
    boolean b32 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test015"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("hi!");
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test016"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    boolean b8 = flightDAO0.cancelFlight("hi!");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("");
    boolean b30 = flightDAO0.cancelFlight("hi!");
    boolean b32 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test017"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    boolean b28 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test018"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    boolean b12 = flightDAO0.cancelFlight("");
    boolean b14 = flightDAO0.cancelFlight("");
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    boolean b20 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("");
    boolean b30 = flightDAO0.cancelFlight("");
    boolean b32 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test019"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    boolean b28 = flightDAO0.cancelFlight("hi!");
    boolean b30 = flightDAO0.cancelFlight("");
    boolean b32 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight34 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight36 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight38 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight38);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test020"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    boolean b12 = flightDAO0.cancelFlight("");
    boolean b14 = flightDAO0.cancelFlight("");
    boolean b16 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    boolean b26 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test021"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test022"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    boolean b6 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    boolean b26 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test023"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    boolean b12 = flightDAO0.cancelFlight("");
    boolean b14 = flightDAO0.cancelFlight("");
    boolean b16 = flightDAO0.cancelFlight("hi!");
    boolean b18 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test024"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("");
    boolean b16 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    boolean b26 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    boolean b30 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test025"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    boolean b24 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test026"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    boolean b30 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight31 = null;
    boolean b32 = flightDAO0.saveFlight(flight31);
    boolean b34 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight36 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight36);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test027"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    boolean b26 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test028"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    boolean b18 = flightDAO0.cancelFlight("");
    boolean b20 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    UseCase2.Business.Flight flight29 = null;
    boolean b30 = flightDAO0.saveFlight(flight29);
    UseCase2.Business.Flight flight32 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight33 = null;
    boolean b34 = flightDAO0.saveFlight(flight33);
    UseCase2.Business.Flight flight36 = flightDAO0.getFlightByNumber("hi!");
    boolean b38 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test029"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    boolean b22 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test030"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    boolean b24 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight32 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test031"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    boolean b18 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    boolean b22 = flightDAO0.cancelFlight("hi!");
    boolean b24 = flightDAO0.cancelFlight("hi!");
    boolean b26 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test032"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    boolean b8 = flightDAO0.cancelFlight("hi!");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    boolean b18 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    boolean b22 = flightDAO0.cancelFlight("");
    boolean b24 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    boolean b28 = flightDAO0.cancelFlight("hi!");
    boolean b30 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight31 = null;
    boolean b32 = flightDAO0.saveFlight(flight31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test033"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("hi!");
    boolean b12 = flightDAO0.cancelFlight("hi!");
    boolean b14 = flightDAO0.cancelFlight("hi!");
    boolean b16 = flightDAO0.cancelFlight("");
    boolean b18 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test034"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    boolean b26 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight31 = null;
    boolean b32 = flightDAO0.saveFlight(flight31);
    UseCase2.Business.Flight flight34 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight36 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight36);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test035"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    boolean b6 = flightDAO0.cancelFlight("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("hi!");
    boolean b16 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test036"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test037"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    boolean b6 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test038"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    boolean b26 = flightDAO0.cancelFlight("");
    boolean b28 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("");
    boolean b32 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight33 = null;
    boolean b34 = flightDAO0.saveFlight(flight33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test039"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    boolean b6 = flightDAO0.cancelFlight("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test040"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("hi!");
    boolean b16 = flightDAO0.cancelFlight("hi!");
    boolean b18 = flightDAO0.cancelFlight("");
    boolean b20 = flightDAO0.cancelFlight("");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    UseCase2.Business.Flight flight29 = null;
    boolean b30 = flightDAO0.saveFlight(flight29);
    UseCase2.Business.Flight flight31 = null;
    boolean b32 = flightDAO0.saveFlight(flight31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test041"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    boolean b24 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    boolean b28 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test042"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    boolean b6 = flightDAO0.cancelFlight("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    boolean b12 = flightDAO0.cancelFlight("");
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    boolean b20 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test043"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    boolean b30 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight32 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight33 = null;
    boolean b34 = flightDAO0.saveFlight(flight33);
    boolean b36 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test044"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    boolean b24 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    boolean b30 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight31 = null;
    boolean b32 = flightDAO0.saveFlight(flight31);
    UseCase2.Business.Flight flight34 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight36 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight37 = null;
    boolean b38 = flightDAO0.saveFlight(flight37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test045"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    boolean b22 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("");
    boolean b30 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight31 = null;
    boolean b32 = flightDAO0.saveFlight(flight31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test046"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    boolean b18 = flightDAO0.cancelFlight("hi!");
    boolean b20 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test047"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("");
    boolean b20 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test048"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight32 = flightDAO0.getFlightByNumber("");
    boolean b34 = flightDAO0.cancelFlight("");
    boolean b36 = flightDAO0.cancelFlight("");
    boolean b38 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test049"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test050"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    boolean b16 = flightDAO0.cancelFlight("");
    boolean b18 = flightDAO0.cancelFlight("");
    boolean b20 = flightDAO0.cancelFlight("");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    boolean b26 = flightDAO0.cancelFlight("");
    boolean b28 = flightDAO0.cancelFlight("");
    boolean b30 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test051"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    boolean b10 = flightDAO0.cancelFlight("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    boolean b16 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test052"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test053"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("hi!");
    boolean b4 = flightDAO0.cancelFlight("hi!");
    boolean b6 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test054"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("hi!");
    boolean b12 = flightDAO0.cancelFlight("");
    boolean b14 = flightDAO0.cancelFlight("hi!");
    boolean b16 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    boolean b24 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test055"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    boolean b18 = flightDAO0.cancelFlight("hi!");
    boolean b20 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    boolean b24 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test056"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    boolean b24 = flightDAO0.cancelFlight("hi!");
    boolean b26 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    boolean b30 = flightDAO0.cancelFlight("");
    boolean b32 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight33 = null;
    boolean b34 = flightDAO0.saveFlight(flight33);
    boolean b36 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight37 = null;
    boolean b38 = flightDAO0.saveFlight(flight37);
    UseCase2.Business.Flight flight39 = null;
    boolean b40 = flightDAO0.saveFlight(flight39);
    UseCase2.Business.Flight flight41 = null;
    boolean b42 = flightDAO0.saveFlight(flight41);
    boolean b44 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight46 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight47 = null;
    boolean b48 = flightDAO0.saveFlight(flight47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test057"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    boolean b12 = flightDAO0.cancelFlight("hi!");
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    boolean b20 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test058"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("hi!");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test059"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("");
    boolean b16 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    boolean b20 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight29 = null;
    boolean b30 = flightDAO0.saveFlight(flight29);
    boolean b32 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight34 = flightDAO0.getFlightByNumber("");
    boolean b36 = flightDAO0.cancelFlight("hi!");
    boolean b38 = flightDAO0.cancelFlight("");
    boolean b40 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight42 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight43 = null;
    boolean b44 = flightDAO0.saveFlight(flight43);
    UseCase2.Business.Flight flight45 = null;
    boolean b46 = flightDAO0.saveFlight(flight45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test060"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    boolean b16 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test061"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    boolean b16 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    boolean b24 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    boolean b30 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test062"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    boolean b28 = flightDAO0.cancelFlight("");
    boolean b30 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight31 = null;
    boolean b32 = flightDAO0.saveFlight(flight31);
    UseCase2.Business.Flight flight34 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight36 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight36);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test063"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    boolean b20 = flightDAO0.cancelFlight("");
    boolean b22 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    boolean b26 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test064"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    boolean b20 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test065"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    boolean b22 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test066"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    boolean b8 = flightDAO0.cancelFlight("hi!");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test067"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    boolean b20 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test068"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    boolean b28 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight32 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test069"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    boolean b14 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test070"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    boolean b18 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    boolean b22 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    boolean b26 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight32 = flightDAO0.getFlightByNumber("hi!");
    boolean b34 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight36 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight36);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test071"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test072"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("");
    boolean b16 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    boolean b24 = flightDAO0.cancelFlight("");
    boolean b26 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test073"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    boolean b20 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    boolean b24 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test074"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("hi!");
    boolean b30 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight31 = null;
    boolean b32 = flightDAO0.saveFlight(flight31);
    boolean b34 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test075"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    boolean b26 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test076"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("hi!");
    boolean b4 = flightDAO0.cancelFlight("hi!");
    boolean b6 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("hi!");
    boolean b12 = flightDAO0.cancelFlight("hi!");
    boolean b14 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test077"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    boolean b20 = flightDAO0.cancelFlight("");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    boolean b28 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test078"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    boolean b2 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("");
    boolean b12 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test079"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("hi!");
    boolean b4 = flightDAO0.cancelFlight("hi!");
    boolean b6 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    boolean b14 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test080"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    boolean b18 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("");
    boolean b30 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test081"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    boolean b22 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    boolean b30 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test082"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("hi!");
    boolean b4 = flightDAO0.cancelFlight("hi!");
    boolean b6 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test083"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    boolean b20 = flightDAO0.cancelFlight("");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    boolean b24 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    boolean b28 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test084"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test085"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    boolean b18 = flightDAO0.cancelFlight("");
    boolean b20 = flightDAO0.cancelFlight("hi!");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    boolean b24 = flightDAO0.cancelFlight("hi!");
    boolean b26 = flightDAO0.cancelFlight("hi!");
    boolean b28 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight32 = flightDAO0.getFlightByNumber("hi!");
    boolean b34 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test086"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    boolean b22 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    boolean b28 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test087"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    boolean b22 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("");
    boolean b30 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight31 = null;
    boolean b32 = flightDAO0.saveFlight(flight31);
    boolean b34 = flightDAO0.cancelFlight("hi!");
    boolean b36 = flightDAO0.cancelFlight("");
    boolean b38 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test088"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test089"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    boolean b24 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test090"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test091"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    boolean b20 = flightDAO0.cancelFlight("");
    boolean b22 = flightDAO0.cancelFlight("");
    boolean b24 = flightDAO0.cancelFlight("");
    boolean b26 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test092"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    boolean b12 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    boolean b16 = flightDAO0.cancelFlight("hi!");
    boolean b18 = flightDAO0.cancelFlight("hi!");
    boolean b20 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test093"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("hi!");
    boolean b20 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test094"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("hi!");
    boolean b4 = flightDAO0.cancelFlight("hi!");
    boolean b6 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    boolean b16 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    boolean b20 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test095"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("hi!");
    boolean b4 = flightDAO0.cancelFlight("hi!");
    boolean b6 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test096"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    boolean b24 = flightDAO0.cancelFlight("hi!");
    boolean b26 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    boolean b30 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight31 = null;
    boolean b32 = flightDAO0.saveFlight(flight31);
    UseCase2.Business.Flight flight34 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight36 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight36);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test097"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    boolean b2 = flightDAO0.cancelFlight("hi!");
    boolean b4 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test098"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    boolean b20 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test099"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test100"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    boolean b14 = flightDAO0.cancelFlight("hi!");
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    boolean b20 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    boolean b24 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test101"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("hi!");
    boolean b14 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    boolean b18 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    boolean b22 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    boolean b28 = flightDAO0.cancelFlight("hi!");
    boolean b30 = flightDAO0.cancelFlight("");
    boolean b32 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight34 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight34);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test102"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    boolean b6 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("hi!");
    boolean b12 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    boolean b20 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test103"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    boolean b30 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight32 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight34 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight34);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test104"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    boolean b24 = flightDAO0.cancelFlight("");
    boolean b26 = flightDAO0.cancelFlight("hi!");
    boolean b28 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test105"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    boolean b24 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test106"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    boolean b10 = flightDAO0.cancelFlight("");
    boolean b12 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test107"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    boolean b6 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    boolean b12 = flightDAO0.cancelFlight("");
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test108"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    boolean b8 = flightDAO0.cancelFlight("hi!");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("hi!");
    boolean b20 = flightDAO0.cancelFlight("");
    boolean b22 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    boolean b26 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("hi!");
    boolean b30 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight32 = flightDAO0.getFlightByNumber("hi!");
    boolean b34 = flightDAO0.cancelFlight("hi!");
    boolean b36 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test109"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    boolean b12 = flightDAO0.cancelFlight("hi!");
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    boolean b20 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    boolean b24 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test110"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    boolean b20 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    boolean b24 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test111"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    boolean b8 = flightDAO0.cancelFlight("hi!");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    boolean b16 = flightDAO0.cancelFlight("");
    boolean b18 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    boolean b28 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight31 = null;
    boolean b32 = flightDAO0.saveFlight(flight31);
    UseCase2.Business.Flight flight33 = null;
    boolean b34 = flightDAO0.saveFlight(flight33);
    UseCase2.Business.Flight flight35 = null;
    boolean b36 = flightDAO0.saveFlight(flight35);
    UseCase2.Business.Flight flight38 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight39 = null;
    boolean b40 = flightDAO0.saveFlight(flight39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test112"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test113"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test114"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test115"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    boolean b24 = flightDAO0.cancelFlight("");
    boolean b26 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test116"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("hi!");
    boolean b10 = flightDAO0.cancelFlight("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    boolean b22 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    boolean b26 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test117"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    boolean b20 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    boolean b24 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test118"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    boolean b14 = flightDAO0.cancelFlight("hi!");
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    boolean b22 = flightDAO0.cancelFlight("");
    boolean b24 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test119"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    boolean b24 = flightDAO0.cancelFlight("hi!");
    boolean b26 = flightDAO0.cancelFlight("hi!");
    boolean b28 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test120"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    boolean b18 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    boolean b24 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    boolean b28 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test121"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    boolean b6 = flightDAO0.cancelFlight("hi!");
    boolean b8 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test122"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    boolean b20 = flightDAO0.cancelFlight("");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    boolean b24 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("hi!");
    boolean b30 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight32 = flightDAO0.getFlightByNumber("");
    boolean b34 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight35 = null;
    boolean b36 = flightDAO0.saveFlight(flight35);
    UseCase2.Business.Flight flight37 = null;
    boolean b38 = flightDAO0.saveFlight(flight37);
    boolean b40 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test123"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test124"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    boolean b20 = flightDAO0.cancelFlight("hi!");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test125"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    boolean b22 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    boolean b26 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test126"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    boolean b20 = flightDAO0.cancelFlight("hi!");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    boolean b24 = flightDAO0.cancelFlight("");
    boolean b26 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test127"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    boolean b10 = flightDAO0.cancelFlight("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    boolean b20 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    boolean b24 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    boolean b28 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test128"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    boolean b24 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test129"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    boolean b14 = flightDAO0.cancelFlight("hi!");
    boolean b16 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    boolean b20 = flightDAO0.cancelFlight("");
    boolean b22 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test130"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    boolean b6 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test131"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    boolean b24 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight31 = null;
    boolean b32 = flightDAO0.saveFlight(flight31);
    UseCase2.Business.Flight flight33 = null;
    boolean b34 = flightDAO0.saveFlight(flight33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test132"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    boolean b6 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test133"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    boolean b10 = flightDAO0.cancelFlight("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    boolean b16 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    boolean b20 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    boolean b26 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test134"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    boolean b4 = flightDAO0.cancelFlight("");
    boolean b6 = flightDAO0.cancelFlight("hi!");
    boolean b8 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    boolean b14 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    boolean b18 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test135"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    boolean b10 = flightDAO0.cancelFlight("");
    boolean b12 = flightDAO0.cancelFlight("");
    boolean b14 = flightDAO0.cancelFlight("hi!");
    boolean b16 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    boolean b20 = flightDAO0.cancelFlight("hi!");
    boolean b22 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight29 = null;
    boolean b30 = flightDAO0.saveFlight(flight29);
    boolean b32 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test136"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    boolean b22 = flightDAO0.cancelFlight("hi!");
    boolean b24 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test137"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    boolean b8 = flightDAO0.cancelFlight("hi!");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    boolean b18 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test138"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight8 = flightDAO0.getFlightByNumber("hi!");
    boolean b10 = flightDAO0.cancelFlight("hi!");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    boolean b20 = flightDAO0.cancelFlight("");
    boolean b22 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test139"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    boolean b4 = flightDAO0.cancelFlight("");
    boolean b6 = flightDAO0.cancelFlight("");
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    boolean b18 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test140"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("hi!");
    boolean b12 = flightDAO0.cancelFlight("hi!");
    boolean b14 = flightDAO0.cancelFlight("");
    boolean b16 = flightDAO0.cancelFlight("");
    boolean b18 = flightDAO0.cancelFlight("");
    boolean b20 = flightDAO0.cancelFlight("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test141"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test142"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    boolean b18 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    boolean b26 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    boolean b30 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight32 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight34 = flightDAO0.getFlightByNumber("");
    boolean b36 = flightDAO0.cancelFlight("");
    boolean b38 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight40 = flightDAO0.getFlightByNumber("");
    boolean b42 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test143"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    boolean b12 = flightDAO0.cancelFlight("hi!");
    boolean b14 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test144"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    boolean b24 = flightDAO0.cancelFlight("hi!");
    boolean b26 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test145"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight1 = null;
    boolean b2 = flightDAO0.saveFlight(flight1);
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    boolean b6 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight7 = null;
    boolean b8 = flightDAO0.saveFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    boolean b20 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight21 = null;
    boolean b22 = flightDAO0.saveFlight(flight21);
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    boolean b26 = flightDAO0.cancelFlight("");
    boolean b28 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test146"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("");
    boolean b8 = flightDAO0.cancelFlight("hi!");
    boolean b10 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    boolean b16 = flightDAO0.cancelFlight("");
    boolean b18 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    boolean b22 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    UseCase2.Business.Flight flight28 = flightDAO0.getFlightByNumber("");
    boolean b30 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight32 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test147"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    boolean b10 = flightDAO0.cancelFlight("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    boolean b16 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    boolean b24 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight25 = null;
    boolean b26 = flightDAO0.saveFlight(flight25);
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test148"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight23 = null;
    boolean b24 = flightDAO0.saveFlight(flight23);
    boolean b26 = flightDAO0.cancelFlight("hi!");
    boolean b28 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight30 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight31 = null;
    boolean b32 = flightDAO0.saveFlight(flight31);
    boolean b34 = flightDAO0.cancelFlight("hi!");
    boolean b36 = flightDAO0.cancelFlight("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test149"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    boolean b12 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight17 = null;
    boolean b18 = flightDAO0.saveFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    boolean b20 = flightDAO0.saveFlight(flight19);
    boolean b22 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight26 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test150"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight3 = null;
    boolean b4 = flightDAO0.saveFlight(flight3);
    UseCase2.Business.Flight flight5 = null;
    boolean b6 = flightDAO0.saveFlight(flight5);
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight10 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight11 = null;
    boolean b12 = flightDAO0.saveFlight(flight11);
    UseCase2.Business.Flight flight14 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight15 = null;
    boolean b16 = flightDAO0.saveFlight(flight15);
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test151"); }

    UseCase2.Data.FlightDAO flightDAO0 = new UseCase2.Data.FlightDAO();
    UseCase2.Business.Flight flight2 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight4 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight6 = flightDAO0.getFlightByNumber("hi!");
    boolean b8 = flightDAO0.cancelFlight("");
    UseCase2.Business.Flight flight9 = null;
    boolean b10 = flightDAO0.saveFlight(flight9);
    UseCase2.Business.Flight flight12 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight13 = null;
    boolean b14 = flightDAO0.saveFlight(flight13);
    UseCase2.Business.Flight flight16 = flightDAO0.getFlightByNumber("hi!");
    UseCase2.Business.Flight flight18 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight20 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight22 = flightDAO0.getFlightByNumber("");
    UseCase2.Business.Flight flight24 = flightDAO0.getFlightByNumber("");
    boolean b26 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight27 = null;
    boolean b28 = flightDAO0.saveFlight(flight27);
    UseCase2.Business.Flight flight29 = null;
    boolean b30 = flightDAO0.saveFlight(flight29);
    boolean b32 = flightDAO0.cancelFlight("hi!");
    UseCase2.Business.Flight flight33 = null;
    boolean b34 = flightDAO0.saveFlight(flight33);
    UseCase2.Business.Flight flight36 = flightDAO0.getFlightByNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight36);

  }

}
