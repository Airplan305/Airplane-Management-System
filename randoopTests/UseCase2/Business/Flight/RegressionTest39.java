
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest39 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test001"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("");
    java.lang.String str14 = flight5.getOrigin();
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str18 = flight5.getFlightNumber();
    java.lang.String str19 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test002"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("hi!");
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test003"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    flight5.setOrigin("");
    java.lang.String str18 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test004"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("hi!");
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str16 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test005"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "", "");
    flight5.setDestination("");
    flight5.setFlightNumber("hi!");
    java.lang.String str10 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test006"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    java.lang.String str19 = flight5.getFlightNumber();
    java.lang.String str20 = flight5.getDestination();
    java.lang.String str21 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str24 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str27 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test007"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str18 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    java.lang.String str21 = flight5.getOrigin();
    flight5.setDepartureTime("");
    java.lang.String str24 = flight5.getDestination();
    flight5.setArrivalTime("");
    java.lang.String str27 = flight5.getArrivalTime();
    java.lang.String str28 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str31 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test008"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getDestination();
    flight5.setDepartureTime("");
    flight5.setOrigin("");
    java.lang.String str20 = flight5.getDestination();
    java.lang.String str21 = flight5.getArrivalTime();
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test009"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "hi!", "hi!", "hi!");
    flight5.setDepartureTime("");
    flight5.setOrigin("");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("");
    flight5.setDestination("hi!");
    java.lang.String str16 = flight5.getOrigin();
    java.lang.String str17 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test010"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test011"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test012"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setDestination("");
    flight5.setArrivalTime("");
    java.lang.String str18 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test013"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("");
    flight5.setDepartureTime("");
    java.lang.String str18 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test014"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str16 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    java.lang.String str19 = flight5.getDepartureTime();
    java.lang.String str20 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test015"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "hi!", "", "hi!");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str16 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test016"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getDepartureTime();
    java.lang.String str18 = flight5.getDepartureTime();
    java.lang.String str19 = flight5.getArrivalTime();
    java.lang.String str20 = flight5.getOrigin();
    java.lang.String str21 = flight5.getDestination();
    java.lang.String str22 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    java.lang.String str25 = flight5.getArrivalTime();
    java.lang.String str26 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test017"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setDestination("");
    flight5.setDestination("");
    flight5.setDestination("");
    java.lang.String str19 = flight5.getFlightNumber();
    java.lang.String str20 = flight5.getDepartureTime();
    java.lang.String str21 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test018"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setDestination("");
    java.lang.String str17 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test019"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getArrivalTime();
    java.lang.String str16 = flight5.getFlightNumber();
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test020"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getOrigin();
    java.lang.String str15 = flight5.getOrigin();
    java.lang.String str16 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str23 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test021"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getDepartureTime();
    java.lang.String str16 = flight5.getOrigin();
    java.lang.String str17 = flight5.getOrigin();
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test022"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str11 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getArrivalTime();
    java.lang.String str18 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test023"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getDestination();
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test024"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setDepartureTime("");
    java.lang.String str16 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str19 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test025"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setOrigin("");
    java.lang.String str12 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    java.lang.String str15 = flight5.getFlightNumber();
    java.lang.String str16 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test026"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "", "hi!");
    flight5.setDepartureTime("hi!");
    flight5.setArrivalTime("");
    flight5.setArrivalTime("hi!");

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test027"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getOrigin();
    flight5.setDestination("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("");
    flight5.setDestination("hi!");
    java.lang.String str22 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test028"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getArrivalTime();
    java.lang.String str16 = flight5.getDepartureTime();
    java.lang.String str17 = flight5.getFlightNumber();
    java.lang.String str18 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test029"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    java.lang.String str17 = flight5.getOrigin();
    java.lang.String str18 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test030"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getDepartureTime();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getFlightNumber();
    java.lang.String str16 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    flight5.setDepartureTime("");
    flight5.setArrivalTime("hi!");
    java.lang.String str23 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test031"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "", "hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str15 = flight5.getFlightNumber();
    flight5.setDestination("");
    java.lang.String str18 = flight5.getOrigin();
    java.lang.String str19 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test032"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str13 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test033"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getDestination();
    flight5.setDestination("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setFlightNumber("");
    java.lang.String str19 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    java.lang.String str22 = flight5.getDepartureTime();
    java.lang.String str23 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test034"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str22 = flight5.getArrivalTime();
    java.lang.String str23 = flight5.getFlightNumber();
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test035"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getDepartureTime();
    flight5.setOrigin("");
    java.lang.String str19 = flight5.getFlightNumber();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test036"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "");
    flight5.setArrivalTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str10 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getOrigin();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test037"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("");
    flight5.setDestination("");
    java.lang.String str17 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test038"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str16 = flight5.getDepartureTime();
    java.lang.String str17 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test039"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setArrivalTime("");
    java.lang.String str18 = flight5.getOrigin();
    java.lang.String str19 = flight5.getDestination();
    java.lang.String str20 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str23 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    java.lang.String str26 = flight5.getFlightNumber();
    java.lang.String str27 = flight5.getOrigin();
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test040"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test041"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getFlightNumber();
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    flight5.setDestination("");
    java.lang.String str19 = flight5.getDepartureTime();
    java.lang.String str20 = flight5.getArrivalTime();
    java.lang.String str21 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test042"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setOrigin("");
    java.lang.String str18 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test043"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    flight5.setOrigin("");
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test044"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    flight5.setDestination("");
    flight5.setArrivalTime("hi!");
    java.lang.String str17 = flight5.getDestination();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test045"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test046"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "", "", "hi!");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getOrigin();
    java.lang.String str10 = flight5.getOrigin();
    flight5.setDestination("");
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str18 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test047"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "", "hi!");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setDestination("");
    flight5.setOrigin("hi!");
    java.lang.String str21 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test048"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setDestination("");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    java.lang.String str22 = flight5.getDepartureTime();
    java.lang.String str23 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str26 = flight5.getDestination();
    java.lang.String str27 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test049"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    flight5.setDestination("");
    java.lang.String str16 = flight5.getDepartureTime();
    java.lang.String str17 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test050"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    flight5.setArrivalTime("");
    java.lang.String str12 = flight5.getArrivalTime();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test051"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    java.lang.String str17 = flight5.getFlightNumber();
    java.lang.String str18 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test052"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str14 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test053"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setDepartureTime("hi!");
    java.lang.String str18 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test054"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDepartureTime("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    java.lang.String str17 = flight5.getArrivalTime();
    java.lang.String str18 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test055"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "hi!");
    flight5.setFlightNumber("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test056"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    flight5.setDestination("");
    flight5.setArrivalTime("");
    flight5.setDestination("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str21 = flight5.getFlightNumber();
    java.lang.String str22 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test057"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    flight5.setArrivalTime("");
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    java.lang.String str19 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test058"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDestination("");
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getDestination();
    flight5.setDestination("hi!");
    flight5.setDepartureTime("");
    flight5.setFlightNumber("");
    java.lang.String str19 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test059"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "hi!", "hi!", "hi!");
    flight5.setDestination("");
    flight5.setDestination("hi!");
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    java.lang.String str16 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test060"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDestination("hi!");
    java.lang.String str19 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str24 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    java.lang.String str27 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test061"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    flight5.setOrigin("");
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    java.lang.String str17 = flight5.getDestination();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test062"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    flight5.setFlightNumber("hi!");
    java.lang.String str23 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test063"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDestination();
    flight5.setDestination("hi!");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getFlightNumber();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("");
    java.lang.String str16 = flight5.getOrigin();
    java.lang.String str17 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test064"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("hi!");
    java.lang.String str12 = flight5.getArrivalTime();
    java.lang.String str13 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str16 = flight5.getDestination();
    java.lang.String str17 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test065"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getDepartureTime();
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test066"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str18 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    java.lang.String str21 = flight5.getOrigin();
    java.lang.String str22 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test067"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setDestination("");
    java.lang.String str17 = flight5.getOrigin();
    flight5.setDestination("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("");
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test068"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    java.lang.String str18 = flight5.getArrivalTime();
    java.lang.String str19 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test069"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str21 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str28 = flight5.getArrivalTime();
    java.lang.String str29 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    java.lang.String str32 = flight5.getFlightNumber();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test070"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    java.lang.String str18 = flight5.getOrigin();
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test071"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "hi!");
    flight5.setFlightNumber("hi!");
    flight5.setDestination("hi!");
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    java.lang.String str16 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test072"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setDestination("");
    flight5.setFlightNumber("hi!");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test073"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDepartureTime("");
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str15 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test074"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test075"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getOrigin();
    java.lang.String str10 = flight5.getOrigin();
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test076"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getArrivalTime();
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test077"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setDestination("");
    java.lang.String str12 = flight5.getDestination();
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test078"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setDepartureTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    flight5.setDestination("hi!");
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test079"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    java.lang.String str13 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    flight5.setOrigin("");
    java.lang.String str18 = flight5.getOrigin();
    java.lang.String str19 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test080"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test081"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str17 = flight5.getDestination();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    java.lang.String str26 = flight5.getFlightNumber();
    java.lang.String str27 = flight5.getDestination();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test082"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setOrigin("");
    java.lang.String str17 = flight5.getDestination();
    flight5.setDestination("hi!");
    java.lang.String str20 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test083"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDestination("hi!");
    java.lang.String str14 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test084"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getDestination();
    flight5.setDepartureTime("");
    flight5.setDestination("");
    flight5.setDepartureTime("");
    java.lang.String str21 = flight5.getOrigin();
    java.lang.String str22 = flight5.getFlightNumber();
    java.lang.String str23 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str26 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test085"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setDepartureTime("hi!");
    java.lang.String str11 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test086"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getFlightNumber();
    java.lang.String str12 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getDepartureTime();
    java.lang.String str17 = flight5.getOrigin();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test087"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    flight5.setDestination("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str17 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str22 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test088"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str23 = flight5.getOrigin();
    java.lang.String str24 = flight5.getDepartureTime();
    java.lang.String str25 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test089"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str20 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    java.lang.String str23 = flight5.getOrigin();
    java.lang.String str24 = flight5.getDestination();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test090"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    flight5.setDepartureTime("");
    java.lang.String str14 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test091"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getFlightNumber();
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    flight5.setDestination("");
    java.lang.String str19 = flight5.getDepartureTime();
    java.lang.String str20 = flight5.getDestination();
    java.lang.String str21 = flight5.getOrigin();
    java.lang.String str22 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test092"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getFlightNumber();
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getFlightNumber();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test093"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getDestination();
    flight5.setDestination("");
    flight5.setArrivalTime("");
    flight5.setDestination("hi!");
    flight5.setOrigin("hi!");
    java.lang.String str17 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str20 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test094"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDepartureTime("");
    flight5.setOrigin("");
    java.lang.String str21 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test095"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    flight5.setDestination("");
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test096"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    java.lang.String str22 = flight5.getDestination();
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test097"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test098"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    java.lang.String str10 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str18 = flight5.getDestination();
    java.lang.String str19 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str22 = flight5.getArrivalTime();
    java.lang.String str23 = flight5.getOrigin();
    java.lang.String str24 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test099"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    flight5.setDestination("");
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test100"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str15 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str18 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test101"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getDestination();
    flight5.setFlightNumber("");
    java.lang.String str12 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("");
    flight5.setDestination("");
    java.lang.String str19 = flight5.getDepartureTime();
    java.lang.String str20 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test102"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "", "hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    java.lang.String str12 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test103"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setDepartureTime("");
    java.lang.String str16 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str19 = flight5.getDestination();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test104"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str15 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("");
    flight5.setArrivalTime("hi!");
    flight5.setOrigin("hi!");
    flight5.setDestination("");
    java.lang.String str26 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test105"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "", "", "hi!");
    flight5.setDestination("hi!");
    flight5.setDestination("");
    java.lang.String str10 = flight5.getOrigin();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test106"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test107"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str19 = flight5.getOrigin();
    java.lang.String str20 = flight5.getDestination();
    java.lang.String str21 = flight5.getDepartureTime();
    java.lang.String str22 = flight5.getDestination();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test108"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    java.lang.String str15 = flight5.getFlightNumber();
    java.lang.String str16 = flight5.getArrivalTime();
    java.lang.String str17 = flight5.getArrivalTime();
    java.lang.String str18 = flight5.getDestination();
    java.lang.String str19 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str22 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test109"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setOrigin("");
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test110"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    flight5.setDestination("hi!");
    java.lang.String str24 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test111"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str10 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    flight5.setDestination("");
    flight5.setDepartureTime("");
    java.lang.String str23 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test112"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test113"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getDepartureTime();
    java.lang.String str16 = flight5.getOrigin();
    java.lang.String str17 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    java.lang.String str22 = flight5.getDepartureTime();
    java.lang.String str23 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test114"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str14 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    java.lang.String str21 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test115"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test116"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getOrigin();
    flight5.setDestination("");
    java.lang.String str18 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test117"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str14 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str17 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str20 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test118"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getArrivalTime();
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getDestination();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test119"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str10 = flight5.getOrigin();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test120"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    flight5.setDestination("");
    flight5.setDepartureTime("");
    java.lang.String str20 = flight5.getDestination();
    java.lang.String str21 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test121"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test122"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str17 = flight5.getFlightNumber();
    java.lang.String str18 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    java.lang.String str21 = flight5.getArrivalTime();
    java.lang.String str22 = flight5.getOrigin();
    java.lang.String str23 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test123"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setArrivalTime("");
    java.lang.String str18 = flight5.getOrigin();
    java.lang.String str19 = flight5.getDestination();
    flight5.setFlightNumber("");
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test124"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getOrigin();
    flight5.setOrigin("");
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str20 = flight5.getDepartureTime();
    java.lang.String str21 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test125"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "hi!");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    flight5.setDestination("");
    flight5.setFlightNumber("");
    java.lang.String str25 = flight5.getArrivalTime();
    flight5.setOrigin("");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test126"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    flight5.setOrigin("");
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getArrivalTime();
    flight5.setOrigin("");
    flight5.setDepartureTime("hi!");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test127"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setArrivalTime("");
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str14 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test128"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setArrivalTime("");
    java.lang.String str17 = flight5.getDepartureTime();
    flight5.setOrigin("");
    java.lang.String str20 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test129"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getDepartureTime();
    java.lang.String str16 = flight5.getArrivalTime();
    java.lang.String str17 = flight5.getDestination();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    java.lang.String str22 = flight5.getDepartureTime();
    java.lang.String str23 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test130"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str14 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str17 = flight5.getDestination();
    java.lang.String str18 = flight5.getDestination();
    flight5.setArrivalTime("");
    java.lang.String str21 = flight5.getDestination();
    java.lang.String str22 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test131"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str10 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test132"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getOrigin();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test133"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test134"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "", "");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getDestination();
    flight5.setDepartureTime("");
    java.lang.String str10 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test135"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "hi!");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str14 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str17 = flight5.getDestination();
    java.lang.String str18 = flight5.getArrivalTime();
    java.lang.String str19 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test136"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "", "hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test137"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str9 = flight5.getDestination();
    flight5.setDepartureTime("");
    java.lang.String str12 = flight5.getOrigin();
    flight5.setFlightNumber("");
    java.lang.String str15 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test138"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    java.lang.String str9 = flight5.getFlightNumber();
    java.lang.String str10 = flight5.getOrigin();
    java.lang.String str11 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    java.lang.String str16 = flight5.getDestination();
    flight5.setArrivalTime("");
    java.lang.String str19 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test139"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("");
    java.lang.String str22 = flight5.getDestination();
    java.lang.String str23 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setOrigin("");
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test140"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test141"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setDepartureTime("");
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str26 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test142"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test143"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getOrigin();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test144"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setOrigin("");
    flight5.setOrigin("");
    java.lang.String str18 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test145"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    java.lang.String str10 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test146"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setDestination("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str17 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str20 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test147"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "", "");
    flight5.setOrigin("");
    java.lang.String str8 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    java.lang.String str15 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test148"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str16 = flight5.getDestination();
    flight5.setDepartureTime("");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("");
    flight5.setDepartureTime("");
    java.lang.String str25 = flight5.getDestination();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test149"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setOrigin("");
    java.lang.String str14 = flight5.getOrigin();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test150"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str23 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test151"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setArrivalTime("");
    java.lang.String str18 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str21 = flight5.getArrivalTime();
    java.lang.String str22 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test152"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str12 = flight5.getArrivalTime();
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setOrigin("");
    java.lang.String str16 = flight5.getOrigin();
    java.lang.String str17 = flight5.getDepartureTime();
    java.lang.String str18 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test153"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getDestination();
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    flight5.setDepartureTime("hi!");
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    java.lang.String str20 = flight5.getDestination();
    java.lang.String str21 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test154"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    flight5.setDestination("");
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    java.lang.String str20 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test155"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getDestination();
    flight5.setArrivalTime("");
    java.lang.String str10 = flight5.getOrigin();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test156"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str16 = flight5.getDestination();
    java.lang.String str17 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test157"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setArrivalTime("");
    java.lang.String str18 = flight5.getOrigin();
    java.lang.String str19 = flight5.getDestination();
    java.lang.String str20 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("");
    flight5.setArrivalTime("");
    flight5.setDestination("hi!");
    java.lang.String str29 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test158"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    flight5.setOrigin("");
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test159"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test160"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    flight5.setDestination("");
    flight5.setDestination("");
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str17 = flight5.getDepartureTime();
    java.lang.String str18 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test161"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getArrivalTime();
    java.lang.String str16 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    java.lang.String str23 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test162"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setOrigin("");
    java.lang.String str12 = flight5.getDestination();
    flight5.setDepartureTime("");
    java.lang.String str15 = flight5.getDepartureTime();
    java.lang.String str16 = flight5.getArrivalTime();
    java.lang.String str17 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test163"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setDestination("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str17 = flight5.getFlightNumber();
    java.lang.String str18 = flight5.getOrigin();
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test164"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test165"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setFlightNumber("");
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test166"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getFlightNumber();
    java.lang.String str16 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    flight5.setOrigin("");
    java.lang.String str21 = flight5.getOrigin();
    flight5.setOrigin("");
    java.lang.String str24 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test167"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test168"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test169"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setArrivalTime("");
    flight5.setOrigin("hi!");
    flight5.setDestination("hi!");
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test170"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "");
    flight5.setOrigin("");
    flight5.setOrigin("");
    flight5.setDepartureTime("");
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setDestination("");
    flight5.setDestination("");
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test171"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setOrigin("");
    java.lang.String str10 = flight5.getDepartureTime();
    flight5.setOrigin("");
    flight5.setFlightNumber("hi!");
    flight5.setDestination("");
    java.lang.String str17 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test172"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test173"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    flight5.setDestination("");
    flight5.setDestination("");
    java.lang.String str19 = flight5.getOrigin();
    flight5.setDestination("");
    java.lang.String str22 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test174"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    flight5.setOrigin("");
    java.lang.String str20 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test175"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    flight5.setDestination("hi!");
    java.lang.String str21 = flight5.getArrivalTime();
    java.lang.String str22 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str27 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test176"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "hi!", "", "");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    java.lang.String str10 = flight5.getDestination();
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setDestination("");
    java.lang.String str18 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test177"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test178"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str15 = flight5.getDestination();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test179"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str13 = flight5.getDepartureTime();
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getDestination();
    flight5.setDestination("hi!");
    flight5.setArrivalTime("");
    java.lang.String str20 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test180"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test181"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setDepartureTime("");
    flight5.setOrigin("hi!");
    java.lang.String str13 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str18 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test182"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getOrigin();
    java.lang.String str10 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test183"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    flight5.setDepartureTime("");
    flight5.setDestination("");
    java.lang.String str22 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test184"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setOrigin("");
    java.lang.String str16 = flight5.getOrigin();
    java.lang.String str17 = flight5.getDestination();
    java.lang.String str18 = flight5.getDestination();
    java.lang.String str19 = flight5.getFlightNumber();
    java.lang.String str20 = flight5.getOrigin();
    java.lang.String str21 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test185"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    java.lang.String str13 = flight5.getDepartureTime();
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    java.lang.String str20 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test186"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("hi!");
    flight5.setDepartureTime("");
    java.lang.String str14 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("");
    java.lang.String str21 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test187"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "hi!", "hi!", "hi!");
    flight5.setDestination("");
    flight5.setDestination("hi!");
    java.lang.String str10 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test188"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setArrivalTime("");
    java.lang.String str18 = flight5.getArrivalTime();
    java.lang.String str19 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setFlightNumber("hi!");
    java.lang.String str24 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test189"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    java.lang.String str18 = flight5.getFlightNumber();
    java.lang.String str19 = flight5.getOrigin();
    java.lang.String str20 = flight5.getFlightNumber();
    java.lang.String str21 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test190"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    java.lang.String str18 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test191"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getArrivalTime();
    java.lang.String str16 = flight5.getFlightNumber();
    flight5.setDestination("");
    java.lang.String str19 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test192"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "", "");
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test193"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    flight5.setDestination("hi!");
    flight5.setDestination("");
    flight5.setFlightNumber("");
    java.lang.String str19 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test194"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getOrigin();
    flight5.setFlightNumber("");
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getDepartureTime();
    java.lang.String str16 = flight5.getDepartureTime();
    java.lang.String str17 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test195"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setArrivalTime("");
    java.lang.String str18 = flight5.getDestination();
    java.lang.String str19 = flight5.getOrigin();
    java.lang.String str20 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    java.lang.String str23 = flight5.getFlightNumber();
    java.lang.String str24 = flight5.getOrigin();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test196"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    flight5.setFlightNumber("");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test197"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    flight5.setDestination("hi!");
    flight5.setDestination("");
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test198"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getOrigin();
    flight5.setDepartureTime("");
    flight5.setArrivalTime("hi!");
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getDestination();
    flight5.setOrigin("");
    java.lang.String str18 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test199"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getOrigin();
    java.lang.String str10 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test200"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    flight5.setOrigin("hi!");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test201"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str15 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test202"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setOrigin("");
    java.lang.String str16 = flight5.getArrivalTime();
    java.lang.String str17 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test203"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getDestination();
    flight5.setDepartureTime("");
    java.lang.String str18 = flight5.getDestination();
    java.lang.String str19 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    java.lang.String str22 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test204"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setDepartureTime("");
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getDestination();
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test205"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str18 = flight5.getDestination();
    java.lang.String str19 = flight5.getOrigin();
    java.lang.String str20 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test206"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str19 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test207"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("hi!");
    flight5.setArrivalTime("");
    java.lang.String str21 = flight5.getDepartureTime();
    flight5.setDestination("");
    flight5.setOrigin("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test208"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getDepartureTime();
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getArrivalTime();
    java.lang.String str16 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test209"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    flight5.setDepartureTime("");
    flight5.setDestination("hi!");
    java.lang.String str18 = flight5.getDestination();
    flight5.setDestination("");
    java.lang.String str21 = flight5.getOrigin();
    flight5.setDepartureTime("");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str28 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test210"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDepartureTime("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    flight5.setArrivalTime("");
    java.lang.String str16 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test211"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    java.lang.String str11 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test212"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getFlightNumber();
    java.lang.String str16 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test213"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "hi!");
    flight5.setFlightNumber("hi!");
    flight5.setDestination("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str12 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test214"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setDepartureTime("");
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    java.lang.String str17 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDepartureTime("hi!");
    java.lang.String str22 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test215"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    flight5.setDestination("");
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test216"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    java.lang.String str17 = flight5.getOrigin();
    java.lang.String str18 = flight5.getArrivalTime();
    java.lang.String str19 = flight5.getArrivalTime();
    flight5.setOrigin("");
    java.lang.String str22 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test217"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("");
    java.lang.String str18 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    java.lang.String str21 = flight5.getArrivalTime();
    java.lang.String str22 = flight5.getArrivalTime();
    java.lang.String str23 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test218"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setDepartureTime("");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setDestination("");
    java.lang.String str19 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test219"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    java.lang.String str16 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setDestination("hi!");
    java.lang.String str21 = flight5.getArrivalTime();
    java.lang.String str22 = flight5.getArrivalTime();
    java.lang.String str23 = flight5.getDepartureTime();
    java.lang.String str24 = flight5.getDestination();
    java.lang.String str25 = flight5.getDestination();
    java.lang.String str26 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test220"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test221"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "", "hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test222"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getOrigin();
    java.lang.String str10 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    java.lang.String str15 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str18 = flight5.getDestination();
    flight5.setOrigin("");
    java.lang.String str21 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test223"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str9 = flight5.getDestination();
    flight5.setOrigin("");
    flight5.setDepartureTime("hi!");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    java.lang.String str20 = flight5.getDepartureTime();
    java.lang.String str21 = flight5.getArrivalTime();
    java.lang.String str22 = flight5.getDepartureTime();
    java.lang.String str23 = flight5.getArrivalTime();
    java.lang.String str24 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test224"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test225"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getFlightNumber();
    flight5.setDestination("");
    java.lang.String str19 = flight5.getOrigin();
    flight5.setFlightNumber("");
    java.lang.String str22 = flight5.getArrivalTime();
    java.lang.String str23 = flight5.getDepartureTime();
    java.lang.String str24 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test226"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str20 = flight5.getDestination();
    java.lang.String str21 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test227"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getDestination();
    java.lang.String str8 = flight5.getArrivalTime();
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    java.lang.String str13 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str20 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test228"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    java.lang.String str16 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setDestination("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test229"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setDestination("");
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    java.lang.String str22 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test230"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str17 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test231"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getOrigin();
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str19 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test232"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "", "");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getArrivalTime();
    java.lang.String str8 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    java.lang.String str16 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test233"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str18 = flight5.getOrigin();
    java.lang.String str19 = flight5.getOrigin();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test234"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str19 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test235"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    java.lang.String str16 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test236"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setArrivalTime("");
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    java.lang.String str22 = flight5.getOrigin();
    java.lang.String str23 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test237"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDestination("");
    java.lang.String str10 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setOrigin("hi!");
    java.lang.String str15 = flight5.getOrigin();
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test238"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test239"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setOrigin("");
    java.lang.String str16 = flight5.getOrigin();
    java.lang.String str17 = flight5.getOrigin();
    java.lang.String str18 = flight5.getFlightNumber();
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test240"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    flight5.setArrivalTime("hi!");
    java.lang.String str15 = flight5.getArrivalTime();
    java.lang.String str16 = flight5.getArrivalTime();
    java.lang.String str17 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test241"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str10 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getDestination();
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test242"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test243"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "", "");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("");
    flight5.setArrivalTime("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDestination();
    flight5.setFlightNumber("");
    java.lang.String str16 = flight5.getDestination();
    flight5.setArrivalTime("");
    java.lang.String str19 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test244"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setOrigin("");
    java.lang.String str10 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test245"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    java.lang.String str10 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str17 = flight5.getOrigin();
    flight5.setDepartureTime("");
    java.lang.String str20 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    java.lang.String str23 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str26 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test246"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str15 = flight5.getOrigin();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test247"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str12 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str15 = flight5.getDepartureTime();
    java.lang.String str16 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

}
