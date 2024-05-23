
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test001"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    java.lang.String str18 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight26 = null;
    reservation3.setFlight(flight26);
    reservation3.setReservationId("");
    UseCase1And4.business.User user30 = null;
    reservation3.setUser(user30);
    UseCase2.Business.Flight flight32 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight35 = null;
    reservation3.setFlight(flight35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test002"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = reservation3.getUser();
    java.lang.String str17 = reservation3.getReservationId();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test003"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    reservation3.setReservationId("");
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test004"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    java.lang.String str19 = reservation3.getReservationId();
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test005"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test006"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user13 = reservation3.getUser();
    java.lang.String str14 = reservation3.getReservationId();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test007"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase1And4.business.User user9 = reservation3.getUser();
    java.lang.String str10 = reservation3.getReservationId();
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test008"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    java.lang.String str25 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test009"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    java.lang.String str18 = reservation3.getReservationId();
    java.lang.String str19 = reservation3.getReservationId();
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    UseCase1And4.business.User user25 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test010"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    reservation3.setReservationId("");
    java.lang.String str25 = reservation3.getReservationId();
    java.lang.String str26 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight29 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight29);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test011"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase1And4.business.User user9 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str12 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    java.lang.String str18 = reservation3.getReservationId();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test012"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test013"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase1And4.business.User user9 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test014"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    reservation3.setReservationId("");
    UseCase1And4.business.User user11 = reservation3.getUser();
    java.lang.String str12 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test015"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    java.lang.String str12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test016"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test017"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    java.lang.String str15 = reservation3.getReservationId();
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user27 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user27);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test018"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user17 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test019"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test020"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase1And4.business.User user17 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    UseCase1And4.business.User user24 = null;
    reservation3.setUser(user24);
    UseCase2.Business.Flight flight26 = null;
    reservation3.setFlight(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test021"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase1And4.business.User user18 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test022"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    java.lang.String str12 = reservation3.getReservationId();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test023"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    java.lang.String str15 = reservation3.getReservationId();
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    java.lang.String str22 = reservation3.getReservationId();
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    UseCase1And4.business.User user25 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    java.lang.String str28 = reservation3.getReservationId();
    java.lang.String str29 = reservation3.getReservationId();
    UseCase2.Business.Flight flight30 = reservation3.getFlight();
    UseCase2.Business.Flight flight31 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight31);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test024"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase1And4.business.User user9 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test025"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    reservation3.setReservationId("");
    java.lang.String str19 = reservation3.getReservationId();
    java.lang.String str20 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test026"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test027"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    java.lang.String str14 = reservation3.getReservationId();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    java.lang.String str20 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user23 = reservation3.getUser();
    java.lang.String str24 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test028"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = reservation3.getUser();
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str13 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("");
    java.lang.String str19 = reservation3.getReservationId();
    UseCase1And4.business.User user20 = reservation3.getUser();
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test029"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    java.lang.String str5 = reservation3.getReservationId();
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test030"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    java.lang.String str9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test031"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    java.lang.String str10 = reservation3.getReservationId();
    UseCase1And4.business.User user11 = reservation3.getUser();
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test032"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    reservation3.setReservationId("hi!");
    java.lang.String str23 = reservation3.getReservationId();
    UseCase1And4.business.User user24 = reservation3.getUser();
    UseCase1And4.business.User user25 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test033"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    UseCase1And4.business.User user22 = reservation3.getUser();
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    UseCase2.Business.Flight flight25 = null;
    reservation3.setFlight(flight25);
    UseCase2.Business.Flight flight27 = null;
    reservation3.setFlight(flight27);
    UseCase2.Business.Flight flight29 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user32 = null;
    reservation3.setUser(user32);
    UseCase1And4.business.User user34 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user34);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test034"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test035"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    java.lang.String str18 = reservation3.getReservationId();
    java.lang.String str19 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test036"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    UseCase1And4.business.User user24 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test037"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test038"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    java.lang.String str17 = reservation3.getReservationId();
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase1And4.business.User user19 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test039"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    java.lang.String str12 = reservation3.getReservationId();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
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
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test040"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    reservation3.setReservationId("");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    reservation3.setReservationId("hi!");
    java.lang.String str18 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test041"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = reservation3.getUser();
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    java.lang.String str14 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test042"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    reservation3.setReservationId("");
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test043"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user23 = reservation3.getUser();
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test044"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    java.lang.String str5 = reservation3.getReservationId();
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test045"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str10 = reservation3.getReservationId();
    UseCase1And4.business.User user11 = reservation3.getUser();
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    java.lang.String str14 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    reservation3.setReservationId("");
    java.lang.String str23 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight26 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test046"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test047"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight25 = reservation3.getFlight();
    java.lang.String str26 = reservation3.getReservationId();
    UseCase1And4.business.User user27 = null;
    reservation3.setUser(user27);
    UseCase2.Business.Flight flight29 = reservation3.getFlight();
    java.lang.String str30 = reservation3.getReservationId();
    UseCase2.Business.Flight flight31 = null;
    reservation3.setFlight(flight31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test048"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase1And4.business.User user18 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test049"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = reservation3.getUser();
    java.lang.String str16 = reservation3.getReservationId();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test050"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    java.lang.String str19 = reservation3.getReservationId();
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    UseCase1And4.business.User user25 = reservation3.getUser();
    UseCase1And4.business.User user26 = null;
    reservation3.setUser(user26);
    UseCase2.Business.Flight flight28 = null;
    reservation3.setFlight(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test051"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test052"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    java.lang.String str12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test053"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    UseCase1And4.business.User user23 = reservation3.getUser();
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test054"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("hi!", flight1, user2);
    reservation3.setReservationId("");
    java.lang.String str6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getReservationId();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test055"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase1And4.business.User user19 = reservation3.getUser();
    UseCase1And4.business.User user20 = reservation3.getUser();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test056"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    UseCase1And4.business.User user25 = null;
    reservation3.setUser(user25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test057"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("hi!");
    java.lang.String str22 = reservation3.getReservationId();
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    UseCase1And4.business.User user25 = null;
    reservation3.setUser(user25);
    UseCase1And4.business.User user27 = null;
    reservation3.setUser(user27);
    java.lang.String str29 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user32 = null;
    reservation3.setUser(user32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test058"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    java.lang.String str8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test059"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    UseCase1And4.business.User user11 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("");
    java.lang.String str19 = reservation3.getReservationId();
    UseCase1And4.business.User user20 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test060"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test061"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = reservation3.getUser();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test062"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    java.lang.String str16 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user19 = reservation3.getUser();
    java.lang.String str20 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test063"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test064"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    reservation3.setReservationId("");
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user23 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test065"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    java.lang.String str9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    java.lang.String str13 = reservation3.getReservationId();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    java.lang.String str17 = reservation3.getReservationId();
    java.lang.String str18 = reservation3.getReservationId();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test066"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str10 = reservation3.getReservationId();
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase1And4.business.User user12 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase1And4.business.User user20 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test067"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase1And4.business.User user17 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test068"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test069"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    java.lang.String str18 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test070"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test071"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user13 = reservation3.getUser();
    java.lang.String str14 = reservation3.getReservationId();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    java.lang.String str17 = reservation3.getReservationId();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    UseCase1And4.business.User user22 = reservation3.getUser();
    java.lang.String str23 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test072"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    java.lang.String str12 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test073"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test074"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    java.lang.String str9 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test075"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test076"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    java.lang.String str14 = reservation3.getReservationId();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    java.lang.String str20 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    java.lang.String str23 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user26 = null;
    reservation3.setUser(user26);
    UseCase1And4.business.User user28 = null;
    reservation3.setUser(user28);
    UseCase1And4.business.User user30 = reservation3.getUser();
    java.lang.String str31 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user34 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user34);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test077"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase2.Business.Flight flight5 = null;
    reservation3.setFlight(flight5);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    reservation3.setReservationId("");
    java.lang.String str16 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test078"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase2.Business.Flight flight5 = null;
    reservation3.setFlight(flight5);
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    java.lang.String str19 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test079"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test080"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    java.lang.String str14 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str17 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str20 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test081"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    java.lang.String str19 = reservation3.getReservationId();
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test082"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    reservation3.setReservationId("");
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    java.lang.String str22 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user25 = null;
    reservation3.setUser(user25);
    java.lang.String str27 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test083"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    UseCase1And4.business.User user11 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test084"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = reservation3.getUser();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    java.lang.String str12 = reservation3.getReservationId();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    java.lang.String str19 = reservation3.getReservationId();
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    UseCase1And4.business.User user21 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test085"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    java.lang.String str13 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    UseCase1And4.business.User user22 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test086"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    java.lang.String str14 = reservation3.getReservationId();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    java.lang.String str19 = reservation3.getReservationId();
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    UseCase1And4.business.User user22 = reservation3.getUser();
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    UseCase1And4.business.User user24 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test087"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase2.Business.Flight flight5 = null;
    reservation3.setFlight(flight5);
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    java.lang.String str11 = reservation3.getReservationId();
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user16 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test088"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase1And4.business.User user19 = reservation3.getUser();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test089"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    java.lang.String str24 = reservation3.getReservationId();
    UseCase1And4.business.User user25 = reservation3.getUser();
    UseCase2.Business.Flight flight26 = null;
    reservation3.setFlight(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test090"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test091"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    UseCase2.Business.Flight flight25 = reservation3.getFlight();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight25);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test092"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    java.lang.String str18 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase1And4.business.User user22 = reservation3.getUser();
    UseCase1And4.business.User user23 = reservation3.getUser();
    UseCase1And4.business.User user24 = reservation3.getUser();
    java.lang.String str25 = reservation3.getReservationId();
    java.lang.String str26 = reservation3.getReservationId();
    UseCase1And4.business.User user27 = null;
    reservation3.setUser(user27);
    UseCase2.Business.Flight flight29 = null;
    reservation3.setFlight(flight29);
    UseCase1And4.business.User user31 = null;
    reservation3.setUser(user31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test093"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test094"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    java.lang.String str21 = reservation3.getReservationId();
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test095"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = reservation3.getUser();
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str13 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase1And4.business.User user23 = reservation3.getUser();
    UseCase1And4.business.User user24 = reservation3.getUser();
    UseCase1And4.business.User user25 = reservation3.getUser();
    UseCase2.Business.Flight flight26 = null;
    reservation3.setFlight(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test096"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    java.lang.String str17 = reservation3.getReservationId();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    java.lang.String str21 = reservation3.getReservationId();
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test097"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    java.lang.String str14 = reservation3.getReservationId();
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    java.lang.String str18 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test098"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = reservation3.getUser();
    java.lang.String str12 = reservation3.getReservationId();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    java.lang.String str16 = reservation3.getReservationId();
    java.lang.String str17 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test099"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    UseCase2.Business.Flight flight25 = null;
    reservation3.setFlight(flight25);
    UseCase1And4.business.User user27 = null;
    reservation3.setUser(user27);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight31 = reservation3.getFlight();
    UseCase2.Business.Flight flight32 = null;
    reservation3.setFlight(flight32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight31);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test100"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    java.lang.String str15 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test101"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    reservation3.setReservationId("");
    java.lang.String str15 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test102"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    java.lang.String str18 = reservation3.getReservationId();
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test103"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test104"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user25 = reservation3.getUser();
    UseCase2.Business.Flight flight26 = reservation3.getFlight();
    UseCase2.Business.Flight flight27 = null;
    reservation3.setFlight(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test105"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test106"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test107"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    java.lang.String str14 = reservation3.getReservationId();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test108"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase1And4.business.User user10 = reservation3.getUser();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test109"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase1And4.business.User user20 = reservation3.getUser();
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test110"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str10 = reservation3.getReservationId();
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test111"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    java.lang.String str6 = reservation3.getReservationId();
    UseCase1And4.business.User user7 = null;
    reservation3.setUser(user7);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test112"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    java.lang.String str18 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test113"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase1And4.business.User user20 = reservation3.getUser();
    UseCase1And4.business.User user21 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test114"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    reservation3.setReservationId("");
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test115"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    java.lang.String str8 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase1And4.business.User user20 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test116"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    reservation3.setReservationId("hi!");
    java.lang.String str15 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user18 = reservation3.getUser();
    java.lang.String str19 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test117"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = reservation3.getUser();
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str13 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    UseCase1And4.business.User user24 = null;
    reservation3.setUser(user24);
    java.lang.String str26 = reservation3.getReservationId();
    UseCase1And4.business.User user27 = reservation3.getUser();
    UseCase2.Business.Flight flight28 = reservation3.getFlight();
    UseCase2.Business.Flight flight29 = null;
    reservation3.setFlight(flight29);
    UseCase2.Business.Flight flight31 = null;
    reservation3.setFlight(flight31);
    UseCase2.Business.Flight flight33 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight36 = null;
    reservation3.setFlight(flight36);
    UseCase1And4.business.User user38 = reservation3.getUser();
    UseCase1And4.business.User user39 = null;
    reservation3.setUser(user39);
    UseCase2.Business.Flight flight41 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight41);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test118"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test119"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    java.lang.String str20 = reservation3.getReservationId();
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    UseCase1And4.business.User user22 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test120"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    java.lang.String str19 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user22 = reservation3.getUser();
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test121"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase1And4.business.User user6 = reservation3.getUser();
    java.lang.String str7 = reservation3.getReservationId();
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test122"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test123"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase1And4.business.User user20 = reservation3.getUser();
    UseCase1And4.business.User user21 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test124"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    java.lang.String str8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test125"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    java.lang.String str20 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test126"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase1And4.business.User user20 = reservation3.getUser();
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test127"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    java.lang.String str18 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase1And4.business.User user22 = reservation3.getUser();
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    UseCase2.Business.Flight flight25 = reservation3.getFlight();
    UseCase2.Business.Flight flight26 = reservation3.getFlight();
    UseCase1And4.business.User user27 = reservation3.getUser();
    UseCase2.Business.Flight flight28 = null;
    reservation3.setFlight(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user27);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test128"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test129"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    java.lang.String str6 = reservation3.getReservationId();
    UseCase1And4.business.User user7 = null;
    reservation3.setUser(user7);
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test130"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    reservation3.setReservationId("");
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase1And4.business.User user12 = reservation3.getUser();
    java.lang.String str13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test131"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test132"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    java.lang.String str9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getReservationId();
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test133"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    UseCase2.Business.Flight flight25 = null;
    reservation3.setFlight(flight25);
    UseCase1And4.business.User user27 = null;
    reservation3.setUser(user27);
    java.lang.String str29 = reservation3.getReservationId();
    UseCase1And4.business.User user30 = null;
    reservation3.setUser(user30);
    UseCase1And4.business.User user32 = null;
    reservation3.setUser(user32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test134"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase1And4.business.User user20 = reservation3.getUser();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    java.lang.String str23 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test135"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    java.lang.String str5 = reservation3.getReservationId();
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test136"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase1And4.business.User user19 = reservation3.getUser();
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test137"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    reservation3.setReservationId("");
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase1And4.business.User user18 = reservation3.getUser();
    java.lang.String str19 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test138"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    java.lang.String str13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getReservationId();
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase1And4.business.User user16 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user19 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test139"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("");
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    UseCase2.Business.Flight flight25 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight25);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test140"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = reservation3.getUser();
    java.lang.String str17 = reservation3.getReservationId();
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test141"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    UseCase1And4.business.User user24 = null;
    reservation3.setUser(user24);
    UseCase2.Business.Flight flight26 = null;
    reservation3.setFlight(flight26);
    UseCase1And4.business.User user28 = reservation3.getUser();
    UseCase1And4.business.User user29 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user29);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test142"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    java.lang.String str17 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test143"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test144"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    java.lang.String str8 = reservation3.getReservationId();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase1And4.business.User user11 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test145"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test146"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test147"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    java.lang.String str8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    java.lang.String str19 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test148"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase1And4.business.User user19 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test149"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase2.Business.Flight flight6 = reservation3.getFlight();
    UseCase1And4.business.User user7 = null;
    reservation3.setUser(user7);
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase1And4.business.User user10 = reservation3.getUser();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    java.lang.String str13 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test150"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    UseCase1And4.business.User user11 = reservation3.getUser();
    java.lang.String str12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getReservationId();
    java.lang.String str15 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test151"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test152"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    reservation3.setReservationId("");
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight27 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight27);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test153"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test154"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    UseCase1And4.business.User user24 = reservation3.getUser();
    UseCase2.Business.Flight flight25 = null;
    reservation3.setFlight(flight25);
    UseCase1And4.business.User user27 = null;
    reservation3.setUser(user27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test155"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test156"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    java.lang.String str18 = reservation3.getReservationId();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test157"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    java.lang.String str22 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user25 = reservation3.getUser();
    UseCase1And4.business.User user26 = null;
    reservation3.setUser(user26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test158"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase1And4.business.User user18 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test159"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    java.lang.String str5 = reservation3.getReservationId();
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test160"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str11 = reservation3.getReservationId();
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    java.lang.String str15 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    java.lang.String str24 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test161"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase1And4.business.User user23 = reservation3.getUser();
    UseCase1And4.business.User user24 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test162"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    java.lang.String str18 = reservation3.getReservationId();
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test163"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase1And4.business.User user13 = reservation3.getUser();
    java.lang.String str14 = reservation3.getReservationId();
    java.lang.String str15 = reservation3.getReservationId();
    java.lang.String str16 = reservation3.getReservationId();
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase1And4.business.User user18 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test164"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = reservation3.getUser();
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test165"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    UseCase1And4.business.User user25 = reservation3.getUser();
    UseCase1And4.business.User user26 = reservation3.getUser();
    java.lang.String str27 = reservation3.getReservationId();
    UseCase1And4.business.User user28 = null;
    reservation3.setUser(user28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test166"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = null;
    reservation3.setUser(user7);
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test167"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test168"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase2.Business.Flight flight5 = reservation3.getFlight();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = null;
    reservation3.setUser(user7);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    UseCase1And4.business.User user13 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test169"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test170"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    java.lang.String str18 = reservation3.getReservationId();
    java.lang.String str19 = reservation3.getReservationId();
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test171"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase2.Business.Flight flight5 = null;
    reservation3.setFlight(flight5);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    UseCase1And4.business.User user19 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    java.lang.String str22 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test172"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase2.Business.Flight flight5 = null;
    reservation3.setFlight(flight5);
    reservation3.setReservationId("hi!");
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = reservation3.getUser();
    java.lang.String str11 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test173"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase1And4.business.User user19 = reservation3.getUser();
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    UseCase1And4.business.User user23 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test174"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase1And4.business.User user19 = reservation3.getUser();
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test175"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    java.lang.String str14 = reservation3.getReservationId();
    java.lang.String str15 = reservation3.getReservationId();
    java.lang.String str16 = reservation3.getReservationId();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test176"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = reservation3.getUser();
    java.lang.String str16 = reservation3.getReservationId();
    java.lang.String str17 = reservation3.getReservationId();
    UseCase1And4.business.User user18 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test177"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase1And4.business.User user24 = reservation3.getUser();
    UseCase2.Business.Flight flight25 = null;
    reservation3.setFlight(flight25);
    UseCase1And4.business.User user27 = null;
    reservation3.setUser(user27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test178"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    UseCase1And4.business.User user19 = reservation3.getUser();
    java.lang.String str20 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test179"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test180"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    java.lang.String str12 = reservation3.getReservationId();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test181"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test182"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    reservation3.setReservationId("");
    java.lang.String str22 = reservation3.getReservationId();
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    UseCase1And4.business.User user25 = reservation3.getUser();
    UseCase2.Business.Flight flight26 = null;
    reservation3.setFlight(flight26);
    java.lang.String str28 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test183"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test184"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test185"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("hi!", flight1, user2);
    reservation3.setReservationId("");
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    java.lang.String str16 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test186"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    java.lang.String str14 = reservation3.getReservationId();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user19 = reservation3.getUser();
    java.lang.String str20 = reservation3.getReservationId();
    java.lang.String str21 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test187"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    java.lang.String str17 = reservation3.getReservationId();
    UseCase1And4.business.User user18 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    UseCase1And4.business.User user22 = reservation3.getUser();
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    UseCase2.Business.Flight flight25 = null;
    reservation3.setFlight(flight25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test188"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    java.lang.String str12 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    java.lang.String str21 = reservation3.getReservationId();
    java.lang.String str22 = reservation3.getReservationId();
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test189"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    reservation3.setReservationId("hi!");
    java.lang.String str16 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test190"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test191"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    java.lang.String str5 = reservation3.getReservationId();
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test192"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = reservation3.getFlight();
    UseCase1And4.business.User user7 = null;
    reservation3.setUser(user7);
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test193"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test194"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user25 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str28 = reservation3.getReservationId();
    java.lang.String str29 = reservation3.getReservationId();
    UseCase2.Business.Flight flight30 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test195"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    java.lang.String str6 = reservation3.getReservationId();
    UseCase1And4.business.User user7 = null;
    reservation3.setUser(user7);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    java.lang.String str14 = reservation3.getReservationId();
    java.lang.String str15 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test196"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase1And4.business.User user20 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test197"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    java.lang.String str18 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user24 = null;
    reservation3.setUser(user24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test198"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test199"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    java.lang.String str14 = reservation3.getReservationId();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = reservation3.getUser();
    java.lang.String str17 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test200"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("hi!", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = reservation3.getFlight();
    UseCase1And4.business.User user7 = null;
    reservation3.setUser(user7);
    UseCase1And4.business.User user9 = reservation3.getUser();
    java.lang.String str10 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test201"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    java.lang.String str14 = reservation3.getReservationId();
    java.lang.String str15 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test202"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test203"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    java.lang.String str17 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str20 = reservation3.getReservationId();
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test204"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    UseCase1And4.business.User user11 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user20 = reservation3.getUser();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase1And4.business.User user23 = reservation3.getUser();
    java.lang.String str24 = reservation3.getReservationId();
    UseCase1And4.business.User user25 = null;
    reservation3.setUser(user25);
    UseCase2.Business.Flight flight27 = null;
    reservation3.setFlight(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test205"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    java.lang.String str12 = reservation3.getReservationId();
    UseCase1And4.business.User user13 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    java.lang.String str16 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test206"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase1And4.business.User user12 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    java.lang.String str15 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test207"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    UseCase1And4.business.User user25 = reservation3.getUser();
    UseCase1And4.business.User user26 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user26);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test208"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    java.lang.String str18 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    UseCase1And4.business.User user24 = null;
    reservation3.setUser(user24);
    UseCase1And4.business.User user26 = null;
    reservation3.setUser(user26);
    UseCase2.Business.Flight flight28 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test209"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    reservation3.setReservationId("");
    UseCase1And4.business.User user18 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test210"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    java.lang.String str4 = reservation3.getReservationId();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    java.lang.String str8 = reservation3.getReservationId();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    UseCase1And4.business.User user11 = reservation3.getUser();
    java.lang.String str12 = reservation3.getReservationId();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test211"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test212"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase1And4.business.User user13 = reservation3.getUser();
    java.lang.String str14 = reservation3.getReservationId();
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    java.lang.String str21 = reservation3.getReservationId();
    UseCase1And4.business.User user22 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user25 = null;
    reservation3.setUser(user25);
    UseCase1And4.business.User user27 = null;
    reservation3.setUser(user27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test213"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight27 = null;
    reservation3.setFlight(flight27);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test214"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str19 = reservation3.getReservationId();
    UseCase1And4.business.User user20 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test215"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase1And4.business.User user13 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test216"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    java.lang.String str26 = reservation3.getReservationId();
    UseCase1And4.business.User user27 = reservation3.getUser();
    UseCase2.Business.Flight flight28 = null;
    reservation3.setFlight(flight28);
    UseCase1And4.business.User user30 = reservation3.getUser();
    UseCase1And4.business.User user31 = null;
    reservation3.setUser(user31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user30);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test217"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    UseCase1And4.business.User user26 = reservation3.getUser();
    UseCase2.Business.Flight flight27 = null;
    reservation3.setFlight(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user26);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test218"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user15 = reservation3.getUser();
    java.lang.String str16 = reservation3.getReservationId();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test219"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test220"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    UseCase1And4.business.User user25 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test221"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test222"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    UseCase1And4.business.User user22 = reservation3.getUser();
    UseCase1And4.business.User user23 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test223"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test224"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    UseCase1And4.business.User user12 = reservation3.getUser();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test225"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test226"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase2.Business.Flight flight5 = null;
    reservation3.setFlight(flight5);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    reservation3.setReservationId("");
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    java.lang.String str18 = reservation3.getReservationId();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    UseCase1And4.business.User user23 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test227"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test228"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test229"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    reservation3.setReservationId("");
    UseCase1And4.business.User user15 = reservation3.getUser();
    java.lang.String str16 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test230"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    UseCase1And4.business.User user25 = reservation3.getUser();
    UseCase1And4.business.User user26 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user26);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test231"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    java.lang.String str18 = reservation3.getReservationId();
    UseCase1And4.business.User user19 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test232"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    java.lang.String str9 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test233"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user21 = reservation3.getUser();
    java.lang.String str22 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test234"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test235"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase2.Business.Flight flight5 = null;
    reservation3.setFlight(flight5);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    reservation3.setReservationId("");
    UseCase1And4.business.User user13 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    java.lang.String str17 = reservation3.getReservationId();
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase1And4.business.User user19 = reservation3.getUser();
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user23 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test236"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    reservation3.setReservationId("");
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test237"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str10 = reservation3.getReservationId();
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase1And4.business.User user12 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase1And4.business.User user18 = reservation3.getUser();
    java.lang.String str19 = reservation3.getReservationId();
    java.lang.String str20 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test238"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    java.lang.String str17 = reservation3.getReservationId();
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test239"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    java.lang.String str20 = reservation3.getReservationId();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight27 = null;
    reservation3.setFlight(flight27);
    UseCase1And4.business.User user29 = reservation3.getUser();
    UseCase1And4.business.User user30 = null;
    reservation3.setUser(user30);
    java.lang.String str32 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    java.lang.String str35 = reservation3.getReservationId();
    java.lang.String str36 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test240"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test241"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("hi!");
    java.lang.String str22 = reservation3.getReservationId();
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    reservation3.setReservationId("");
    UseCase1And4.business.User user27 = reservation3.getUser();
    UseCase1And4.business.User user28 = null;
    reservation3.setUser(user28);
    UseCase1And4.business.User user30 = reservation3.getUser();
    UseCase1And4.business.User user31 = reservation3.getUser();
    UseCase1And4.business.User user32 = reservation3.getUser();
    UseCase1And4.business.User user33 = null;
    reservation3.setUser(user33);
    UseCase2.Business.Flight flight35 = reservation3.getFlight();
    UseCase2.Business.Flight flight36 = null;
    reservation3.setFlight(flight36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight35);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test242"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    java.lang.String str18 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test243"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    java.lang.String str23 = reservation3.getReservationId();
    UseCase1And4.business.User user24 = null;
    reservation3.setUser(user24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test244"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str11 = reservation3.getReservationId();
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    reservation3.setReservationId("");
    java.lang.String str26 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test245"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test246"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    java.lang.String str18 = reservation3.getReservationId();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    java.lang.String str21 = reservation3.getReservationId();
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test247"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase1And4.business.User user19 = reservation3.getUser();
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test248"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    java.lang.String str18 = reservation3.getReservationId();
    UseCase1And4.business.User user19 = reservation3.getUser();
    java.lang.String str20 = reservation3.getReservationId();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test249"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test250"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    UseCase1And4.business.User user22 = reservation3.getUser();
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test251"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    UseCase1And4.business.User user22 = reservation3.getUser();
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test252"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test253"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str10 = reservation3.getReservationId();
    UseCase1And4.business.User user11 = reservation3.getUser();
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test254"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase2.Business.Flight flight5 = reservation3.getFlight();
    UseCase1And4.business.User user6 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test255"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase1And4.business.User user18 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test256"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test257"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    java.lang.String str18 = reservation3.getReservationId();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    java.lang.String str26 = reservation3.getReservationId();
    UseCase2.Business.Flight flight27 = null;
    reservation3.setFlight(flight27);
    UseCase2.Business.Flight flight29 = reservation3.getFlight();
    UseCase2.Business.Flight flight30 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test258"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    java.lang.String str8 = reservation3.getReservationId();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    java.lang.String str20 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test259"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = reservation3.getUser();
    java.lang.String str17 = reservation3.getReservationId();
    java.lang.String str18 = reservation3.getReservationId();
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    UseCase1And4.business.User user23 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test260"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    java.lang.String str9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    java.lang.String str13 = reservation3.getReservationId();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase1And4.business.User user18 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test261"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    java.lang.String str16 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str19 = reservation3.getReservationId();
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test262"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase2.Business.Flight flight5 = null;
    reservation3.setFlight(flight5);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    reservation3.setReservationId("");
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    java.lang.String str18 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test263"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    java.lang.String str16 = reservation3.getReservationId();
    UseCase1And4.business.User user17 = reservation3.getUser();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test264"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    java.lang.String str18 = reservation3.getReservationId();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test265"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test266"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase1And4.business.User user20 = reservation3.getUser();
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    UseCase1And4.business.User user25 = null;
    reservation3.setUser(user25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test267"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    java.lang.String str17 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test268"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    UseCase1And4.business.User user22 = reservation3.getUser();
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test269"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test270"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    java.lang.String str11 = reservation3.getReservationId();
    UseCase1And4.business.User user12 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test271"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test272"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase1And4.business.User user19 = reservation3.getUser();
    UseCase1And4.business.User user20 = reservation3.getUser();
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test273"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user20 = reservation3.getUser();
    java.lang.String str21 = reservation3.getReservationId();
    java.lang.String str22 = reservation3.getReservationId();
    UseCase1And4.business.User user23 = reservation3.getUser();
    UseCase1And4.business.User user24 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test274"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test275"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("hi!", flight1, user2);
    reservation3.setReservationId("");
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test276"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase1And4.business.User user18 = reservation3.getUser();
    java.lang.String str19 = reservation3.getReservationId();
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    reservation3.setReservationId("");
    UseCase1And4.business.User user24 = reservation3.getUser();
    UseCase2.Business.Flight flight25 = null;
    reservation3.setFlight(flight25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test277"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    java.lang.String str18 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = reservation3.getUser();
    java.lang.String str22 = reservation3.getReservationId();
    UseCase1And4.business.User user23 = reservation3.getUser();
    java.lang.String str24 = reservation3.getReservationId();
    java.lang.String str25 = reservation3.getReservationId();
    UseCase2.Business.Flight flight26 = null;
    reservation3.setFlight(flight26);
    UseCase1And4.business.User user28 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user28);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test278"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    java.lang.String str18 = reservation3.getReservationId();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    UseCase1And4.business.User user26 = null;
    reservation3.setUser(user26);
    reservation3.setReservationId("");
    UseCase1And4.business.User user30 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user30);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test279"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    java.lang.String str25 = reservation3.getReservationId();
    UseCase1And4.business.User user26 = reservation3.getUser();
    UseCase1And4.business.User user27 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user27);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test280"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    reservation3.setReservationId("");
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase1And4.business.User user20 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user23 = reservation3.getUser();
    UseCase1And4.business.User user24 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test281"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    java.lang.String str6 = reservation3.getReservationId();
    UseCase1And4.business.User user7 = null;
    reservation3.setUser(user7);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user18 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test282"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    java.lang.String str18 = reservation3.getReservationId();
    java.lang.String str19 = reservation3.getReservationId();
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test283"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    UseCase2.Business.Flight flight25 = reservation3.getFlight();
    UseCase1And4.business.User user26 = reservation3.getUser();
    UseCase2.Business.Flight flight27 = null;
    reservation3.setFlight(flight27);
    UseCase2.Business.Flight flight29 = null;
    reservation3.setFlight(flight29);
    java.lang.String str31 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test284"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    java.lang.String str17 = reservation3.getReservationId();
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    reservation3.setReservationId("");
    UseCase1And4.business.User user23 = reservation3.getUser();
    UseCase1And4.business.User user24 = null;
    reservation3.setUser(user24);
    UseCase2.Business.Flight flight26 = null;
    reservation3.setFlight(flight26);
    UseCase2.Business.Flight flight28 = null;
    reservation3.setFlight(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test285"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user17 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test286"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    java.lang.String str20 = reservation3.getReservationId();
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    UseCase1And4.business.User user23 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test287"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase1And4.business.User user19 = reservation3.getUser();
    java.lang.String str20 = reservation3.getReservationId();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test288"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    java.lang.String str4 = reservation3.getReservationId();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test289"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test290"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase1And4.business.User user20 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight25 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight25);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test291"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    UseCase1And4.business.User user22 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test292"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    java.lang.String str19 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test293"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    java.lang.String str22 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test294"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    reservation3.setReservationId("");
    UseCase1And4.business.User user20 = reservation3.getUser();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test295"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    java.lang.String str6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getReservationId();
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase1And4.business.User user13 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test296"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    reservation3.setReservationId("");
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    java.lang.String str26 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test297"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    java.lang.String str13 = reservation3.getReservationId();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test298"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    java.lang.String str19 = reservation3.getReservationId();
    UseCase1And4.business.User user20 = reservation3.getUser();
    java.lang.String str21 = reservation3.getReservationId();
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test299"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase2.Business.Flight flight5 = null;
    reservation3.setFlight(flight5);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    java.lang.String str23 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test300"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test301"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    java.lang.String str6 = reservation3.getReservationId();
    UseCase1And4.business.User user7 = null;
    reservation3.setUser(user7);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    java.lang.String str21 = reservation3.getReservationId();
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test302"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    java.lang.String str14 = reservation3.getReservationId();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    java.lang.String str21 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test303"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str11 = reservation3.getReservationId();
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    java.lang.String str20 = reservation3.getReservationId();
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test304"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase2.Business.Flight flight5 = null;
    reservation3.setFlight(flight5);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    java.lang.String str20 = reservation3.getReservationId();
    java.lang.String str21 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test305"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    UseCase1And4.business.User user22 = reservation3.getUser();
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    UseCase2.Business.Flight flight25 = null;
    reservation3.setFlight(flight25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test306"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    java.lang.String str4 = reservation3.getReservationId();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test307"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user16 = reservation3.getUser();
    java.lang.String str17 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test308"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    java.lang.String str15 = reservation3.getReservationId();
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    java.lang.String str21 = reservation3.getReservationId();
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    java.lang.String str23 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test309"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test310"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test311"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    java.lang.String str13 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test312"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test313"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    java.lang.String str18 = reservation3.getReservationId();
    UseCase1And4.business.User user19 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test314"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test315"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test316"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    java.lang.String str6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase1And4.business.User user11 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test317"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    java.lang.String str12 = reservation3.getReservationId();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test318"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    java.lang.String str11 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test319"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = reservation3.getUser();
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    reservation3.setReservationId("");
    java.lang.String str21 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test320"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    java.lang.String str18 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test321"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase1And4.business.User user15 = reservation3.getUser();
    java.lang.String str16 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test322"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test323"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test324"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    java.lang.String str10 = reservation3.getReservationId();
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test325"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    UseCase1And4.business.User user24 = null;
    reservation3.setUser(user24);
    java.lang.String str26 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test326"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("hi!", flight1, user2);
    reservation3.setReservationId("");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str10 = reservation3.getReservationId();
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test327"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test328"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    UseCase1And4.business.User user24 = reservation3.getUser();
    UseCase2.Business.Flight flight25 = null;
    reservation3.setFlight(flight25);
    UseCase1And4.business.User user27 = null;
    reservation3.setUser(user27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test329"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    java.lang.String str12 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test330"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    java.lang.String str16 = reservation3.getReservationId();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user21 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test331"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    java.lang.String str6 = reservation3.getReservationId();
    java.lang.String str7 = reservation3.getReservationId();
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test332"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    java.lang.String str22 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test333"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase1And4.business.User user16 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test334"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    java.lang.String str25 = reservation3.getReservationId();
    java.lang.String str26 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight29 = null;
    reservation3.setFlight(flight29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test335"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test336"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test337"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test338"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    java.lang.String str14 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test339"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user24 = reservation3.getUser();
    UseCase2.Business.Flight flight25 = reservation3.getFlight();
    java.lang.String str26 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test340"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    UseCase1And4.business.User user24 = null;
    reservation3.setUser(user24);
    UseCase2.Business.Flight flight26 = null;
    reservation3.setFlight(flight26);
    UseCase1And4.business.User user28 = reservation3.getUser();
    UseCase2.Business.Flight flight29 = null;
    reservation3.setFlight(flight29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user28);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test341"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test342"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    java.lang.String str18 = reservation3.getReservationId();
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase1And4.business.User user22 = reservation3.getUser();
    UseCase1And4.business.User user23 = reservation3.getUser();
    java.lang.String str24 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test343"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test344"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = null;
    reservation3.setUser(user7);
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    java.lang.String str12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test345"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    reservation3.setReservationId("");
    java.lang.String str16 = reservation3.getReservationId();
    java.lang.String str17 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user20 = reservation3.getUser();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    UseCase2.Business.Flight flight25 = null;
    reservation3.setFlight(flight25);
    UseCase2.Business.Flight flight27 = null;
    reservation3.setFlight(flight27);
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test346"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = reservation3.getFlight();
    java.lang.String str7 = reservation3.getReservationId();
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    reservation3.setReservationId("");
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test347"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    java.lang.String str19 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test348"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    java.lang.String str22 = reservation3.getReservationId();
    UseCase1And4.business.User user23 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test349"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getReservationId();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    java.lang.String str17 = reservation3.getReservationId();
    java.lang.String str18 = reservation3.getReservationId();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test350"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    java.lang.String str10 = reservation3.getReservationId();
    UseCase1And4.business.User user11 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test351"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test352"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    reservation3.setReservationId("");
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test353"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    reservation3.setReservationId("hi!");
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test354"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    UseCase1And4.business.User user23 = reservation3.getUser();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test355"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test356"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    java.lang.String str14 = reservation3.getReservationId();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test357"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    java.lang.String str5 = reservation3.getReservationId();
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    java.lang.String str15 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test358"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test359"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test360"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    UseCase1And4.business.User user24 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test361"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test362"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user16 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test363"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test364"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("hi!", flight1, user2);
    reservation3.setReservationId("");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test365"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test366"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    reservation3.setReservationId("hi!");
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    reservation3.setReservationId("hi!");
    java.lang.String str20 = reservation3.getReservationId();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test367"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = reservation3.getUser();
    java.lang.String str16 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    java.lang.String str19 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test368"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    java.lang.String str20 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user23 = reservation3.getUser();
    UseCase1And4.business.User user24 = null;
    reservation3.setUser(user24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test369"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    java.lang.String str18 = reservation3.getReservationId();
    UseCase1And4.business.User user19 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test370"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase1And4.business.User user19 = reservation3.getUser();
    UseCase1And4.business.User user20 = reservation3.getUser();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    UseCase2.Business.Flight flight25 = null;
    reservation3.setFlight(flight25);
    java.lang.String str27 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test371"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getReservationId();
    java.lang.String str11 = reservation3.getReservationId();
    java.lang.String str12 = reservation3.getReservationId();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    java.lang.String str15 = reservation3.getReservationId();
    java.lang.String str16 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test372"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    reservation3.setReservationId("");
    java.lang.String str15 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test373"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    UseCase1And4.business.User user11 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str14 = reservation3.getReservationId();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test374"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test375"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    java.lang.String str13 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    java.lang.String str19 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test376"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    java.lang.String str18 = reservation3.getReservationId();
    java.lang.String str19 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test377"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user15 = reservation3.getUser();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test378"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test379"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    java.lang.String str20 = reservation3.getReservationId();
    java.lang.String str21 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test380"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test381"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    java.lang.String str18 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str21 = reservation3.getReservationId();
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test382"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight26 = reservation3.getFlight();
    UseCase2.Business.Flight flight27 = reservation3.getFlight();
    UseCase1And4.business.User user28 = null;
    reservation3.setUser(user28);
    UseCase2.Business.Flight flight30 = null;
    reservation3.setFlight(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight27);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test383"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase1And4.business.User user12 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase1And4.business.User user17 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test384"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test385"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str10 = reservation3.getReservationId();
    UseCase1And4.business.User user11 = reservation3.getUser();
    java.lang.String str12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test386"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    reservation3.setReservationId("");
    java.lang.String str22 = reservation3.getReservationId();
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user29 = null;
    reservation3.setUser(user29);
    UseCase1And4.business.User user31 = null;
    reservation3.setUser(user31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test387"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("");
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test388"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test389"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test390"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase1And4.business.User user19 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test391"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase1And4.business.User user18 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase1And4.business.User user22 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test392"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    java.lang.String str11 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test393"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    java.lang.String str26 = reservation3.getReservationId();
    UseCase2.Business.Flight flight27 = null;
    reservation3.setFlight(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test394"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    UseCase1And4.business.User user22 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test395"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase2.Business.Flight flight6 = reservation3.getFlight();
    java.lang.String str7 = reservation3.getReservationId();
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test396"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    UseCase1And4.business.User user24 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test397"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    java.lang.String str11 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase1And4.business.User user22 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test398"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase1And4.business.User user18 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user21 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test399"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    java.lang.String str8 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase1And4.business.User user13 = reservation3.getUser();
    java.lang.String str14 = reservation3.getReservationId();
    UseCase1And4.business.User user15 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test400"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    java.lang.String str8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase1And4.business.User user11 = reservation3.getUser();
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase1And4.business.User user15 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test401"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test402"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    UseCase1And4.business.User user26 = reservation3.getUser();
    UseCase1And4.business.User user27 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user27);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test403"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    java.lang.String str5 = reservation3.getReservationId();
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test404"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test405"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user22 = reservation3.getUser();
    UseCase1And4.business.User user23 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight26 = null;
    reservation3.setFlight(flight26);
    java.lang.String str28 = reservation3.getReservationId();
    UseCase1And4.business.User user29 = reservation3.getUser();
    UseCase1And4.business.User user30 = reservation3.getUser();
    UseCase2.Business.Flight flight31 = null;
    reservation3.setFlight(flight31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user30);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test406"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str13 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    java.lang.String str16 = reservation3.getReservationId();
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase1And4.business.User user20 = reservation3.getUser();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test407"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    UseCase1And4.business.User user21 = reservation3.getUser();
    java.lang.String str22 = reservation3.getReservationId();
    java.lang.String str23 = reservation3.getReservationId();
    java.lang.String str24 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test408"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    java.lang.String str11 = reservation3.getReservationId();
    java.lang.String str12 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test409"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    UseCase1And4.business.User user9 = null;
    reservation3.setUser(user9);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    java.lang.String str15 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    java.lang.String str22 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test410"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    java.lang.String str19 = reservation3.getReservationId();
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    UseCase1And4.business.User user22 = reservation3.getUser();
    java.lang.String str23 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test411"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    java.lang.String str8 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    java.lang.String str11 = reservation3.getReservationId();
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    java.lang.String str15 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test412"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test413"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase1And4.business.User user6 = reservation3.getUser();
    java.lang.String str7 = reservation3.getReservationId();
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase1And4.business.User user12 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test414"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    reservation3.setReservationId("");
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test415"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    reservation3.setReservationId("hi!");
    java.lang.String str20 = reservation3.getReservationId();
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    java.lang.String str22 = reservation3.getReservationId();
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test416"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user18 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    java.lang.String str23 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test417"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user22 = reservation3.getUser();
    UseCase1And4.business.User user23 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight26 = null;
    reservation3.setFlight(flight26);
    java.lang.String str28 = reservation3.getReservationId();
    UseCase1And4.business.User user29 = reservation3.getUser();
    UseCase2.Business.Flight flight30 = reservation3.getFlight();
    UseCase2.Business.Flight flight31 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight31);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test418"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    java.lang.String str9 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test419"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase2.Business.Flight flight5 = null;
    reservation3.setFlight(flight5);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase1And4.business.User user20 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test420"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test421"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    java.lang.String str15 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test422"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    reservation3.setReservationId("");
    java.lang.String str18 = reservation3.getReservationId();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test423"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase1And4.business.User user9 = reservation3.getUser();
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test424"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase1And4.business.User user15 = reservation3.getUser();
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test425"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase1And4.business.User user12 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user15 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test426"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test427"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    java.lang.String str12 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user15 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user18 = reservation3.getUser();
    java.lang.String str19 = reservation3.getReservationId();
    java.lang.String str20 = reservation3.getReservationId();
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test428"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    UseCase1And4.business.User user9 = reservation3.getUser();
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str13 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    java.lang.String str21 = reservation3.getReservationId();
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    UseCase1And4.business.User user24 = null;
    reservation3.setUser(user24);
    UseCase1And4.business.User user26 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user26);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test429"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("");
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test430"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase1And4.business.User user19 = reservation3.getUser();
    UseCase1And4.business.User user20 = reservation3.getUser();
    java.lang.String str21 = reservation3.getReservationId();
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    UseCase2.Business.Flight flight26 = null;
    reservation3.setFlight(flight26);
    UseCase2.Business.Flight flight28 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test431"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test432"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    java.lang.String str8 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    UseCase2.Business.Flight flight23 = reservation3.getFlight();
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight28 = reservation3.getFlight();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test433"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight27 = reservation3.getFlight();
    UseCase2.Business.Flight flight28 = reservation3.getFlight();
    UseCase2.Business.Flight flight29 = reservation3.getFlight();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight29);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test434"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    java.lang.String str24 = reservation3.getReservationId();
    java.lang.String str25 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user28 = null;
    reservation3.setUser(user28);
    UseCase2.Business.Flight flight30 = null;
    reservation3.setFlight(flight30);
    java.lang.String str32 = reservation3.getReservationId();
    java.lang.String str33 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test435"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    java.lang.String str10 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test436"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test437"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    UseCase1And4.business.User user24 = reservation3.getUser();
    java.lang.String str25 = reservation3.getReservationId();
    UseCase2.Business.Flight flight26 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight26);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test438"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test439"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("hi!", flight1, user2);
    reservation3.setReservationId("");
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    java.lang.String str16 = reservation3.getReservationId();
    UseCase1And4.business.User user17 = reservation3.getUser();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test440"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    reservation3.setReservationId("");
    java.lang.String str23 = reservation3.getReservationId();
    UseCase2.Business.Flight flight24 = null;
    reservation3.setFlight(flight24);
    java.lang.String str26 = reservation3.getReservationId();
    UseCase1And4.business.User user27 = null;
    reservation3.setUser(user27);
    UseCase2.Business.Flight flight29 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight29);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test441"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test442"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    reservation3.setReservationId("");
    UseCase1And4.business.User user11 = reservation3.getUser();
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test443"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user12 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test444"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    java.lang.String str7 = reservation3.getReservationId();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    UseCase1And4.business.User user13 = reservation3.getUser();
    java.lang.String str14 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test445"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test446"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test447"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    java.lang.String str14 = reservation3.getReservationId();
    java.lang.String str15 = reservation3.getReservationId();
    java.lang.String str16 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test448"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    UseCase2.Business.Flight flight25 = reservation3.getFlight();
    UseCase1And4.business.User user26 = null;
    reservation3.setUser(user26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight25);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test449"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    UseCase1And4.business.User user9 = reservation3.getUser();
    UseCase1And4.business.User user10 = reservation3.getUser();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase1And4.business.User user12 = reservation3.getUser();
    java.lang.String str13 = reservation3.getReservationId();
    java.lang.String str14 = reservation3.getReservationId();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test450"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    java.lang.String str19 = reservation3.getReservationId();
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    UseCase2.Business.Flight flight25 = reservation3.getFlight();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight25);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test451"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    UseCase1And4.business.User user15 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test452"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    java.lang.String str18 = reservation3.getReservationId();
    java.lang.String str19 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test453"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase1And4.business.User user20 = null;
    reservation3.setUser(user20);
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    UseCase2.Business.Flight flight24 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight27 = null;
    reservation3.setFlight(flight27);
    UseCase1And4.business.User user29 = reservation3.getUser();
    UseCase2.Business.Flight flight30 = null;
    reservation3.setFlight(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user29);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test454"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase2.Business.Flight flight20 = reservation3.getFlight();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight20);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test455"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = null;
    reservation3.setUser(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test456"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test457"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    java.lang.String str4 = reservation3.getReservationId();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    java.lang.String str8 = reservation3.getReservationId();
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    UseCase1And4.business.User user11 = reservation3.getUser();
    java.lang.String str12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getReservationId();
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test458"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test459"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    java.lang.String str22 = reservation3.getReservationId();
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    UseCase2.Business.Flight flight25 = null;
    reservation3.setFlight(flight25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test460"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    java.lang.String str15 = reservation3.getReservationId();
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = reservation3.getUser();
    java.lang.String str22 = reservation3.getReservationId();
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test461"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    java.lang.String str18 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase1And4.business.User user22 = reservation3.getUser();
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    UseCase2.Business.Flight flight25 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight28 = null;
    reservation3.setFlight(flight28);
    UseCase1And4.business.User user30 = null;
    reservation3.setUser(user30);
    java.lang.String str32 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test462"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = reservation3.getUser();
    java.lang.String str6 = reservation3.getReservationId();
    UseCase1And4.business.User user7 = null;
    reservation3.setUser(user7);
    reservation3.setReservationId("");
    java.lang.String str11 = reservation3.getReservationId();
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test463"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    UseCase1And4.business.User user19 = reservation3.getUser();
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test464"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    java.lang.String str9 = reservation3.getReservationId();
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test465"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    java.lang.String str18 = reservation3.getReservationId();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    reservation3.setReservationId("");
    java.lang.String str24 = reservation3.getReservationId();
    UseCase1And4.business.User user25 = null;
    reservation3.setUser(user25);
    UseCase1And4.business.User user27 = null;
    reservation3.setUser(user27);
    UseCase2.Business.Flight flight29 = null;
    reservation3.setFlight(flight29);
    java.lang.String str31 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test466"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    java.lang.String str17 = reservation3.getReservationId();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    UseCase2.Business.Flight flight22 = null;
    reservation3.setFlight(flight22);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user26 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user26);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test467"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    java.lang.String str18 = reservation3.getReservationId();
    UseCase1And4.business.User user19 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test468"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user24 = null;
    reservation3.setUser(user24);
    UseCase1And4.business.User user26 = null;
    reservation3.setUser(user26);
    UseCase1And4.business.User user28 = reservation3.getUser();
    java.lang.String str29 = reservation3.getReservationId();
    UseCase2.Business.Flight flight30 = reservation3.getFlight();
    java.lang.String str31 = reservation3.getReservationId();
    UseCase2.Business.Flight flight32 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test469"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    reservation3.setReservationId("");
    UseCase1And4.business.User user18 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test470"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = null;
    reservation3.setUser(user7);
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    java.lang.String str12 = reservation3.getReservationId();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test471"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    java.lang.String str17 = reservation3.getReservationId();
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    reservation3.setReservationId("");
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    java.lang.String str25 = reservation3.getReservationId();
    UseCase1And4.business.User user26 = reservation3.getUser();
    UseCase2.Business.Flight flight27 = reservation3.getFlight();
    UseCase2.Business.Flight flight28 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight28);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test472"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight16 = null;
    reservation3.setFlight(flight16);
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase1And4.business.User user20 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    java.lang.String str25 = reservation3.getReservationId();
    UseCase2.Business.Flight flight26 = null;
    reservation3.setFlight(flight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test473"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    java.lang.String str21 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test474"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase2.Business.Flight flight8 = null;
    reservation3.setFlight(flight8);
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase2.Business.Flight flight15 = reservation3.getFlight();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    java.lang.String str17 = reservation3.getReservationId();
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    java.lang.String str20 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test475"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    reservation3.setReservationId("");
    reservation3.setReservationId("");
    java.lang.String str26 = reservation3.getReservationId();
    UseCase1And4.business.User user27 = null;
    reservation3.setUser(user27);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test476"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    UseCase1And4.business.User user22 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test477"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    java.lang.String str8 = reservation3.getReservationId();
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase1And4.business.User user11 = reservation3.getUser();
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase1And4.business.User user15 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user18 = reservation3.getUser();
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test478"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase1And4.business.User user12 = reservation3.getUser();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test479"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    java.lang.String str14 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test480"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    UseCase1And4.business.User user6 = reservation3.getUser();
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = reservation3.getFlight();
    UseCase1And4.business.User user11 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test481"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    reservation3.setReservationId("");
    java.lang.String str19 = reservation3.getReservationId();
    java.lang.String str20 = reservation3.getReservationId();
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    UseCase1And4.business.User user23 = null;
    reservation3.setUser(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test482"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    java.lang.String str18 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = reservation3.getUser();
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user25 = null;
    reservation3.setUser(user25);
    reservation3.setReservationId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test483"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    UseCase2.Business.Flight flight9 = reservation3.getFlight();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    UseCase1And4.business.User user14 = null;
    reservation3.setUser(user14);
    UseCase1And4.business.User user16 = reservation3.getUser();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase1And4.business.User user20 = reservation3.getUser();
    UseCase2.Business.Flight flight21 = reservation3.getFlight();
    UseCase2.Business.Flight flight22 = reservation3.getFlight();
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight22);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test484"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    java.lang.String str4 = reservation3.getReservationId();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    UseCase2.Business.Flight flight18 = reservation3.getFlight();
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    java.lang.String str21 = reservation3.getReservationId();
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("");
    UseCase1And4.business.User user28 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user28);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test485"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("");
    java.lang.String str12 = reservation3.getReservationId();
    UseCase2.Business.Flight flight13 = null;
    reservation3.setFlight(flight13);
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test486"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase1And4.business.User user8 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user11 = null;
    reservation3.setUser(user11);
    reservation3.setReservationId("");
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test487"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight6 = null;
    reservation3.setFlight(flight6);
    UseCase2.Business.Flight flight8 = reservation3.getFlight();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase2.Business.Flight flight13 = reservation3.getFlight();
    java.lang.String str14 = reservation3.getReservationId();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test488"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    java.lang.String str18 = reservation3.getReservationId();
    reservation3.setReservationId("");
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    reservation3.setReservationId("hi!");
    java.lang.String str27 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user30 = reservation3.getUser();
    UseCase2.Business.Flight flight31 = reservation3.getFlight();
    UseCase2.Business.Flight flight32 = reservation3.getFlight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight32);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test489"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase1And4.business.User user18 = null;
    reservation3.setUser(user18);
    java.lang.String str20 = reservation3.getReservationId();
    UseCase1And4.business.User user21 = null;
    reservation3.setUser(user21);
    UseCase2.Business.Flight flight23 = null;
    reservation3.setFlight(flight23);
    UseCase2.Business.Flight flight25 = reservation3.getFlight();
    UseCase1And4.business.User user26 = null;
    reservation3.setUser(user26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight25);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test490"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("hi!", flight1, user2);
    reservation3.setReservationId("");
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = reservation3.getFlight();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    java.lang.String str10 = reservation3.getReservationId();
    UseCase2.Business.Flight flight11 = null;
    reservation3.setFlight(flight11);
    reservation3.setReservationId("");
    UseCase1And4.business.User user15 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test491"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    UseCase2.Business.Flight flight11 = reservation3.getFlight();
    UseCase1And4.business.User user12 = null;
    reservation3.setUser(user12);
    java.lang.String str14 = reservation3.getReservationId();
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    UseCase1And4.business.User user17 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test492"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight14 = reservation3.getFlight();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user19 = reservation3.getUser();
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test493"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    java.lang.String str16 = reservation3.getReservationId();
    UseCase2.Business.Flight flight17 = null;
    reservation3.setFlight(flight17);
    UseCase1And4.business.User user19 = null;
    reservation3.setUser(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test494"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    UseCase1And4.business.User user13 = reservation3.getUser();
    UseCase1And4.business.User user14 = reservation3.getUser();
    java.lang.String str15 = reservation3.getReservationId();
    UseCase2.Business.Flight flight16 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight19 = null;
    reservation3.setFlight(flight19);
    UseCase1And4.business.User user21 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user24 = null;
    reservation3.setUser(user24);
    UseCase1And4.business.User user26 = null;
    reservation3.setUser(user26);
    UseCase2.Business.Flight flight28 = null;
    reservation3.setFlight(flight28);
    UseCase1And4.business.User user30 = null;
    reservation3.setUser(user30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test495"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    java.lang.String str8 = reservation3.getReservationId();
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user11 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = null;
    reservation3.setUser(user15);
    UseCase1And4.business.User user17 = null;
    reservation3.setUser(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test496"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase2.Business.Flight flight5 = null;
    reservation3.setFlight(flight5);
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight9 = null;
    reservation3.setFlight(flight9);
    reservation3.setReservationId("");
    UseCase1And4.business.User user13 = reservation3.getUser();
    reservation3.setReservationId("");
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase2.Business.Flight flight18 = null;
    reservation3.setFlight(flight18);
    reservation3.setReservationId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test497"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    java.lang.String str11 = reservation3.getReservationId();
    UseCase2.Business.Flight flight12 = reservation3.getFlight();
    java.lang.String str13 = reservation3.getReservationId();
    UseCase2.Business.Flight flight14 = null;
    reservation3.setFlight(flight14);
    UseCase1And4.business.User user16 = reservation3.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test498"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    reservation3.setReservationId("hi!");
    UseCase1And4.business.User user6 = null;
    reservation3.setUser(user6);
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase2.Business.Flight flight10 = null;
    reservation3.setFlight(flight10);
    UseCase1And4.business.User user12 = reservation3.getUser();
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight15 = null;
    reservation3.setFlight(flight15);
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight19 = reservation3.getFlight();
    UseCase1And4.business.User user20 = reservation3.getUser();
    UseCase2.Business.Flight flight21 = null;
    reservation3.setFlight(flight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test499"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = null;
    reservation3.setUser(user4);
    java.lang.String str6 = reservation3.getReservationId();
    UseCase2.Business.Flight flight7 = null;
    reservation3.setFlight(flight7);
    java.lang.String str9 = reservation3.getReservationId();
    UseCase1And4.business.User user10 = null;
    reservation3.setUser(user10);
    UseCase2.Business.Flight flight12 = null;
    reservation3.setFlight(flight12);
    UseCase1And4.business.User user14 = reservation3.getUser();
    UseCase1And4.business.User user15 = reservation3.getUser();
    UseCase1And4.business.User user16 = null;
    reservation3.setUser(user16);
    UseCase1And4.business.User user18 = reservation3.getUser();
    java.lang.String str19 = reservation3.getReservationId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27.test500"); }

    UseCase2.Business.Flight flight1 = null;
    UseCase1And4.business.User user2 = null;
    UseCase3.business.Reservation reservation3 = new UseCase3.business.Reservation("", flight1, user2);
    UseCase1And4.business.User user4 = reservation3.getUser();
    UseCase1And4.business.User user5 = null;
    reservation3.setUser(user5);
    UseCase1And4.business.User user7 = reservation3.getUser();
    UseCase1And4.business.User user8 = null;
    reservation3.setUser(user8);
    UseCase1And4.business.User user10 = reservation3.getUser();
    reservation3.setReservationId("");
    reservation3.setReservationId("hi!");
    reservation3.setReservationId("hi!");
    UseCase2.Business.Flight flight17 = reservation3.getFlight();
    reservation3.setReservationId("");
    UseCase2.Business.Flight flight20 = null;
    reservation3.setFlight(flight20);
    UseCase1And4.business.User user22 = null;
    reservation3.setUser(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(flight17);

  }

}
