
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test001"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    double d7 = payment4.getAmount();
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test002"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    java.lang.String str8 = payment4.getPaymentId();
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)(-1.0f));
    java.lang.String str14 = payment4.getPaymentId();
    boolean b15 = payment4.getRefunded();
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test003"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)'4');
    payment4.setPaymentId("");
    java.lang.String str10 = payment4.getPaymentId();
    boolean b11 = payment4.getRefunded();
    boolean b12 = payment4.getRefunded();
    payment4.setPaymentId("");
    boolean b15 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test004"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = payment4.getUser();
    UseCase1And4.business.User user10 = payment4.getUser();
    payment4.setAmount((double)0);
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test005"); }

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
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    payment4.setAmount((-1.0d));
    payment4.setRefunded(true);
    boolean b25 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test006"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test007"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    payment4.setAmount((-1.0d));
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    boolean b12 = payment4.getRefunded();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    UseCase1And4.business.User user15 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test008"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    payment4.setPaymentId("");
    boolean b10 = payment4.getRefunded();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    double d13 = payment4.getAmount();
    double d14 = payment4.getAmount();
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 10.0d);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test009"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)1.0f);
    boolean b11 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    payment4.setRefunded(false);
    payment4.setAmount((double)(short)-1);
    double d18 = payment4.getAmount();
    java.lang.String str19 = payment4.getPaymentId();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test010"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    payment4.setPaymentId("hi!");
    payment4.setAmount(0.0d);
    double d9 = payment4.getAmount();
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    payment4.setRefunded(true);
    payment4.setPaymentId("");
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test011"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setPaymentId("");
    payment4.setAmount((double)' ');
    boolean b9 = payment4.getRefunded();
    payment4.setAmount((double)(byte)1);
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    payment4.setPaymentId("");
    UseCase1And4.business.User user16 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test012"); }

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
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user27 = payment4.getUser();
    
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
    org.junit.Assert.assertNull(user27);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test013"); }

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
    payment4.setRefunded(false);
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
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 1.0d);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test014"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    payment4.setAmount((double)10.0f);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    double d17 = payment4.getAmount();
    double d18 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 10.0d);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test015"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 10.0d, true);
    java.lang.String str5 = payment4.getPaymentId();
    java.lang.String str6 = payment4.getPaymentId();
    double d7 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test016"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, true);
    payment4.setPaymentId("");
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setPaymentId("");
    boolean b11 = payment4.getRefunded();
    java.lang.String str12 = payment4.getPaymentId();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    payment4.setAmount(0.0d);
    boolean b17 = payment4.getRefunded();
    java.lang.String str18 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test017"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    double d10 = payment4.getAmount();
    payment4.setAmount((double)(short)100);
    double d13 = payment4.getAmount();
    boolean b14 = payment4.getRefunded();
    double d15 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 100.0d);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test018"); }

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
    boolean b17 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test019"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(byte)10, false);
    double d5 = payment4.getAmount();
    payment4.setPaymentId("");
    payment4.setAmount((double)(byte)0);
    payment4.setRefunded(true);
    double d12 = payment4.getAmount();
    java.lang.String str13 = payment4.getPaymentId();
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setAmount((double)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test020"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(short)1, true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(byte)0);
    double d8 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test021"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, true);
    payment4.setPaymentId("");
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(false);
    payment4.setAmount((double)1);
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    payment4.setPaymentId("");
    double d17 = payment4.getAmount();
    UseCase1And4.business.User user18 = payment4.getUser();
    double d19 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 1.0d);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test022"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)100, false);
    payment4.setAmount((double)(short)100);
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    java.lang.String str11 = payment4.getPaymentId();
    boolean b12 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test023"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    UseCase1And4.business.User user13 = payment4.getUser();
    payment4.setRefunded(false);
    payment4.setAmount((double)0L);
    boolean b18 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    payment4.setAmount(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test024"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test025"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    payment4.setAmount((double)(short)0);
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user15 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setAmount((double)1);
    payment4.setAmount(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test026"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)10, true);
    payment4.setPaymentId("hi!");
    java.lang.String str7 = payment4.getPaymentId();
    payment4.setAmount((double)1);
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test027"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    java.lang.String str10 = payment4.getPaymentId();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    java.lang.String str13 = payment4.getPaymentId();
    double d14 = payment4.getAmount();
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user17 = payment4.getUser();
    boolean b18 = payment4.getRefunded();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test028"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    boolean b8 = payment4.getRefunded();
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    double d13 = payment4.getAmount();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    UseCase1And4.business.User user16 = payment4.getUser();
    payment4.setPaymentId("");
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    double d21 = payment4.getAmount();
    boolean b22 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test029"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    boolean b9 = payment4.getRefunded();
    java.lang.String str10 = payment4.getPaymentId();
    double d11 = payment4.getAmount();
    payment4.setAmount(97.0d);
    double d14 = payment4.getAmount();
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    java.lang.String str19 = payment4.getPaymentId();
    java.lang.String str20 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test030"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (-1.0d), true);
    boolean b5 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user8 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test031"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)'#', true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test032"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setRefunded(false);
    double d11 = payment4.getAmount();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    java.lang.String str14 = payment4.getPaymentId();
    boolean b15 = payment4.getRefunded();
    boolean b16 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test033"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 52.0d, true);
    payment4.setAmount((double)'a');
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setAmount((double)(short)10);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test034"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(true);
    payment4.setAmount((double)100);
    payment4.setAmount((double)1L);
    payment4.setPaymentId("");
    double d16 = payment4.getAmount();
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    boolean b19 = payment4.getRefunded();
    boolean b20 = payment4.getRefunded();
    payment4.setAmount((double)(byte)10);
    UseCase1And4.business.User user23 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test035"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    double d10 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test036"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    payment4.setPaymentId("");
    payment4.setAmount((double)10.0f);
    double d12 = payment4.getAmount();
    UseCase1And4.business.User user13 = payment4.getUser();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    java.lang.String str18 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test037"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)0, true);
    boolean b5 = payment4.getRefunded();
    boolean b6 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test038"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setAmount((double)0L);
    double d13 = payment4.getAmount();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    boolean b18 = payment4.getRefunded();
    java.lang.String str19 = payment4.getPaymentId();
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("hi!");
    double d24 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 0.0d);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test039"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    UseCase1And4.business.User user13 = payment4.getUser();
    payment4.setAmount((double)' ');
    payment4.setRefunded(false);
    double d18 = payment4.getAmount();
    payment4.setPaymentId("");
    boolean b21 = payment4.getRefunded();
    double d22 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 32.0d);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test040"); }

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
    java.lang.String str23 = payment4.getPaymentId();
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test041"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setPaymentId("hi!");
    double d11 = payment4.getAmount();
    payment4.setAmount((double)' ');
    UseCase1And4.business.User user14 = payment4.getUser();
    UseCase1And4.business.User user15 = payment4.getUser();
    UseCase1And4.business.User user16 = payment4.getUser();
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
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 32.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test042"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1, true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    double d7 = payment4.getAmount();
    payment4.setRefunded(true);
    payment4.setAmount((double)(-1L));
    UseCase1And4.business.User user12 = payment4.getUser();
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    UseCase1And4.business.User user19 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test043"); }

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
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test044"); }

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
    payment4.setAmount((double)(byte)100);
    UseCase1And4.business.User user23 = null;
    payment4.setUser(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test045"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(byte)10, false);
    double d5 = payment4.getAmount();
    double d6 = payment4.getAmount();
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    payment4.setAmount((double)(-1.0f));
    payment4.setAmount((double)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test046"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    boolean b7 = payment4.getRefunded();
    java.lang.String str8 = payment4.getPaymentId();
    boolean b9 = payment4.getRefunded();
    payment4.setAmount(100.0d);
    java.lang.String str12 = payment4.getPaymentId();
    payment4.setAmount(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test047"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 100.0d, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    double d6 = payment4.getAmount();
    payment4.setRefunded(true);
    payment4.setPaymentId("");
    payment4.setPaymentId("hi!");
    payment4.setAmount(97.0d);
    boolean b15 = payment4.getRefunded();
    boolean b16 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test048"); }

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
    UseCase1And4.business.User user17 = payment4.getUser();
    boolean b18 = payment4.getRefunded();
    payment4.setPaymentId("");
    payment4.setRefunded(true);
    java.lang.String str23 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test049"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    boolean b8 = payment4.getRefunded();
    payment4.setAmount(0.0d);
    boolean b11 = payment4.getRefunded();
    java.lang.String str12 = payment4.getPaymentId();
    boolean b13 = payment4.getRefunded();
    payment4.setRefunded(false);
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
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test050"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    boolean b8 = payment4.getRefunded();
    payment4.setAmount(0.0d);
    boolean b11 = payment4.getRefunded();
    java.lang.String str12 = payment4.getPaymentId();
    boolean b13 = payment4.getRefunded();
    payment4.setRefunded(false);
    boolean b16 = payment4.getRefunded();
    double d17 = payment4.getAmount();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test051"); }

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
    payment4.setRefunded(true);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test052"); }

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
    payment4.setAmount((double)'#');
    payment4.setPaymentId("hi!");
    java.lang.String str20 = payment4.getPaymentId();
    boolean b21 = payment4.getRefunded();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test053"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    java.lang.String str10 = payment4.getPaymentId();
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    java.lang.String str13 = payment4.getPaymentId();
    payment4.setAmount((double)10L);
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test054"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user13 = payment4.getUser();
    payment4.setRefunded(false);
    payment4.setRefunded(false);
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)'#');
    double d22 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 35.0d);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test055"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = payment4.getUser();
    UseCase1And4.business.User user10 = payment4.getUser();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test056"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    boolean b7 = payment4.getRefunded();
    double d8 = payment4.getAmount();
    java.lang.String str9 = payment4.getPaymentId();
    UseCase1And4.business.User user10 = payment4.getUser();
    java.lang.String str11 = payment4.getPaymentId();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    double d14 = payment4.getAmount();
    payment4.setAmount(100.0d);
    boolean b17 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test057"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)1, true);
    payment4.setAmount((double)0);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setAmount((double)(short)0);
    payment4.setRefunded(false);
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test058"); }

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
    java.lang.String str19 = payment4.getPaymentId();
    java.lang.String str20 = payment4.getPaymentId();
    UseCase1And4.business.User user21 = null;
    payment4.setUser(user21);
    payment4.setAmount((double)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test059"); }

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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test060"); }

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
    payment4.setAmount((double)(byte)10);
    double d19 = payment4.getAmount();
    java.lang.String str20 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test061"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setPaymentId("hi!");
    double d11 = payment4.getAmount();
    payment4.setAmount((double)' ');
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test062"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    UseCase1And4.business.User user6 = null;
    payment4.setUser(user6);
    java.lang.String str8 = payment4.getPaymentId();
    payment4.setAmount((double)(short)100);
    java.lang.String str11 = payment4.getPaymentId();
    UseCase1And4.business.User user12 = payment4.getUser();
    payment4.setPaymentId("hi!");
    java.lang.String str15 = payment4.getPaymentId();
    UseCase1And4.business.User user16 = null;
    payment4.setUser(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test063"); }

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
    UseCase1And4.business.User user17 = payment4.getUser();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test064"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', false);
    double d5 = payment4.getAmount();
    boolean b6 = payment4.getRefunded();
    double d7 = payment4.getAmount();
    payment4.setPaymentId("");
    UseCase1And4.business.User user10 = payment4.getUser();
    double d11 = payment4.getAmount();
    payment4.setAmount((double)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 97.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 97.0d);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test065"); }

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
    payment4.setAmount((double)10L);
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user26 = null;
    payment4.setUser(user26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test066"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    java.lang.String str9 = payment4.getPaymentId();
    payment4.setAmount(10.0d);
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    payment4.setAmount((double)10L);
    UseCase1And4.business.User user16 = payment4.getUser();
    boolean b17 = payment4.getRefunded();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test067"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    UseCase1And4.business.User user7 = payment4.getUser();
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setAmount((double)1);
    boolean b12 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user15 = payment4.getUser();
    boolean b16 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test068"); }

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
    java.lang.String str25 = payment4.getPaymentId();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test069"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    double d6 = payment4.getAmount();
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setAmount((double)100);
    UseCase1And4.business.User user10 = payment4.getUser();
    boolean b11 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test070"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setRefunded(false);
    payment4.setRefunded(false);
    payment4.setAmount(1.0d);
    boolean b16 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test071"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(true);
    payment4.setRefunded(true);
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user15 = payment4.getUser();
    payment4.setAmount((double)10.0f);
    payment4.setAmount(10.0d);
    double d20 = payment4.getAmount();
    double d21 = payment4.getAmount();
    boolean b22 = payment4.getRefunded();
    UseCase1And4.business.User user23 = null;
    payment4.setUser(user23);
    double d25 = payment4.getAmount();
    UseCase1And4.business.User user26 = null;
    payment4.setUser(user26);
    double d28 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 10.0d);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test072"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setRefunded(true);
    payment4.setAmount((double)' ');
    boolean b12 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)10L);
    payment4.setAmount((double)10);
    payment4.setPaymentId("");
    payment4.setPaymentId("");
    boolean b23 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test073"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 10.0d, false);
    double d5 = payment4.getAmount();
    double d6 = payment4.getAmount();
    java.lang.String str7 = payment4.getPaymentId();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test074"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    double d7 = payment4.getAmount();
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setAmount((double)'4');
    java.lang.String str11 = payment4.getPaymentId();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    payment4.setRefunded(false);
    UseCase1And4.business.User user16 = payment4.getUser();
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test075"); }

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
    java.lang.String str18 = payment4.getPaymentId();
    payment4.setRefunded(true);
    double d21 = payment4.getAmount();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 100.0d);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test076"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    java.lang.String str9 = payment4.getPaymentId();
    java.lang.String str10 = payment4.getPaymentId();
    UseCase1And4.business.User user11 = payment4.getUser();
    payment4.setPaymentId("hi!");
    boolean b14 = payment4.getRefunded();
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    boolean b17 = payment4.getRefunded();
    UseCase1And4.business.User user18 = null;
    payment4.setUser(user18);
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test077"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (-1.0d), false);
    payment4.setAmount(10.0d);
    payment4.setRefunded(false);
    payment4.setAmount((double)100.0f);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test078"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    java.lang.String str7 = payment4.getPaymentId();
    double d8 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)(short)0);
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test079"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    payment4.setPaymentId("");
    double d14 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user17 = null;
    payment4.setUser(user17);
    boolean b19 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user22 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user22);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test080"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    boolean b7 = payment4.getRefunded();
    boolean b8 = payment4.getRefunded();
    payment4.setAmount(0.0d);
    boolean b11 = payment4.getRefunded();
    payment4.setRefunded(false);
    boolean b14 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test081"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    boolean b11 = payment4.getRefunded();
    UseCase1And4.business.User user12 = payment4.getUser();
    double d13 = payment4.getAmount();
    payment4.setAmount(1.0d);
    payment4.setPaymentId("hi!");
    boolean b18 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test082"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, true);
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user9 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test083"); }

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
    boolean b22 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user25 = null;
    payment4.setUser(user25);
    
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
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test084"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, false);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    boolean b9 = payment4.getRefunded();
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    java.lang.String str14 = payment4.getPaymentId();
    payment4.setAmount(35.0d);
    UseCase1And4.business.User user17 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test085"); }

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
    boolean b17 = payment4.getRefunded();
    UseCase1And4.business.User user18 = payment4.getUser();
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    payment4.setPaymentId("");
    payment4.setPaymentId("");
    java.lang.String str25 = payment4.getPaymentId();
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
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test086"); }

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
    java.lang.String str18 = payment4.getPaymentId();
    payment4.setAmount((double)100.0f);
    UseCase1And4.business.User user21 = null;
    payment4.setUser(user21);
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 100.0d);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test087"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    boolean b7 = payment4.getRefunded();
    double d8 = payment4.getAmount();
    payment4.setRefunded(true);
    payment4.setAmount((double)1L);
    payment4.setPaymentId("hi!");
    boolean b15 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test088"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    payment4.setAmount((double)(short)0);
    double d11 = payment4.getAmount();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    java.lang.String str14 = payment4.getPaymentId();
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    UseCase1And4.business.User user17 = payment4.getUser();
    payment4.setAmount(100.0d);
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test089"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    payment4.setRefunded(false);
    double d8 = payment4.getAmount();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    UseCase1And4.business.User user11 = payment4.getUser();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user16 = payment4.getUser();
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test090"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    double d9 = payment4.getAmount();
    UseCase1And4.business.User user10 = payment4.getUser();
    java.lang.String str11 = payment4.getPaymentId();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    boolean b14 = payment4.getRefunded();
    payment4.setAmount((double)'a');
    
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
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test091"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    boolean b6 = payment4.getRefunded();
    UseCase1And4.business.User user7 = payment4.getUser();
    payment4.setAmount((double)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test092"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(byte)10, false);
    double d5 = payment4.getAmount();
    double d6 = payment4.getAmount();
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    payment4.setPaymentId("");
    payment4.setAmount((double)(-1.0f));
    boolean b17 = payment4.getRefunded();
    boolean b18 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test093"); }

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
    double d22 = payment4.getAmount();
    payment4.setPaymentId("");
    payment4.setPaymentId("");
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
    org.junit.Assert.assertTrue(d22 == 1.0d);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test094"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)1L, false);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    double d7 = payment4.getAmount();
    double d8 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1.0d);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test095"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = null;
    payment4.setUser(user8);
    UseCase1And4.business.User user10 = payment4.getUser();
    UseCase1And4.business.User user11 = payment4.getUser();
    boolean b12 = payment4.getRefunded();
    boolean b13 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test096"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)100.0f, false);
    payment4.setAmount(100.0d);
    payment4.setRefunded(false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test097"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, true);
    payment4.setPaymentId("");
    double d7 = payment4.getAmount();
    java.lang.String str8 = payment4.getPaymentId();
    boolean b9 = payment4.getRefunded();
    payment4.setRefunded(false);
    java.lang.String str12 = payment4.getPaymentId();
    boolean b13 = payment4.getRefunded();
    payment4.setPaymentId("");
    UseCase1And4.business.User user16 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test098"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1, true);
    java.lang.String str5 = payment4.getPaymentId();
    boolean b6 = payment4.getRefunded();
    java.lang.String str7 = payment4.getPaymentId();
    payment4.setRefunded(true);
    double d10 = payment4.getAmount();
    double d11 = payment4.getAmount();
    boolean b12 = payment4.getRefunded();
    java.lang.String str13 = payment4.getPaymentId();
    double d14 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 1.0d);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test099"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)10, true);
    payment4.setAmount((double)100);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user9 = payment4.getUser();
    payment4.setAmount((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test100"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)100, false);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user7 = payment4.getUser();
    double d8 = payment4.getAmount();
    double d9 = payment4.getAmount();
    java.lang.String str10 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test101"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user8 = payment4.getUser();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    boolean b11 = payment4.getRefunded();
    double d12 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 10.0d);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test102"); }

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
    boolean b24 = payment4.getRefunded();
    java.lang.String str25 = payment4.getPaymentId();
    
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
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test103"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setRefunded(false);
    java.lang.String str10 = payment4.getPaymentId();
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    double d15 = payment4.getAmount();
    UseCase1And4.business.User user16 = payment4.getUser();
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user16);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test104"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)100, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setRefunded(false);
    boolean b8 = payment4.getRefunded();
    payment4.setRefunded(false);
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test105"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    UseCase1And4.business.User user9 = payment4.getUser();
    UseCase1And4.business.User user10 = payment4.getUser();
    payment4.setAmount(0.0d);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test106"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, 97.0d, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setAmount(0.0d);
    boolean b8 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test107"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)'4');
    payment4.setPaymentId("");
    payment4.setAmount((double)10);
    boolean b12 = payment4.getRefunded();
    boolean b13 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)(short)100);
    payment4.setPaymentId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test108"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)-1, false);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)100.0f);
    payment4.setAmount(52.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test109"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setAmount((double)0L);
    double d13 = payment4.getAmount();
    UseCase1And4.business.User user14 = payment4.getUser();
    UseCase1And4.business.User user15 = null;
    payment4.setUser(user15);
    UseCase1And4.business.User user17 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test110"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)100, true);
    payment4.setAmount((double)(byte)100);
    payment4.setRefunded(false);
    payment4.setRefunded(true);
    payment4.setAmount(32.0d);
    payment4.setPaymentId("hi!");
    double d15 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 32.0d);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test111"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1L), true);
    payment4.setRefunded(true);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    UseCase1And4.business.User user9 = payment4.getUser();
    boolean b10 = payment4.getRefunded();
    payment4.setRefunded(false);
    payment4.setAmount((double)(byte)100);
    payment4.setPaymentId("");
    payment4.setPaymentId("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test112"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)-1, false);
    boolean b5 = payment4.getRefunded();
    double d6 = payment4.getAmount();
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    payment4.setAmount((double)(short)100);
    boolean b13 = payment4.getRefunded();
    UseCase1And4.business.User user14 = null;
    payment4.setUser(user14);
    java.lang.String str16 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test113"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)-1, false);
    boolean b5 = payment4.getRefunded();
    boolean b6 = payment4.getRefunded();
    boolean b7 = payment4.getRefunded();
    payment4.setAmount(10.0d);
    UseCase1And4.business.User user10 = null;
    payment4.setUser(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test114"); }

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
    payment4.setRefunded(true);
    double d25 = payment4.getAmount();
    UseCase1And4.business.User user26 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user26);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test115"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)-1, false);
    payment4.setPaymentId("hi!");
    payment4.setRefunded(true);
    payment4.setPaymentId("");
    java.lang.String str11 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user14 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setAmount((double)1.0f);
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user14);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test116"); }

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
    payment4.setRefunded(true);
    
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

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test117"); }

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
    boolean b18 = payment4.getRefunded();
    payment4.setAmount(32.0d);
    
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
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test118"); }

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
    payment4.setAmount((double)100);
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

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test119"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(true);
    payment4.setRefunded(true);
    double d13 = payment4.getAmount();
    double d14 = payment4.getAmount();
    boolean b15 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test120"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)1L, true);
    payment4.setAmount((double)(-1L));
    payment4.setRefunded(true);
    payment4.setPaymentId("hi!");
    payment4.setAmount(97.0d);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test121"); }

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
    java.lang.String str17 = payment4.getPaymentId();
    UseCase1And4.business.User user18 = payment4.getUser();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test122"); }

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
    boolean b25 = payment4.getRefunded();
    payment4.setRefunded(false);
    double d28 = payment4.getAmount();
    payment4.setAmount((double)1L);
    UseCase1And4.business.User user31 = payment4.getUser();
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
    org.junit.Assert.assertTrue(d19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user31);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test123"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(short)1, false);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setAmount((double)100);
    payment4.setRefunded(true);
    payment4.setAmount((double)10);
    payment4.setAmount((double)10L);
    payment4.setAmount(52.0d);
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test124"); }

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
    payment4.setRefunded(false);
    java.lang.String str25 = payment4.getPaymentId();
    boolean b26 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test125"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    payment4.setRefunded(true);
    java.lang.String str11 = payment4.getPaymentId();
    UseCase1And4.business.User user12 = payment4.getUser();
    payment4.setAmount(0.0d);
    UseCase1And4.business.User user15 = payment4.getUser();
    payment4.setAmount((double)0);
    double d18 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test126"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)(short)-1, false);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setPaymentId("hi!");
    payment4.setAmount((double)(short)-1);
    payment4.setRefunded(false);
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    boolean b14 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test127"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(-1), true);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    double d7 = payment4.getAmount();
    java.lang.String str8 = payment4.getPaymentId();
    boolean b9 = payment4.getRefunded();
    payment4.setRefunded(true);
    boolean b12 = payment4.getRefunded();
    boolean b13 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test128"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 0.0d, true);
    payment4.setPaymentId("");
    java.lang.String str7 = payment4.getPaymentId();
    boolean b8 = payment4.getRefunded();
    payment4.setAmount((double)(short)100);
    java.lang.String str11 = payment4.getPaymentId();
    payment4.setRefunded(false);
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test129"); }

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
    payment4.setPaymentId("hi!");
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test130"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    payment4.setPaymentId("");
    java.lang.String str13 = payment4.getPaymentId();
    payment4.setRefunded(false);
    payment4.setAmount((double)(-1.0f));
    UseCase1And4.business.User user18 = payment4.getUser();
    payment4.setPaymentId("");
    payment4.setAmount((-1.0d));
    UseCase1And4.business.User user23 = payment4.getUser();
    payment4.setPaymentId("");
    double d26 = payment4.getAmount();
    payment4.setAmount(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == (-1.0d));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test131"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, 10.0d, false);
    payment4.setPaymentId("hi!");
    double d7 = payment4.getAmount();
    java.lang.String str8 = payment4.getPaymentId();
    UseCase1And4.business.User user9 = null;
    payment4.setUser(user9);
    java.lang.String str11 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test132"); }

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
    payment4.setPaymentId("");
    boolean b20 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    java.lang.String str23 = payment4.getPaymentId();
    UseCase1And4.business.User user24 = payment4.getUser();
    java.lang.String str25 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test133"); }

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
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user17 = payment4.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user17);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test134"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setRefunded(false);
    java.lang.String str7 = payment4.getPaymentId();
    double d8 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user11 = null;
    payment4.setUser(user11);
    payment4.setPaymentId("hi!");
    java.lang.String str15 = payment4.getPaymentId();
    boolean b16 = payment4.getRefunded();
    boolean b17 = payment4.getRefunded();
    double d18 = payment4.getAmount();
    UseCase1And4.business.User user19 = payment4.getUser();
    payment4.setAmount((double)10.0f);
    java.lang.String str22 = payment4.getPaymentId();
    boolean b23 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test135"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    UseCase1And4.business.User user5 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user8 = payment4.getUser();
    java.lang.String str9 = payment4.getPaymentId();
    UseCase1And4.business.User user10 = payment4.getUser();
    payment4.setRefunded(false);
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    boolean b15 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test136"); }

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
    payment4.setRefunded(false);
    UseCase1And4.business.User user19 = null;
    payment4.setUser(user19);
    payment4.setPaymentId("hi!");
    UseCase1And4.business.User user23 = null;
    payment4.setUser(user23);
    java.lang.String str25 = payment4.getPaymentId();
    payment4.setPaymentId("");
    payment4.setRefunded(false);
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test137"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    java.lang.String str5 = payment4.getPaymentId();
    payment4.setRefunded(true);
    UseCase1And4.business.User user8 = payment4.getUser();
    payment4.setRefunded(false);
    double d11 = payment4.getAmount();
    UseCase1And4.business.User user12 = null;
    payment4.setUser(user12);
    payment4.setAmount((double)'4');
    payment4.setPaymentId("");
    boolean b18 = payment4.getRefunded();
    java.lang.String str19 = payment4.getPaymentId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test138"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)10, false);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    UseCase1And4.business.User user7 = null;
    payment4.setUser(user7);
    double d9 = payment4.getAmount();
    double d10 = payment4.getAmount();
    boolean b11 = payment4.getRefunded();
    boolean b12 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test139"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)1, false);
    UseCase1And4.business.User user5 = null;
    payment4.setUser(user5);
    payment4.setRefunded(false);
    payment4.setAmount(1.0d);
    java.lang.String str11 = payment4.getPaymentId();
    boolean b12 = payment4.getRefunded();
    boolean b13 = payment4.getRefunded();
    payment4.setPaymentId("hi!");
    boolean b16 = payment4.getRefunded();
    payment4.setRefunded(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test140"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    java.lang.String str11 = payment4.getPaymentId();
    boolean b12 = payment4.getRefunded();
    UseCase1And4.business.User user13 = null;
    payment4.setUser(user13);
    boolean b15 = payment4.getRefunded();
    payment4.setAmount((double)(short)0);
    payment4.setPaymentId("hi!");
    boolean b20 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test141"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("hi!", user1, (double)(byte)10, true);
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    java.lang.String str9 = payment4.getPaymentId();
    payment4.setAmount(10.0d);
    payment4.setPaymentId("hi!");
    java.lang.String str14 = payment4.getPaymentId();
    double d15 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 10.0d);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test142"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    payment4.setAmount((double)(short)100);
    payment4.setAmount((double)1.0f);
    boolean b9 = payment4.getRefunded();
    double d10 = payment4.getAmount();
    double d11 = payment4.getAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.0d);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test143"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)10L, true);
    payment4.setRefunded(true);
    boolean b7 = payment4.getRefunded();
    payment4.setPaymentId("");
    boolean b10 = payment4.getRefunded();
    UseCase1And4.business.User user11 = payment4.getUser();
    boolean b12 = payment4.getRefunded();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test144"); }

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
    payment4.setPaymentId("hi!");
    java.lang.String str21 = payment4.getPaymentId();
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
    org.junit.Assert.assertTrue(d18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test145"); }

    UseCase1And4.business.User user1 = null;
    UseCase1And4.business.Payment payment4 = new UseCase1And4.business.Payment("", user1, (double)'a', true);
    boolean b5 = payment4.getRefunded();
    payment4.setAmount((double)(short)-1);
    double d8 = payment4.getAmount();
    double d9 = payment4.getAmount();
    payment4.setPaymentId("hi!");
    payment4.setPaymentId("");
    payment4.setPaymentId("");
    payment4.setAmount((double)1.0f);
    payment4.setPaymentId("");
    UseCase1And4.business.User user20 = null;
    payment4.setUser(user20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-1.0d));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test146"); }

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
    payment4.setRefunded(true);
    java.lang.String str23 = payment4.getPaymentId();
    UseCase1And4.business.User user24 = payment4.getUser();
    payment4.setRefunded(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user24);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23.test147"); }

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
    payment4.setAmount((double)(byte)-1);
    double d25 = payment4.getAmount();
    UseCase1And4.business.User user26 = payment4.getUser();
    double d27 = payment4.getAmount();
    java.lang.String str28 = payment4.getPaymentId();
    
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
    org.junit.Assert.assertTrue(d25 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(user26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

}
