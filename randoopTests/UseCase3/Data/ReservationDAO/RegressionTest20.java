
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test001"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test002"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
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
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test003"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test004"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test005"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test006"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test007"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test008"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test009"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test010"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    UseCase3.business.Reservation reservation40 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation40);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test011"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test012"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test013"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test014"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test015"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation40 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation40);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test016"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test017"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test018"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test019"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation39 = null;
    boolean b40 = reservationDAO0.saveReservation(reservation39);
    UseCase3.business.Reservation reservation42 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation44 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
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
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation44);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test020"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test021"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test022"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test023"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test024"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test025"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test026"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test027"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test028"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test029"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test030"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test031"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test032"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
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
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test033"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test034"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test035"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test036"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test037"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test038"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test039"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test040"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test041"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test042"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test043"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test044"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
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
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test045"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test046"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test047"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test048"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    UseCase3.business.Reservation reservation39 = null;
    boolean b40 = reservationDAO0.saveReservation(reservation39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
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
    org.junit.Assert.assertNull(reservation32);
    
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
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test049"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test050"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test051"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test052"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test053"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
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
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test054"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation39 = null;
    boolean b40 = reservationDAO0.saveReservation(reservation39);
    UseCase3.business.Reservation reservation41 = null;
    boolean b42 = reservationDAO0.saveReservation(reservation41);
    UseCase3.business.Reservation reservation43 = null;
    boolean b44 = reservationDAO0.saveReservation(reservation43);
    UseCase3.business.Reservation reservation45 = null;
    boolean b46 = reservationDAO0.saveReservation(reservation45);
    UseCase3.business.Reservation reservation48 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation50 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation51 = null;
    boolean b52 = reservationDAO0.saveReservation(reservation51);
    UseCase3.business.Reservation reservation54 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
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
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation54);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test055"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test056"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test057"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test058"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test059"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    
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
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test060"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    UseCase3.business.Reservation reservation39 = null;
    boolean b40 = reservationDAO0.saveReservation(reservation39);
    UseCase3.business.Reservation reservation41 = null;
    boolean b42 = reservationDAO0.saveReservation(reservation41);
    UseCase3.business.Reservation reservation43 = null;
    boolean b44 = reservationDAO0.saveReservation(reservation43);
    UseCase3.business.Reservation reservation45 = null;
    boolean b46 = reservationDAO0.saveReservation(reservation45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
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
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test061"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test062"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test063"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test064"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test065"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test066"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test067"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test068"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test069"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test070"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test071"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test072"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test073"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test074"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test075"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test076"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test077"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test078"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test079"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
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
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test080"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test081"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test082"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test083"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    
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
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test084"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test085"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test086"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
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
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test087"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test088"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test089"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test090"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test091"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test092"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test093"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test094"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test095"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test096"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test097"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
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
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test098"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test099"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test100"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    UseCase3.business.Reservation reservation40 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation42 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation42);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test101"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test102"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test103"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation39 = null;
    boolean b40 = reservationDAO0.saveReservation(reservation39);
    UseCase3.business.Reservation reservation42 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation44 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation46 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation46);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test104"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test105"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test106"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test107"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test108"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test109"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test110"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test111"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test112"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test113"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test114"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test115"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test116"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test117"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test118"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    UseCase3.business.Reservation reservation40 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation42 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation43 = null;
    boolean b44 = reservationDAO0.saveReservation(reservation43);
    UseCase3.business.Reservation reservation45 = null;
    boolean b46 = reservationDAO0.saveReservation(reservation45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test119"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test120"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test121"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test122"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test123"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test124"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test125"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test126"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
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
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test127"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    UseCase3.business.Reservation reservation40 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation42 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation42);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test128"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
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
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test129"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test130"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test131"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test132"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test133"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test134"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
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
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test135"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test136"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test137"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test138"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test139"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test140"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test141"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    UseCase3.business.Reservation reservation39 = null;
    boolean b40 = reservationDAO0.saveReservation(reservation39);
    UseCase3.business.Reservation reservation41 = null;
    boolean b42 = reservationDAO0.saveReservation(reservation41);
    UseCase3.business.Reservation reservation44 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation46 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation47 = null;
    boolean b48 = reservationDAO0.saveReservation(reservation47);
    UseCase3.business.Reservation reservation49 = null;
    boolean b50 = reservationDAO0.saveReservation(reservation49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
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
    org.junit.Assert.assertNull(reservation44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test142"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test143"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
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
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test144"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test145"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test146"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    UseCase3.business.Reservation reservation39 = null;
    boolean b40 = reservationDAO0.saveReservation(reservation39);
    UseCase3.business.Reservation reservation41 = null;
    boolean b42 = reservationDAO0.saveReservation(reservation41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test147"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test148"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test149"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test150"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test151"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test152"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
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
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test153"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test154"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
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
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test155"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test156"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test157"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test158"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("hi!");
    
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
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test159"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test160"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test161"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    UseCase3.business.Reservation reservation40 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation41 = null;
    boolean b42 = reservationDAO0.saveReservation(reservation41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
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
    org.junit.Assert.assertNull(reservation40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test162"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test163"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
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
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test164"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test165"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test166"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test167"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    UseCase3.business.Reservation reservation39 = null;
    boolean b40 = reservationDAO0.saveReservation(reservation39);
    UseCase3.business.Reservation reservation41 = null;
    boolean b42 = reservationDAO0.saveReservation(reservation41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test168"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test169"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test170"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
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
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test171"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test172"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test173"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test174"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test175"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test176"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
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
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test177"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test178"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test179"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test180"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test181"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test182"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    UseCase3.business.Reservation reservation40 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation40);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test183"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test184"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    UseCase3.business.Reservation reservation39 = null;
    boolean b40 = reservationDAO0.saveReservation(reservation39);
    UseCase3.business.Reservation reservation41 = null;
    boolean b42 = reservationDAO0.saveReservation(reservation41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test185"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test186"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
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
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test187"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test188"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test189"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation39 = null;
    boolean b40 = reservationDAO0.saveReservation(reservation39);
    UseCase3.business.Reservation reservation42 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation44 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation46 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation47 = null;
    boolean b48 = reservationDAO0.saveReservation(reservation47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test190"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
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
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test191"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
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
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test192"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test193"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test194"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test195"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test196"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation39 = null;
    boolean b40 = reservationDAO0.saveReservation(reservation39);
    UseCase3.business.Reservation reservation42 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation43 = null;
    boolean b44 = reservationDAO0.saveReservation(reservation43);
    UseCase3.business.Reservation reservation46 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation46);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test197"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
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
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test198"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test199"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test200"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test201"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test202"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test203"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test204"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test205"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test206"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test207"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test208"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test209"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test210"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test211"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test212"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test213"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test214"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test215"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    
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
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test216"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test217"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test218"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    UseCase3.business.Reservation reservation40 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation41 = null;
    boolean b42 = reservationDAO0.saveReservation(reservation41);
    UseCase3.business.Reservation reservation44 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation45 = null;
    boolean b46 = reservationDAO0.saveReservation(reservation45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test219"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test220"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    
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
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test221"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation39 = null;
    boolean b40 = reservationDAO0.saveReservation(reservation39);
    UseCase3.business.Reservation reservation41 = null;
    boolean b42 = reservationDAO0.saveReservation(reservation41);
    UseCase3.business.Reservation reservation43 = null;
    boolean b44 = reservationDAO0.saveReservation(reservation43);
    UseCase3.business.Reservation reservation46 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
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
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation46);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test222"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test223"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test224"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test225"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test226"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test227"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test228"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test229"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test230"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation31 = null;
    boolean b32 = reservationDAO0.saveReservation(reservation31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test231"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
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
    org.junit.Assert.assertNull(reservation24);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test232"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test233"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test234"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test235"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test236"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test237"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test238"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test239"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test240"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
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
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test241"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test242"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test243"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation35 = null;
    boolean b36 = reservationDAO0.saveReservation(reservation35);
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test244"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation38 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation40 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation40);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test245"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test246"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test247"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test248"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation29 = null;
    boolean b30 = reservationDAO0.saveReservation(reservation29);
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
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
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test249"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test250"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test251"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation34 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation34);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test252"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation3 = null;
    boolean b4 = reservationDAO0.saveReservation(reservation3);
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test253"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation1 = null;
    boolean b2 = reservationDAO0.saveReservation(reservation1);
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation22 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation27 = null;
    boolean b28 = reservationDAO0.saveReservation(reservation27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test254"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation18);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test255"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation8 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation14 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation23 = null;
    boolean b24 = reservationDAO0.saveReservation(reservation23);
    UseCase3.business.Reservation reservation26 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation26);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test256"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation5 = null;
    boolean b6 = reservationDAO0.saveReservation(reservation5);
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation10 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation12 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation16 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation17 = null;
    boolean b18 = reservationDAO0.saveReservation(reservation17);
    UseCase3.business.Reservation reservation20 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation25 = null;
    boolean b26 = reservationDAO0.saveReservation(reservation25);
    UseCase3.business.Reservation reservation28 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation30 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation32 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation33 = null;
    boolean b34 = reservationDAO0.saveReservation(reservation33);
    UseCase3.business.Reservation reservation36 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation37 = null;
    boolean b38 = reservationDAO0.saveReservation(reservation37);
    UseCase3.business.Reservation reservation40 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation42 = reservationDAO0.getReservation("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation42);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test257"); }

    UseCase3.data.ReservationDAO reservationDAO0 = new UseCase3.data.ReservationDAO();
    UseCase3.business.Reservation reservation2 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation4 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation6 = reservationDAO0.getReservation("");
    UseCase3.business.Reservation reservation7 = null;
    boolean b8 = reservationDAO0.saveReservation(reservation7);
    UseCase3.business.Reservation reservation9 = null;
    boolean b10 = reservationDAO0.saveReservation(reservation9);
    UseCase3.business.Reservation reservation11 = null;
    boolean b12 = reservationDAO0.saveReservation(reservation11);
    UseCase3.business.Reservation reservation13 = null;
    boolean b14 = reservationDAO0.saveReservation(reservation13);
    UseCase3.business.Reservation reservation15 = null;
    boolean b16 = reservationDAO0.saveReservation(reservation15);
    UseCase3.business.Reservation reservation18 = reservationDAO0.getReservation("hi!");
    UseCase3.business.Reservation reservation19 = null;
    boolean b20 = reservationDAO0.saveReservation(reservation19);
    UseCase3.business.Reservation reservation21 = null;
    boolean b22 = reservationDAO0.saveReservation(reservation21);
    UseCase3.business.Reservation reservation24 = reservationDAO0.getReservation("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation6);
    
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
    org.junit.Assert.assertNull(reservation18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reservation24);

  }

}
