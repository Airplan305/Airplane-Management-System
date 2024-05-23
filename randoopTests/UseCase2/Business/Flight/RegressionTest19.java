
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test001"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str17 = flight5.getDepartureTime();
    java.lang.String str18 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test002"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str18 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    java.lang.String str21 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test003"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getOrigin();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test004"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test005"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str10 = flight5.getDestination();
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test006"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("");
    flight5.setDestination("");
    java.lang.String str17 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str20 = flight5.getDestination();
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    
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

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test007"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    flight5.setArrivalTime("");
    java.lang.String str18 = flight5.getArrivalTime();
    java.lang.String str19 = flight5.getDepartureTime();
    java.lang.String str20 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test008"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    flight5.setDestination("hi!");
    flight5.setDepartureTime("");
    flight5.setOrigin("hi!");
    flight5.setDestination("hi!");
    flight5.setDestination("");
    java.lang.String str25 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test009"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getDestination();
    flight5.setArrivalTime("");
    java.lang.String str12 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    java.lang.String str15 = flight5.getOrigin();
    flight5.setDestination("hi!");
    java.lang.String str18 = flight5.getDepartureTime();
    flight5.setOrigin("");
    java.lang.String str21 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test010"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "", "hi!");
    flight5.setFlightNumber("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str10 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test011"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    flight5.setOrigin("");
    
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
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test012"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    flight5.setDestination("");
    flight5.setOrigin("");
    java.lang.String str18 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    flight5.setDepartureTime("");
    java.lang.String str23 = flight5.getFlightNumber();
    java.lang.String str24 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test013"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test014"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test015"); }

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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test016"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    java.lang.String str21 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test017"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "", "");
    java.lang.String str6 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("");
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str17 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test018"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getDepartureTime();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("");
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getArrivalTime();
    java.lang.String str16 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test019"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("");
    java.lang.String str16 = flight5.getDepartureTime();
    java.lang.String str17 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str20 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test020"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str10 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str18 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str21 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test021"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setArrivalTime("hi!");
    
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

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test022"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    flight5.setArrivalTime("");
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setDestination("");
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    flight5.setDestination("hi!");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test023"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test024"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("");
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test025"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setDestination("");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test026"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    flight5.setDepartureTime("");
    flight5.setDestination("hi!");
    java.lang.String str18 = flight5.getFlightNumber();
    java.lang.String str19 = flight5.getDepartureTime();
    java.lang.String str20 = flight5.getFlightNumber();
    java.lang.String str21 = flight5.getFlightNumber();
    flight5.setDepartureTime("hi!");
    java.lang.String str24 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test027"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    flight5.setArrivalTime("");
    java.lang.String str18 = flight5.getDestination();
    java.lang.String str19 = flight5.getDestination();
    java.lang.String str20 = flight5.getArrivalTime();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test028"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str17 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str20 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    flight5.setOrigin("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test029"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getOrigin();
    java.lang.String str10 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    java.lang.String str15 = flight5.getDestination();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("");
    java.lang.String str22 = flight5.getArrivalTime();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test030"); }

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
    flight5.setDestination("");
    java.lang.String str20 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str23 = flight5.getFlightNumber();
    java.lang.String str24 = flight5.getFlightNumber();
    java.lang.String str25 = flight5.getFlightNumber();
    java.lang.String str26 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    java.lang.String str29 = flight5.getDestination();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test031"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test032"); }

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
    java.lang.String str20 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("");
    
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

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test033"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setOrigin("hi!");
    java.lang.String str20 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    flight5.setArrivalTime("");
    java.lang.String str25 = flight5.getDepartureTime();
    java.lang.String str26 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setFlightNumber("hi!");
    java.lang.String str31 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test034"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    java.lang.String str16 = flight5.getDestination();
    java.lang.String str17 = flight5.getOrigin();
    java.lang.String str18 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str21 = flight5.getDestination();
    java.lang.String str22 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test035"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    java.lang.String str10 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    flight5.setArrivalTime("hi!");
    java.lang.String str21 = flight5.getFlightNumber();
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test036"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    java.lang.String str16 = flight5.getArrivalTime();
    java.lang.String str17 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test037"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setOrigin("");
    java.lang.String str19 = flight5.getOrigin();
    java.lang.String str20 = flight5.getArrivalTime();
    java.lang.String str21 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    java.lang.String str24 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str27 = flight5.getDestination();
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test038"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
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
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test039"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str18 = flight5.getArrivalTime();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test040"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    java.lang.String str13 = flight5.getDepartureTime();
    java.lang.String str14 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
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
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test041"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setArrivalTime("");
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setDestination("hi!");
    flight5.setDestination("hi!");
    java.lang.String str16 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test042"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    flight5.setDestination("");
    flight5.setOrigin("");
    java.lang.String str18 = flight5.getArrivalTime();
    java.lang.String str19 = flight5.getDestination();
    java.lang.String str20 = flight5.getDepartureTime();
    java.lang.String str21 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    java.lang.String str24 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test043"); }

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
    flight5.setFlightNumber("");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    java.lang.String str25 = flight5.getDestination();
    java.lang.String str26 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str29 = flight5.getOrigin();
    java.lang.String str30 = flight5.getOrigin();
    java.lang.String str31 = flight5.getFlightNumber();
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test044"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str14 = flight5.getOrigin();
    flight5.setFlightNumber("");
    java.lang.String str17 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test045"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getFlightNumber();
    flight5.setDestination("");
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
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
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test046"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("");
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    java.lang.String str18 = flight5.getDestination();
    java.lang.String str19 = flight5.getOrigin();
    java.lang.String str20 = flight5.getDepartureTime();
    java.lang.String str21 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test047"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    flight5.setDestination("");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    java.lang.String str26 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test048"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getOrigin();
    flight5.setDestination("hi!");
    java.lang.String str16 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test049"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getOrigin();
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getOrigin();
    java.lang.String str13 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test050"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    java.lang.String str8 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getArrivalTime();
    java.lang.String str13 = flight5.getOrigin();
    flight5.setDestination("");
    java.lang.String str16 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test051"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getFlightNumber();
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setDestination("");
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test052"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str15 = flight5.getOrigin();
    java.lang.String str16 = flight5.getDepartureTime();
    flight5.setDestination("");
    flight5.setDepartureTime("");
    flight5.setDestination("");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test053"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("");
    java.lang.String str18 = flight5.getOrigin();
    flight5.setDepartureTime("");
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test054"); }

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
    java.lang.String str23 = flight5.getDestination();
    java.lang.String str24 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test055"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    flight5.setDepartureTime("");
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test056"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getFlightNumber();
    java.lang.String str12 = flight5.getDestination();
    flight5.setArrivalTime("");
    flight5.setDestination("");
    flight5.setArrivalTime("");
    java.lang.String str19 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test057"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setDestination("hi!");
    java.lang.String str11 = flight5.getDestination();
    flight5.setOrigin("");
    java.lang.String str14 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test058"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    flight5.setOrigin("hi!");
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test059"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test060"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str16 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    java.lang.String str19 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    flight5.setDestination("");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("");
    flight5.setOrigin("");
    java.lang.String str30 = flight5.getDepartureTime();
    java.lang.String str31 = flight5.getArrivalTime();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test061"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test062"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setDepartureTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str15 = flight5.getDestination();
    flight5.setDestination("");
    java.lang.String str18 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test063"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    java.lang.String str18 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test064"); }

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
    flight5.setArrivalTime("hi!");
    java.lang.String str28 = flight5.getFlightNumber();
    java.lang.String str29 = flight5.getOrigin();
    java.lang.String str30 = flight5.getOrigin();
    java.lang.String str31 = flight5.getDestination();
    flight5.setOrigin("");
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
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test065"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getOrigin();
    flight5.setFlightNumber("");
    java.lang.String str12 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test066"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getDestination();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str19 = flight5.getDepartureTime();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test067"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    flight5.setDepartureTime("");
    flight5.setDestination("hi!");
    java.lang.String str18 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    java.lang.String str21 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str24 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test068"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setDestination("");
    flight5.setArrivalTime("hi!");
    java.lang.String str16 = flight5.getDestination();
    java.lang.String str17 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test069"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    java.lang.String str15 = flight5.getOrigin();
    java.lang.String str16 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    java.lang.String str19 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test070"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str16 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str19 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test071"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test072"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    flight5.setArrivalTime("hi!");
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getDepartureTime();
    java.lang.String str16 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test073"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test074"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("hi!");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test075"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "", "");
    flight5.setOrigin("");
    java.lang.String str8 = flight5.getArrivalTime();
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getOrigin();
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str17 = flight5.getDepartureTime();
    java.lang.String str18 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test076"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("");
    java.lang.String str10 = flight5.getOrigin();
    flight5.setDestination("hi!");
    java.lang.String str13 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test077"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str14 = flight5.getDestination();
    flight5.setArrivalTime("");
    flight5.setOrigin("hi!");
    java.lang.String str19 = flight5.getArrivalTime();
    
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

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test078"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    flight5.setArrivalTime("");
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setDestination("");
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str18 = flight5.getOrigin();
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test079"); }

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
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test080"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setOrigin("");
    java.lang.String str10 = flight5.getOrigin();
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setOrigin("");
    flight5.setFlightNumber("");
    java.lang.String str21 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str24 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test081"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str18 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test082"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setDestination("");
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test083"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getOrigin();
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getFlightNumber();
    java.lang.String str16 = flight5.getDepartureTime();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test084"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    flight5.setDestination("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setDestination("");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test085"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setDestination("hi!");
    java.lang.String str20 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test086"); }

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
    flight5.setFlightNumber("");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    java.lang.String str25 = flight5.getDestination();
    java.lang.String str26 = flight5.getFlightNumber();
    flight5.setDestination("");
    java.lang.String str29 = flight5.getOrigin();
    java.lang.String str30 = flight5.getFlightNumber();
    java.lang.String str31 = flight5.getOrigin();
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test087"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "hi!", "", "");
    flight5.setDestination("");
    flight5.setDepartureTime("hi!");
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setDepartureTime("hi!");
    java.lang.String str15 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test088"); }

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
    java.lang.String str22 = flight5.getFlightNumber();
    java.lang.String str23 = flight5.getDestination();
    flight5.setFlightNumber("");
    java.lang.String str26 = flight5.getDestination();
    flight5.setOrigin("");
    flight5.setOrigin("");
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test089"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getDepartureTime();
    flight5.setOrigin("");
    flight5.setOrigin("");
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test090"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test091"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getDepartureTime();
    java.lang.String str16 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    java.lang.String str19 = flight5.getDestination();
    flight5.setDestination("hi!");
    java.lang.String str22 = flight5.getOrigin();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test092"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str17 = flight5.getDepartureTime();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test093"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str17 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test094"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str16 = flight5.getDepartureTime();
    java.lang.String str17 = flight5.getOrigin();
    flight5.setDestination("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test095"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    flight5.setArrivalTime("hi!");
    java.lang.String str24 = flight5.getFlightNumber();
    java.lang.String str25 = flight5.getDestination();
    java.lang.String str26 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    java.lang.String str29 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test096"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str16 = flight5.getOrigin();
    flight5.setOrigin("");
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test097"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getDestination();
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getDestination();
    flight5.setArrivalTime("");
    java.lang.String str12 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test098"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "", "hi!");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    flight5.setFlightNumber("");
    flight5.setOrigin("");
    java.lang.String str19 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test099"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    java.lang.String str9 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test100"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str16 = flight5.getDepartureTime();
    java.lang.String str17 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test101"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getDestination();
    flight5.setDestination("");
    java.lang.String str15 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test102"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str14 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("hi!");
    
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

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test103"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    java.lang.String str18 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test104"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setDepartureTime("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    flight5.setFlightNumber("");
    java.lang.String str20 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test105"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    java.lang.String str17 = flight5.getDepartureTime();
    java.lang.String str18 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test106"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test107"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getArrivalTime();
    java.lang.String str9 = flight5.getDestination();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test108"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getOrigin();
    java.lang.String str10 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test109"); }

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
    java.lang.String str17 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    
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
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test110"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "", "");
    flight5.setDestination("");
    flight5.setDestination("");
    java.lang.String str10 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test111"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test112"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "hi!", "", "hi!");
    flight5.setDepartureTime("");
    flight5.setDestination("hi!");
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test113"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("hi!");
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    
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

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test114"); }

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
    flight5.setOrigin("hi!");
    java.lang.String str23 = flight5.getArrivalTime();
    java.lang.String str24 = flight5.getFlightNumber();
    java.lang.String str25 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    flight5.setArrivalTime("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test115"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
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

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test116"); }

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
    java.lang.String str22 = flight5.getFlightNumber();
    java.lang.String str23 = flight5.getDestination();
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test117"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    flight5.setDestination("");
    flight5.setDepartureTime("");
    java.lang.String str18 = flight5.getDestination();
    java.lang.String str19 = flight5.getDestination();
    java.lang.String str20 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test118"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str17 = flight5.getDepartureTime();
    java.lang.String str18 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test119"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str17 = flight5.getOrigin();
    flight5.setFlightNumber("");
    java.lang.String str20 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test120"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getFlightNumber();
    java.lang.String str10 = flight5.getOrigin();
    java.lang.String str11 = flight5.getFlightNumber();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getDepartureTime();
    java.lang.String str18 = flight5.getFlightNumber();
    java.lang.String str19 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test121"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "", "");
    flight5.setOrigin("");
    java.lang.String str8 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test122"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getFlightNumber();
    java.lang.String str10 = flight5.getDepartureTime();
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getOrigin();
    
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

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test123"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setDestination("");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str21 = flight5.getOrigin();
    java.lang.String str22 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test124"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getDepartureTime();
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getArrivalTime();
    java.lang.String str16 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    java.lang.String str19 = flight5.getArrivalTime();
    java.lang.String str20 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test125"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str15 = flight5.getOrigin();
    flight5.setOrigin("");
    java.lang.String str18 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test126"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str15 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("");
    flight5.setDestination("hi!");
    java.lang.String str24 = flight5.getDepartureTime();
    java.lang.String str25 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test127"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setDestination("");
    flight5.setOrigin("");
    flight5.setDestination("hi!");
    java.lang.String str21 = flight5.getFlightNumber();
    java.lang.String str22 = flight5.getDestination();
    java.lang.String str23 = flight5.getDestination();
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test128"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "", "hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setOrigin("");
    flight5.setDepartureTime("");
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str17 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test129"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getDepartureTime();
    java.lang.String str14 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setDepartureTime("hi!");
    java.lang.String str19 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test130"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str14 = flight5.getDestination();
    
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

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test131"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setDestination("");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str21 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str26 = flight5.getArrivalTime();
    java.lang.String str27 = flight5.getDestination();
    java.lang.String str28 = flight5.getFlightNumber();
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test132"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test133"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str10 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
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
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test134"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getDepartureTime();
    java.lang.String str14 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test135"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test136"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    flight5.setArrivalTime("hi!");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test137"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getOrigin();
    java.lang.String str16 = flight5.getOrigin();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test138"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "hi!", "", "");
    flight5.setDestination("");
    flight5.setFlightNumber("");
    java.lang.String str10 = flight5.getDepartureTime();
    flight5.setDestination("");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test139"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getDepartureTime();
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str19 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test140"); }

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
    flight5.setOrigin("hi!");
    java.lang.String str24 = flight5.getDepartureTime();
    
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
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test141"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    java.lang.String str16 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    
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

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test142"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str11 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setArrivalTime("hi!");
    java.lang.String str16 = flight5.getOrigin();
    java.lang.String str17 = flight5.getFlightNumber();
    java.lang.String str18 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test143"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getOrigin();
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test144"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    java.lang.String str10 = flight5.getOrigin();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test145"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    java.lang.String str22 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test146"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getFlightNumber();
    java.lang.String str12 = flight5.getArrivalTime();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test147"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str18 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test148"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test149"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setDestination("");
    java.lang.String str12 = flight5.getOrigin();
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test150"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "hi!");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setDestination("");
    java.lang.String str17 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test151"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    flight5.setArrivalTime("hi!");
    java.lang.String str15 = flight5.getFlightNumber();
    java.lang.String str16 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test152"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    java.lang.String str16 = flight5.getDepartureTime();
    java.lang.String str17 = flight5.getArrivalTime();
    java.lang.String str18 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test153"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    java.lang.String str10 = flight5.getDestination();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test154"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setOrigin("");
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    java.lang.String str18 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test155"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setDepartureTime("");
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getOrigin();
    java.lang.String str18 = flight5.getArrivalTime();
    flight5.setOrigin("");
    java.lang.String str21 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test156"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setDestination("");
    flight5.setDepartureTime("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test157"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    java.lang.String str13 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test158"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    flight5.setDestination("");
    flight5.setFlightNumber("");
    flight5.setDestination("hi!");
    flight5.setDestination("");
    flight5.setDestination("");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test159"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    flight5.setArrivalTime("");
    flight5.setDestination("hi!");
    java.lang.String str10 = flight5.getDestination();
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test160"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "", "", "hi!");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    flight5.setDepartureTime("");
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test161"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    java.lang.String str9 = flight5.getFlightNumber();
    java.lang.String str10 = flight5.getOrigin();
    java.lang.String str11 = flight5.getOrigin();
    flight5.setDepartureTime("");
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getOrigin();
    java.lang.String str16 = flight5.getOrigin();
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test162"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getDestination();
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test163"); }

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
    java.lang.String str18 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    java.lang.String str21 = flight5.getDestination();
    flight5.setDestination("");
    java.lang.String str24 = flight5.getDestination();
    flight5.setArrivalTime("");
    flight5.setDestination("");
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test164"); }

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
    flight5.setFlightNumber("");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    java.lang.String str25 = flight5.getDestination();
    java.lang.String str26 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str29 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    java.lang.String str34 = flight5.getDestination();
    java.lang.String str35 = flight5.getOrigin();
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test165"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getDepartureTime();
    flight5.setOrigin("");
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test166"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test167"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    flight5.setDestination("hi!");
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test168"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "", "", "hi!");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getDestination();
    flight5.setOrigin("");
    java.lang.String str17 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test169"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getDestination();
    flight5.setFlightNumber("");
    java.lang.String str17 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test170"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    flight5.setDestination("");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    
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

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test171"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setDepartureTime("");
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str17 = flight5.getDepartureTime();
    java.lang.String str18 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test172"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setDestination("");
    flight5.setArrivalTime("hi!");
    flight5.setOrigin("hi!");
    java.lang.String str22 = flight5.getDestination();
    java.lang.String str23 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test173"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setDestination("");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setDestination("");
    java.lang.String str16 = flight5.getDestination();
    java.lang.String str17 = flight5.getOrigin();
    java.lang.String str18 = flight5.getArrivalTime();
    flight5.setOrigin("");
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test174"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setArrivalTime("");
    java.lang.String str14 = flight5.getDestination();
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test175"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    java.lang.String str16 = flight5.getDepartureTime();
    java.lang.String str17 = flight5.getDestination();
    java.lang.String str18 = flight5.getDepartureTime();
    flight5.setDestination("");
    flight5.setDepartureTime("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test176"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str12 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    flight5.setDestination("hi!");
    java.lang.String str17 = flight5.getDestination();
    java.lang.String str18 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test177"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    java.lang.String str19 = flight5.getOrigin();
    java.lang.String str20 = flight5.getFlightNumber();
    java.lang.String str21 = flight5.getOrigin();
    java.lang.String str22 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test178"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getDepartureTime();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getDestination();
    flight5.setOrigin("hi!");
    java.lang.String str18 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
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
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test179"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test180"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    java.lang.String str18 = flight5.getOrigin();
    java.lang.String str19 = flight5.getFlightNumber();
    java.lang.String str20 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test181"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getDestination();
    flight5.setOrigin("");
    java.lang.String str18 = flight5.getArrivalTime();
    java.lang.String str19 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test182"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    flight5.setDestination("");
    java.lang.String str19 = flight5.getDepartureTime();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test183"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str15 = flight5.getFlightNumber();
    java.lang.String str16 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test184"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setOrigin("");
    flight5.setDestination("");
    flight5.setFlightNumber("");
    java.lang.String str20 = flight5.getDepartureTime();
    java.lang.String str21 = flight5.getDepartureTime();
    java.lang.String str22 = flight5.getDestination();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test185"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "", "");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("");
    flight5.setArrivalTime("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    java.lang.String str19 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test186"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getDestination();
    flight5.setDestination("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test187"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str10 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    java.lang.String str15 = flight5.getFlightNumber();
    java.lang.String str16 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test188"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getDestination();
    flight5.setOrigin("");
    flight5.setFlightNumber("");
    java.lang.String str18 = flight5.getDestination();
    java.lang.String str19 = flight5.getFlightNumber();
    java.lang.String str20 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test189"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("hi!");
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setArrivalTime("hi!");
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

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test190"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setOrigin("");
    java.lang.String str10 = flight5.getDepartureTime();
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str15 = flight5.getDepartureTime();
    java.lang.String str16 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test191"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getDepartureTime();
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getDepartureTime();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test192"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getDestination();
    flight5.setOrigin("");
    flight5.setOrigin("");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test193"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setFlightNumber("hi!");
    
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
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test194"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    java.lang.String str19 = flight5.getArrivalTime();
    java.lang.String str20 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test195"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    flight5.setDepartureTime("");
    flight5.setDestination("hi!");
    java.lang.String str18 = flight5.getFlightNumber();
    java.lang.String str19 = flight5.getDepartureTime();
    java.lang.String str20 = flight5.getDestination();
    java.lang.String str21 = flight5.getFlightNumber();
    java.lang.String str22 = flight5.getDepartureTime();
    java.lang.String str23 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test196"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str12 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    flight5.setDepartureTime("");
    java.lang.String str17 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test197"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "", "");
    java.lang.String str6 = flight5.getOrigin();
    flight5.setFlightNumber("");
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getOrigin();
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    java.lang.String str16 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test198"); }

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
    flight5.setOrigin("");
    java.lang.String str21 = flight5.getDestination();
    java.lang.String str22 = flight5.getFlightNumber();
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test199"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("hi!");
    flight5.setDestination("hi!");
    flight5.setArrivalTime("");
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test200"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test201"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test202"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    flight5.setFlightNumber("hi!");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getOrigin();
    java.lang.String str15 = flight5.getDestination();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test203"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test204"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    flight5.setDepartureTime("");
    java.lang.String str17 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str20 = flight5.getDepartureTime();
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test205"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getDestination();
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test206"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    java.lang.String str17 = flight5.getDepartureTime();
    java.lang.String str18 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    java.lang.String str21 = flight5.getOrigin();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test207"); }

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
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test208"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    java.lang.String str19 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
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
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test209"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    
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
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test210"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getDepartureTime();
    
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
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test211"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test212"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str18 = flight5.getArrivalTime();
    java.lang.String str19 = flight5.getOrigin();
    flight5.setFlightNumber("");
    java.lang.String str22 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setOrigin("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test213"); }

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
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    java.lang.String str25 = flight5.getFlightNumber();
    java.lang.String str26 = flight5.getArrivalTime();
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test214"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getDestination();
    flight5.setArrivalTime("");
    flight5.setOrigin("hi!");
    java.lang.String str19 = flight5.getFlightNumber();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test215"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    
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

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test216"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    flight5.setDestination("");
    flight5.setOrigin("hi!");
    java.lang.String str20 = flight5.getArrivalTime();
    java.lang.String str21 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test217"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    flight5.setDestination("");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test218"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str17 = flight5.getDepartureTime();
    java.lang.String str18 = flight5.getDepartureTime();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test219"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test220"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getDestination();
    flight5.setDestination("hi!");
    java.lang.String str15 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str18 = flight5.getOrigin();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test221"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "", "hi!", "");
    flight5.setOrigin("");
    flight5.setFlightNumber("");
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getDestination();
    flight5.setArrivalTime("");
    java.lang.String str14 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test222"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "");
    flight5.setArrivalTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str10 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    java.lang.String str17 = flight5.getDestination();
    java.lang.String str18 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test223"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    java.lang.String str8 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test224"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str18 = flight5.getFlightNumber();
    java.lang.String str19 = flight5.getFlightNumber();
    java.lang.String str20 = flight5.getDepartureTime();
    java.lang.String str21 = flight5.getArrivalTime();
    java.lang.String str22 = flight5.getFlightNumber();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test225"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    java.lang.String str17 = flight5.getOrigin();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test226"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    java.lang.String str10 = flight5.getOrigin();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test227"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("");
    flight5.setArrivalTime("hi!");
    java.lang.String str17 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test228"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str17 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    flight5.setDestination("hi!");
    java.lang.String str22 = flight5.getOrigin();
    java.lang.String str23 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test229"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getDestination();
    java.lang.String str17 = flight5.getDestination();
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test230"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test231"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setDestination("");
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str23 = flight5.getArrivalTime();
    java.lang.String str24 = flight5.getDestination();
    java.lang.String str25 = flight5.getDepartureTime();
    java.lang.String str26 = flight5.getOrigin();
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test232"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "");
    flight5.setArrivalTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str10 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test233"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str12 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test234"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "hi!", "hi!", "hi!");
    flight5.setDepartureTime("");
    flight5.setOrigin("");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("");
    flight5.setDestination("hi!");
    java.lang.String str16 = flight5.getDestination();
    flight5.setDepartureTime("");
    java.lang.String str19 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test235"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    flight5.setDestination("hi!");
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test236"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getFlightNumber();
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test237"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "", "");
    java.lang.String str6 = flight5.getDestination();
    flight5.setOrigin("");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test238"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "hi!", "");
    flight5.setOrigin("");

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test239"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test240"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "", "");
    flight5.setOrigin("");
    java.lang.String str8 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test241"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "", "hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test242"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test243"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getOrigin();
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test244"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDestination();
    flight5.setDestination("hi!");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getOrigin();
    java.lang.String str16 = flight5.getDepartureTime();
    java.lang.String str17 = flight5.getDestination();
    flight5.setDestination("");
    java.lang.String str20 = flight5.getDepartureTime();
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test245"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getDepartureTime();
    java.lang.String str17 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test246"); }

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
    java.lang.String str19 = flight5.getOrigin();
    java.lang.String str20 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str23 = flight5.getDestination();
    java.lang.String str24 = flight5.getDepartureTime();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test247"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "hi!", "hi!", "hi!");
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setOrigin("hi!");
    flight5.setDestination("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDepartureTime("");
    flight5.setArrivalTime("hi!");
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    java.lang.String str26 = flight5.getArrivalTime();
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test248"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setDepartureTime("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test249"); }

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
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("hi!");
    
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

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test250"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    java.lang.String str10 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test251"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getDestination();
    flight5.setDestination("");
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    flight5.setFlightNumber("");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test252"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getOrigin();
    java.lang.String str15 = flight5.getFlightNumber();
    java.lang.String str16 = flight5.getArrivalTime();
    java.lang.String str17 = flight5.getDestination();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test253"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    flight5.setDestination("hi!");
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getOrigin();
    flight5.setDepartureTime("");
    java.lang.String str17 = flight5.getArrivalTime();
    java.lang.String str18 = flight5.getFlightNumber();
    
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
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test254"); }

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
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    java.lang.String str24 = flight5.getDestination();
    flight5.setDestination("");
    java.lang.String str27 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test255"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getOrigin();
    flight5.setDepartureTime("");
    flight5.setArrivalTime("hi!");
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str17 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test256"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getFlightNumber();
    java.lang.String str8 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test257"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    java.lang.String str15 = flight5.getDepartureTime();
    java.lang.String str16 = flight5.getDepartureTime();
    java.lang.String str17 = flight5.getArrivalTime();
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test258"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getOrigin();
    flight5.setOrigin("");
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    java.lang.String str20 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test259"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str15 = flight5.getOrigin();
    flight5.setDepartureTime("");
    flight5.setOrigin("");
    java.lang.String str20 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test260"); }

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
    flight5.setDestination("hi!");
    flight5.setFlightNumber("hi!");
    
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

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test261"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str10 = flight5.getDestination();
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test262"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    flight5.setDepartureTime("");
    java.lang.String str15 = flight5.getArrivalTime();
    java.lang.String str16 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test263"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setDestination("");
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str21 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test264"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getFlightNumber();
    java.lang.String str12 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str15 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test265"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setDestination("");
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test266"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getFlightNumber();
    java.lang.String str12 = flight5.getOrigin();
    java.lang.String str13 = flight5.getDepartureTime();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test267"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    java.lang.String str18 = flight5.getDepartureTime();
    java.lang.String str19 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    java.lang.String str22 = flight5.getDepartureTime();
    java.lang.String str23 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    flight5.setOrigin("");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test268"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setDestination("hi!");
    java.lang.String str11 = flight5.getOrigin();
    flight5.setDestination("hi!");
    java.lang.String str14 = flight5.getDestination();
    flight5.setDestination("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str19 = flight5.getDestination();
    flight5.setArrivalTime("");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test269"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    flight5.setDestination("");
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test270"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    java.lang.String str13 = flight5.getDestination();
    flight5.setDepartureTime("");
    java.lang.String str16 = flight5.getDepartureTime();
    java.lang.String str17 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test271"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDestination("hi!");
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str19 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str24 = flight5.getFlightNumber();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test272"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getDestination();
    flight5.setOrigin("");
    java.lang.String str18 = flight5.getDepartureTime();
    java.lang.String str19 = flight5.getDepartureTime();
    java.lang.String str20 = flight5.getOrigin();
    flight5.setOrigin("");
    flight5.setDestination("hi!");
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test273"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    java.lang.String str15 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setFlightNumber("");
    java.lang.String str20 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test274"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getFlightNumber();
    java.lang.String str12 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test275"); }

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
    java.lang.String str23 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str26 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test276"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDestination();
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getDestination();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test277"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDestination("");
    java.lang.String str10 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test278"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setDestination("");
    flight5.setDestination("");
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    java.lang.String str18 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test279"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str18 = flight5.getDestination();
    java.lang.String str19 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    java.lang.String str22 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test280"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    java.lang.String str17 = flight5.getDestination();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test281"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getFlightNumber();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test282"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test283"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    java.lang.String str18 = flight5.getDestination();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("");
    java.lang.String str23 = flight5.getDestination();
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test284"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test285"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    java.lang.String str10 = flight5.getOrigin();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getDestination();
    flight5.setFlightNumber("");
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test286"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str17 = flight5.getDestination();
    java.lang.String str18 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
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
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test287"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getDepartureTime();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
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
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test288"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getDepartureTime();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    flight5.setDestination("");
    flight5.setOrigin("");
    java.lang.String str17 = flight5.getDestination();
    java.lang.String str18 = flight5.getDestination();
    java.lang.String str19 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test289"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str18 = flight5.getArrivalTime();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test290"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("");
    flight5.setDestination("");
    java.lang.String str17 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str20 = flight5.getOrigin();
    java.lang.String str21 = flight5.getOrigin();
    java.lang.String str22 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test291"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "hi!");
    flight5.setArrivalTime("");
    flight5.setOrigin("hi!");
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test292"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getArrivalTime();
    flight5.setOrigin("");
    java.lang.String str11 = flight5.getOrigin();
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test293"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setOrigin("");
    java.lang.String str15 = flight5.getArrivalTime();
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test294"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test295"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    flight5.setArrivalTime("");
    java.lang.String str14 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test296"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    flight5.setDepartureTime("");
    java.lang.String str14 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setArrivalTime("");
    flight5.setDepartureTime("");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test297"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getFlightNumber();
    java.lang.String str16 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test298"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    flight5.setOrigin("");
    flight5.setDestination("hi!");
    flight5.setDestination("hi!");
    flight5.setArrivalTime("");
    java.lang.String str17 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test299"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getDestination();
    java.lang.String str17 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test300"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getOrigin();
    java.lang.String str15 = flight5.getFlightNumber();
    java.lang.String str16 = flight5.getDestination();
    java.lang.String str17 = flight5.getDestination();
    java.lang.String str18 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test301"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str17 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    java.lang.String str20 = flight5.getArrivalTime();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test302"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str15 = flight5.getOrigin();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test303"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getOrigin();
    flight5.setDestination("");
    java.lang.String str15 = flight5.getDepartureTime();
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
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
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test304"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDestination("hi!");
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str17 = flight5.getDepartureTime();
    java.lang.String str18 = flight5.getDepartureTime();
    java.lang.String str19 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test305"); }

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
    java.lang.String str20 = flight5.getDestination();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test306"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test307"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getOrigin();
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test308"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test309"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "", "");
    flight5.setDestination("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test310"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str17 = flight5.getOrigin();
    java.lang.String str18 = flight5.getOrigin();
    flight5.setOrigin("");
    flight5.setFlightNumber("hi!");
    java.lang.String str23 = flight5.getDestination();
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test311"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    java.lang.String str13 = flight5.getDepartureTime();
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    java.lang.String str20 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test312"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "", "hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test313"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "", "", "");
    flight5.setDestination("");
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setFlightNumber("");
    java.lang.String str14 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test314"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    flight5.setDestination("hi!");
    flight5.setArrivalTime("");
    java.lang.String str17 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test315"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    flight5.setOrigin("hi!");
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getOrigin();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test316"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str15 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str26 = flight5.getDepartureTime();
    java.lang.String str27 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test317"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDestination("hi!");
    flight5.setDepartureTime("");
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test318"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setOrigin("");
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str13 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test319"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str10 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setDepartureTime("hi!");
    java.lang.String str15 = flight5.getFlightNumber();
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test320"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    java.lang.String str16 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    java.lang.String str19 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test321"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getArrivalTime();
    java.lang.String str9 = flight5.getFlightNumber();
    java.lang.String str10 = flight5.getDepartureTime();
    flight5.setDestination("");
    flight5.setOrigin("");
    java.lang.String str15 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test322"); }

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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test323"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    flight5.setArrivalTime("");
    java.lang.String str14 = flight5.getOrigin();
    flight5.setDestination("");
    java.lang.String str17 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str20 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test324"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    java.lang.String str11 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    java.lang.String str18 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test325"); }

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
    java.lang.String str21 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    
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
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test326"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test327"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str15 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test328"); }

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
    flight5.setDestination("hi!");
    flight5.setDestination("");
    java.lang.String str25 = flight5.getDepartureTime();
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test329"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getDepartureTime();
    java.lang.String str16 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    java.lang.String str19 = flight5.getDepartureTime();
    flight5.setDestination("");
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test330"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getDestination();
    flight5.setDepartureTime("");
    flight5.setDestination("");
    java.lang.String str19 = flight5.getFlightNumber();
    java.lang.String str20 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test331"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    flight5.setFlightNumber("");
    java.lang.String str8 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test332"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getArrivalTime();
    java.lang.String str9 = flight5.getFlightNumber();
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getFlightNumber();
    flight5.setDestination("");
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test333"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "hi!", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test334"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    java.lang.String str22 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test335"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setDepartureTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setDestination("");
    java.lang.String str15 = flight5.getOrigin();
    flight5.setOrigin("");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test336"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "hi!", "hi!");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setDestination("");
    flight5.setDepartureTime("");
    flight5.setOrigin("hi!");
    java.lang.String str16 = flight5.getDestination();
    java.lang.String str17 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test337"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str11 = flight5.getFlightNumber();
    flight5.setDestination("");
    java.lang.String str14 = flight5.getOrigin();
    flight5.setOrigin("");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    java.lang.String str21 = flight5.getOrigin();
    java.lang.String str22 = flight5.getFlightNumber();
    java.lang.String str23 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test338"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getArrivalTime();
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str12 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test339"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    flight5.setFlightNumber("");
    flight5.setOrigin("");
    flight5.setOrigin("");
    java.lang.String str28 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test340"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getFlightNumber();
    java.lang.String str12 = flight5.getArrivalTime();
    flight5.setOrigin("");
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str19 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setDepartureTime("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test341"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    flight5.setDepartureTime("hi!");
    java.lang.String str16 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test342"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getOrigin();
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test343"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    flight5.setDestination("hi!");
    java.lang.String str16 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str19 = flight5.getDestination();
    java.lang.String str20 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    java.lang.String str25 = flight5.getFlightNumber();
    java.lang.String str26 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test344"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test345"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getArrivalTime();
    java.lang.String str9 = flight5.getOrigin();
    flight5.setDestination("hi!");
    java.lang.String str12 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test346"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    java.lang.String str19 = flight5.getOrigin();
    flight5.setDestination("");
    java.lang.String str22 = flight5.getDestination();
    java.lang.String str23 = flight5.getFlightNumber();
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test347"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setDestination("");
    java.lang.String str12 = flight5.getOrigin();
    flight5.setOrigin("");
    java.lang.String str15 = flight5.getArrivalTime();
    java.lang.String str16 = flight5.getOrigin();
    java.lang.String str17 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test348"); }

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
    java.lang.String str19 = flight5.getOrigin();
    java.lang.String str20 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test349"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str16 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test350"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "", "");
    flight5.setDestination("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    flight5.setDestination("");
    flight5.setOrigin("");
    java.lang.String str17 = flight5.getFlightNumber();
    java.lang.String str18 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test351"); }

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
    java.lang.String str28 = flight5.getDepartureTime();
    java.lang.String str29 = flight5.getDepartureTime();
    java.lang.String str30 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test352"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str20 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test353"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDestination();
    java.lang.String str7 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str10 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test354"); }

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
    flight5.setFlightNumber("");
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test355"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str18 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
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
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test356"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setDestination("");
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test357"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDestination();
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str18 = flight5.getDepartureTime();
    java.lang.String str19 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test358"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "", "hi!", "");
    flight5.setArrivalTime("hi!");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getOrigin();
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test359"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getDestination();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    java.lang.String str18 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test360"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setOrigin("hi!");
    java.lang.String str20 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str25 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test361"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getFlightNumber();
    flight5.setDepartureTime("hi!");
    java.lang.String str14 = flight5.getOrigin();
    java.lang.String str15 = flight5.getOrigin();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test362"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    flight5.setArrivalTime("");
    flight5.setDepartureTime("");
    java.lang.String str17 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test363"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "", "");
    flight5.setOrigin("");
    java.lang.String str8 = flight5.getArrivalTime();
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getOrigin();
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setOrigin("");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test364"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str9 = flight5.getOrigin();
    java.lang.String str10 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test365"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setOrigin("");
    java.lang.String str14 = flight5.getOrigin();
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test366"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setFlightNumber("");
    java.lang.String str18 = flight5.getOrigin();
    java.lang.String str19 = flight5.getDestination();
    flight5.setDestination("hi!");
    java.lang.String str22 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test367"); }

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
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    java.lang.String str25 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test368"); }

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
    java.lang.String str18 = flight5.getOrigin();
    java.lang.String str19 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    java.lang.String str22 = flight5.getFlightNumber();
    java.lang.String str23 = flight5.getDepartureTime();
    java.lang.String str24 = flight5.getFlightNumber();
    java.lang.String str25 = flight5.getArrivalTime();
    java.lang.String str26 = flight5.getOrigin();
    java.lang.String str27 = flight5.getArrivalTime();
    java.lang.String str28 = flight5.getFlightNumber();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test369"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str14 = flight5.getDestination();
    flight5.setArrivalTime("");
    java.lang.String str17 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    flight5.setDestination("hi!");
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test370"); }

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
    java.lang.String str22 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("hi!");
    
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
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test371"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    java.lang.String str14 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str17 = flight5.getFlightNumber();
    java.lang.String str18 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str21 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test372"); }

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
    java.lang.String str18 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    flight5.setDestination("");
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test373"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "", "", "hi!");
    flight5.setDepartureTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getDestination();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test374"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    java.lang.String str9 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test375"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getOrigin();
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
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
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test376"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str17 = flight5.getDepartureTime();
    java.lang.String str18 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test377"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test378"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str15 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str20 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str27 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test379"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str15 = flight5.getOrigin();
    java.lang.String str16 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test380"); }

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
    java.lang.String str19 = flight5.getArrivalTime();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test381"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str17 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str20 = flight5.getOrigin();
    java.lang.String str21 = flight5.getArrivalTime();
    java.lang.String str22 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test382"); }

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
    java.lang.String str22 = flight5.getDepartureTime();
    java.lang.String str23 = flight5.getArrivalTime();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test383"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setOrigin("");
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test384"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str16 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test385"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setDestination("hi!");
    flight5.setDepartureTime("");
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    flight5.setDepartureTime("");
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test386"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test387"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    flight5.setOrigin("");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getOrigin();
    java.lang.String str15 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test388"); }

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
    flight5.setDepartureTime("");
    flight5.setFlightNumber("hi!");
    java.lang.String str23 = flight5.getDestination();
    flight5.setDestination("hi!");
    java.lang.String str26 = flight5.getDestination();
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test389"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getDepartureTime();
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getFlightNumber();
    java.lang.String str16 = flight5.getDepartureTime();
    java.lang.String str17 = flight5.getOrigin();
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test390"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getFlightNumber();
    java.lang.String str12 = flight5.getOrigin();
    flight5.setOrigin("");
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    java.lang.String str18 = flight5.getDestination();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test391"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str18 = flight5.getOrigin();
    java.lang.String str19 = flight5.getOrigin();
    java.lang.String str20 = flight5.getDestination();
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test392"); }

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
    flight5.setFlightNumber("");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    java.lang.String str25 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str30 = flight5.getFlightNumber();
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test393"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    flight5.setDepartureTime("");
    java.lang.String str16 = flight5.getDestination();
    flight5.setDestination("");
    flight5.setFlightNumber("");
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test394"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getDepartureTime();
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getOrigin();
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test395"); }

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
    java.lang.String str22 = flight5.getFlightNumber();
    java.lang.String str23 = flight5.getDestination();
    flight5.setFlightNumber("");
    java.lang.String str26 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    java.lang.String str29 = flight5.getFlightNumber();
    flight5.setDepartureTime("hi!");
    java.lang.String str32 = flight5.getFlightNumber();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test396"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getArrivalTime();
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setDestination("");
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test397"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    java.lang.String str17 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test398"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str15 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str18 = flight5.getDestination();
    flight5.setArrivalTime("");
    java.lang.String str21 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    java.lang.String str24 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test399"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    flight5.setDestination("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str14 = flight5.getDestination();
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test400"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    flight5.setDestination("hi!");
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test401"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getDepartureTime();
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setDestination("");
    flight5.setOrigin("hi!");
    java.lang.String str19 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test402"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getArrivalTime();
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getArrivalTime();
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test403"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("hi!");
    java.lang.String str15 = flight5.getOrigin();
    java.lang.String str16 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test404"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    flight5.setArrivalTime("hi!");
    java.lang.String str15 = flight5.getArrivalTime();
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setFlightNumber("");
    flight5.setFlightNumber("hi!");
    
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

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test405"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    java.lang.String str10 = flight5.getDestination();
    flight5.setDestination("");
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test406"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("");
    java.lang.String str16 = flight5.getDestination();
    flight5.setOrigin("");
    flight5.setDepartureTime("");
    java.lang.String str21 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test407"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str15 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    flight5.setDestination("");
    flight5.setDepartureTime("");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test408"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str17 = flight5.getOrigin();
    flight5.setOrigin("");
    flight5.setArrivalTime("");
    flight5.setDepartureTime("");
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test409"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str10 = flight5.getDestination();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test410"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getDestination();
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setOrigin("");
    flight5.setDepartureTime("");
    java.lang.String str19 = flight5.getOrigin();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test411"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getDepartureTime();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test412"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str15 = flight5.getDestination();
    java.lang.String str16 = flight5.getOrigin();
    java.lang.String str17 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test413"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getFlightNumber();
    java.lang.String str8 = flight5.getArrivalTime();
    java.lang.String str9 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test414"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str14 = flight5.getDestination();
    flight5.setArrivalTime("");
    flight5.setOrigin("");
    flight5.setFlightNumber("");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("");
    java.lang.String str25 = flight5.getDepartureTime();
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test415"); }

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
    java.lang.String str19 = flight5.getOrigin();
    java.lang.String str20 = flight5.getDepartureTime();
    java.lang.String str21 = flight5.getDestination();
    java.lang.String str22 = flight5.getArrivalTime();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test416"); }

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
    flight5.setArrivalTime("hi!");
    java.lang.String str20 = flight5.getOrigin();
    flight5.setDestination("");
    java.lang.String str23 = flight5.getOrigin();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test417"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setDepartureTime("");
    flight5.setOrigin("hi!");
    java.lang.String str18 = flight5.getDepartureTime();
    java.lang.String str19 = flight5.getArrivalTime();
    java.lang.String str20 = flight5.getDestination();
    java.lang.String str21 = flight5.getArrivalTime();
    java.lang.String str22 = flight5.getDestination();
    java.lang.String str23 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test418"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str9 = flight5.getDestination();
    flight5.setOrigin("");
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str18 = flight5.getDepartureTime();
    flight5.setOrigin("");
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test419"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test420"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "");
    flight5.setOrigin("");
    flight5.setOrigin("");
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test421"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    java.lang.String str15 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test422"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getDestination();
    flight5.setDestination("");
    java.lang.String str16 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str23 = flight5.getDestination();
    java.lang.String str24 = flight5.getArrivalTime();
    java.lang.String str25 = flight5.getArrivalTime();
    java.lang.String str26 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test423"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    java.lang.String str15 = flight5.getOrigin();
    java.lang.String str16 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    flight5.setDestination("hi!");
    java.lang.String str21 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test424"); }

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
    java.lang.String str20 = flight5.getDestination();
    java.lang.String str21 = flight5.getOrigin();
    flight5.setDestination("hi!");
    java.lang.String str24 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test425"); }

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
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test426"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setFlightNumber("");
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test427"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("hi!");
    java.lang.String str12 = flight5.getDepartureTime();
    java.lang.String str13 = flight5.getDepartureTime();
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    java.lang.String str18 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test428"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "hi!", "", "");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test429"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "", "");
    flight5.setDestination("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getOrigin();
    java.lang.String str10 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test430"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("");
    flight5.setDestination("");
    flight5.setOrigin("");
    java.lang.String str20 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test431"); }

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
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("hi!");
    
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

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test432"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setDestination("");
    java.lang.String str15 = flight5.getFlightNumber();
    flight5.setDepartureTime("hi!");
    flight5.setDestination("hi!");
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test433"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getOrigin();
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str15 = flight5.getOrigin();
    java.lang.String str16 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test434"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getFlightNumber();
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test435"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    flight5.setArrivalTime("");
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test436"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "hi!", "", "");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getDestination();
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("");
    flight5.setDepartureTime("");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test437"); }

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
    java.lang.String str18 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    java.lang.String str21 = flight5.getDestination();
    flight5.setDepartureTime("");
    flight5.setOrigin("");
    flight5.setDepartureTime("hi!");
    flight5.setDepartureTime("");
    java.lang.String str30 = flight5.getOrigin();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test438"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    java.lang.String str16 = flight5.getDestination();
    java.lang.String str17 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test439"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str10 = flight5.getOrigin();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test440"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getFlightNumber();
    java.lang.String str9 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    flight5.setFlightNumber("");
    java.lang.String str14 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test441"); }

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
    java.lang.String str20 = flight5.getOrigin();
    
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

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test442"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("");
    java.lang.String str16 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test443"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    flight5.setOrigin("");
    flight5.setArrivalTime("");
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setDestination("");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("");
    flight5.setOrigin("");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test444"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    flight5.setFlightNumber("");
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test445"); }

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
    java.lang.String str21 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    java.lang.String str24 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test446"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getDestination();
    flight5.setArrivalTime("");
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test447"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getFlightNumber();
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    java.lang.String str15 = flight5.getDestination();
    flight5.setDepartureTime("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test448"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "hi!", "", "");
    java.lang.String str6 = flight5.getOrigin();
    flight5.setDestination("hi!");
    flight5.setOrigin("hi!");
    java.lang.String str11 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test449"); }

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
    java.lang.String str19 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("");
    flight5.setFlightNumber("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str28 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    flight5.setFlightNumber("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test450"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getDepartureTime();
    java.lang.String str8 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test451"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str17 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test452"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getFlightNumber();
    java.lang.String str15 = flight5.getArrivalTime();
    flight5.setOrigin("");
    flight5.setFlightNumber("");
    java.lang.String str20 = flight5.getDepartureTime();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test453"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getDestination();
    flight5.setFlightNumber("");
    java.lang.String str12 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test454"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "hi!", "hi!", "hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str8 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    flight5.setOrigin("hi!");
    java.lang.String str13 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    java.lang.String str16 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test455"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str12 = flight5.getDepartureTime();
    flight5.setFlightNumber("hi!");
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test456"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("");
    java.lang.String str13 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test457"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDestination("");
    java.lang.String str10 = flight5.getDestination();
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test458"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setOrigin("");
    flight5.setOrigin("");
    flight5.setOrigin("hi!");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test459"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str18 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str21 = flight5.getDepartureTime();
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test460"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str17 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str20 = flight5.getDestination();
    flight5.setOrigin("hi!");
    java.lang.String str23 = flight5.getArrivalTime();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test461"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("hi!");
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    flight5.setOrigin("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setFlightNumber("hi!");
    java.lang.String str18 = flight5.getDestination();
    java.lang.String str19 = flight5.getArrivalTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str22 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test462"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    java.lang.String str14 = flight5.getDestination();
    java.lang.String str15 = flight5.getDepartureTime();
    java.lang.String str16 = flight5.getOrigin();
    flight5.setOrigin("hi!");
    java.lang.String str19 = flight5.getDepartureTime();
    java.lang.String str20 = flight5.getDestination();
    flight5.setArrivalTime("");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test463"); }

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
    java.lang.String str22 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test464"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str14 = flight5.getArrivalTime();
    flight5.setDestination("");
    java.lang.String str17 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str20 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    flight5.setFlightNumber("");
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test465"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setDestination("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test466"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("hi!");
    java.lang.String str17 = flight5.getOrigin();
    java.lang.String str18 = flight5.getOrigin();
    flight5.setOrigin("");
    flight5.setFlightNumber("hi!");
    java.lang.String str23 = flight5.getDestination();
    java.lang.String str24 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test467"); }

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
    flight5.setFlightNumber("");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    java.lang.String str25 = flight5.getDestination();
    java.lang.String str26 = flight5.getFlightNumber();
    flight5.setDestination("");
    flight5.setFlightNumber("hi!");
    java.lang.String str31 = flight5.getDepartureTime();
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test468"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "", "");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setOrigin("hi!");
    java.lang.String str9 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test469"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getFlightNumber();
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getDestination();
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test470"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getArrivalTime();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getFlightNumber();
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setDestination("");
    flight5.setOrigin("");
    flight5.setDestination("hi!");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("");
    flight5.setOrigin("");
    flight5.setArrivalTime("hi!");
    
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

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test471"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getOrigin();
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setArrivalTime("");
    java.lang.String str14 = flight5.getDepartureTime();
    java.lang.String str15 = flight5.getArrivalTime();
    java.lang.String str16 = flight5.getFlightNumber();
    java.lang.String str17 = flight5.getDestination();
    java.lang.String str18 = flight5.getFlightNumber();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test472"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setDepartureTime("hi!");
    java.lang.String str9 = flight5.getDestination();
    flight5.setOrigin("");
    flight5.setDepartureTime("hi!");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    flight5.setDestination("hi!");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test473"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str15 = flight5.getOrigin();
    flight5.setArrivalTime("");
    flight5.setDepartureTime("hi!");
    java.lang.String str20 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test474"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getDestination();
    flight5.setFlightNumber("");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str16 = flight5.getArrivalTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test475"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getFlightNumber();
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    java.lang.String str16 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test476"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setFlightNumber("hi!");
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    java.lang.String str14 = flight5.getOrigin();
    java.lang.String str15 = flight5.getDepartureTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test477"); }

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
    java.lang.String str20 = flight5.getArrivalTime();
    flight5.setArrivalTime("");
    java.lang.String str23 = flight5.getDestination();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test478"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "hi!", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    flight5.setArrivalTime("hi!");
    java.lang.String str11 = flight5.getOrigin();
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test479"); }

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
    flight5.setDepartureTime("hi!");
    java.lang.String str22 = flight5.getDestination();
    java.lang.String str23 = flight5.getDepartureTime();
    java.lang.String str24 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test480"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setOrigin("");
    flight5.setArrivalTime("");
    java.lang.String str11 = flight5.getOrigin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test481"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setOrigin("");
    flight5.setDestination("");
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getDestination();
    flight5.setDestination("");
    flight5.setArrivalTime("");
    java.lang.String str17 = flight5.getDestination();
    flight5.setOrigin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test482"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "", "", "hi!", "");
    flight5.setFlightNumber("");
    flight5.setDestination("");
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test483"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "", "hi!");
    flight5.setArrivalTime("hi!");
    flight5.setDestination("hi!");
    flight5.setDestination("hi!");
    java.lang.String str12 = flight5.getArrivalTime();
    java.lang.String str13 = flight5.getDepartureTime();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test484"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    flight5.setArrivalTime("");
    flight5.setDestination("hi!");
    java.lang.String str10 = flight5.getDestination();
    java.lang.String str11 = flight5.getDestination();
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test485"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    java.lang.String str9 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test486"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    flight5.setDestination("hi!");
    java.lang.String str9 = flight5.getDestination();
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getOrigin();
    java.lang.String str13 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    flight5.setFlightNumber("");
    java.lang.String str18 = flight5.getDestination();
    java.lang.String str19 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test487"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "", "hi!", "");
    java.lang.String str6 = flight5.getDepartureTime();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setDepartureTime("hi!");
    java.lang.String str10 = flight5.getFlightNumber();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    flight5.setArrivalTime("");
    flight5.setArrivalTime("");
    flight5.setFlightNumber("");
    java.lang.String str21 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test488"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setOrigin("hi!");
    flight5.setOrigin("");
    java.lang.String str13 = flight5.getOrigin();
    flight5.setDestination("");
    flight5.setDestination("");
    java.lang.String str18 = flight5.getDepartureTime();
    flight5.setDepartureTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test489"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setDestination("hi!");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getFlightNumber();
    flight5.setDestination("hi!");
    java.lang.String str12 = flight5.getOrigin();
    flight5.setDestination("");
    java.lang.String str15 = flight5.getOrigin();
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test490"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getOrigin();
    java.lang.String str7 = flight5.getFlightNumber();
    flight5.setDepartureTime("");
    java.lang.String str10 = flight5.getDepartureTime();
    java.lang.String str11 = flight5.getDepartureTime();
    flight5.setOrigin("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test491"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setArrivalTime("hi!");
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getFlightNumber();
    java.lang.String str11 = flight5.getDestination();
    flight5.setArrivalTime("hi!");
    flight5.setDestination("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test492"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "hi!", "", "");
    java.lang.String str6 = flight5.getFlightNumber();
    flight5.setOrigin("");
    java.lang.String str9 = flight5.getDestination();
    java.lang.String str10 = flight5.getArrivalTime();
    java.lang.String str11 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    java.lang.String str14 = flight5.getFlightNumber();
    flight5.setArrivalTime("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test493"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    java.lang.String str9 = flight5.getDestination();
    flight5.setFlightNumber("");
    java.lang.String str12 = flight5.getDestination();
    flight5.setDestination("");
    java.lang.String str15 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test494"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    flight5.setArrivalTime("");
    java.lang.String str8 = flight5.getOrigin();
    flight5.setFlightNumber("hi!");
    flight5.setArrivalTime("");
    java.lang.String str13 = flight5.getArrivalTime();
    java.lang.String str14 = flight5.getArrivalTime();
    java.lang.String str15 = flight5.getFlightNumber();
    java.lang.String str16 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    flight5.setArrivalTime("hi!");
    flight5.setDepartureTime("hi!");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test495"); }

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
    flight5.setFlightNumber("");
    flight5.setDestination("hi!");
    flight5.setFlightNumber("");
    flight5.setArrivalTime("");
    java.lang.String str27 = flight5.getDestination();
    java.lang.String str28 = flight5.getDestination();
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test496"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getDepartureTime();
    flight5.setFlightNumber("");
    java.lang.String str9 = flight5.getDepartureTime();
    java.lang.String str10 = flight5.getOrigin();
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getFlightNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test497"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = flight5.getFlightNumber();
    java.lang.String str7 = flight5.getOrigin();
    flight5.setFlightNumber("");
    flight5.setOrigin("hi!");
    java.lang.String str12 = flight5.getDestination();
    java.lang.String str13 = flight5.getArrivalTime();
    flight5.setFlightNumber("hi!");
    java.lang.String str16 = flight5.getDepartureTime();
    flight5.setArrivalTime("hi!");
    flight5.setDestination("");
    java.lang.String str21 = flight5.getDepartureTime();
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test498"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "hi!", "");
    flight5.setArrivalTime("hi!");
    flight5.setDestination("hi!");
    java.lang.String str10 = flight5.getOrigin();
    flight5.setArrivalTime("hi!");
    flight5.setOrigin("hi!");
    flight5.setDepartureTime("");
    flight5.setDepartureTime("");
    flight5.setFlightNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test499"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "", "hi!", "", "");
    flight5.setDestination("");
    java.lang.String str8 = flight5.getDepartureTime();
    java.lang.String str9 = flight5.getArrivalTime();
    flight5.setArrivalTime("hi!");
    flight5.setFlightNumber("hi!");
    flight5.setDestination("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test500"); }

    UseCase2.Business.Flight flight5 = new UseCase2.Business.Flight("hi!", "hi!", "", "", "hi!");
    java.lang.String str6 = flight5.getArrivalTime();
    java.lang.String str7 = flight5.getOrigin();
    java.lang.String str8 = flight5.getDestination();
    flight5.setDestination("");
    java.lang.String str11 = flight5.getDestination();
    java.lang.String str12 = flight5.getOrigin();
    java.lang.String str13 = flight5.getDestination();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

}
