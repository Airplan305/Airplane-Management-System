
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test001"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setAmount((double)100L);
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    UseCase1And4.business.User user21 = payment4.getUser();
    UseCase1And4.business.User user22 = payment4.getUser();
    java.lang.String str23 = payment4.getPaymentId();
    UseCase1And4.business.User user24 = null;
    payment4.setUser(user24);
    UseCase1And4.business.User user26 = null;
    payment4.setUser(user26);
    UseCase1And4.business.User user28 = null;
    payment4.setUser(user28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test002"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, true);
    payment4.setPaymentId("");
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setPaymentId("");
    UseCase1And4.business.User user11 = payment4.getUser();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    UseCase1And4.business.User user14 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test003"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10, false);
    UseCase1And4.business.User user5 = payment4.getUser();
    java.lang.String str6 = payment4.getPaymentId();
    boolean b7 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test004"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(true);
    java.lang.String str11 = payment4.getPaymentId();
    UseCase1And4.business.User user12 = payment4.getUser();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    payment4.setAmount((double)(-1L));
    double d17 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == (-1.0d));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test005"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    payment4.setRefunded(false);
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    payment4.setRefunded(true);
    java.lang.String str19 = payment4.getPaymentId();
    UseCase1And4.business.User user20 = null;
    payment4.setUser(user20);
    java.lang.String str22 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test006"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    double d8 = payment4.getAmount();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setAmount((-1.0d));
    boolean b13 = payment4.getRefunded();
    payment4.setRefunded(false);
    double d16 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == (-1.0d));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test007"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    double d8 = payment4.getAmount();
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test008"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, false);
    payment4.setAmount((double)(byte)10);
    payment4.setAmount((double)(-1));
    payment4.setPaymentId("");
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user15 = payment4.getUser();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test009"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(true);
    payment4.setAmount((double)(short)100);
    boolean b12 = payment4.getRefunded();
    UseCase1And4.business.User user13 = payment4.getUser();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    double d16 = payment4.getAmount();
    boolean b17 = payment4.getRefunded();
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user22 = null;
    payment4.setUser(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test010"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 1.0d, false);
    boolean b5 = payment4.getRefunded();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    boolean b11 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test011"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    double d7 = payment4.getAmount();
    boolean b8 = payment4.getRefunded();
    UseCase1And4.business.User user9 = payment4.getUser();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test012"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 32.0d, false);
    boolean b5 = payment4.getRefunded();
    double d6 = payment4.getAmount();
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    boolean b9 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test013"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setRefunded(false);
    payment4.setRefunded(false);
    double d21 = payment4.getAmount();
    java.lang.String str22 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test014"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)'4');
    payment4.setAmount(0.0d);
    boolean b10 = payment4.getRefunded();
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user15 = payment4.getUser();
    double d16 = payment4.getAmount();
    boolean b17 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test015"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setPaymentId("");
    double d8 = payment4.getAmount();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    double d13 = payment4.getAmount();
    double d14 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 10.0d);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test016"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    payment4.setPaymentId("");
    UseCase1And4.business.User user10 = payment4.getUser();
    boolean b11 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test017"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 10.0d, false);
    payment4.setPaymentId("hi!");
    double d7 = payment4.getAmount();
    java.lang.String str8 = payment4.getPaymentId();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test018"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setRefunded(false);
    payment4.setRefunded(false);
    java.lang.String str10 = payment4.getPaymentId();
    payment4.setAmount((double)(-1));
    payment4.setAmount(100.0d);
    java.lang.String str15 = payment4.getPaymentId();
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    UseCase1And4.business.User user18 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test019"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)1, true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user11 = payment4.getUser();
    payment4.setPaymentId("");
    java.lang.String str14 = payment4.getPaymentId();
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    UseCase1And4.business.User user17 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test020"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    payment4.setRefunded(true);
    java.lang.String str10 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test021"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(byte)10, false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user7 = payment4.getUser();
    java.lang.String str8 = payment4.getPaymentId();
    payment4.setPaymentId("");
    boolean b11 = payment4.getRefunded();
    boolean b12 = payment4.getRefunded();
    payment4.setAmount((double)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test022"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)100, false);
    payment4.setAmount((double)(short)100);
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    java.lang.String str11 = payment4.getPaymentId();
    double d12 = payment4.getAmount();
    boolean b13 = payment4.getRefunded();
    java.lang.String str14 = payment4.getPaymentId();
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    double d17 = payment4.getAmount();
    UseCase1And4.business.User user18 = null;
    payment4.setUser(user18);
    payment4.setAmount(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 100.0d);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test023"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = payment4.getUser();
    UseCase1And4.business.User user15 = payment4.getUser();
    payment4.setPaymentId("");
    double d18 = payment4.getAmount();
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    double d21 = payment4.getAmount();
    payment4.setAmount((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 1.0d);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test024"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(short)0, true);
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    payment4.setPaymentId("");
    payment4.setAmount((double)(byte)100);
    double d13 = payment4.getAmount();
    payment4.setPaymentId("");
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 100.0d);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test025"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)'#', false);
    boolean b5 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test026"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    payment4.setRefunded(true);
    double d7 = payment4.getAmount();
    boolean b8 = payment4.getRefunded();
    java.lang.String str9 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    double d12 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test027"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setRefunded(true);
    java.lang.String str11 = payment4.getPaymentId();
    java.lang.String str12 = payment4.getPaymentId();
    boolean b13 = payment4.getRefunded();
    UseCase1And4.business.User user14 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test028"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    java.lang.String str11 = payment4.getPaymentId();
    java.lang.String str12 = payment4.getPaymentId();
    boolean b13 = payment4.getRefunded();
    boolean b14 = payment4.getRefunded();
    UseCase1And4.business.User user15 = payment4.getUser();
    UseCase1And4.business.User user16 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test029"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    payment4.setPaymentId("hi!");
    payment4.setAmount(0.0d);
    double d9 = payment4.getAmount();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    boolean b14 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test030"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setRefunded(false);
    double d18 = payment4.getAmount();
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    UseCase1And4.business.User user21 = null;
    payment4.setUser(user21);
    payment4.setPaymentId("hi!");
    double d25 = payment4.getAmount();
    double d26 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 1.0d);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test031"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    payment4.setAmount((double)(-1L));
    boolean b10 = payment4.getRefunded();
    boolean b11 = payment4.getRefunded();
    UseCase1And4.business.User user12 = payment4.getUser();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test032"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    double d7 = payment4.getAmount();
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    java.lang.String str11 = payment4.getPaymentId();
    UseCase1And4.business.User user12 = payment4.getUser();
    java.lang.String str13 = payment4.getPaymentId();
    boolean b14 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test033"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setRefunded(false);
    double d18 = payment4.getAmount();
    payment4.setPaymentId("");
    payment4.setPaymentId("hi!");
    payment4.setRefunded(false);
    double d25 = payment4.getAmount();
    UseCase1And4.business.User user26 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user26);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test034"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setRefunded(false);
    java.lang.String str8 = payment4.getPaymentId();
    payment4.setAmount((double)(-1));
    UseCase1And4.business.User user11 = payment4.getUser();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    boolean b14 = payment4.getRefunded();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test035"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    java.lang.String str15 = payment4.getPaymentId();
    java.lang.String str16 = payment4.getPaymentId();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test036"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)'a', false);
    payment4.setRefunded(true);
    java.lang.String str7 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test037"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    double d6 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user11 = payment4.getUser();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    java.lang.String str14 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test038"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    boolean b13 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test039"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)'4');
    payment4.setPaymentId("");
    payment4.setRefunded(true);
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    boolean b14 = payment4.getRefunded();
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    UseCase1And4.business.User user21 = null;
    payment4.setUser(user21);
    payment4.setAmount(52.0d);
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    java.lang.String str29 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test040"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(true);
    payment4.setAmount((double)100);
    double d12 = payment4.getAmount();
    double d13 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 100.0d);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test041"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    double d15 = payment4.getAmount();
    payment4.setAmount(0.0d);
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    payment4.setRefunded(false);
    UseCase1And4.business.User user24 = null;
    payment4.setUser(user24);
    payment4.setAmount(10.0d);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test042"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    java.lang.String str9 = payment4.getPaymentId();
    payment4.setAmount(10.0d);
    payment4.setPaymentId("hi!");
    double d14 = payment4.getAmount();
    double d15 = payment4.getAmount();
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user20 = payment4.getUser();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test043"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)100, true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    payment4.setAmount((double)1.0f);
    payment4.setAmount((double)1);
    UseCase1And4.business.User user11 = payment4.getUser();
    java.lang.String str12 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test044"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    java.lang.String str17 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test045"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    java.lang.String str17 = payment4.getPaymentId();
    payment4.setPaymentId("");
    payment4.setRefunded(true);
    payment4.setAmount(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test046"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setRefunded(true);
    UseCase1And4.business.User user10 = payment4.getUser();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test047"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, false);
    payment4.setAmount((double)(byte)10);
    payment4.setAmount((double)(-1));
    payment4.setPaymentId("");
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    payment4.setPaymentId("");
    payment4.setAmount((double)'#');

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test048"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("hi!");
    payment4.setRefunded(true);
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = payment4.getUser();
    boolean b15 = payment4.getRefunded();
    boolean b16 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test049"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    payment4.setPaymentId("hi!");
    payment4.setRefunded(true);
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    double d16 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 10.0d);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test050"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    boolean b15 = payment4.getRefunded();
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    double d20 = payment4.getAmount();
    double d21 = payment4.getAmount();
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 1.0d);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test051"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    java.lang.String str11 = payment4.getPaymentId();
    java.lang.String str12 = payment4.getPaymentId();
    payment4.setPaymentId("");
    double d15 = payment4.getAmount();
    payment4.setAmount((double)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test052"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    payment4.setAmount((double)(-1));
    UseCase1And4.business.User user23 = payment4.getUser();
    UseCase1And4.business.User user24 = null;
    payment4.setUser(user24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test053"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = payment4.getUser();
    boolean b14 = payment4.getRefunded();
    payment4.setPaymentId("");
    java.lang.String str17 = payment4.getPaymentId();
    boolean b18 = payment4.getRefunded();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test054"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("hi!");
    boolean b13 = payment4.getRefunded();
    payment4.setAmount(0.0d);
    payment4.setPaymentId("");
    double d18 = payment4.getAmount();
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test055"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    double d5 = payment4.getAmount();
    java.lang.String str6 = payment4.getPaymentId();
    double d7 = payment4.getAmount();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test056"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    payment4.setPaymentId("hi!");
    payment4.setAmount(0.0d);
    double d9 = payment4.getAmount();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    payment4.setRefunded(true);
    UseCase1And4.business.User user14 = payment4.getUser();
    UseCase1And4.business.User user15 = payment4.getUser();
    payment4.setPaymentId("");
    double d18 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test057"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, true);
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    java.lang.String str9 = payment4.getPaymentId();
    java.lang.String str10 = payment4.getPaymentId();
    UseCase1And4.business.User user11 = payment4.getUser();
    boolean b12 = payment4.getRefunded();
    boolean b13 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test058"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(true);
    payment4.setAmount((double)100);
    payment4.setAmount((double)1L);
    UseCase1And4.business.User user14 = payment4.getUser();
    java.lang.String str15 = payment4.getPaymentId();
    double d16 = payment4.getAmount();
    payment4.setPaymentId("");
    boolean b19 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test059"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    payment4.setAmount((double)10);
    payment4.setRefunded(false);
    payment4.setAmount(35.0d);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    UseCase1And4.business.User user13 = payment4.getUser();
    payment4.setAmount(35.0d);
    boolean b16 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test060"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    double d9 = payment4.getAmount();
    UseCase1And4.business.User user10 = payment4.getUser();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    UseCase1And4.business.User user13 = payment4.getUser();
    payment4.setRefunded(false);
    double d16 = payment4.getAmount();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == (-1.0d));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test061"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, false);
    payment4.setRefunded(false);
    double d7 = payment4.getAmount();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test062"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    double d9 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    java.lang.String str12 = payment4.getPaymentId();
    UseCase1And4.business.User user13 = payment4.getUser();
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    java.lang.String str18 = payment4.getPaymentId();
    double d19 = payment4.getAmount();
    java.lang.String str20 = payment4.getPaymentId();
    UseCase1And4.business.User user21 = null;
    payment4.setUser(user21);
    UseCase1And4.business.User user23 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test063"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    payment4.setAmount((double)10.0f);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = payment4.getUser();
    payment4.setPaymentId("hi!");
    double d18 = payment4.getAmount();
    payment4.setAmount(10.0d);
    payment4.setAmount((double)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 10.0d);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test064"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    payment4.setPaymentId("");
    java.lang.String str7 = payment4.getPaymentId();
    double d8 = payment4.getAmount();
    payment4.setRefunded(false);
    double d11 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-1.0d));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test065"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(true);
    UseCase1And4.business.User user10 = payment4.getUser();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test066"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 1.0d, false);
    payment4.setAmount(52.0d);
    payment4.setRefunded(true);
    boolean b9 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test067"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(true);
    payment4.setAmount((double)100);
    payment4.setAmount((double)1L);
    UseCase1And4.business.User user14 = payment4.getUser();
    java.lang.String str15 = payment4.getPaymentId();
    double d16 = payment4.getAmount();
    UseCase1And4.business.User user17 = payment4.getUser();
    boolean b18 = payment4.getRefunded();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test068"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, true);
    payment4.setRefunded(true);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setAmount((double)(short)-1);
    UseCase1And4.business.User user10 = payment4.getUser();
    java.lang.String str11 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test069"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    payment4.setAmount((-1.0d));
    payment4.setAmount(1.0d);
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    double d14 = payment4.getAmount();
    payment4.setPaymentId("");
    boolean b17 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test070"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    payment4.setRefunded(true);
    double d12 = payment4.getAmount();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.0d);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test071"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)10.0f, false);
    payment4.setPaymentId("hi!");
    payment4.setRefunded(false);
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test072"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    UseCase1And4.business.User user17 = payment4.getUser();
    UseCase1And4.business.User user18 = payment4.getUser();
    java.lang.String str19 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test073"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    double d15 = payment4.getAmount();
    payment4.setPaymentId("");
    payment4.setPaymentId("");
    payment4.setAmount((double)(-1L));
    boolean b22 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test074"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setRefunded(true);
    double d7 = payment4.getAmount();
    UseCase1And4.business.User user8 = payment4.getUser();
    double d9 = payment4.getAmount();
    boolean b10 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test075"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    boolean b9 = payment4.getRefunded();
    UseCase1And4.business.User user10 = payment4.getUser();
    boolean b11 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test076"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    payment4.setRefunded(true);
    payment4.setAmount((double)'#');
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    boolean b18 = payment4.getRefunded();
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    boolean b21 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test077"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(true);
    payment4.setAmount((double)100);
    payment4.setAmount((double)1L);
    UseCase1And4.business.User user14 = payment4.getUser();
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test078"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(true);
    payment4.setRefunded(true);
    double d13 = payment4.getAmount();
    boolean b14 = payment4.getRefunded();
    payment4.setAmount((double)(byte)100);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user19 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test079"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)-1, false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setPaymentId("");
    java.lang.String str10 = payment4.getPaymentId();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test080"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    payment4.setAmount((-1.0d));
    payment4.setAmount(0.0d);
    boolean b12 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test081"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 0.0d, false);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    boolean b8 = payment4.getRefunded();
    double d9 = payment4.getAmount();
    double d10 = payment4.getAmount();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test082"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    java.lang.String str13 = payment4.getPaymentId();
    payment4.setRefunded(false);
    boolean b16 = payment4.getRefunded();
    java.lang.String str17 = payment4.getPaymentId();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test083"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setRefunded(false);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    java.lang.String str19 = payment4.getPaymentId();
    UseCase1And4.business.User user20 = payment4.getUser();
    java.lang.String str21 = payment4.getPaymentId();
    UseCase1And4.business.User user22 = payment4.getUser();
    boolean b23 = payment4.getRefunded();
    boolean b24 = payment4.getRefunded();
    double d25 = payment4.getAmount();
    UseCase1And4.business.User user26 = null;
    payment4.setUser(user26);
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 1.0d);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test084"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    payment4.setPaymentId("");
    payment4.setRefunded(true);
    double d18 = payment4.getAmount();
    payment4.setAmount((double)(byte)1);
    UseCase1And4.business.User user21 = null;
    payment4.setUser(user21);
    UseCase1And4.business.User user23 = payment4.getUser();
    java.lang.String str24 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test085"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = payment4.getUser();
    payment4.setPaymentId("");
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    payment4.setAmount((double)(short)-1);
    boolean b20 = payment4.getRefunded();
    payment4.setPaymentId("");
    java.lang.String str23 = payment4.getPaymentId();
    UseCase1And4.business.User user24 = null;
    payment4.setUser(user24);
    payment4.setRefunded(false);
    java.lang.String str28 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test086"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setPaymentId("");
    payment4.setAmount((double)' ');
    boolean b9 = payment4.getRefunded();
    payment4.setAmount((double)(byte)1);
    payment4.setAmount((double)(-1.0f));
    payment4.setAmount((-1.0d));
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    java.lang.String str18 = payment4.getPaymentId();
    payment4.setPaymentId("");
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test087"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(short)10, false);
    payment4.setAmount((double)'4');
    UseCase1And4.business.User user7 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test088"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 10.0d, false);
    payment4.setAmount((double)(-1));
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(true);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test089"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)1L, false);
    double d5 = payment4.getAmount();
    java.lang.String str6 = payment4.getPaymentId();
    java.lang.String str7 = payment4.getPaymentId();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setRefunded(false);
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test090"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    payment4.setAmount((double)(short)0);
    boolean b11 = payment4.getRefunded();
    double d12 = payment4.getAmount();
    double d13 = payment4.getAmount();
    boolean b14 = payment4.getRefunded();
    payment4.setPaymentId("");
    java.lang.String str17 = payment4.getPaymentId();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test091"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setPaymentId("");
    payment4.setAmount((double)' ');
    payment4.setAmount((double)(-1));
    java.lang.String str11 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test092"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    boolean b13 = payment4.getRefunded();
    payment4.setRefunded(true);
    boolean b16 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test093"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    boolean b5 = payment4.getRefunded();
    UseCase1And4.business.User user6 = payment4.getUser();
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test094"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setPaymentId("hi!");
    double d11 = payment4.getAmount();
    payment4.setAmount((double)' ');
    boolean b14 = payment4.getRefunded();
    payment4.setRefunded(false);
    double d17 = payment4.getAmount();
    boolean b18 = payment4.getRefunded();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test095"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    payment4.setAmount((double)10.0f);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = payment4.getUser();
    payment4.setPaymentId("hi!");
    double d18 = payment4.getAmount();
    boolean b19 = payment4.getRefunded();
    UseCase1And4.business.User user20 = null;
    payment4.setUser(user20);
    UseCase1And4.business.User user22 = null;
    payment4.setUser(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test096"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    payment4.setPaymentId("");
    java.lang.String str7 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setRefunded(true);
    UseCase1And4.business.User user12 = payment4.getUser();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test097"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    UseCase1And4.business.User user8 = payment4.getUser();
    boolean b9 = payment4.getRefunded();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    double d12 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 97.0d);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test098"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10, false);
    double d5 = payment4.getAmount();
    payment4.setAmount((double)(byte)-1);
    java.lang.String str8 = payment4.getPaymentId();
    double d9 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test099"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(true);
    payment4.setRefunded(true);
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    payment4.setPaymentId("hi!");
    java.lang.String str21 = payment4.getPaymentId();
    payment4.setRefunded(false);
    UseCase1And4.business.User user24 = null;
    payment4.setUser(user24);
    double d26 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 0.0d);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test100"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 52.0d, false);
    double d5 = payment4.getAmount();
    double d6 = payment4.getAmount();
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setPaymentId("");
    double d11 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 52.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 52.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 52.0d);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test101"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    double d11 = payment4.getAmount();
    UseCase1And4.business.User user12 = payment4.getUser();
    boolean b13 = payment4.getRefunded();
    double d14 = payment4.getAmount();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 10.0d);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test102"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)10.0f, false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(false);
    java.lang.String str11 = payment4.getPaymentId();
    payment4.setAmount((double)(-1L));
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test103"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    boolean b9 = payment4.getRefunded();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    UseCase1And4.business.User user12 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    java.lang.String str17 = payment4.getPaymentId();
    payment4.setAmount((double)0.0f);
    UseCase1And4.business.User user20 = payment4.getUser();
    payment4.setAmount((double)10L);
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test104"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)1, true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    UseCase1And4.business.User user9 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test105"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    boolean b8 = payment4.getRefunded();
    payment4.setAmount(0.0d);
    java.lang.String str11 = payment4.getPaymentId();
    boolean b12 = payment4.getRefunded();
    payment4.setAmount((double)1);
    UseCase1And4.business.User user15 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test106"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setRefunded(true);
    java.lang.String str11 = payment4.getPaymentId();
    java.lang.String str12 = payment4.getPaymentId();
    double d13 = payment4.getAmount();
    payment4.setRefunded(true);
    boolean b16 = payment4.getRefunded();
    double d17 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 100.0d);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test107"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    boolean b11 = payment4.getRefunded();
    UseCase1And4.business.User user12 = payment4.getUser();
    double d13 = payment4.getAmount();
    double d14 = payment4.getAmount();
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 1.0d);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test108"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    boolean b9 = payment4.getRefunded();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    UseCase1And4.business.User user12 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    boolean b17 = payment4.getRefunded();
    UseCase1And4.business.User user18 = payment4.getUser();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test109"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, true);
    payment4.setPaymentId("");
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setPaymentId("");
    UseCase1And4.business.User user11 = payment4.getUser();
    UseCase1And4.business.User user12 = payment4.getUser();
    payment4.setPaymentId("hi!");
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test110"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setRefunded(false);
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setRefunded(true);
    double d17 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 10.0d);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test111"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)'4');
    payment4.setPaymentId("");
    payment4.setRefunded(true);
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    boolean b14 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test112"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    double d15 = payment4.getAmount();
    payment4.setAmount(0.0d);
    payment4.setRefunded(false);
    double d20 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    boolean b23 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test113"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(true);
    java.lang.String str11 = payment4.getPaymentId();
    UseCase1And4.business.User user12 = payment4.getUser();
    payment4.setAmount(0.0d);
    payment4.setAmount(35.0d);
    UseCase1And4.business.User user17 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test114"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    payment4.setPaymentId("hi!");
    payment4.setAmount(0.0d);
    double d9 = payment4.getAmount();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    payment4.setRefunded(true);
    UseCase1And4.business.User user14 = payment4.getUser();
    UseCase1And4.business.User user15 = payment4.getUser();
    UseCase1And4.business.User user16 = payment4.getUser();
    java.lang.String str17 = payment4.getPaymentId();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test115"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    double d9 = payment4.getAmount();
    UseCase1And4.business.User user10 = payment4.getUser();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test116"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    java.lang.String str8 = payment4.getPaymentId();
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setPaymentId("hi!");
    java.lang.String str12 = payment4.getPaymentId();
    payment4.setPaymentId("");
    double d15 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 10.0d);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test117"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 100.0d, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    double d6 = payment4.getAmount();
    payment4.setRefunded(true);
    java.lang.String str9 = payment4.getPaymentId();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    double d12 = payment4.getAmount();
    UseCase1And4.business.User user13 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test118"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    boolean b15 = payment4.getRefunded();
    payment4.setRefunded(true);
    UseCase1And4.business.User user18 = payment4.getUser();
    payment4.setPaymentId("");
    java.lang.String str21 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test119"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    boolean b8 = payment4.getRefunded();
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    double d13 = payment4.getAmount();
    double d14 = payment4.getAmount();
    boolean b15 = payment4.getRefunded();
    payment4.setAmount((double)(-1));
    double d18 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user21 = payment4.getUser();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test120"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)100.0f, true);
    boolean b5 = payment4.getRefunded();
    java.lang.String str6 = payment4.getPaymentId();
    payment4.setPaymentId("");
    java.lang.String str9 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test121"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test122"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    double d7 = payment4.getAmount();
    payment4.setRefunded(false);
    boolean b10 = payment4.getRefunded();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test123"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)(byte)-1);
    boolean b11 = payment4.getRefunded();
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test124"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    java.lang.String str10 = payment4.getPaymentId();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    java.lang.String str13 = payment4.getPaymentId();
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test125"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setRefunded(false);
    double d18 = payment4.getAmount();
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    payment4.setPaymentId("");
    boolean b23 = payment4.getRefunded();
    UseCase1And4.business.User user24 = null;
    payment4.setUser(user24);
    double d26 = payment4.getAmount();
    payment4.setAmount(100.0d);
    UseCase1And4.business.User user29 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user29);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test126"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    payment4.setAmount((-1.0d));
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    java.lang.String str12 = payment4.getPaymentId();
    double d13 = payment4.getAmount();
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test127"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, true);
    double d5 = payment4.getAmount();
    payment4.setAmount((double)0L);
    java.lang.String str8 = payment4.getPaymentId();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test128"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setPaymentId("hi!");
    double d11 = payment4.getAmount();
    payment4.setAmount((double)' ');
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setAmount((double)(short)100);
    payment4.setPaymentId("hi!");
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test129"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    UseCase1And4.business.User user17 = payment4.getUser();
    UseCase1And4.business.User user18 = null;
    payment4.setUser(user18);
    payment4.setAmount((double)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test130"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 1.0d, false);
    payment4.setRefunded(true);
    double d7 = payment4.getAmount();
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test131"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setPaymentId("");
    payment4.setAmount((double)' ');
    payment4.setPaymentId("hi!");
    payment4.setRefunded(true);
    UseCase1And4.business.User user13 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test132"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    payment4.setAmount((double)(-1L));
    boolean b10 = payment4.getRefunded();
    double d11 = payment4.getAmount();
    double d12 = payment4.getAmount();
    payment4.setAmount(32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == (-1.0d));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test133"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(short)10, false);
    payment4.setRefunded(false);
    double d7 = payment4.getAmount();
    payment4.setAmount((double)(-1L));
    payment4.setPaymentId("");
    double d12 = payment4.getAmount();
    payment4.setAmount(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == (-1.0d));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test134"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setAmount(10.0d);
    java.lang.String str19 = payment4.getPaymentId();
    boolean b20 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test135"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    double d7 = payment4.getAmount();
    boolean b8 = payment4.getRefunded();
    payment4.setAmount((double)(short)10);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test136"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (-1.0d), true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test137"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    payment4.setAmount((-1.0d));
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    java.lang.String str12 = payment4.getPaymentId();
    payment4.setAmount(1.0d);
    UseCase1And4.business.User user15 = payment4.getUser();
    double d16 = payment4.getAmount();
    boolean b17 = payment4.getRefunded();
    UseCase1And4.business.User user18 = null;
    payment4.setUser(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test138"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    boolean b11 = payment4.getRefunded();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test139"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)10.0f, false);
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)(short)100);
    double d9 = payment4.getAmount();
    java.lang.String str10 = payment4.getPaymentId();
    UseCase1And4.business.User user11 = payment4.getUser();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test140"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, false);
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test141"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setRefunded(false);
    java.lang.String str8 = payment4.getPaymentId();
    payment4.setAmount((double)(-1));
    UseCase1And4.business.User user11 = payment4.getUser();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    double d14 = payment4.getAmount();
    payment4.setAmount(1.0d);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == (-1.0d));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test142"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    double d15 = payment4.getAmount();
    payment4.setAmount(0.0d);
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    payment4.setRefunded(false);
    UseCase1And4.business.User user24 = null;
    payment4.setUser(user24);
    UseCase1And4.business.User user26 = null;
    payment4.setUser(user26);
    double d28 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 0.0d);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test143"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    payment4.setPaymentId("");
    boolean b10 = payment4.getRefunded();
    payment4.setAmount((double)'#');
    UseCase1And4.business.User user13 = payment4.getUser();
    java.lang.String str14 = payment4.getPaymentId();
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setRefunded(true);
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    double d21 = payment4.getAmount();
    UseCase1And4.business.User user22 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 35.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test144"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)0L, true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    payment4.setAmount((double)1.0f);
    payment4.setAmount((double)'4');

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test145"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 1.0d, false);
    payment4.setRefunded(true);
    double d7 = payment4.getAmount();
    boolean b8 = payment4.getRefunded();
    payment4.setRefunded(false);
    java.lang.String str11 = payment4.getPaymentId();
    java.lang.String str12 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test146"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)'a', false);
    boolean b5 = payment4.getRefunded();
    java.lang.String str6 = payment4.getPaymentId();
    UseCase1And4.business.User user7 = payment4.getUser();
    boolean b8 = payment4.getRefunded();
    java.lang.String str9 = payment4.getPaymentId();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    java.lang.String str12 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test147"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    double d6 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)(-1L));
    double d11 = payment4.getAmount();
    java.lang.String str12 = payment4.getPaymentId();
    boolean b13 = payment4.getRefunded();
    payment4.setAmount(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test148"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    double d9 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    java.lang.String str12 = payment4.getPaymentId();
    UseCase1And4.business.User user13 = payment4.getUser();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    UseCase1And4.business.User user16 = payment4.getUser();
    boolean b17 = payment4.getRefunded();
    java.lang.String str18 = payment4.getPaymentId();
    payment4.setAmount((double)(byte)10);
    boolean b21 = payment4.getRefunded();
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user28 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user28);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test149"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(short)1, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    UseCase1And4.business.User user6 = payment4.getUser();
    UseCase1And4.business.User user7 = payment4.getUser();
    java.lang.String str8 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test150"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(-1), true);
    double d5 = payment4.getAmount();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-1.0d));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test151"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)10, false);
    boolean b5 = payment4.getRefunded();
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    UseCase1And4.business.User user14 = payment4.getUser();
    double d15 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 10.0d);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test152"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)-1, false);
    boolean b5 = payment4.getRefunded();
    double d6 = payment4.getAmount();
    payment4.setRefunded(false);
    payment4.setRefunded(false);
    double d11 = payment4.getAmount();
    double d12 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == (-1.0d));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test153"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, false);
    payment4.setAmount((double)(byte)10);
    payment4.setAmount((double)(-1));
    payment4.setPaymentId("");
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    payment4.setPaymentId("");
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    boolean b19 = payment4.getRefunded();
    payment4.setPaymentId("");
    payment4.setAmount(0.0d);
    java.lang.String str24 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test154"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(byte)10, false);
    double d5 = payment4.getAmount();
    payment4.setPaymentId("");
    payment4.setAmount((double)(byte)0);
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    java.lang.String str12 = payment4.getPaymentId();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test155"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, true);
    payment4.setPaymentId("");
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(false);
    payment4.setAmount((double)1);
    UseCase1And4.business.User user13 = payment4.getUser();
    double d14 = payment4.getAmount();
    double d15 = payment4.getAmount();
    double d16 = payment4.getAmount();
    java.lang.String str17 = payment4.getPaymentId();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test156"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)100, false);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)100.0f);
    payment4.setRefunded(true);
    java.lang.String str10 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test157"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setRefunded(false);
    double d18 = payment4.getAmount();
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    double d21 = payment4.getAmount();
    payment4.setAmount((double)'a');
    payment4.setAmount(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 1.0d);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test158"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    payment4.setPaymentId("");
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    java.lang.String str11 = payment4.getPaymentId();
    UseCase1And4.business.User user12 = payment4.getUser();
    UseCase1And4.business.User user13 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test159"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    boolean b11 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("hi!");
    payment4.setRefunded(false);
    payment4.setAmount((double)1);
    payment4.setAmount((double)(-1L));
    payment4.setRefunded(true);
    payment4.setAmount((double)10.0f);
    payment4.setAmount((double)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test160"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setAmount((double)(short)10);
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    UseCase1And4.business.User user17 = payment4.getUser();
    boolean b18 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test161"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    double d15 = payment4.getAmount();
    payment4.setPaymentId("");
    double d18 = payment4.getAmount();
    payment4.setAmount((double)10.0f);
    UseCase1And4.business.User user21 = payment4.getUser();
    double d22 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 10.0d);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test162"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    boolean b11 = payment4.getRefunded();
    payment4.setAmount((double)'a');
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setAmount((double)(byte)100);
    boolean b17 = payment4.getRefunded();
    double d18 = payment4.getAmount();
    UseCase1And4.business.User user19 = payment4.getUser();
    double d20 = payment4.getAmount();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 100.0d);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test163"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = payment4.getUser();
    payment4.setPaymentId("");
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    payment4.setAmount((double)(short)-1);
    boolean b20 = payment4.getRefunded();
    boolean b21 = payment4.getRefunded();
    UseCase1And4.business.User user22 = payment4.getUser();
    java.lang.String str23 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test164"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, false);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test165"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)100L, false);
    payment4.setPaymentId("hi!");
    double d7 = payment4.getAmount();
    UseCase1And4.business.User user8 = payment4.getUser();
    double d9 = payment4.getAmount();
    boolean b10 = payment4.getRefunded();
    double d11 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 100.0d);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test166"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, false);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    payment4.setRefunded(false);
    payment4.setAmount(1.0d);
    java.lang.String str11 = payment4.getPaymentId();
    UseCase1And4.business.User user12 = payment4.getUser();
    payment4.setRefunded(false);
    java.lang.String str15 = payment4.getPaymentId();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test167"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)-1, false);
    boolean b5 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test168"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, true);
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    boolean b9 = payment4.getRefunded();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test169"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setPaymentId("");
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test170"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setRefunded(false);
    payment4.setAmount((double)(-1.0f));
    boolean b20 = payment4.getRefunded();
    boolean b21 = payment4.getRefunded();
    payment4.setAmount((double)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test171"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(true);
    payment4.setRefunded(true);
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user15 = payment4.getUser();
    payment4.setAmount((double)10);
    java.lang.String str18 = payment4.getPaymentId();
    double d19 = payment4.getAmount();
    UseCase1And4.business.User user20 = null;
    payment4.setUser(user20);
    double d22 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 10.0d);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test172"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    java.lang.String str11 = payment4.getPaymentId();
    java.lang.String str12 = payment4.getPaymentId();
    payment4.setPaymentId("");
    double d15 = payment4.getAmount();
    double d16 = payment4.getAmount();
    UseCase1And4.business.User user17 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test173"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    boolean b11 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("hi!");
    java.lang.String str16 = payment4.getPaymentId();
    payment4.setRefunded(true);
    double d19 = payment4.getAmount();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 1.0d);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test174"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10, true);
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test175"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    double d6 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    double d9 = payment4.getAmount();
    payment4.setAmount((-1.0d));
    boolean b12 = payment4.getRefunded();
    UseCase1And4.business.User user13 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test176"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    double d15 = payment4.getAmount();
    payment4.setPaymentId("");
    double d18 = payment4.getAmount();
    payment4.setAmount((double)10.0f);
    UseCase1And4.business.User user21 = null;
    payment4.setUser(user21);
    java.lang.String str23 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test177"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    double d9 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    double d14 = payment4.getAmount();
    boolean b15 = payment4.getRefunded();
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test178"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)(short)-1);
    double d16 = payment4.getAmount();
    payment4.setRefunded(false);
    payment4.setAmount((double)(short)-1);
    boolean b21 = payment4.getRefunded();
    boolean b22 = payment4.getRefunded();
    double d23 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == (-1.0d));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test179"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(true);
    UseCase1And4.business.User user10 = payment4.getUser();
    payment4.setRefunded(false);
    double d13 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 1.0d);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test180"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    java.lang.String str11 = payment4.getPaymentId();
    java.lang.String str12 = payment4.getPaymentId();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setRefunded(true);
    boolean b17 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test181"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    boolean b7 = payment4.getRefunded();
    boolean b8 = payment4.getRefunded();
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setRefunded(false);
    payment4.setRefunded(false);
    UseCase1And4.business.User user14 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test182"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = payment4.getUser();
    payment4.setRefunded(false);
    java.lang.String str16 = payment4.getPaymentId();
    java.lang.String str17 = payment4.getPaymentId();
    boolean b18 = payment4.getRefunded();
    java.lang.String str19 = payment4.getPaymentId();
    UseCase1And4.business.User user20 = null;
    payment4.setUser(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test183"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    double d7 = payment4.getAmount();
    boolean b8 = payment4.getRefunded();
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setAmount((double)100L);
    java.lang.String str12 = payment4.getPaymentId();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setPaymentId("");
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    double d19 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 100.0d);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test184"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, false);
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    payment4.setRefunded(true);
    java.lang.String str11 = payment4.getPaymentId();
    UseCase1And4.business.User user12 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test185"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    java.lang.String str11 = payment4.getPaymentId();
    java.lang.String str12 = payment4.getPaymentId();
    java.lang.String str13 = payment4.getPaymentId();
    double d14 = payment4.getAmount();
    double d15 = payment4.getAmount();
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    UseCase1And4.business.User user18 = payment4.getUser();
    java.lang.String str19 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test186"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    double d6 = payment4.getAmount();
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    payment4.setAmount((double)100);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user14 = payment4.getUser();
    UseCase1And4.business.User user15 = payment4.getUser();
    java.lang.String str16 = payment4.getPaymentId();
    UseCase1And4.business.User user17 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test187"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    payment4.setAmount((double)(short)100);
    double d17 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 100.0d);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test188"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    double d7 = payment4.getAmount();
    boolean b8 = payment4.getRefunded();
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setAmount((double)100L);
    UseCase1And4.business.User user12 = payment4.getUser();
    java.lang.String str13 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test189"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, false);
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    boolean b9 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test190"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    payment4.setRefunded(false);
    boolean b14 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test191"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    java.lang.String str8 = payment4.getPaymentId();
    payment4.setAmount((double)100L);
    java.lang.String str11 = payment4.getPaymentId();
    boolean b12 = payment4.getRefunded();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test192"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)100.0f, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setPaymentId("");
    boolean b8 = payment4.getRefunded();
    payment4.setAmount((double)100.0f);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    UseCase1And4.business.User user13 = payment4.getUser();
    double d14 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 100.0d);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test193"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    java.lang.String str9 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test194"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setRefunded(false);
    boolean b17 = payment4.getRefunded();
    payment4.setRefunded(false);
    boolean b20 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test195"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    double d7 = payment4.getAmount();
    boolean b8 = payment4.getRefunded();
    payment4.setPaymentId("");
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user13 = payment4.getUser();
    payment4.setAmount((double)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test196"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1.0f), false);
    payment4.setRefunded(false);
    boolean b7 = payment4.getRefunded();
    payment4.setAmount((double)(byte)-1);
    double d10 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-1.0d));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test197"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    double d13 = payment4.getAmount();
    payment4.setRefunded(false);
    java.lang.String str16 = payment4.getPaymentId();
    java.lang.String str17 = payment4.getPaymentId();
    payment4.setPaymentId("");
    UseCase1And4.business.User user20 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test198"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("hi!");
    boolean b13 = payment4.getRefunded();
    double d14 = payment4.getAmount();
    java.lang.String str15 = payment4.getPaymentId();
    double d16 = payment4.getAmount();
    java.lang.String str17 = payment4.getPaymentId();
    java.lang.String str18 = payment4.getPaymentId();
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test199"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setAmount((double)(short)10);
    UseCase1And4.business.User user10 = payment4.getUser();
    boolean b11 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test200"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(short)1, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    UseCase1And4.business.User user6 = payment4.getUser();
    double d7 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test201"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(short)1, false);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setAmount((double)100);
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    boolean b14 = payment4.getRefunded();
    boolean b15 = payment4.getRefunded();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test202"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(short)1, false);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setRefunded(true);
    payment4.setPaymentId("");
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    double d16 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    double d19 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 1.0d);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test203"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    boolean b7 = payment4.getRefunded();
    double d8 = payment4.getAmount();
    payment4.setRefunded(true);
    java.lang.String str11 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    double d14 = payment4.getAmount();
    payment4.setAmount((double)(byte)100);
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 10.0d);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test204"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)0L, false);
    boolean b5 = payment4.getRefunded();
    boolean b6 = payment4.getRefunded();
    payment4.setAmount((double)(-1));
    double d9 = payment4.getAmount();
    double d10 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    payment4.setRefunded(true);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-1.0d));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test205"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)100, false);
    double d5 = payment4.getAmount();
    payment4.setAmount(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 100.0d);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test206"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 10.0d, false);
    payment4.setPaymentId("hi!");
    java.lang.String str7 = payment4.getPaymentId();
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test207"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)10L, false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(false);
    payment4.setAmount((double)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test208"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setPaymentId("hi!");
    double d18 = payment4.getAmount();
    payment4.setRefunded(true);
    payment4.setAmount((double)' ');
    double d23 = payment4.getAmount();
    boolean b24 = payment4.getRefunded();
    UseCase1And4.business.User user25 = payment4.getUser();
    UseCase1And4.business.User user26 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user26);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test209"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setPaymentId("hi!");
    double d12 = payment4.getAmount();
    UseCase1And4.business.User user13 = payment4.getUser();
    boolean b14 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test210"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    boolean b9 = payment4.getRefunded();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    UseCase1And4.business.User user12 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    java.lang.String str19 = payment4.getPaymentId();
    payment4.setPaymentId("");
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    payment4.setAmount((double)100);
    payment4.setRefunded(true);
    UseCase1And4.business.User user30 = null;
    payment4.setUser(user30);
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test211"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    boolean b15 = payment4.getRefunded();
    payment4.setRefunded(true);
    boolean b18 = payment4.getRefunded();
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    double d23 = payment4.getAmount();
    payment4.setAmount(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 1.0d);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test212"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setRefunded(true);
    double d7 = payment4.getAmount();
    double d8 = payment4.getAmount();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    double d11 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 97.0d);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test213"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1, true);
    java.lang.String str5 = payment4.getPaymentId();
    boolean b6 = payment4.getRefunded();
    java.lang.String str7 = payment4.getPaymentId();
    payment4.setRefunded(true);
    double d10 = payment4.getAmount();
    payment4.setAmount((double)(-1));
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setAmount(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 1.0d);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test214"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    double d8 = payment4.getAmount();
    UseCase1And4.business.User user9 = payment4.getUser();
    double d10 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-1.0d));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test215"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)100, false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(false);
    boolean b10 = payment4.getRefunded();
    boolean b11 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test216"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 10.0d, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    payment4.setAmount(32.0d);
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test217"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)10.0f, true);
    boolean b5 = payment4.getRefunded();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test218"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    payment4.setRefunded(true);
    boolean b7 = payment4.getRefunded();
    java.lang.String str8 = payment4.getPaymentId();
    UseCase1And4.business.User user9 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test219"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setPaymentId("hi!");
    double d11 = payment4.getAmount();
    payment4.setAmount((double)' ');
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    java.lang.String str19 = payment4.getPaymentId();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test220"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setRefunded(false);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    payment4.setPaymentId("hi!");
    java.lang.String str21 = payment4.getPaymentId();
    payment4.setPaymentId("");
    payment4.setPaymentId("");
    payment4.setAmount((double)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test221"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)100, false);
    payment4.setAmount((double)(byte)10);
    double d7 = payment4.getAmount();
    double d8 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test222"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, false);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    payment4.setRefunded(false);
    payment4.setAmount(1.0d);
    payment4.setPaymentId("");
    boolean b13 = payment4.getRefunded();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test223"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, false);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    payment4.setRefunded(false);
    payment4.setAmount(1.0d);
    java.lang.String str11 = payment4.getPaymentId();
    UseCase1And4.business.User user12 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = payment4.getUser();
    double d16 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test224"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setPaymentId("");
    double d10 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)100L);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user17 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test225"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)(short)1);
    UseCase1And4.business.User user21 = null;
    payment4.setUser(user21);
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test226"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1, true);
    java.lang.String str5 = payment4.getPaymentId();
    boolean b6 = payment4.getRefunded();
    java.lang.String str7 = payment4.getPaymentId();
    payment4.setRefunded(true);
    double d10 = payment4.getAmount();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 1.0d);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test227"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), false);
    double d5 = payment4.getAmount();
    java.lang.String str6 = payment4.getPaymentId();
    double d7 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    boolean b10 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test228"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    double d15 = payment4.getAmount();
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    payment4.setAmount((double)0.0f);
    payment4.setPaymentId("");
    double d22 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test229"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    payment4.setRefunded(false);
    boolean b13 = payment4.getRefunded();
    payment4.setPaymentId("");
    java.lang.String str16 = payment4.getPaymentId();
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test230"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setRefunded(false);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    payment4.setAmount((double)1);
    payment4.setAmount((double)(byte)10);
    boolean b23 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test231"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)100, false);
    payment4.setPaymentId("hi!");
    java.lang.String str7 = payment4.getPaymentId();
    java.lang.String str8 = payment4.getPaymentId();
    boolean b9 = payment4.getRefunded();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test232"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 52.0d, false);
    payment4.setRefunded(true);
    payment4.setAmount((double)(short)-1);
    boolean b9 = payment4.getRefunded();
    double d10 = payment4.getAmount();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-1.0d));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test233"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, false);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test234"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    java.lang.String str8 = payment4.getPaymentId();
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setAmount(1.0d);
    java.lang.String str12 = payment4.getPaymentId();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test235"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    payment4.setAmount((double)(short)0);
    double d11 = payment4.getAmount();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    java.lang.String str14 = payment4.getPaymentId();
    java.lang.String str15 = payment4.getPaymentId();
    UseCase1And4.business.User user16 = payment4.getUser();
    UseCase1And4.business.User user17 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test236"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    boolean b7 = payment4.getRefunded();
    double d8 = payment4.getAmount();
    boolean b9 = payment4.getRefunded();
    UseCase1And4.business.User user10 = payment4.getUser();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    payment4.setPaymentId("");
    double d15 = payment4.getAmount();
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 10.0d);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test237"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    payment4.setRefunded(false);
    boolean b13 = payment4.getRefunded();
    payment4.setPaymentId("");
    java.lang.String str16 = payment4.getPaymentId();
    UseCase1And4.business.User user17 = payment4.getUser();
    java.lang.String str18 = payment4.getPaymentId();
    payment4.setPaymentId("");
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test238"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)'#', true);
    double d5 = payment4.getAmount();
    UseCase1And4.business.User user6 = payment4.getUser();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setAmount((-1.0d));
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 35.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test239"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    double d14 = payment4.getAmount();
    UseCase1And4.business.User user15 = payment4.getUser();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test240"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setPaymentId("hi!");
    double d12 = payment4.getAmount();
    UseCase1And4.business.User user13 = payment4.getUser();
    payment4.setPaymentId("");
    UseCase1And4.business.User user16 = payment4.getUser();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test241"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    payment4.setPaymentId("hi!");
    boolean b9 = payment4.getRefunded();
    double d10 = payment4.getAmount();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    boolean b13 = payment4.getRefunded();
    payment4.setAmount((double)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test242"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 97.0d, true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    payment4.setAmount((double)(-1.0f));
    payment4.setPaymentId("");
    UseCase1And4.business.User user11 = payment4.getUser();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    payment4.setAmount((double)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test243"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    payment4.setPaymentId("");
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setAmount((double)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test244"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    boolean b8 = payment4.getRefunded();
    payment4.setAmount(0.0d);
    boolean b11 = payment4.getRefunded();
    java.lang.String str12 = payment4.getPaymentId();
    payment4.setAmount((double)(byte)100);
    java.lang.String str15 = payment4.getPaymentId();
    boolean b16 = payment4.getRefunded();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test245"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = payment4.getUser();
    UseCase1And4.business.User user6 = payment4.getUser();
    payment4.setAmount((double)(byte)10);
    boolean b9 = payment4.getRefunded();
    boolean b10 = payment4.getRefunded();
    java.lang.String str11 = payment4.getPaymentId();
    boolean b12 = payment4.getRefunded();
    boolean b13 = payment4.getRefunded();
    payment4.setPaymentId("");
    boolean b16 = payment4.getRefunded();
    boolean b17 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test246"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setRefunded(true);
    boolean b18 = payment4.getRefunded();
    java.lang.String str19 = payment4.getPaymentId();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test247"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    double d6 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("hi!");
    double d11 = payment4.getAmount();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test248"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    boolean b15 = payment4.getRefunded();
    payment4.setRefunded(true);
    UseCase1And4.business.User user18 = payment4.getUser();
    java.lang.String str19 = payment4.getPaymentId();
    java.lang.String str20 = payment4.getPaymentId();
    payment4.setAmount((double)(byte)1);
    boolean b23 = payment4.getRefunded();
    UseCase1And4.business.User user24 = null;
    payment4.setUser(user24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test249"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setRefunded(false);
    double d18 = payment4.getAmount();
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    UseCase1And4.business.User user21 = null;
    payment4.setUser(user21);
    payment4.setPaymentId("");
    payment4.setRefunded(true);
    UseCase1And4.business.User user27 = null;
    payment4.setUser(user27);
    java.lang.String str29 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test250"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 1.0d, false);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = payment4.getUser();
    java.lang.String str7 = payment4.getPaymentId();
    payment4.setAmount((double)(byte)10);
    payment4.setAmount((double)100L);
    UseCase1And4.business.User user12 = payment4.getUser();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    boolean b15 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test251"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(byte)10, false);
    double d5 = payment4.getAmount();
    double d6 = payment4.getAmount();
    payment4.setRefunded(false);
    double d9 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test252"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    double d9 = payment4.getAmount();
    UseCase1And4.business.User user10 = payment4.getUser();
    java.lang.String str11 = payment4.getPaymentId();
    boolean b12 = payment4.getRefunded();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    double d15 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == (-1.0d));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test253"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)0.0f, false);
    payment4.setPaymentId("");
    java.lang.String str7 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setAmount(97.0d);
    boolean b12 = payment4.getRefunded();
    double d13 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 97.0d);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test254"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, true);
    double d5 = payment4.getAmount();
    payment4.setAmount((double)0L);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    payment4.setAmount((double)' ');
    boolean b14 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test255"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    java.lang.String str13 = payment4.getPaymentId();
    payment4.setRefunded(false);
    double d16 = payment4.getAmount();
    boolean b17 = payment4.getRefunded();
    payment4.setRefunded(false);
    boolean b20 = payment4.getRefunded();
    payment4.setRefunded(true);
    payment4.setAmount((double)(byte)1);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test256"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(byte)10, false);
    double d5 = payment4.getAmount();
    payment4.setPaymentId("");
    payment4.setPaymentId("");
    UseCase1And4.business.User user10 = payment4.getUser();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test257"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    java.lang.String str7 = payment4.getPaymentId();
    double d8 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    payment4.setAmount((double)100);
    payment4.setRefunded(true);
    payment4.setAmount(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test258"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)0L, false);
    UseCase1And4.business.User user5 = payment4.getUser();
    java.lang.String str6 = payment4.getPaymentId();
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test259"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setRefunded(false);
    boolean b17 = payment4.getRefunded();
    payment4.setRefunded(true);
    UseCase1And4.business.User user20 = payment4.getUser();
    java.lang.String str21 = payment4.getPaymentId();
    UseCase1And4.business.User user22 = payment4.getUser();
    double d23 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 1.0d);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test260"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setAmount(0.0d);
    payment4.setAmount((double)1L);
    boolean b15 = payment4.getRefunded();
    boolean b16 = payment4.getRefunded();
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test261"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 1.0d, true);
    boolean b5 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test262"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    double d6 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)(short)-1);
    payment4.setAmount((double)(byte)0);
    UseCase1And4.business.User user13 = payment4.getUser();
    java.lang.String str14 = payment4.getPaymentId();
    double d15 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test263"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    boolean b8 = payment4.getRefunded();
    payment4.setRefunded(false);
    double d11 = payment4.getAmount();
    UseCase1And4.business.User user12 = payment4.getUser();
    double d13 = payment4.getAmount();
    UseCase1And4.business.User user14 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test264"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)10, false);
    payment4.setRefunded(false);
    boolean b7 = payment4.getRefunded();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test265"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)10L, false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user7 = payment4.getUser();
    java.lang.String str8 = payment4.getPaymentId();
    payment4.setPaymentId("");
    double d11 = payment4.getAmount();
    payment4.setPaymentId("");
    payment4.setAmount((double)(short)1);
    double d16 = payment4.getAmount();
    double d17 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 1.0d);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test266"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    double d9 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    double d14 = payment4.getAmount();
    boolean b15 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test267"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, false);
    payment4.setAmount((double)(byte)10);
    payment4.setAmount((double)(-1));
    payment4.setPaymentId("");
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    payment4.setPaymentId("");
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setAmount((double)100);
    payment4.setRefunded(false);
    double d21 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 100.0d);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test268"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    java.lang.String str17 = payment4.getPaymentId();
    UseCase1And4.business.User user18 = null;
    payment4.setUser(user18);
    UseCase1And4.business.User user20 = null;
    payment4.setUser(user20);
    double d22 = payment4.getAmount();
    payment4.setAmount((double)(-1L));
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 1.0d);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test269"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    UseCase1And4.business.User user10 = payment4.getUser();
    payment4.setAmount((double)(short)0);
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    UseCase1And4.business.User user15 = payment4.getUser();
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    java.lang.String str18 = payment4.getPaymentId();
    UseCase1And4.business.User user19 = payment4.getUser();
    UseCase1And4.business.User user20 = payment4.getUser();
    UseCase1And4.business.User user21 = null;
    payment4.setUser(user21);
    payment4.setAmount((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test270"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)'4');
    payment4.setPaymentId("");
    java.lang.String str10 = payment4.getPaymentId();
    payment4.setPaymentId("");
    java.lang.String str13 = payment4.getPaymentId();
    boolean b14 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test271"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    payment4.setAmount((double)(-1L));
    boolean b10 = payment4.getRefunded();
    boolean b11 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user14 = payment4.getUser();
    java.lang.String str15 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test272"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)100, false);
    payment4.setAmount((double)(short)100);
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    java.lang.String str11 = payment4.getPaymentId();
    double d12 = payment4.getAmount();
    payment4.setRefunded(true);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setAmount(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 100.0d);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test273"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = payment4.getUser();
    boolean b14 = payment4.getRefunded();
    payment4.setAmount(0.0d);
    java.lang.String str17 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test274"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 1.0d, false);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = payment4.getUser();
    payment4.setAmount((double)10);
    double d9 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)(byte)-1);
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setAmount((double)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test275"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, true);
    payment4.setPaymentId("");
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(false);
    payment4.setAmount((double)1);
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    UseCase1And4.business.User user15 = payment4.getUser();
    payment4.setAmount(1.0d);
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test276"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, false);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    payment4.setRefunded(false);
    UseCase1And4.business.User user9 = payment4.getUser();
    java.lang.String str10 = payment4.getPaymentId();
    java.lang.String str11 = payment4.getPaymentId();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setPaymentId("");
    UseCase1And4.business.User user19 = payment4.getUser();
    double d20 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 1.0d);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test277"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    boolean b8 = payment4.getRefunded();
    payment4.setAmount(0.0d);
    double d11 = payment4.getAmount();
    payment4.setRefunded(true);
    boolean b14 = payment4.getRefunded();
    java.lang.String str15 = payment4.getPaymentId();
    java.lang.String str16 = payment4.getPaymentId();
    UseCase1And4.business.User user17 = payment4.getUser();
    payment4.setRefunded(true);
    boolean b20 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test278"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(byte)10, false);
    double d5 = payment4.getAmount();
    UseCase1And4.business.User user6 = payment4.getUser();
    payment4.setAmount(0.0d);
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    boolean b13 = payment4.getRefunded();
    boolean b14 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test279"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setRefunded(true);
    double d9 = payment4.getAmount();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.0d);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test280"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    java.lang.String str9 = payment4.getPaymentId();
    payment4.setAmount(10.0d);
    payment4.setPaymentId("hi!");
    double d14 = payment4.getAmount();
    double d15 = payment4.getAmount();
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    java.lang.String str18 = payment4.getPaymentId();
    java.lang.String str19 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test281"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, true);
    payment4.setPaymentId("");
    boolean b7 = payment4.getRefunded();
    payment4.setAmount((double)1.0f);
    payment4.setRefunded(true);
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    payment4.setAmount(97.0d);
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    payment4.setAmount((double)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test282"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    payment4.setPaymentId("");
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setPaymentId("hi!");
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test283"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    double d5 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user8 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test284"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)' ', false);
    boolean b5 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test285"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 35.0d, false);
    double d5 = payment4.getAmount();
    UseCase1And4.business.User user6 = payment4.getUser();
    payment4.setPaymentId("hi!");
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 35.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test286"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    boolean b13 = payment4.getRefunded();
    payment4.setRefunded(true);
    java.lang.String str16 = payment4.getPaymentId();
    UseCase1And4.business.User user17 = payment4.getUser();
    boolean b18 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test287"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    double d11 = payment4.getAmount();
    payment4.setRefunded(true);
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    payment4.setAmount((double)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test288"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setRefunded(true);
    UseCase1And4.business.User user10 = payment4.getUser();
    payment4.setAmount((double)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test289"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)1, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    boolean b6 = payment4.getRefunded();
    payment4.setAmount((double)(byte)100);
    payment4.setAmount((double)(byte)10);
    UseCase1And4.business.User user11 = payment4.getUser();
    java.lang.String str12 = payment4.getPaymentId();
    boolean b13 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test290"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 10.0d, false);
    payment4.setAmount((double)(-1));
    double d7 = payment4.getAmount();
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    double d10 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-1.0d));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test291"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setRefunded(true);
    java.lang.String str11 = payment4.getPaymentId();
    java.lang.String str12 = payment4.getPaymentId();
    double d13 = payment4.getAmount();
    payment4.setRefunded(true);
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user18 = null;
    payment4.setUser(user18);
    payment4.setAmount((double)(short)10);
    payment4.setRefunded(true);
    UseCase1And4.business.User user24 = null;
    payment4.setUser(user24);
    java.lang.String str26 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test292"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)-1, false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setPaymentId("");
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    double d12 = payment4.getAmount();
    boolean b13 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test293"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    java.lang.String str9 = payment4.getPaymentId();
    payment4.setAmount(10.0d);
    java.lang.String str12 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user15 = payment4.getUser();
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    boolean b20 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test294"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    double d9 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("hi!");
    java.lang.String str18 = payment4.getPaymentId();
    java.lang.String str19 = payment4.getPaymentId();
    double d20 = payment4.getAmount();
    java.lang.String str21 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test295"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setRefunded(false);
    double d18 = payment4.getAmount();
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    double d21 = payment4.getAmount();
    boolean b22 = payment4.getRefunded();
    payment4.setRefunded(false);
    payment4.setAmount((double)(byte)-1);
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test296"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setPaymentId("hi!");
    double d18 = payment4.getAmount();
    payment4.setRefunded(true);
    boolean b21 = payment4.getRefunded();
    java.lang.String str22 = payment4.getPaymentId();
    UseCase1And4.business.User user23 = payment4.getUser();
    UseCase1And4.business.User user24 = null;
    payment4.setUser(user24);
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user30 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user30);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test297"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)'#', true);
    double d5 = payment4.getAmount();
    payment4.setRefunded(true);
    double d8 = payment4.getAmount();
    boolean b9 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 35.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 35.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test298"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)'a', false);
    boolean b5 = payment4.getRefunded();
    java.lang.String str6 = payment4.getPaymentId();
    payment4.setAmount((double)'4');
    payment4.setAmount((double)(-1L));
    java.lang.String str11 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test299"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)(short)1);
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    payment4.setPaymentId("");
    UseCase1And4.business.User user17 = payment4.getUser();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test300"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)100, true);
    payment4.setPaymentId("hi!");
    payment4.setRefunded(true);
    double d9 = payment4.getAmount();
    payment4.setAmount((double)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test301"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    boolean b9 = payment4.getRefunded();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    java.lang.String str16 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test302"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(byte)1, true);
    double d5 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test303"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setRefunded(false);
    java.lang.String str8 = payment4.getPaymentId();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    boolean b11 = payment4.getRefunded();
    payment4.setRefunded(false);
    java.lang.String str14 = payment4.getPaymentId();
    UseCase1And4.business.User user15 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test304"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    UseCase1And4.business.User user13 = payment4.getUser();
    java.lang.String str14 = payment4.getPaymentId();
    boolean b15 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test305"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    boolean b15 = payment4.getRefunded();
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    java.lang.String str28 = payment4.getPaymentId();
    UseCase1And4.business.User user29 = null;
    payment4.setUser(user29);
    payment4.setAmount((double)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test306"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)100, true);
    payment4.setAmount((double)(byte)100);
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    double d11 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 100.0d);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test307"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test308"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    java.lang.String str9 = payment4.getPaymentId();
    payment4.setAmount(10.0d);
    java.lang.String str12 = payment4.getPaymentId();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setRefunded(true);
    boolean b17 = payment4.getRefunded();
    UseCase1And4.business.User user18 = payment4.getUser();
    boolean b19 = payment4.getRefunded();
    boolean b20 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test309"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    boolean b15 = payment4.getRefunded();
    payment4.setRefunded(true);
    UseCase1And4.business.User user18 = payment4.getUser();
    java.lang.String str19 = payment4.getPaymentId();
    java.lang.String str20 = payment4.getPaymentId();
    payment4.setAmount(1.0d);
    payment4.setPaymentId("");
    boolean b25 = payment4.getRefunded();
    double d26 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 1.0d);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test310"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    java.lang.String str6 = payment4.getPaymentId();
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test311"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1.0f), false);
    payment4.setRefunded(false);
    boolean b7 = payment4.getRefunded();
    payment4.setAmount((double)(byte)-1);
    payment4.setAmount(1.0d);
    UseCase1And4.business.User user12 = payment4.getUser();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test312"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    payment4.setAmount((double)10);
    payment4.setAmount((double)(byte)10);
    UseCase1And4.business.User user9 = payment4.getUser();
    UseCase1And4.business.User user10 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test313"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    payment4.setAmount((double)10.0f);
    payment4.setRefunded(false);
    java.lang.String str13 = payment4.getPaymentId();
    boolean b14 = payment4.getRefunded();
    double d15 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 10.0d);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test314"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(short)10, false);
    payment4.setRefunded(false);
    double d7 = payment4.getAmount();
    payment4.setPaymentId("");
    double d10 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test315"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    payment4.setPaymentId("");
    boolean b10 = payment4.getRefunded();
    payment4.setAmount((double)'#');
    UseCase1And4.business.User user13 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setPaymentId("hi!");
    boolean b18 = payment4.getRefunded();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test316"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    java.lang.String str9 = payment4.getPaymentId();
    payment4.setAmount(10.0d);
    java.lang.String str12 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user15 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user18 = payment4.getUser();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test317"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    payment4.setPaymentId("");
    double d10 = payment4.getAmount();
    java.lang.String str11 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test318"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    boolean b11 = payment4.getRefunded();
    payment4.setAmount((double)'a');
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setAmount((double)(byte)100);
    java.lang.String str17 = payment4.getPaymentId();
    payment4.setPaymentId("");
    UseCase1And4.business.User user20 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test319"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    double d15 = payment4.getAmount();
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    payment4.setAmount((double)0.0f);
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test320"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, true);
    payment4.setRefunded(true);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    boolean b9 = payment4.getRefunded();
    java.lang.String str10 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test321"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    UseCase1And4.business.User user9 = payment4.getUser();
    boolean b10 = payment4.getRefunded();
    UseCase1And4.business.User user11 = payment4.getUser();
    UseCase1And4.business.User user12 = payment4.getUser();
    UseCase1And4.business.User user13 = payment4.getUser();
    payment4.setPaymentId("");
    boolean b16 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    boolean b19 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test322"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    boolean b8 = payment4.getRefunded();
    payment4.setRefunded(false);
    double d11 = payment4.getAmount();
    UseCase1And4.business.User user12 = payment4.getUser();
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test323"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, true);
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    java.lang.String str9 = payment4.getPaymentId();
    boolean b10 = payment4.getRefunded();
    boolean b11 = payment4.getRefunded();
    double d12 = payment4.getAmount();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    UseCase1And4.business.User user15 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test324"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    double d7 = payment4.getAmount();
    payment4.setPaymentId("");
    payment4.setPaymentId("");
    UseCase1And4.business.User user12 = payment4.getUser();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test325"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    boolean b15 = payment4.getRefunded();
    payment4.setRefunded(true);
    UseCase1And4.business.User user18 = null;
    payment4.setUser(user18);
    boolean b20 = payment4.getRefunded();
    boolean b21 = payment4.getRefunded();
    payment4.setAmount(35.0d);
    UseCase1And4.business.User user24 = payment4.getUser();
    UseCase1And4.business.User user25 = payment4.getUser();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test326"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(short)1, true);
    payment4.setRefunded(true);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(false);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test327"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    java.lang.String str10 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setAmount(1.0d);
    double d15 = payment4.getAmount();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test328"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(true);
    payment4.setAmount((double)100);
    payment4.setAmount((double)1L);
    payment4.setPaymentId("");
    double d16 = payment4.getAmount();
    payment4.setRefunded(false);
    boolean b19 = payment4.getRefunded();
    boolean b20 = payment4.getRefunded();
    UseCase1And4.business.User user21 = null;
    payment4.setUser(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test329"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(byte)10, false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user7 = payment4.getUser();
    java.lang.String str8 = payment4.getPaymentId();
    payment4.setPaymentId("");
    double d11 = payment4.getAmount();
    double d12 = payment4.getAmount();
    payment4.setAmount((double)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test330"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    double d6 = payment4.getAmount();
    payment4.setRefunded(false);
    double d9 = payment4.getAmount();
    payment4.setPaymentId("");
    java.lang.String str12 = payment4.getPaymentId();
    payment4.setRefunded(true);
    boolean b15 = payment4.getRefunded();
    UseCase1And4.business.User user16 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test331"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setPaymentId("");
    UseCase1And4.business.User user8 = payment4.getUser();
    java.lang.String str9 = payment4.getPaymentId();
    double d10 = payment4.getAmount();
    boolean b11 = payment4.getRefunded();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test332"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    double d9 = payment4.getAmount();
    UseCase1And4.business.User user10 = payment4.getUser();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    payment4.setRefunded(true);
    UseCase1And4.business.User user17 = payment4.getUser();
    UseCase1And4.business.User user18 = null;
    payment4.setUser(user18);
    payment4.setRefunded(false);
    double d22 = payment4.getAmount();
    UseCase1And4.business.User user23 = null;
    payment4.setUser(user23);
    java.lang.String str25 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test333"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1L), true);
    payment4.setRefunded(true);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setAmount(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test334"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setRefunded(false);
    double d18 = payment4.getAmount();
    payment4.setPaymentId("");
    payment4.setPaymentId("hi!");
    payment4.setRefunded(false);
    UseCase1And4.business.User user25 = payment4.getUser();
    java.lang.String str26 = payment4.getPaymentId();
    payment4.setAmount((double)(byte)100);
    UseCase1And4.business.User user29 = null;
    payment4.setUser(user29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test335"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    java.lang.String str17 = payment4.getPaymentId();
    UseCase1And4.business.User user18 = null;
    payment4.setUser(user18);
    payment4.setAmount((double)(-1));
    payment4.setAmount((double)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test336"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)100, false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user7 = payment4.getUser();
    double d8 = payment4.getAmount();
    payment4.setAmount((double)10);
    UseCase1And4.business.User user11 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test337"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    java.lang.String str13 = payment4.getPaymentId();
    payment4.setRefunded(false);
    payment4.setAmount(0.0d);
    payment4.setAmount((double)10);
    payment4.setPaymentId("");
    double d22 = payment4.getAmount();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 10.0d);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test338"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)10, true);
    payment4.setPaymentId("hi!");
    boolean b7 = payment4.getRefunded();
    double d8 = payment4.getAmount();
    payment4.setAmount(97.0d);
    boolean b11 = payment4.getRefunded();
    boolean b12 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test339"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    boolean b8 = payment4.getRefunded();
    payment4.setAmount(0.0d);
    boolean b11 = payment4.getRefunded();
    java.lang.String str12 = payment4.getPaymentId();
    payment4.setAmount((double)(byte)100);
    java.lang.String str15 = payment4.getPaymentId();
    boolean b16 = payment4.getRefunded();
    payment4.setRefunded(false);
    payment4.setAmount((double)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test340"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(short)0, true);
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    payment4.setAmount((double)(byte)-1);
    payment4.setPaymentId("");

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test341"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    payment4.setRefunded(true);
    boolean b12 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    double d15 = payment4.getAmount();
    java.lang.String str16 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test342"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setPaymentId("");
    double d19 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    double d22 = payment4.getAmount();
    payment4.setRefunded(true);
    boolean b25 = payment4.getRefunded();
    UseCase1And4.business.User user26 = null;
    payment4.setUser(user26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test343"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    payment4.setRefunded(false);
    double d8 = payment4.getAmount();
    double d9 = payment4.getAmount();
    double d10 = payment4.getAmount();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test344"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setAmount(10.0d);
    java.lang.String str19 = payment4.getPaymentId();
    payment4.setPaymentId("");
    payment4.setAmount((double)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test345"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    payment4.setPaymentId("");
    boolean b7 = payment4.getRefunded();
    payment4.setRefunded(false);
    double d10 = payment4.getAmount();
    double d11 = payment4.getAmount();
    java.lang.String str12 = payment4.getPaymentId();
    double d13 = payment4.getAmount();
    payment4.setAmount((double)(-1L));
    boolean b16 = payment4.getRefunded();
    java.lang.String str17 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test346"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(true);
    payment4.setRefunded(true);
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    boolean b19 = payment4.getRefunded();
    java.lang.String str20 = payment4.getPaymentId();
    boolean b21 = payment4.getRefunded();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test347"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    boolean b15 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test348"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)100, false);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    double d9 = payment4.getAmount();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test349"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 100.0d, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    double d8 = payment4.getAmount();
    java.lang.String str9 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setPaymentId("");
    java.lang.String str17 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test350"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setRefunded(false);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    payment4.setRefunded(false);
    UseCase1And4.business.User user21 = payment4.getUser();
    payment4.setRefunded(false);
    payment4.setAmount((double)1L);
    UseCase1And4.business.User user26 = null;
    payment4.setUser(user26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test351"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    boolean b13 = payment4.getRefunded();
    payment4.setRefunded(true);
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test352"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    double d15 = payment4.getAmount();
    payment4.setRefunded(false);
    boolean b18 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test353"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    payment4.setAmount((double)(short)0);
    double d11 = payment4.getAmount();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    java.lang.String str14 = payment4.getPaymentId();
    java.lang.String str15 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    double d18 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test354"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    double d7 = payment4.getAmount();
    double d8 = payment4.getAmount();
    java.lang.String str9 = payment4.getPaymentId();
    double d10 = payment4.getAmount();
    double d11 = payment4.getAmount();
    UseCase1And4.business.User user12 = payment4.getUser();
    boolean b13 = payment4.getRefunded();
    payment4.setPaymentId("");
    boolean b16 = payment4.getRefunded();
    payment4.setAmount((double)'a');
    double d19 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 97.0d);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test355"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)100, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    boolean b6 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setRefunded(true);
    double d13 = payment4.getAmount();
    payment4.setAmount(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 100.0d);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test356"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    payment4.setPaymentId("");
    boolean b7 = payment4.getRefunded();
    payment4.setRefunded(false);
    double d10 = payment4.getAmount();
    double d11 = payment4.getAmount();
    double d12 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == (-1.0d));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test357"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setAmount((double)1);
    UseCase1And4.business.User user12 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test358"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    boolean b8 = payment4.getRefunded();
    payment4.setAmount((double)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test359"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    double d7 = payment4.getAmount();
    boolean b8 = payment4.getRefunded();
    java.lang.String str9 = payment4.getPaymentId();
    payment4.setRefunded(true);
    java.lang.String str12 = payment4.getPaymentId();
    java.lang.String str13 = payment4.getPaymentId();
    double d14 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == (-1.0d));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test360"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    payment4.setAmount((double)(-1L));
    boolean b10 = payment4.getRefunded();
    boolean b11 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)100.0f);
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test361"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 100.0d, true);
    payment4.setAmount(100.0d);
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    double d11 = payment4.getAmount();
    UseCase1And4.business.User user12 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test362"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    java.lang.String str9 = payment4.getPaymentId();
    java.lang.String str10 = payment4.getPaymentId();
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    java.lang.String str17 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test363"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)100L, false);
    payment4.setRefunded(true);
    double d7 = payment4.getAmount();
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 100.0d);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test364"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(short)1, false);
    double d5 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setRefunded(true);
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test365"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, true);
    payment4.setRefunded(true);
    UseCase1And4.business.User user7 = payment4.getUser();
    java.lang.String str8 = payment4.getPaymentId();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test366"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setRefunded(false);
    java.lang.String str19 = payment4.getPaymentId();
    UseCase1And4.business.User user20 = null;
    payment4.setUser(user20);
    UseCase1And4.business.User user22 = null;
    payment4.setUser(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test367"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    UseCase1And4.business.User user15 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setPaymentId("hi!");
    double d20 = payment4.getAmount();
    boolean b21 = payment4.getRefunded();
    java.lang.String str22 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test368"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(true);
    payment4.setAmount((double)100);
    payment4.setAmount((double)1L);
    payment4.setPaymentId("");
    double d16 = payment4.getAmount();
    payment4.setRefunded(false);
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    UseCase1And4.business.User user25 = null;
    payment4.setUser(user25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test369"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    boolean b7 = payment4.getRefunded();
    java.lang.String str8 = payment4.getPaymentId();
    boolean b9 = payment4.getRefunded();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    payment4.setRefunded(false);
    UseCase1And4.business.User user14 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test370"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setPaymentId("");
    java.lang.String str11 = payment4.getPaymentId();
    double d12 = payment4.getAmount();
    java.lang.String str13 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test371"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(-1.0f), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    payment4.setRefunded(false);
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setRefunded(true);
    double d13 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-1.0d));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test372"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setRefunded(false);
    payment4.setAmount((double)'4');
    double d21 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 52.0d);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test373"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(true);
    payment4.setAmount((double)100);
    payment4.setAmount((double)1L);
    payment4.setPaymentId("");
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    payment4.setPaymentId("");
    payment4.setPaymentId("");
    java.lang.String str22 = payment4.getPaymentId();
    java.lang.String str23 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test374"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)100, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    java.lang.String str8 = payment4.getPaymentId();
    payment4.setAmount((double)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test375"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setRefunded(false);
    boolean b17 = payment4.getRefunded();
    boolean b18 = payment4.getRefunded();
    payment4.setRefunded(true);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test376"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)'4');
    payment4.setPaymentId("");
    payment4.setRefunded(true);
    payment4.setAmount(0.0d);
    double d14 = payment4.getAmount();
    java.lang.String str15 = payment4.getPaymentId();
    UseCase1And4.business.User user16 = payment4.getUser();
    java.lang.String str17 = payment4.getPaymentId();
    double d18 = payment4.getAmount();
    payment4.setAmount(52.0d);
    boolean b21 = payment4.getRefunded();
    payment4.setPaymentId("");
    payment4.setPaymentId("");
    UseCase1And4.business.User user26 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user26);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test377"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)'a', false);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    java.lang.String str9 = payment4.getPaymentId();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test378"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    boolean b11 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("hi!");
    java.lang.String str16 = payment4.getPaymentId();
    payment4.setAmount((double)(short)10);
    payment4.setPaymentId("");
    boolean b21 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test379"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    double d6 = payment4.getAmount();
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setRefunded(true);
    boolean b12 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test380"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    payment4.setPaymentId("");
    boolean b10 = payment4.getRefunded();
    payment4.setAmount((double)'#');
    UseCase1And4.business.User user13 = payment4.getUser();
    java.lang.String str14 = payment4.getPaymentId();
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setRefunded(false);
    UseCase1And4.business.User user19 = payment4.getUser();
    payment4.setAmount(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test381"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)'a', false);
    boolean b5 = payment4.getRefunded();
    double d6 = payment4.getAmount();
    java.lang.String str7 = payment4.getPaymentId();
    payment4.setAmount((double)1L);
    UseCase1And4.business.User user10 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test382"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = payment4.getUser();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test383"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setPaymentId("");
    double d19 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    double d22 = payment4.getAmount();
    payment4.setRefunded(false);
    payment4.setAmount((double)'a');
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 1.0d);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test384"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setPaymentId("hi!");
    double d18 = payment4.getAmount();
    payment4.setRefunded(true);
    boolean b21 = payment4.getRefunded();
    java.lang.String str22 = payment4.getPaymentId();
    payment4.setAmount((double)'4');
    UseCase1And4.business.User user25 = null;
    payment4.setUser(user25);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test385"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    UseCase1And4.business.User user10 = payment4.getUser();
    java.lang.String str11 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test386"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, true);
    payment4.setPaymentId("");
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(false);
    payment4.setAmount((double)1);
    UseCase1And4.business.User user13 = payment4.getUser();
    payment4.setPaymentId("");
    UseCase1And4.business.User user16 = payment4.getUser();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test387"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setRefunded(true);
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    payment4.setRefunded(true);
    double d14 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 97.0d);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test388"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    UseCase1And4.business.User user10 = payment4.getUser();
    payment4.setAmount((double)(short)0);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test389"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    double d8 = payment4.getAmount();
    payment4.setRefunded(true);
    payment4.setRefunded(true);
    payment4.setPaymentId("");
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    UseCase1And4.business.User user17 = payment4.getUser();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test390"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    double d7 = payment4.getAmount();
    boolean b8 = payment4.getRefunded();
    payment4.setAmount((double)(short)10);
    payment4.setAmount(52.0d);
    boolean b13 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test391"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'4', false);
    UseCase1And4.business.User user5 = payment4.getUser();
    java.lang.String str6 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test392"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)100, false);
    payment4.setRefunded(false);
    boolean b7 = payment4.getRefunded();
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    double d10 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 100.0d);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test393"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(-1.0f), true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(false);
    payment4.setAmount(35.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test394"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    payment4.setPaymentId("");
    boolean b7 = payment4.getRefunded();
    double d8 = payment4.getAmount();
    UseCase1And4.business.User user9 = payment4.getUser();
    boolean b10 = payment4.getRefunded();
    payment4.setPaymentId("");
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test395"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 100.0d, false);
    UseCase1And4.business.User user5 = payment4.getUser();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    double d8 = payment4.getAmount();
    payment4.setAmount((double)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 100.0d);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test396"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setAmount(0.0d);
    payment4.setAmount((double)1L);
    boolean b15 = payment4.getRefunded();
    java.lang.String str16 = payment4.getPaymentId();
    java.lang.String str17 = payment4.getPaymentId();
    payment4.setPaymentId("");
    payment4.setAmount((double)0.0f);
    java.lang.String str22 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test397"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(byte)10, false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user7 = payment4.getUser();
    java.lang.String str8 = payment4.getPaymentId();
    payment4.setPaymentId("");
    payment4.setAmount((double)1);
    UseCase1And4.business.User user13 = payment4.getUser();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test398"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    payment4.setAmount((double)1);
    java.lang.String str17 = payment4.getPaymentId();
    double d18 = payment4.getAmount();
    java.lang.String str19 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test399"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(byte)10, false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user7 = payment4.getUser();
    java.lang.String str8 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    boolean b11 = payment4.getRefunded();
    boolean b12 = payment4.getRefunded();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test400"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setPaymentId("");
    boolean b12 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test401"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    UseCase1And4.business.User user8 = payment4.getUser();
    java.lang.String str9 = payment4.getPaymentId();
    java.lang.String str10 = payment4.getPaymentId();
    UseCase1And4.business.User user11 = payment4.getUser();
    boolean b12 = payment4.getRefunded();
    double d13 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 97.0d);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test402"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setPaymentId("");
    double d10 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    payment4.setPaymentId("");
    boolean b17 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test403"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)100, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    java.lang.String str8 = payment4.getPaymentId();
    payment4.setPaymentId("");
    java.lang.String str11 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test404"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    java.lang.String str8 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test405"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    double d5 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test406"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)'a', false);
    boolean b5 = payment4.getRefunded();
    java.lang.String str6 = payment4.getPaymentId();
    payment4.setAmount((double)'4');
    UseCase1And4.business.User user9 = payment4.getUser();
    UseCase1And4.business.User user10 = payment4.getUser();
    payment4.setPaymentId("");
    double d13 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 52.0d);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test407"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(true);
    payment4.setRefunded(true);
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    payment4.setPaymentId("hi!");
    java.lang.String str21 = payment4.getPaymentId();
    payment4.setRefunded(false);
    UseCase1And4.business.User user24 = null;
    payment4.setUser(user24);
    java.lang.String str26 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test408"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    double d15 = payment4.getAmount();
    payment4.setRefunded(true);
    double d18 = payment4.getAmount();
    payment4.setAmount((double)(-1L));
    payment4.setPaymentId("");
    payment4.setPaymentId("hi!");
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test409"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    payment4.setPaymentId("");
    payment4.setAmount((double)10.0f);
    payment4.setRefunded(true);
    payment4.setAmount((double)(short)0);
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test410"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, true);
    double d5 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    double d8 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test411"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)0, false);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    java.lang.String str7 = payment4.getPaymentId();
    boolean b8 = payment4.getRefunded();
    payment4.setPaymentId("");
    UseCase1And4.business.User user11 = payment4.getUser();
    payment4.setAmount(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test412"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    java.lang.String str11 = payment4.getPaymentId();
    boolean b12 = payment4.getRefunded();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    double d15 = payment4.getAmount();
    double d16 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test413"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setRefunded(false);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    payment4.setPaymentId("hi!");
    java.lang.String str21 = payment4.getPaymentId();
    UseCase1And4.business.User user22 = payment4.getUser();
    payment4.setRefunded(false);
    boolean b25 = payment4.getRefunded();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test414"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    payment4.setAmount((double)10.0f);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = payment4.getUser();
    payment4.setPaymentId("hi!");
    double d18 = payment4.getAmount();
    payment4.setAmount(10.0d);
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 10.0d);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test415"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(byte)0, true);
    payment4.setPaymentId("hi!");
    payment4.setRefunded(true);
    payment4.setAmount((double)10.0f);
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("hi!");

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test416"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    payment4.setAmount((double)1);
    java.lang.String str17 = payment4.getPaymentId();
    payment4.setAmount((double)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test417"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setPaymentId("hi!");
    double d11 = payment4.getAmount();
    payment4.setAmount((double)' ');
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setAmount((double)(short)100);
    double d18 = payment4.getAmount();
    java.lang.String str19 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test418"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    java.lang.String str17 = payment4.getPaymentId();
    payment4.setAmount(97.0d);
    double d20 = payment4.getAmount();
    double d21 = payment4.getAmount();
    UseCase1And4.business.User user22 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test419"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    double d9 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    java.lang.String str12 = payment4.getPaymentId();
    UseCase1And4.business.User user13 = payment4.getUser();
    double d14 = payment4.getAmount();
    payment4.setAmount((double)0);
    payment4.setPaymentId("hi!");
    payment4.setRefunded(true);
    UseCase1And4.business.User user21 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user21);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test420"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)100.0f, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test421"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)1, true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user11 = payment4.getUser();
    payment4.setPaymentId("");
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test422"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setRefunded(false);
    java.lang.String str17 = payment4.getPaymentId();
    java.lang.String str18 = payment4.getPaymentId();
    UseCase1And4.business.User user19 = payment4.getUser();
    UseCase1And4.business.User user20 = null;
    payment4.setUser(user20);
    UseCase1And4.business.User user22 = payment4.getUser();
    UseCase1And4.business.User user23 = payment4.getUser();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test423"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    double d7 = payment4.getAmount();
    double d8 = payment4.getAmount();
    java.lang.String str9 = payment4.getPaymentId();
    double d10 = payment4.getAmount();
    double d11 = payment4.getAmount();
    java.lang.String str12 = payment4.getPaymentId();
    payment4.setAmount(1.0d);
    double d15 = payment4.getAmount();
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test424"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)1, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    boolean b6 = payment4.getRefunded();
    payment4.setAmount((double)(byte)100);
    payment4.setAmount((double)(byte)10);
    UseCase1And4.business.User user11 = payment4.getUser();
    double d12 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test425"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    boolean b15 = payment4.getRefunded();
    boolean b16 = payment4.getRefunded();
    java.lang.String str17 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test426"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)-1, false);
    boolean b5 = payment4.getRefunded();
    double d6 = payment4.getAmount();
    payment4.setPaymentId("");
    java.lang.String str9 = payment4.getPaymentId();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test427"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setPaymentId("");
    payment4.setAmount((double)' ');
    payment4.setAmount((double)(-1L));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test428"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    payment4.setPaymentId("");
    boolean b10 = payment4.getRefunded();
    payment4.setAmount((double)'#');
    UseCase1And4.business.User user13 = payment4.getUser();
    payment4.setPaymentId("");
    boolean b16 = payment4.getRefunded();
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    payment4.setRefunded(false);
    java.lang.String str21 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test429"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10.0f, false);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    double d7 = payment4.getAmount();
    java.lang.String str8 = payment4.getPaymentId();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test430"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(true);
    payment4.setRefunded(true);
    java.lang.String str13 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setAmount((double)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test431"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(true);
    UseCase1And4.business.User user10 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user13 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test432"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    payment4.setAmount((double)(short)0);
    double d11 = payment4.getAmount();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    java.lang.String str14 = payment4.getPaymentId();
    boolean b15 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test433"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    double d6 = payment4.getAmount();
    payment4.setAmount((double)10L);
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    double d11 = payment4.getAmount();
    UseCase1And4.business.User user12 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test434"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setRefunded(false);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    java.lang.String str19 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user22 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test435"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    payment4.setAmount((-1.0d));
    payment4.setRefunded(false);
    java.lang.String str12 = payment4.getPaymentId();
    payment4.setAmount(0.0d);
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test436"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    payment4.setPaymentId("");
    double d10 = payment4.getAmount();
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test437"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 100.0d, true);
    boolean b5 = payment4.getRefunded();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test438"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 35.0d, true);
    payment4.setRefunded(true);
    java.lang.String str7 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test439"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)-1, false);
    payment4.setAmount((double)100.0f);
    payment4.setAmount((double)100L);
    double d9 = payment4.getAmount();
    UseCase1And4.business.User user10 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test440"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setRefunded(false);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    payment4.setPaymentId("hi!");
    boolean b21 = payment4.getRefunded();
    boolean b22 = payment4.getRefunded();
    boolean b23 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test441"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 0.0d, true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    java.lang.String str7 = payment4.getPaymentId();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test442"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    UseCase1And4.business.User user17 = payment4.getUser();
    double d18 = payment4.getAmount();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test443"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setRefunded(false);
    java.lang.String str8 = payment4.getPaymentId();
    double d9 = payment4.getAmount();
    payment4.setAmount((double)10.0f);
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    payment4.setPaymentId("");
    payment4.setAmount((double)'4');
    payment4.setAmount((double)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test444"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    boolean b8 = payment4.getRefunded();
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    double d13 = payment4.getAmount();
    double d14 = payment4.getAmount();
    boolean b15 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user18 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test445"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    double d7 = payment4.getAmount();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)'4');
    java.lang.String str11 = payment4.getPaymentId();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    payment4.setRefunded(true);
    boolean b16 = payment4.getRefunded();
    payment4.setAmount(10.0d);
    double d19 = payment4.getAmount();
    double d20 = payment4.getAmount();
    double d21 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 10.0d);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test446"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    boolean b15 = payment4.getRefunded();
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    double d20 = payment4.getAmount();
    UseCase1And4.business.User user21 = null;
    payment4.setUser(user21);
    java.lang.String str23 = payment4.getPaymentId();
    UseCase1And4.business.User user24 = payment4.getUser();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test447"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)'#', true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    java.lang.String str7 = payment4.getPaymentId();
    payment4.setAmount((double)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test448"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)'4');
    payment4.setPaymentId("");
    java.lang.String str10 = payment4.getPaymentId();
    double d11 = payment4.getAmount();
    java.lang.String str12 = payment4.getPaymentId();
    boolean b13 = payment4.getRefunded();
    double d14 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 52.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 52.0d);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test449"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    java.lang.String str11 = payment4.getPaymentId();
    java.lang.String str12 = payment4.getPaymentId();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = payment4.getUser();
    boolean b15 = payment4.getRefunded();
    double d16 = payment4.getAmount();
    payment4.setRefunded(true);
    UseCase1And4.business.User user19 = payment4.getUser();
    UseCase1And4.business.User user20 = null;
    payment4.setUser(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test450"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)10, false);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    double d9 = payment4.getAmount();
    double d10 = payment4.getAmount();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test451"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 1.0d, false);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = payment4.getUser();
    payment4.setAmount((double)10);
    double d9 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)(byte)-1);
    java.lang.String str14 = payment4.getPaymentId();
    boolean b15 = payment4.getRefunded();
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test452"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    boolean b7 = payment4.getRefunded();
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    java.lang.String str10 = payment4.getPaymentId();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    double d13 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 10.0d);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test453"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    boolean b7 = payment4.getRefunded();
    double d8 = payment4.getAmount();
    payment4.setRefunded(true);
    double d11 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test454"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    double d7 = payment4.getAmount();
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test455"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user8 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test456"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(true);
    payment4.setAmount((double)(short)100);
    boolean b12 = payment4.getRefunded();
    UseCase1And4.business.User user13 = payment4.getUser();
    boolean b14 = payment4.getRefunded();
    payment4.setPaymentId("");
    payment4.setPaymentId("hi!");
    java.lang.String str19 = payment4.getPaymentId();
    boolean b20 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test457"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)100, false);
    payment4.setAmount((double)(short)100);
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    java.lang.String str11 = payment4.getPaymentId();
    double d12 = payment4.getAmount();
    UseCase1And4.business.User user13 = payment4.getUser();
    double d14 = payment4.getAmount();
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    UseCase1And4.business.User user17 = payment4.getUser();
    double d18 = payment4.getAmount();
    java.lang.String str19 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test458"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    boolean b6 = payment4.getRefunded();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test459"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1L), true);
    payment4.setRefunded(true);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    UseCase1And4.business.User user9 = payment4.getUser();
    boolean b10 = payment4.getRefunded();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test460"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setRefunded(false);
    double d18 = payment4.getAmount();
    double d19 = payment4.getAmount();
    java.lang.String str20 = payment4.getPaymentId();
    payment4.setAmount((double)1.0f);
    boolean b23 = payment4.getRefunded();
    boolean b24 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test461"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)100, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    boolean b6 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    UseCase1And4.business.User user11 = payment4.getUser();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setRefunded(false);
    UseCase1And4.business.User user17 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test462"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)-1, false);
    boolean b5 = payment4.getRefunded();
    double d6 = payment4.getAmount();
    payment4.setPaymentId("");
    java.lang.String str9 = payment4.getPaymentId();
    UseCase1And4.business.User user10 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test463"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    UseCase1And4.business.User user16 = payment4.getUser();
    payment4.setRefunded(false);
    double d19 = payment4.getAmount();
    UseCase1And4.business.User user20 = payment4.getUser();
    double d21 = payment4.getAmount();
    UseCase1And4.business.User user22 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test464"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, false);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setAmount((double)(byte)10);
    UseCase1And4.business.User user8 = payment4.getUser();
    double d9 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test465"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setRefunded(false);
    double d18 = payment4.getAmount();
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    UseCase1And4.business.User user21 = null;
    payment4.setUser(user21);
    payment4.setPaymentId("");
    payment4.setRefunded(true);
    UseCase1And4.business.User user27 = null;
    payment4.setUser(user27);
    UseCase1And4.business.User user29 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user29);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test466"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    java.lang.String str9 = payment4.getPaymentId();
    payment4.setAmount(10.0d);
    java.lang.String str12 = payment4.getPaymentId();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setRefunded(true);
    boolean b17 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    payment4.setAmount((double)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test467"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, false);
    payment4.setRefunded(false);
    double d7 = payment4.getAmount();
    payment4.setRefunded(true);
    payment4.setAmount((double)(-1));
    payment4.setPaymentId("");
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test468"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    java.lang.String str9 = payment4.getPaymentId();
    payment4.setAmount(10.0d);
    payment4.setRefunded(false);
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setAmount((double)(short)100);
    UseCase1And4.business.User user17 = payment4.getUser();
    java.lang.String str18 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test469"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    boolean b9 = payment4.getRefunded();
    java.lang.String str10 = payment4.getPaymentId();
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    double d15 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test470"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    double d8 = payment4.getAmount();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setAmount((-1.0d));
    boolean b13 = payment4.getRefunded();
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user17 = payment4.getUser();
    double d18 = payment4.getAmount();
    java.lang.String str19 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test471"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    double d6 = payment4.getAmount();
    payment4.setAmount((double)10L);
    payment4.setPaymentId("");
    UseCase1And4.business.User user11 = payment4.getUser();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test472"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    payment4.setPaymentId("");
    java.lang.String str7 = payment4.getPaymentId();
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test473"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    payment4.setPaymentId("hi!");
    double d18 = payment4.getAmount();
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    UseCase1And4.business.User user21 = null;
    payment4.setUser(user21);
    double d23 = payment4.getAmount();
    java.lang.String str24 = payment4.getPaymentId();
    payment4.setAmount((double)' ');
    double d27 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 32.0d);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test474"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    double d6 = payment4.getAmount();
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    boolean b11 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test475"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    payment4.setAmount((double)(short)0);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test476"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)10L, false);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user8 = payment4.getUser();
    java.lang.String str9 = payment4.getPaymentId();
    boolean b10 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test477"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)100, true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    payment4.setPaymentId("");
    double d9 = payment4.getAmount();
    UseCase1And4.business.User user10 = payment4.getUser();
    boolean b11 = payment4.getRefunded();
    java.lang.String str12 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test478"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test479"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    payment4.setPaymentId("");
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    double d19 = payment4.getAmount();
    java.lang.String str20 = payment4.getPaymentId();
    UseCase1And4.business.User user21 = null;
    payment4.setUser(user21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test480"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("hi!");
    boolean b13 = payment4.getRefunded();
    double d14 = payment4.getAmount();
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    java.lang.String str17 = payment4.getPaymentId();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test481"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    boolean b9 = payment4.getRefunded();
    payment4.setAmount((double)100);
    UseCase1And4.business.User user12 = payment4.getUser();
    java.lang.String str13 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    double d16 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 100.0d);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test482"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    boolean b15 = payment4.getRefunded();
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    double d20 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    UseCase1And4.business.User user25 = null;
    payment4.setUser(user25);
    UseCase1And4.business.User user27 = payment4.getUser();
    java.lang.String str28 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test483"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    java.lang.String str15 = payment4.getPaymentId();
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test484"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    boolean b5 = payment4.getRefunded();
    UseCase1And4.business.User user6 = payment4.getUser();
    payment4.setAmount(0.0d);
    double d9 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test485"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 1.0d, false);
    payment4.setAmount(52.0d);
    payment4.setPaymentId("hi!");
    java.lang.String str9 = payment4.getPaymentId();
    payment4.setAmount((double)(byte)10);
    double d12 = payment4.getAmount();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    double d15 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 10.0d);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test486"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1, true);
    java.lang.String str5 = payment4.getPaymentId();
    boolean b6 = payment4.getRefunded();
    java.lang.String str7 = payment4.getPaymentId();
    double d8 = payment4.getAmount();
    payment4.setAmount((double)0L);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test487"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)0, false);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    java.lang.String str7 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test488"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    UseCase1And4.business.User user12 = payment4.getUser();
    payment4.setRefunded(false);
    payment4.setAmount((double)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test489"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)'4');
    payment4.setAmount(0.0d);
    double d10 = payment4.getAmount();
    java.lang.String str11 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setAmount((double)(-1.0f));
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test490"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setRefunded(false);
    payment4.setAmount((double)0L);
    double d14 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test491"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    java.lang.String str16 = payment4.getPaymentId();
    double d17 = payment4.getAmount();
    payment4.setAmount((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 1.0d);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test492"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    java.lang.String str10 = payment4.getPaymentId();
    java.lang.String str11 = payment4.getPaymentId();
    payment4.setAmount((double)1L);
    payment4.setAmount((double)(byte)1);
    double d16 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test493"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    java.lang.String str8 = payment4.getPaymentId();
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user12 = payment4.getUser();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    java.lang.String str15 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test494"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    double d5 = payment4.getAmount();
    UseCase1And4.business.User user6 = payment4.getUser();
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = payment4.getUser();
    java.lang.String str10 = payment4.getPaymentId();
    java.lang.String str11 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test495"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    double d7 = payment4.getAmount();
    payment4.setRefunded(true);
    payment4.setRefunded(true);
    payment4.setAmount(0.0d);
    boolean b14 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    double d17 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test496"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    boolean b11 = payment4.getRefunded();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    UseCase1And4.business.User user16 = payment4.getUser();
    double d17 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 1.0d);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test497"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(short)1, false);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setAmount((double)100);
    double d10 = payment4.getAmount();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    payment4.setAmount(10.0d);
    payment4.setPaymentId("");
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 100.0d);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test498"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1L), true);
    payment4.setRefunded(true);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    double d9 = payment4.getAmount();
    payment4.setRefunded(true);
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    double d14 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == (-1.0d));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test499"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setRefunded(false);
    payment4.setRefunded(false);
    boolean b19 = payment4.getRefunded();
    payment4.setRefunded(true);
    payment4.setAmount(1.0d);
    UseCase1And4.business.User user24 = payment4.getUser();
    boolean b25 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8.test500"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(true);
    payment4.setRefunded(true);
    java.lang.String str13 = payment4.getPaymentId();
    payment4.setRefunded(false);
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

}
