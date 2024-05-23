
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test001"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    boolean b21 = user5.verifyEmailAddress();
    boolean b22 = user5.verifyEmailAddress();
    boolean b23 = user5.verifyPhoneNumber();
    java.lang.String str24 = user5.getAddress();
    java.lang.String str25 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test002"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str20 = user5.getContactNumber();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test003"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getAddress();
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test004"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getUsername();
    boolean b12 = user5.verifyEmailAddress();
    java.lang.String str13 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test005"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    java.lang.String str26 = user5.getEmail();
    boolean b27 = user5.verifyPhoneNumber();
    boolean b28 = user5.verifyPhoneNumber();
    boolean b29 = user5.verifyEmailAddress();
    user5.setEmail("");
    user5.setAddress("");
    user5.setEmail("hi!");
    boolean b36 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test006"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    boolean b12 = user5.verifyPhoneNumber();
    user5.setPassword("");
    java.lang.String str15 = user5.getContactNumber();
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getEmail();
    java.lang.String str18 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test007"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getPassword();
    user5.setUsername("");
    boolean b23 = user5.verifyEmailAddress();
    java.lang.String str24 = user5.getEmail();
    boolean b25 = user5.verifyEmailAddress();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test008"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    user5.setPassword("hi!");
    java.lang.String str16 = user5.getUsername();
    java.lang.String str17 = user5.getUsername();
    java.lang.String str18 = user5.getPassword();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test009"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str12 = user5.getEmail();
    boolean b13 = user5.verifyPhoneNumber();
    java.lang.String str14 = user5.getPassword();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getContactNumber();
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getPassword();
    boolean b19 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test010"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getContactNumber();
    boolean b14 = user5.verifyPhoneNumber();
    user5.setEmail("");
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getPassword();
    user5.setAddress("hi!");
    java.lang.String str21 = user5.getContactNumber();
    user5.setEmail("");
    user5.setEmail("");
    user5.setContactNumber("hi!");
    boolean b28 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test011"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str19 = user5.getUsername();
    user5.setEmail("");
    java.lang.String str22 = user5.getAddress();
    user5.setUsername("hi!");
    boolean b25 = user5.verifyEmailAddress();
    boolean b26 = user5.verifyPhoneNumber();
    java.lang.String str27 = user5.getContactNumber();
    java.lang.String str28 = user5.getPassword();
    java.lang.String str29 = user5.getUsername();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test012"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test013"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyEmailAddress();
    user5.setEmail("");
    java.lang.String str18 = user5.getUsername();
    boolean b19 = user5.verifyPhoneNumber();
    boolean b20 = user5.verifyPhoneNumber();
    java.lang.String str21 = user5.getAddress();
    java.lang.String str22 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test014"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    user5.setPassword("");
    java.lang.String str10 = user5.getUsername();
    boolean b11 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyEmailAddress();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test015"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setPassword("hi!");
    java.lang.String str12 = user5.getEmail();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test016"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getContactNumber();
    user5.setUsername("hi!");
    user5.setPassword("");
    user5.setContactNumber("");
    boolean b21 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test017"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    boolean b20 = user5.verifyEmailAddress();
    java.lang.String str21 = user5.getPassword();
    java.lang.String str22 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test018"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setContactNumber("");
    user5.setPassword("hi!");
    user5.setAddress("");
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getPassword();
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getAddress();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test019"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getUsername();
    user5.setContactNumber("");
    boolean b19 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    boolean b22 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test020"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    java.lang.String str26 = user5.getEmail();
    boolean b27 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    user5.setUsername("");
    user5.setPassword("");
    user5.setPassword("hi!");
    user5.setUsername("");
    java.lang.String str38 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test021"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyEmailAddress();
    user5.setPassword("");
    java.lang.String str20 = user5.getEmail();
    java.lang.String str21 = user5.getContactNumber();
    java.lang.String str22 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str25 = user5.getAddress();
    java.lang.String str26 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test022"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setEmail("hi!");
    boolean b8 = user5.verifyPhoneNumber();
    user5.setAddress("");
    user5.setEmail("hi!");
    boolean b13 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test023"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    java.lang.String str26 = user5.getUsername();
    java.lang.String str27 = user5.getEmail();
    java.lang.String str28 = user5.getUsername();
    user5.setPassword("hi!");
    java.lang.String str31 = user5.getContactNumber();
    user5.setEmail("hi!");
    boolean b34 = user5.verifyPhoneNumber();
    java.lang.String str35 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test024"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getAddress();
    java.lang.String str17 = user5.getContactNumber();
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getContactNumber();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test025"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setEmail("");
    java.lang.String str10 = user5.getContactNumber();
    user5.setEmail("");
    user5.setContactNumber("");
    user5.setAddress("hi!");
    user5.setUsername("hi!");
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test026"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    user5.setPassword("hi!");
    boolean b13 = user5.verifyEmailAddress();
    java.lang.String str14 = user5.getContactNumber();
    user5.setPassword("hi!");
    java.lang.String str17 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test027"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getPassword();
    user5.setUsername("");
    java.lang.String str23 = user5.getUsername();
    user5.setEmail("hi!");
    user5.setAddress("");
    user5.setUsername("hi!");
    java.lang.String str30 = user5.getPassword();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test028"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setPassword("");
    user5.setUsername("");
    user5.setUsername("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    user5.setUsername("");
    java.lang.String str19 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str22 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test029"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setContactNumber("");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getPassword();
    user5.setAddress("");
    user5.setAddress("hi!");
    user5.setUsername("hi!");
    java.lang.String str18 = user5.getUsername();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test030"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    user5.setPassword("hi!");
    java.lang.String str16 = user5.getUsername();
    boolean b17 = user5.verifyPhoneNumber();
    user5.setPassword("");
    user5.setAddress("");
    user5.setContactNumber("");
    java.lang.String str24 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test031"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    java.lang.String str26 = user5.getEmail();
    boolean b27 = user5.verifyPhoneNumber();
    boolean b28 = user5.verifyPhoneNumber();
    boolean b29 = user5.verifyEmailAddress();
    user5.setEmail("");
    user5.setAddress("");
    user5.setEmail("hi!");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test032"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    user5.setEmail("hi!");
    boolean b18 = user5.verifyEmailAddress();
    java.lang.String str19 = user5.getUsername();
    boolean b20 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    boolean b23 = user5.verifyEmailAddress();
    boolean b24 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test033"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getPassword();
    user5.setEmail("hi!");
    java.lang.String str12 = user5.getUsername();
    boolean b13 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    user5.setPassword("hi!");
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test034"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str9 = user5.getEmail();
    java.lang.String str10 = user5.getAddress();
    user5.setPassword("");
    java.lang.String str13 = user5.getPassword();
    
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
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test035"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    user5.setEmail("");
    user5.setPassword("hi!");
    user5.setContactNumber("");
    java.lang.String str14 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test036"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getContactNumber();
    java.lang.String str18 = user5.getEmail();
    user5.setContactNumber("");
    user5.setAddress("");
    user5.setEmail("");
    user5.setUsername("hi!");
    java.lang.String str27 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test037"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    user5.setEmail("hi!");
    user5.setPassword("");
    user5.setUsername("");
    user5.setEmail("");
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test038"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getContactNumber();
    boolean b14 = user5.verifyPhoneNumber();
    user5.setAddress("");
    java.lang.String str17 = user5.getPassword();
    boolean b18 = user5.verifyPhoneNumber();
    java.lang.String str19 = user5.getPassword();
    user5.setUsername("");
    user5.setEmail("");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test039"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str12 = user5.getPassword();
    boolean b13 = user5.verifyPhoneNumber();
    java.lang.String str14 = user5.getPassword();
    user5.setUsername("hi!");
    boolean b17 = user5.verifyEmailAddress();
    user5.setPassword("");
    java.lang.String str20 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test040"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getEmail();
    user5.setUsername("");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test041"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getContactNumber();
    user5.setEmail("");
    java.lang.String str12 = user5.getContactNumber();
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getEmail();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test042"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    boolean b7 = user5.verifyPhoneNumber();
    user5.setPassword("");
    java.lang.String str10 = user5.getUsername();
    user5.setEmail("");
    user5.setAddress("");
    java.lang.String str15 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test043"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    java.lang.String str7 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str10 = user5.getPassword();
    java.lang.String str11 = user5.getUsername();
    java.lang.String str12 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test044"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    java.lang.String str8 = user5.getAddress();
    user5.setPassword("hi!");
    user5.setContactNumber("");
    java.lang.String str13 = user5.getAddress();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test045"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    java.lang.String str8 = user5.getAddress();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getUsername();
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getUsername();
    java.lang.String str13 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test046"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setEmail("");
    user5.setAddress("");
    boolean b12 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    boolean b15 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test047"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "hi!");
    user5.setEmail("");
    user5.setEmail("");
    java.lang.String str10 = user5.getPassword();
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("");
    java.lang.String str14 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test048"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str19 = user5.getPassword();
    java.lang.String str20 = user5.getUsername();
    boolean b21 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test049"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setAddress("");
    user5.setEmail("hi!");
    java.lang.String str19 = user5.getContactNumber();
    boolean b20 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test050"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setAddress("");
    java.lang.String str17 = user5.getPassword();
    user5.setContactNumber("");
    user5.setPassword("");
    user5.setEmail("hi!");
    java.lang.String str24 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test051"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    user5.setEmail("");
    user5.setContactNumber("hi!");
    boolean b13 = user5.verifyEmailAddress();
    user5.setEmail("");
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str19 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test052"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setAddress("");
    user5.setContactNumber("");
    user5.setContactNumber("hi!");
    boolean b21 = user5.verifyEmailAddress();
    boolean b22 = user5.verifyPhoneNumber();
    java.lang.String str23 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test053"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    java.lang.String str15 = user5.getUsername();
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getContactNumber();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test054"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    boolean b18 = user5.verifyPhoneNumber();
    user5.setEmail("");
    boolean b21 = user5.verifyPhoneNumber();
    java.lang.String str22 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test055"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    boolean b8 = user5.verifyPhoneNumber();
    boolean b9 = user5.verifyEmailAddress();
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getEmail();
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyEmailAddress();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test056"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getPassword();
    java.lang.String str21 = user5.getUsername();
    java.lang.String str22 = user5.getUsername();
    java.lang.String str23 = user5.getContactNumber();
    user5.setUsername("hi!");
    java.lang.String str26 = user5.getUsername();
    user5.setEmail("hi!");
    user5.setUsername("");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test057"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getAddress();
    user5.setEmail("");
    java.lang.String str13 = user5.getAddress();
    user5.setPassword("hi!");
    boolean b16 = user5.verifyEmailAddress();
    java.lang.String str17 = user5.getPassword();
    java.lang.String str18 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test058"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str12 = user5.getPassword();
    boolean b13 = user5.verifyEmailAddress();
    java.lang.String str14 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test059"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getAddress();
    java.lang.String str20 = user5.getContactNumber();
    user5.setEmail("hi!");
    java.lang.String str23 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test060"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test061"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getEmail();
    boolean b19 = user5.verifyEmailAddress();
    user5.setUsername("");
    java.lang.String str22 = user5.getEmail();
    user5.setEmail("hi!");
    boolean b25 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test062"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    boolean b12 = user5.verifyEmailAddress();
    boolean b13 = user5.verifyPhoneNumber();
    java.lang.String str14 = user5.getContactNumber();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test063"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    user5.setContactNumber("");
    user5.setContactNumber("hi!");
    boolean b20 = user5.verifyPhoneNumber();
    boolean b21 = user5.verifyEmailAddress();
    java.lang.String str22 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test064"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getPassword();
    user5.setEmail("hi!");
    java.lang.String str12 = user5.getUsername();
    java.lang.String str13 = user5.getContactNumber();
    user5.setUsername("hi!");
    java.lang.String str16 = user5.getEmail();
    java.lang.String str17 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test065"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getPassword();
    user5.setAddress("");
    java.lang.String str20 = user5.getEmail();
    java.lang.String str21 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test066"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    user5.setPassword("");
    java.lang.String str10 = user5.getUsername();
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test067"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    user5.setPassword("");
    boolean b15 = user5.verifyEmailAddress();
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getAddress();
    java.lang.String str18 = user5.getPassword();
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test068"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    java.lang.String str11 = user5.getPassword();
    java.lang.String str12 = user5.getPassword();
    java.lang.String str13 = user5.getUsername();
    
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
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test069"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setUsername("hi!");
    java.lang.String str24 = user5.getEmail();
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    java.lang.String str29 = user5.getPassword();
    java.lang.String str30 = user5.getPassword();
    java.lang.String str31 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setEmail("");
    java.lang.String str36 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    java.lang.String str39 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!"+ "'", str39.equals("hi!"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test070"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str12 = user5.getPassword();
    boolean b13 = user5.verifyPhoneNumber();
    java.lang.String str14 = user5.getPassword();
    user5.setUsername("hi!");
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getUsername();
    boolean b19 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test071"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    user5.setPassword("");
    boolean b15 = user5.verifyEmailAddress();
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getAddress();
    java.lang.String str18 = user5.getPassword();
    user5.setUsername("hi!");
    java.lang.String str21 = user5.getUsername();
    java.lang.String str22 = user5.getUsername();
    boolean b23 = user5.verifyPhoneNumber();
    java.lang.String str24 = user5.getContactNumber();
    java.lang.String str25 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test072"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    java.lang.String str17 = user5.getAddress();
    user5.setUsername("hi!");
    boolean b20 = user5.verifyPhoneNumber();
    user5.setEmail("");
    java.lang.String str23 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test073"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    user5.setEmail("");
    java.lang.String str18 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setContactNumber("hi!");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test074"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getUsername();
    user5.setUsername("");
    user5.setAddress("");
    user5.setEmail("");
    user5.setPassword("hi!");
    boolean b22 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test075"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getContactNumber();
    user5.setPassword("hi!");
    java.lang.String str17 = user5.getUsername();
    user5.setContactNumber("hi!");
    boolean b20 = user5.verifyPhoneNumber();
    boolean b21 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test076"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    java.lang.String str7 = user5.getUsername();
    java.lang.String str8 = user5.getAddress();
    boolean b9 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test077"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyPhoneNumber();
    java.lang.String str15 = user5.getPassword();
    user5.setEmail("");
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getPassword();
    java.lang.String str20 = user5.getPassword();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test078"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("");
    user5.setEmail("hi!");
    boolean b11 = user5.verifyEmailAddress();
    java.lang.String str12 = user5.getAddress();
    user5.setContactNumber("hi!");
    user5.setContactNumber("");
    java.lang.String str17 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test079"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setEmail("hi!");
    boolean b8 = user5.verifyPhoneNumber();
    user5.setEmail("");
    java.lang.String str11 = user5.getEmail();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str16 = user5.getContactNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setEmail("");
    java.lang.String str20 = user5.getEmail();
    java.lang.String str21 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test080"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setEmail("");
    user5.setEmail("hi!");
    user5.setEmail("");
    java.lang.String str20 = user5.getAddress();
    user5.setContactNumber("");
    java.lang.String str23 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test081"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getPassword();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test082"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    boolean b15 = user5.verifyPhoneNumber();
    user5.setUsername("");
    boolean b18 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test083"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "", "hi!");
    java.lang.String str6 = user5.getUsername();
    user5.setUsername("hi!");
    user5.setPassword("");
    boolean b11 = user5.verifyPhoneNumber();
    java.lang.String str12 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test084"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    user5.setEmail("");
    user5.setUsername("hi!");
    java.lang.String str14 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test085"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    boolean b6 = user5.verifyEmailAddress();
    boolean b7 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    user5.setEmail("hi!");
    java.lang.String str12 = user5.getUsername();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test086"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    boolean b7 = user5.verifyEmailAddress();
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getEmail();
    boolean b11 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test087"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    user5.setContactNumber("");
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str26 = user5.getEmail();
    user5.setEmail("hi!");
    java.lang.String str29 = user5.getUsername();
    user5.setContactNumber("hi!");
    java.lang.String str32 = user5.getEmail();
    user5.setEmail("hi!");
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test088"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "", "hi!", "");
    user5.setEmail("");
    user5.setUsername("");
    java.lang.String str10 = user5.getAddress();
    java.lang.String str11 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test089"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    boolean b21 = user5.verifyEmailAddress();
    boolean b22 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    user5.setUsername("hi!");
    user5.setPassword("hi!");
    java.lang.String str29 = user5.getPassword();
    java.lang.String str30 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test090"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    boolean b17 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    java.lang.String str20 = user5.getAddress();
    user5.setEmail("hi!");
    java.lang.String str23 = user5.getContactNumber();
    java.lang.String str24 = user5.getEmail();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test091"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getUsername();
    java.lang.String str17 = user5.getAddress();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
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
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test092"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    java.lang.String str16 = user5.getUsername();
    java.lang.String str17 = user5.getAddress();
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str22 = user5.getAddress();
    boolean b23 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test093"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    user5.setPassword("");
    boolean b18 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    user5.setAddress("hi!");
    java.lang.String str23 = user5.getContactNumber();
    java.lang.String str24 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test094"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getContactNumber();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test095"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setAddress("");
    user5.setAddress("");
    user5.setPassword("");
    java.lang.String str21 = user5.getPassword();
    java.lang.String str22 = user5.getUsername();
    user5.setPassword("");
    java.lang.String str25 = user5.getPassword();
    boolean b26 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test096"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    java.lang.String str26 = user5.getUsername();
    java.lang.String str27 = user5.getEmail();
    java.lang.String str28 = user5.getUsername();
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    boolean b33 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test097"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getUsername();
    user5.setPassword("");
    user5.setUsername("");
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getAddress();
    user5.setUsername("hi!");
    boolean b18 = user5.verifyEmailAddress();
    boolean b19 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test098"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getAddress();
    java.lang.String str20 = user5.getContactNumber();
    java.lang.String str21 = user5.getPassword();
    java.lang.String str22 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
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

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test099"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    user5.setUsername("hi!");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    user5.setEmail("");
    user5.setUsername("hi!");
    java.lang.String str20 = user5.getEmail();
    boolean b21 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test100"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    boolean b18 = user5.verifyPhoneNumber();
    user5.setEmail("");
    java.lang.String str21 = user5.getPassword();
    user5.setPassword("");
    user5.setAddress("");
    java.lang.String str26 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test101"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    user5.setEmail("");
    user5.setPassword("hi!");
    boolean b20 = user5.verifyEmailAddress();
    java.lang.String str21 = user5.getContactNumber();
    user5.setUsername("");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test102"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    java.lang.String str7 = user5.getContactNumber();
    java.lang.String str8 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test103"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    user5.setAddress("hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    boolean b19 = user5.verifyEmailAddress();
    boolean b20 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test104"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    java.lang.String str7 = user5.getPassword();
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getUsername();
    boolean b10 = user5.verifyEmailAddress();
    java.lang.String str11 = user5.getAddress();
    user5.setUsername("hi!");
    boolean b14 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test105"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    boolean b15 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test106"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("hi!");
    java.lang.String str17 = user5.getUsername();
    user5.setPassword("");
    user5.setAddress("hi!");
    boolean b22 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test107"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    java.lang.String str7 = user5.getUsername();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test108"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setUsername("hi!");
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test109"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getContactNumber();
    user5.setEmail("");
    user5.setEmail("");
    user5.setPassword("hi!");
    java.lang.String str23 = user5.getUsername();
    java.lang.String str24 = user5.getPassword();
    boolean b25 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test110"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setEmail("");
    java.lang.String str10 = user5.getContactNumber();
    boolean b11 = user5.verifyEmailAddress();
    user5.setPassword("");
    user5.setContactNumber("");
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    java.lang.String str20 = user5.getAddress();
    boolean b21 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test111"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    user5.setContactNumber("");
    user5.setUsername("");
    boolean b21 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test112"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str20 = user5.getContactNumber();
    boolean b21 = user5.verifyEmailAddress();
    java.lang.String str22 = user5.getContactNumber();
    java.lang.String str23 = user5.getAddress();
    user5.setAddress("");
    boolean b26 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test113"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    java.lang.String str17 = user5.getAddress();
    java.lang.String str18 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test114"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    boolean b20 = user5.verifyEmailAddress();
    java.lang.String str21 = user5.getPassword();
    boolean b22 = user5.verifyEmailAddress();
    java.lang.String str23 = user5.getPassword();
    java.lang.String str24 = user5.getUsername();
    boolean b25 = user5.verifyEmailAddress();
    boolean b26 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test115"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    java.lang.String str8 = user5.getUsername();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test116"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getPassword();
    java.lang.String str13 = user5.getAddress();
    user5.setUsername("");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test117"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    boolean b21 = user5.verifyEmailAddress();
    boolean b22 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    user5.setUsername("hi!");
    boolean b27 = user5.verifyEmailAddress();
    java.lang.String str28 = user5.getUsername();
    user5.setPassword("hi!");
    user5.setContactNumber("");
    java.lang.String str33 = user5.getContactNumber();
    user5.setAddress("");
    java.lang.String str36 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test118"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "hi!", "hi!");
    user5.setPassword("");
    java.lang.String str8 = user5.getContactNumber();
    boolean b9 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test119"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setUsername("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setUsername("");
    user5.setAddress("");
    java.lang.String str19 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test120"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyPhoneNumber();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getAddress();
    java.lang.String str17 = user5.getPassword();
    user5.setUsername("hi!");
    java.lang.String str20 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test121"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    boolean b10 = user5.verifyEmailAddress();
    user5.setEmail("hi!");
    boolean b13 = user5.verifyEmailAddress();
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("hi!");
    java.lang.String str17 = user5.getContactNumber();
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test122"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    user5.setAddress("");
    user5.setUsername("");
    user5.setUsername("");
    user5.setContactNumber("");
    user5.setContactNumber("");
    java.lang.String str25 = user5.getContactNumber();
    java.lang.String str26 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test123"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    java.lang.String str17 = user5.getEmail();
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test124"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str12 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test125"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getPassword();
    user5.setContactNumber("hi!");
    user5.setAddress("");
    boolean b20 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test126"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setUsername("hi!");
    java.lang.String str24 = user5.getEmail();
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    java.lang.String str29 = user5.getPassword();
    user5.setContactNumber("");
    java.lang.String str32 = user5.getUsername();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test127"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    user5.setPassword("hi!");
    boolean b12 = user5.verifyEmailAddress();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test128"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str12 = user5.getEmail();
    user5.setContactNumber("");
    boolean b15 = user5.verifyPhoneNumber();
    user5.setUsername("");
    user5.setPassword("hi!");
    java.lang.String str20 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test129"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getUsername();
    java.lang.String str16 = user5.getUsername();
    boolean b17 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test130"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "hi!");
    user5.setEmail("");
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getUsername();
    user5.setEmail("");
    user5.setEmail("");
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getAddress();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test131"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    user5.setPassword("");
    java.lang.String str15 = user5.getPassword();
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test132"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getPassword();
    user5.setUsername("");
    boolean b23 = user5.verifyEmailAddress();
    boolean b24 = user5.verifyEmailAddress();
    java.lang.String str25 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test133"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    user5.setEmail("hi!");
    java.lang.String str18 = user5.getPassword();
    user5.setAddress("");
    user5.setAddress("hi!");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str27 = user5.getEmail();
    boolean b28 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test134"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setUsername("");
    user5.setEmail("");
    boolean b18 = user5.verifyPhoneNumber();
    user5.setEmail("");
    java.lang.String str21 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test135"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getPassword();
    user5.setPassword("hi!");
    java.lang.String str22 = user5.getUsername();
    boolean b23 = user5.verifyEmailAddress();
    user5.setEmail("hi!");
    user5.setEmail("");
    java.lang.String str28 = user5.getContactNumber();
    user5.setAddress("");
    java.lang.String str31 = user5.getAddress();
    java.lang.String str32 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test136"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "hi!", "hi!");
    user5.setUsername("hi!");
    java.lang.String str8 = user5.getUsername();
    java.lang.String str9 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test137"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getContactNumber();
    user5.setContactNumber("");
    user5.setContactNumber("");
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getAddress();
    user5.setPassword("hi!");
    java.lang.String str23 = user5.getAddress();
    java.lang.String str24 = user5.getEmail();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test138"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str10 = user5.getUsername();
    user5.setAddress("hi!");
    user5.setUsername("");
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test139"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    boolean b17 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    user5.setPassword("hi!");
    java.lang.String str22 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test140"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setUsername("");
    user5.setEmail("hi!");
    java.lang.String str18 = user5.getUsername();
    user5.setUsername("");
    java.lang.String str21 = user5.getEmail();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test141"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getAddress();
    user5.setPassword("");
    boolean b17 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test142"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    user5.setUsername("hi!");
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getEmail();
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    boolean b20 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test143"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setEmail("");
    java.lang.String str10 = user5.getContactNumber();
    user5.setUsername("hi!");
    boolean b13 = user5.verifyPhoneNumber();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test144"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    boolean b6 = user5.verifyEmailAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setUsername("");
    user5.setContactNumber("hi!");
    java.lang.String str12 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test145"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setAddress("");
    user5.setContactNumber("");
    user5.setContactNumber("hi!");
    boolean b21 = user5.verifyEmailAddress();
    boolean b22 = user5.verifyPhoneNumber();
    java.lang.String str23 = user5.getAddress();
    java.lang.String str24 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test146"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getUsername();
    user5.setPassword("");
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getPassword();
    java.lang.String str21 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test147"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("");
    java.lang.String str9 = user5.getUsername();
    java.lang.String str10 = user5.getUsername();
    java.lang.String str11 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test148"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    java.lang.String str7 = user5.getEmail();
    user5.setAddress("hi!");
    java.lang.String str10 = user5.getContactNumber();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test149"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "", "");
    java.lang.String str6 = user5.getContactNumber();
    boolean b7 = user5.verifyPhoneNumber();
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    java.lang.String str12 = user5.getPassword();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test150"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str25 = user5.getUsername();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test151"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str19 = user5.getUsername();
    user5.setEmail("");
    java.lang.String str22 = user5.getAddress();
    user5.setUsername("hi!");
    java.lang.String str25 = user5.getPassword();
    boolean b26 = user5.verifyPhoneNumber();
    java.lang.String str27 = user5.getUsername();
    user5.setPassword("hi!");
    boolean b30 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test152"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    user5.setEmail("hi!");
    java.lang.String str22 = user5.getEmail();
    user5.setAddress("");
    user5.setPassword("hi!");
    user5.setUsername("hi!");
    java.lang.String str29 = user5.getAddress();
    java.lang.String str30 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test153"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "hi!");
    user5.setEmail("");
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getUsername();
    user5.setEmail("");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test154"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    java.lang.String str16 = user5.getContactNumber();
    user5.setContactNumber("");
    user5.setContactNumber("hi!");
    java.lang.String str21 = user5.getPassword();
    java.lang.String str22 = user5.getContactNumber();
    java.lang.String str23 = user5.getUsername();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test155"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setEmail("");
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getPassword();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test156"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    user5.setEmail("");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getAddress();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test157"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getPassword();
    boolean b13 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getContactNumber();
    java.lang.String str18 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test158"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str10 = user5.getUsername();
    user5.setUsername("");
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    user5.setPassword("");
    boolean b19 = user5.verifyPhoneNumber();
    java.lang.String str20 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test159"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    user5.setContactNumber("");
    java.lang.String str19 = user5.getContactNumber();
    java.lang.String str20 = user5.getContactNumber();
    java.lang.String str21 = user5.getPassword();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test160"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    java.lang.String str17 = user5.getEmail();
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getPassword();
    user5.setContactNumber("");
    user5.setUsername("");
    boolean b24 = user5.verifyPhoneNumber();
    boolean b25 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test161"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    user5.setPassword("hi!");
    user5.setPassword("");
    boolean b20 = user5.verifyPhoneNumber();
    java.lang.String str21 = user5.getUsername();
    java.lang.String str22 = user5.getContactNumber();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test162"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str17 = user5.getUsername();
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getContactNumber();
    user5.setAddress("");
    java.lang.String str22 = user5.getAddress();
    java.lang.String str23 = user5.getAddress();
    java.lang.String str24 = user5.getEmail();
    java.lang.String str25 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test163"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getUsername();
    boolean b17 = user5.verifyPhoneNumber();
    boolean b18 = user5.verifyEmailAddress();
    java.lang.String str19 = user5.getUsername();
    user5.setEmail("hi!");
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test164"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    user5.setContactNumber("");
    java.lang.String str8 = user5.getAddress();
    boolean b9 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    user5.setContactNumber("");
    java.lang.String str14 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test165"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str12 = user5.getPassword();
    boolean b13 = user5.verifyPhoneNumber();
    user5.setAddress("");
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getPassword();
    java.lang.String str18 = user5.getUsername();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test166"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    user5.setUsername("hi!");
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getEmail();
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test167"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    user5.setPassword("");
    user5.setAddress("hi!");
    boolean b11 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test168"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getAddress();
    java.lang.String str12 = user5.getPassword();
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getUsername();
    boolean b16 = user5.verifyEmailAddress();
    java.lang.String str17 = user5.getAddress();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
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
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test169"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "hi!", "");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getUsername();
    java.lang.String str9 = user5.getEmail();
    java.lang.String str10 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test170"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    user5.setAddress("");
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getAddress();
    java.lang.String str19 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test171"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getEmail();
    boolean b10 = user5.verifyEmailAddress();
    user5.setUsername("");
    java.lang.String str13 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test172"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getAddress();
    user5.setEmail("hi!");
    java.lang.String str19 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test173"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test174"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    user5.setEmail("");
    java.lang.String str18 = user5.getAddress();
    user5.setUsername("hi!");
    java.lang.String str21 = user5.getEmail();
    user5.setEmail("hi!");
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test175"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getAddress();
    java.lang.String str12 = user5.getContactNumber();
    java.lang.String str13 = user5.getUsername();
    user5.setContactNumber("hi!");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test176"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    boolean b21 = user5.verifyEmailAddress();
    user5.setEmail("");
    user5.setContactNumber("");
    boolean b26 = user5.verifyPhoneNumber();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test177"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    user5.setAddress("");
    user5.setPassword("hi!");
    java.lang.String str10 = user5.getPassword();
    user5.setUsername("");
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getContactNumber();
    user5.setEmail("");
    boolean b17 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test178"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getAddress();
    java.lang.String str15 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test179"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    user5.setEmail("hi!");
    java.lang.String str22 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test180"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str14 = user5.getAddress();
    user5.setContactNumber("");
    java.lang.String str17 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test181"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getUsername();
    boolean b17 = user5.verifyPhoneNumber();
    boolean b18 = user5.verifyEmailAddress();
    java.lang.String str19 = user5.getPassword();
    java.lang.String str20 = user5.getAddress();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test182"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "hi!");
    user5.setEmail("");
    java.lang.String str8 = user5.getUsername();
    user5.setAddress("hi!");
    boolean b11 = user5.verifyEmailAddress();
    java.lang.String str12 = user5.getPassword();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test183"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    user5.setAddress("hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("");
    boolean b21 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test184"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyEmailAddress();
    java.lang.String str16 = user5.getPassword();
    user5.setAddress("");
    java.lang.String str19 = user5.getContactNumber();
    java.lang.String str20 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test185"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    java.lang.String str8 = user5.getUsername();
    java.lang.String str9 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test186"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    java.lang.String str26 = user5.getUsername();
    java.lang.String str27 = user5.getEmail();
    java.lang.String str28 = user5.getUsername();
    user5.setUsername("hi!");
    boolean b31 = user5.verifyPhoneNumber();
    java.lang.String str32 = user5.getEmail();
    java.lang.String str33 = user5.getContactNumber();
    java.lang.String str34 = user5.getContactNumber();
    user5.setContactNumber("");
    java.lang.String str37 = user5.getContactNumber();
    java.lang.String str38 = user5.getUsername();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test187"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "", "");
    java.lang.String str6 = user5.getContactNumber();
    boolean b7 = user5.verifyPhoneNumber();
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("");
    user5.setContactNumber("");
    java.lang.String str13 = user5.getEmail();
    boolean b14 = user5.verifyEmailAddress();
    boolean b15 = user5.verifyEmailAddress();
    java.lang.String str16 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test188"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    user5.setUsername("hi!");
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("");
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test189"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setContactNumber("hi!");
    boolean b12 = user5.verifyEmailAddress();
    java.lang.String str13 = user5.getPassword();
    user5.setEmail("");
    java.lang.String str16 = user5.getPassword();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test190"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    boolean b12 = user5.verifyEmailAddress();
    boolean b13 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test191"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    user5.setAddress("hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    boolean b19 = user5.verifyEmailAddress();
    java.lang.String str20 = user5.getUsername();
    java.lang.String str21 = user5.getUsername();
    boolean b22 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test192"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getUsername();
    user5.setEmail("hi!");
    java.lang.String str19 = user5.getUsername();
    java.lang.String str20 = user5.getPassword();
    java.lang.String str21 = user5.getUsername();
    java.lang.String str22 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
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
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test193"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    boolean b7 = user5.verifyEmailAddress();
    java.lang.String str8 = user5.getUsername();
    java.lang.String str9 = user5.getUsername();
    boolean b10 = user5.verifyEmailAddress();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test194"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str17 = user5.getUsername();
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getAddress();
    user5.setEmail("");
    java.lang.String str22 = user5.getEmail();
    java.lang.String str23 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test195"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getEmail();
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getContactNumber();
    java.lang.String str18 = user5.getPassword();
    java.lang.String str19 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test196"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getAddress();
    java.lang.String str20 = user5.getContactNumber();
    java.lang.String str21 = user5.getAddress();
    user5.setContactNumber("");
    java.lang.String str24 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str27 = user5.getUsername();
    user5.setEmail("");
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test197"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    user5.setPassword("");
    boolean b18 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test198"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    user5.setAddress("");
    user5.setPassword("hi!");
    java.lang.String str10 = user5.getPassword();
    user5.setUsername("");
    java.lang.String str13 = user5.getPassword();
    user5.setUsername("");
    java.lang.String str16 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str19 = user5.getUsername();
    boolean b20 = user5.verifyPhoneNumber();
    user5.setUsername("");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test199"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    user5.setPassword("hi!");
    user5.setPassword("");
    boolean b20 = user5.verifyPhoneNumber();
    java.lang.String str21 = user5.getUsername();
    java.lang.String str22 = user5.getContactNumber();
    java.lang.String str23 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test200"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "", "hi!");
    user5.setAddress("");
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getPassword();
    java.lang.String str11 = user5.getContactNumber();
    java.lang.String str12 = user5.getAddress();
    
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
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test201"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    user5.setPassword("");
    user5.setAddress("hi!");
    java.lang.String str21 = user5.getUsername();
    boolean b22 = user5.verifyEmailAddress();
    java.lang.String str23 = user5.getAddress();
    boolean b24 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test202"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setAddress("");
    java.lang.String str19 = user5.getAddress();
    java.lang.String str20 = user5.getContactNumber();
    java.lang.String str21 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test203"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getPassword();
    java.lang.String str21 = user5.getUsername();
    java.lang.String str22 = user5.getUsername();
    java.lang.String str23 = user5.getContactNumber();
    user5.setUsername("hi!");
    java.lang.String str26 = user5.getUsername();
    user5.setPassword("");
    java.lang.String str29 = user5.getUsername();
    java.lang.String str30 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test204"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    user5.setAddress("");
    user5.setPassword("hi!");
    java.lang.String str10 = user5.getPassword();
    user5.setUsername("");
    java.lang.String str13 = user5.getPassword();
    user5.setUsername("");
    user5.setUsername("hi!");
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test205"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getPassword();
    user5.setPassword("hi!");
    java.lang.String str22 = user5.getPassword();
    java.lang.String str23 = user5.getPassword();
    java.lang.String str24 = user5.getContactNumber();
    java.lang.String str25 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test206"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("");
    java.lang.String str16 = user5.getAddress();
    java.lang.String str17 = user5.getUsername();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test207"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getPassword();
    user5.setPassword("hi!");
    java.lang.String str22 = user5.getUsername();
    user5.setEmail("");
    user5.setUsername("");
    boolean b27 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test208"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    boolean b9 = user5.verifyEmailAddress();
    user5.setEmail("");
    java.lang.String str12 = user5.getUsername();
    java.lang.String str13 = user5.getAddress();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test209"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    java.lang.String str16 = user5.getAddress();
    user5.setAddress("");
    java.lang.String str19 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test210"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    boolean b9 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    java.lang.String str12 = user5.getContactNumber();
    boolean b13 = user5.verifyEmailAddress();
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    java.lang.String str18 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test211"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    java.lang.String str7 = user5.getPassword();
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getUsername();
    boolean b10 = user5.verifyEmailAddress();
    java.lang.String str11 = user5.getAddress();
    user5.setUsername("hi!");
    java.lang.String str14 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test212"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getPassword();
    java.lang.String str20 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test213"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    user5.setAddress("hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("");
    boolean b21 = user5.verifyPhoneNumber();
    java.lang.String str22 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test214"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getPassword();
    user5.setUsername("");
    boolean b23 = user5.verifyEmailAddress();
    java.lang.String str24 = user5.getEmail();
    java.lang.String str25 = user5.getAddress();
    java.lang.String str26 = user5.getPassword();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test215"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getContactNumber();
    user5.setUsername("");
    user5.setContactNumber("");
    boolean b20 = user5.verifyEmailAddress();
    user5.setAddress("");
    user5.setPassword("");
    boolean b25 = user5.verifyEmailAddress();
    java.lang.String str26 = user5.getContactNumber();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test216"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getEmail();
    boolean b10 = user5.verifyEmailAddress();
    user5.setUsername("");
    java.lang.String str13 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test217"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    user5.setUsername("");
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getPassword();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test218"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    user5.setContactNumber("");
    java.lang.String str13 = user5.getContactNumber();
    user5.setUsername("");
    user5.setAddress("");
    boolean b18 = user5.verifyPhoneNumber();
    user5.setPassword("hi!");
    user5.setAddress("");
    user5.setAddress("hi!");
    boolean b25 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test219"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    user5.setUsername("");
    java.lang.String str18 = user5.getAddress();
    boolean b19 = user5.verifyPhoneNumber();
    java.lang.String str20 = user5.getUsername();
    java.lang.String str21 = user5.getAddress();
    java.lang.String str22 = user5.getPassword();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test220"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setAddress("");
    java.lang.String str17 = user5.getEmail();
    boolean b18 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test221"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getUsername();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getContactNumber();
    java.lang.String str18 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test222"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getUsername();
    user5.setPassword("hi!");
    java.lang.String str12 = user5.getEmail();
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test223"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    java.lang.String str16 = user5.getContactNumber();
    user5.setUsername("");
    boolean b19 = user5.verifyPhoneNumber();
    java.lang.String str20 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test224"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getUsername();
    user5.setUsername("");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test225"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    user5.setUsername("");
    boolean b13 = user5.verifyPhoneNumber();
    java.lang.String str14 = user5.getAddress();
    boolean b15 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test226"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getUsername();
    user5.setUsername("");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    user5.setContactNumber("hi!");
    user5.setPassword("");
    java.lang.String str24 = user5.getContactNumber();
    java.lang.String str25 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setEmail("");
    user5.setEmail("");
    java.lang.String str32 = user5.getAddress();
    java.lang.String str33 = user5.getAddress();
    java.lang.String str34 = user5.getAddress();
    java.lang.String str35 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test227"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyEmailAddress();
    java.lang.String str16 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str19 = user5.getPassword();
    java.lang.String str20 = user5.getAddress();
    user5.setAddress("");
    java.lang.String str23 = user5.getEmail();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test228"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setPassword("hi!");
    boolean b17 = user5.verifyEmailAddress();
    user5.setEmail("");
    java.lang.String str20 = user5.getPassword();
    java.lang.String str21 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test229"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    java.lang.String str13 = user5.getContactNumber();
    user5.setEmail("hi!");
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getContactNumber();
    boolean b18 = user5.verifyEmailAddress();
    java.lang.String str19 = user5.getEmail();
    boolean b20 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test230"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setAddress("");
    java.lang.String str17 = user5.getEmail();
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    java.lang.String str22 = user5.getUsername();
    boolean b23 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test231"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str19 = user5.getUsername();
    user5.setEmail("");
    java.lang.String str22 = user5.getAddress();
    user5.setContactNumber("hi!");
    boolean b25 = user5.verifyEmailAddress();
    boolean b26 = user5.verifyEmailAddress();
    boolean b27 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    boolean b30 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test232"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getContactNumber();
    user5.setPassword("hi!");
    java.lang.String str21 = user5.getUsername();
    java.lang.String str22 = user5.getEmail();
    boolean b23 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test233"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("hi!");
    java.lang.String str17 = user5.getContactNumber();
    boolean b18 = user5.verifyPhoneNumber();
    user5.setPassword("");
    boolean b21 = user5.verifyPhoneNumber();
    user5.setEmail("");
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test234"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    boolean b18 = user5.verifyPhoneNumber();
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str27 = user5.getUsername();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test235"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    user5.setEmail("hi!");
    boolean b18 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    user5.setAddress("hi!");
    java.lang.String str23 = user5.getEmail();
    java.lang.String str24 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test236"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "hi!", "hi!");
    user5.setPassword("");
    user5.setEmail("hi!");

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test237"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setPassword("hi!");
    boolean b12 = user5.verifyPhoneNumber();
    boolean b13 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("");
    java.lang.String str20 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test238"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    boolean b9 = user5.verifyEmailAddress();
    user5.setEmail("");
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test239"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getPassword();
    boolean b18 = user5.verifyEmailAddress();
    java.lang.String str19 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test240"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    user5.setAddress("");
    java.lang.String str17 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test241"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    user5.setAddress("");
    java.lang.String str19 = user5.getContactNumber();
    java.lang.String str20 = user5.getEmail();
    user5.setEmail("hi!");
    java.lang.String str23 = user5.getAddress();
    boolean b24 = user5.verifyEmailAddress();
    boolean b25 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test242"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setContactNumber("hi!");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test243"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getAddress();
    user5.setAddress("");
    java.lang.String str22 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test244"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    user5.setPassword("");
    user5.setContactNumber("");
    user5.setContactNumber("hi!");
    user5.setUsername("");
    java.lang.String str22 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test245"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getAddress();
    user5.setContactNumber("hi!");
    java.lang.String str22 = user5.getAddress();
    java.lang.String str23 = user5.getContactNumber();
    user5.setContactNumber("");
    user5.setPassword("");
    java.lang.String str28 = user5.getContactNumber();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test246"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getUsername();
    boolean b17 = user5.verifyEmailAddress();
    boolean b18 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str21 = user5.getEmail();
    java.lang.String str22 = user5.getUsername();
    java.lang.String str23 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test247"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setUsername("");
    boolean b16 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    java.lang.String str19 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test248"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setAddress("");
    user5.setContactNumber("");
    java.lang.String str19 = user5.getAddress();
    java.lang.String str20 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test249"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setEmail("");
    user5.setPassword("");
    java.lang.String str14 = user5.getAddress();
    boolean b15 = user5.verifyEmailAddress();
    java.lang.String str16 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test250"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    user5.setPassword("hi!");
    user5.setContactNumber("");
    user5.setEmail("hi!");

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test251"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "hi!");
    user5.setEmail("");
    java.lang.String str8 = user5.getUsername();
    user5.setAddress("hi!");
    user5.setUsername("hi!");
    java.lang.String str13 = user5.getAddress();
    user5.setUsername("hi!");
    java.lang.String str16 = user5.getAddress();
    java.lang.String str17 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test252"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str20 = user5.getContactNumber();
    boolean b21 = user5.verifyEmailAddress();
    user5.setUsername("");
    boolean b24 = user5.verifyPhoneNumber();
    java.lang.String str25 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test253"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str20 = user5.getContactNumber();
    boolean b21 = user5.verifyEmailAddress();
    java.lang.String str22 = user5.getContactNumber();
    boolean b23 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test254"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    boolean b21 = user5.verifyEmailAddress();
    boolean b22 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    java.lang.String str25 = user5.getAddress();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test255"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    boolean b10 = user5.verifyEmailAddress();
    user5.setEmail("hi!");
    boolean b13 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setEmail("");
    java.lang.String str18 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test256"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    user5.setEmail("");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test257"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    user5.setEmail("");
    boolean b20 = user5.verifyPhoneNumber();
    boolean b21 = user5.verifyPhoneNumber();
    java.lang.String str22 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test258"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyPhoneNumber();
    java.lang.String str15 = user5.getUsername();
    java.lang.String str16 = user5.getContactNumber();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test259"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getUsername();
    user5.setPassword("");
    user5.setUsername("");
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test260"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    user5.setUsername("");
    boolean b21 = user5.verifyPhoneNumber();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test261"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    java.lang.String str14 = user5.getAddress();
    java.lang.String str15 = user5.getUsername();
    java.lang.String str16 = user5.getUsername();
    java.lang.String str17 = user5.getContactNumber();
    boolean b18 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test262"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setContactNumber("");
    java.lang.String str12 = user5.getEmail();
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getPassword();
    java.lang.String str21 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test263"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    boolean b10 = user5.verifyPhoneNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setEmail("");
    boolean b14 = user5.verifyPhoneNumber();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test264"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    boolean b17 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    java.lang.String str20 = user5.getAddress();
    user5.setEmail("hi!");
    java.lang.String str23 = user5.getContactNumber();
    java.lang.String str24 = user5.getPassword();
    boolean b25 = user5.verifyEmailAddress();
    user5.setUsername("");
    boolean b28 = user5.verifyEmailAddress();
    java.lang.String str29 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test265"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getEmail();
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getEmail();
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getContactNumber();
    boolean b20 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test266"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    user5.setUsername("hi!");

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test267"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setContactNumber("");
    java.lang.String str12 = user5.getEmail();
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getEmail();
    boolean b21 = user5.verifyPhoneNumber();
    user5.setEmail("");
    java.lang.String str24 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test268"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "hi!", "hi!");
    user5.setPassword("");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getEmail();
    user5.setAddress("hi!");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test269"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "hi!");
    user5.setPassword("");
    user5.setContactNumber("");

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test270"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str14 = user5.getUsername();
    boolean b15 = user5.verifyEmailAddress();
    user5.setEmail("");
    boolean b18 = user5.verifyPhoneNumber();
    user5.setPassword("");
    boolean b21 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test271"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    java.lang.String str26 = user5.getUsername();
    java.lang.String str27 = user5.getEmail();
    java.lang.String str28 = user5.getUsername();
    user5.setUsername("hi!");
    boolean b31 = user5.verifyPhoneNumber();
    java.lang.String str32 = user5.getEmail();
    java.lang.String str33 = user5.getContactNumber();
    java.lang.String str34 = user5.getContactNumber();
    user5.setContactNumber("");
    java.lang.String str37 = user5.getContactNumber();
    java.lang.String str38 = user5.getUsername();
    user5.setUsername("hi!");
    java.lang.String str41 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test272"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    boolean b8 = user5.verifyPhoneNumber();
    boolean b9 = user5.verifyEmailAddress();
    boolean b10 = user5.verifyPhoneNumber();
    java.lang.String str11 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test273"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    user5.setAddress("");
    java.lang.String str14 = user5.getEmail();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getUsername();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test274"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getAddress();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test275"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getPassword();
    java.lang.String str21 = user5.getUsername();
    java.lang.String str22 = user5.getUsername();
    java.lang.String str23 = user5.getContactNumber();
    user5.setUsername("hi!");
    java.lang.String str26 = user5.getUsername();
    user5.setPassword("");
    java.lang.String str29 = user5.getContactNumber();
    java.lang.String str30 = user5.getAddress();
    boolean b31 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test276"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    user5.setUsername("hi!");
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("");
    java.lang.String str17 = user5.getAddress();
    user5.setPassword("");
    java.lang.String str20 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test277"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setAddress("");
    java.lang.String str19 = user5.getContactNumber();
    user5.setEmail("hi!");
    java.lang.String str22 = user5.getContactNumber();
    java.lang.String str23 = user5.getPassword();
    java.lang.String str24 = user5.getEmail();
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test278"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    java.lang.String str17 = user5.getAddress();
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test279"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    boolean b15 = user5.verifyEmailAddress();
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test280"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    java.lang.String str8 = user5.getUsername();
    user5.setPassword("hi!");
    java.lang.String str11 = user5.getAddress();
    java.lang.String str12 = user5.getContactNumber();
    java.lang.String str13 = user5.getContactNumber();
    user5.setEmail("");
    
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
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test281"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getAddress();
    java.lang.String str17 = user5.getEmail();
    boolean b18 = user5.verifyPhoneNumber();
    java.lang.String str19 = user5.getEmail();
    boolean b20 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    boolean b23 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test282"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setPassword("hi!");
    java.lang.String str24 = user5.getPassword();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test283"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str19 = user5.getAddress();
    java.lang.String str20 = user5.getPassword();
    user5.setEmail("hi!");
    java.lang.String str23 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test284"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    boolean b7 = user5.verifyPhoneNumber();
    user5.setEmail("");
    java.lang.String str10 = user5.getAddress();
    user5.setUsername("");
    boolean b13 = user5.verifyPhoneNumber();
    user5.setAddress("");
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test285"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    user5.setEmail("");
    user5.setUsername("");
    user5.setEmail("");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test286"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setPassword("");
    user5.setUsername("");
    user5.setUsername("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    java.lang.String str19 = user5.getEmail();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test287"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setUsername("");
    java.lang.String str17 = user5.getUsername();
    user5.setUsername("hi!");
    java.lang.String str20 = user5.getUsername();
    user5.setUsername("");
    java.lang.String str23 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test288"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getContactNumber();
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    boolean b20 = user5.verifyPhoneNumber();
    java.lang.String str21 = user5.getEmail();
    java.lang.String str22 = user5.getPassword();
    user5.setEmail("");
    java.lang.String str25 = user5.getAddress();
    java.lang.String str26 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test289"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getAddress();
    boolean b17 = user5.verifyPhoneNumber();
    user5.setUsername("");
    user5.setUsername("");
    user5.setPassword("hi!");
    java.lang.String str24 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test290"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    user5.setAddress("");
    user5.setPassword("hi!");
    java.lang.String str10 = user5.getPassword();
    java.lang.String str11 = user5.getContactNumber();
    user5.setUsername("hi!");
    boolean b14 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test291"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getUsername();
    java.lang.String str11 = user5.getPassword();
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getContactNumber();
    java.lang.String str14 = user5.getPassword();
    user5.setEmail("");
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test292"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    user5.setEmail("");
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getUsername();
    user5.setUsername("hi!");
    user5.setAddress("");
    java.lang.String str23 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test293"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getContactNumber();
    java.lang.String str18 = user5.getEmail();
    user5.setContactNumber("");
    user5.setAddress("");
    user5.setEmail("");
    user5.setUsername("hi!");
    java.lang.String str27 = user5.getEmail();
    java.lang.String str28 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test294"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("");
    java.lang.String str12 = user5.getEmail();
    user5.setUsername("hi!");
    java.lang.String str15 = user5.getEmail();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test295"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    user5.setEmail("");
    user5.setPassword("hi!");
    user5.setContactNumber("");
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getEmail();
    user5.setEmail("hi!");
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test296"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyEmailAddress();
    java.lang.String str16 = user5.getPassword();
    user5.setPassword("");
    user5.setAddress("");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test297"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    user5.setUsername("");
    boolean b15 = user5.verifyEmailAddress();
    user5.setPassword("");
    boolean b18 = user5.verifyPhoneNumber();
    java.lang.String str19 = user5.getPassword();
    java.lang.String str20 = user5.getUsername();
    boolean b21 = user5.verifyEmailAddress();
    boolean b22 = user5.verifyPhoneNumber();
    java.lang.String str23 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test298"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getContactNumber();
    java.lang.String str18 = user5.getEmail();
    java.lang.String str19 = user5.getEmail();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test299"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getAddress();
    user5.setAddress("");
    boolean b19 = user5.verifyPhoneNumber();
    java.lang.String str20 = user5.getUsername();
    boolean b21 = user5.verifyPhoneNumber();
    user5.setUsername("");
    java.lang.String str24 = user5.getEmail();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test300"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getContactNumber();
    user5.setUsername("");
    user5.setAddress("hi!");
    java.lang.String str21 = user5.getContactNumber();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test301"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getUsername();
    user5.setUsername("");
    user5.setUsername("hi!");
    java.lang.String str18 = user5.getPassword();
    java.lang.String str19 = user5.getEmail();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test302"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getContactNumber();
    boolean b11 = user5.verifyPhoneNumber();
    java.lang.String str12 = user5.getAddress();
    boolean b13 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test303"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getAddress();
    boolean b15 = user5.verifyEmailAddress();
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getUsername();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test304"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    boolean b8 = user5.verifyPhoneNumber();
    boolean b9 = user5.verifyEmailAddress();
    user5.setAddress("");
    boolean b12 = user5.verifyEmailAddress();
    java.lang.String str13 = user5.getContactNumber();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test305"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    user5.setPassword("");
    java.lang.String str20 = user5.getEmail();
    user5.setPassword("");
    boolean b23 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test306"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    java.lang.String str26 = user5.getEmail();
    java.lang.String str27 = user5.getUsername();
    java.lang.String str28 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test307"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getUsername();
    user5.setPassword("");
    user5.setPassword("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    java.lang.String str15 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test308"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    user5.setUsername("hi!");
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getEmail();
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str20 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str23 = user5.getEmail();
    java.lang.String str24 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test309"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    user5.setAddress("");
    user5.setPassword("hi!");
    java.lang.String str10 = user5.getPassword();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test310"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    user5.setAddress("");
    java.lang.String str19 = user5.getAddress();
    user5.setAddress("");
    java.lang.String str22 = user5.getAddress();
    java.lang.String str23 = user5.getEmail();
    boolean b24 = user5.verifyEmailAddress();
    java.lang.String str25 = user5.getEmail();
    boolean b26 = user5.verifyPhoneNumber();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test311"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getContactNumber();
    java.lang.String str20 = user5.getEmail();
    java.lang.String str21 = user5.getContactNumber();
    boolean b22 = user5.verifyEmailAddress();
    boolean b23 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test312"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getContactNumber();
    boolean b14 = user5.verifyPhoneNumber();
    user5.setEmail("");
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getPassword();
    user5.setAddress("hi!");
    java.lang.String str21 = user5.getContactNumber();
    user5.setEmail("");
    user5.setAddress("");
    java.lang.String str26 = user5.getEmail();
    java.lang.String str27 = user5.getAddress();
    java.lang.String str28 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test313"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getContactNumber();
    boolean b14 = user5.verifyPhoneNumber();
    user5.setAddress("");
    java.lang.String str17 = user5.getPassword();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test314"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setUsername("");
    user5.setEmail("");
    boolean b18 = user5.verifyPhoneNumber();
    java.lang.String str19 = user5.getPassword();
    user5.setAddress("hi!");
    boolean b22 = user5.verifyEmailAddress();
    java.lang.String str23 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test315"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getContactNumber();
    user5.setContactNumber("");
    user5.setContactNumber("");
    user5.setPassword("");
    user5.setUsername("hi!");
    java.lang.String str23 = user5.getAddress();
    java.lang.String str24 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test316"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    java.lang.String str26 = user5.getEmail();
    user5.setContactNumber("hi!");
    java.lang.String str29 = user5.getAddress();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test317"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test318"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    java.lang.String str16 = user5.getContactNumber();
    user5.setUsername("");
    java.lang.String str19 = user5.getEmail();
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test319"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getUsername();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getUsername();
    java.lang.String str17 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test320"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    java.lang.String str26 = user5.getUsername();
    java.lang.String str27 = user5.getEmail();
    java.lang.String str28 = user5.getUsername();
    user5.setUsername("hi!");
    boolean b31 = user5.verifyEmailAddress();
    java.lang.String str32 = user5.getEmail();
    java.lang.String str33 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test321"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getAddress();
    java.lang.String str12 = user5.getPassword();
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getUsername();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test322"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    user5.setAddress("");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test323"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setContactNumber("");
    user5.setEmail("");
    java.lang.String str12 = user5.getUsername();
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test324"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getPassword();
    user5.setPassword("hi!");
    java.lang.String str22 = user5.getPassword();
    boolean b23 = user5.verifyPhoneNumber();
    java.lang.String str24 = user5.getUsername();
    boolean b25 = user5.verifyPhoneNumber();
    java.lang.String str26 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test325"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getContactNumber();
    user5.setEmail("");
    java.lang.String str12 = user5.getContactNumber();
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getUsername();
    boolean b15 = user5.verifyEmailAddress();
    boolean b16 = user5.verifyEmailAddress();
    
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
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test326"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "", "", "");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    java.lang.String str11 = user5.getPassword();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test327"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    user5.setEmail("hi!");
    java.lang.String str18 = user5.getPassword();
    user5.setAddress("");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    java.lang.String str25 = user5.getEmail();
    java.lang.String str26 = user5.getEmail();
    java.lang.String str27 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test328"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    user5.setAddress("");
    java.lang.String str19 = user5.getAddress();
    user5.setContactNumber("");
    user5.setAddress("hi!");
    java.lang.String str24 = user5.getUsername();
    java.lang.String str25 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str28 = user5.getContactNumber();
    user5.setAddress("");
    user5.setPassword("");
    java.lang.String str33 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test329"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test330"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getUsername();
    user5.setUsername("");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    java.lang.String str20 = user5.getPassword();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test331"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str16 = user5.getAddress();
    java.lang.String str17 = user5.getEmail();
    boolean b18 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test332"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    user5.setEmail("");
    java.lang.String str16 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test333"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str10 = user5.getUsername();
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test334"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    user5.setPassword("");
    boolean b19 = user5.verifyPhoneNumber();
    java.lang.String str20 = user5.getAddress();
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test335"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getPassword();
    user5.setPassword("hi!");
    java.lang.String str22 = user5.getUsername();
    user5.setEmail("");
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test336"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "");
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    user5.setPassword("");
    java.lang.String str12 = user5.getUsername();
    java.lang.String str13 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test337"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    user5.setEmail("");
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getContactNumber();
    java.lang.String str20 = user5.getUsername();
    user5.setAddress("");
    boolean b23 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test338"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str17 = user5.getUsername();
    java.lang.String str18 = user5.getContactNumber();
    user5.setContactNumber("");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test339"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    boolean b13 = user5.verifyPhoneNumber();
    boolean b14 = user5.verifyPhoneNumber();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test340"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    boolean b9 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    java.lang.String str12 = user5.getUsername();
    java.lang.String str13 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str16 = user5.getAddress();
    java.lang.String str17 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
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
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test341"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getEmail();
    java.lang.String str11 = user5.getPassword();
    user5.setContactNumber("");
    user5.setAddress("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getPassword();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test342"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getAddress();
    java.lang.String str17 = user5.getContactNumber();
    boolean b18 = user5.verifyEmailAddress();
    user5.setAddress("");
    user5.setContactNumber("hi!");
    boolean b23 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test343"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    java.lang.String str26 = user5.getEmail();
    boolean b27 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    user5.setUsername("");
    user5.setContactNumber("");
    user5.setUsername("");
    java.lang.String str36 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test344"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setUsername("");
    java.lang.String str17 = user5.getAddress();
    java.lang.String str18 = user5.getAddress();
    user5.setUsername("");
    java.lang.String str21 = user5.getUsername();
    boolean b22 = user5.verifyEmailAddress();
    java.lang.String str23 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test345"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    user5.setUsername("");
    java.lang.String str15 = user5.getPassword();
    user5.setAddress("");
    user5.setEmail("hi!");
    user5.setContactNumber("");
    boolean b22 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test346"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setEmail("");
    java.lang.String str10 = user5.getEmail();
    user5.setUsername("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getAddress();
    
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

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test347"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    user5.setAddress("");
    java.lang.String str19 = user5.getAddress();
    user5.setAddress("");
    java.lang.String str22 = user5.getAddress();
    java.lang.String str23 = user5.getEmail();
    user5.setUsername("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str28 = user5.getContactNumber();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test348"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getUsername();
    java.lang.String str12 = user5.getEmail();
    user5.setUsername("");
    java.lang.String str15 = user5.getUsername();
    
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
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test349"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "");
    boolean b6 = user5.verifyPhoneNumber();
    java.lang.String str7 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test350"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    user5.setEmail("");
    java.lang.String str10 = user5.getUsername();
    java.lang.String str11 = user5.getContactNumber();
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test351"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getContactNumber();
    boolean b9 = user5.verifyEmailAddress();
    boolean b10 = user5.verifyPhoneNumber();
    boolean b11 = user5.verifyEmailAddress();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test352"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    user5.setEmail("hi!");
    user5.setPassword("");
    java.lang.String str24 = user5.getContactNumber();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test353"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    user5.setEmail("hi!");
    boolean b22 = user5.verifyEmailAddress();
    java.lang.String str23 = user5.getContactNumber();
    java.lang.String str24 = user5.getEmail();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test354"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    user5.setPassword("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getPassword();
    java.lang.String str15 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test355"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    boolean b12 = user5.verifyPhoneNumber();
    user5.setEmail("");
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test356"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    user5.setAddress("");
    java.lang.String str19 = user5.getContactNumber();
    user5.setContactNumber("");
    java.lang.String str22 = user5.getAddress();
    java.lang.String str23 = user5.getUsername();
    user5.setContactNumber("hi!");
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test357"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getAddress();
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    user5.setContactNumber("hi!");
    user5.setContactNumber("");
    user5.setUsername("");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test358"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getUsername();
    user5.setPassword("");
    user5.setUsername("");
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getAddress();
    user5.setUsername("hi!");
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test359"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getContactNumber();
    boolean b9 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test360"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    user5.setEmail("");
    boolean b18 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test361"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setAddress("");
    java.lang.String str14 = user5.getPassword();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test362"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    user5.setUsername("");
    user5.setUsername("");
    boolean b21 = user5.verifyPhoneNumber();
    user5.setUsername("");
    boolean b24 = user5.verifyEmailAddress();
    user5.setPassword("");
    boolean b27 = user5.verifyPhoneNumber();
    java.lang.String str28 = user5.getEmail();
    user5.setContactNumber("hi!");
    java.lang.String str31 = user5.getUsername();
    java.lang.String str32 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test363"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    java.lang.String str12 = user5.getContactNumber();
    user5.setUsername("hi!");
    user5.setUsername("");
    user5.setEmail("hi!");
    
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
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test364"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    boolean b17 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    java.lang.String str20 = user5.getContactNumber();
    boolean b21 = user5.verifyPhoneNumber();
    boolean b22 = user5.verifyPhoneNumber();
    java.lang.String str23 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test365"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    java.lang.String str12 = user5.getUsername();
    java.lang.String str13 = user5.getContactNumber();
    boolean b14 = user5.verifyPhoneNumber();
    boolean b15 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test366"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    boolean b10 = user5.verifyPhoneNumber();
    java.lang.String str11 = user5.getUsername();
    java.lang.String str12 = user5.getContactNumber();
    user5.setAddress("hi!");
    java.lang.String str15 = user5.getAddress();
    user5.setAddress("");
    java.lang.String str18 = user5.getUsername();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
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
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test367"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    user5.setUsername("hi!");
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("");
    user5.setPassword("");
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test368"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    java.lang.String str14 = user5.getPassword();
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getUsername();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test369"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setPassword("hi!");
    user5.setPassword("hi!");
    java.lang.String str11 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test370"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getContactNumber();
    user5.setEmail("");
    java.lang.String str12 = user5.getContactNumber();
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getEmail();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test371"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setEmail("");
    user5.setAddress("");
    boolean b12 = user5.verifyPhoneNumber();
    user5.setPassword("hi!");
    java.lang.String str15 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test372"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyEmailAddress();
    user5.setPassword("");
    java.lang.String str20 = user5.getEmail();
    java.lang.String str21 = user5.getContactNumber();
    user5.setUsername("hi!");
    user5.setContactNumber("hi!");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test373"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    user5.setPassword("hi!");
    user5.setAddress("");
    java.lang.String str18 = user5.getPassword();
    java.lang.String str19 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test374"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    user5.setEmail("");
    java.lang.String str17 = user5.getUsername();
    boolean b18 = user5.verifyEmailAddress();
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test375"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getContactNumber();
    boolean b13 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test376"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    user5.setEmail("");
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getContactNumber();
    java.lang.String str20 = user5.getUsername();
    user5.setAddress("");
    java.lang.String str23 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test377"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getEmail();
    boolean b19 = user5.verifyPhoneNumber();
    user5.setEmail("");
    boolean b22 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test378"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setEmail("");
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getContactNumber();
    boolean b14 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test379"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    java.lang.String str7 = user5.getEmail();
    java.lang.String str8 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setPassword("");
    boolean b13 = user5.verifyPhoneNumber();
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test380"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getUsername();
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    java.lang.String str21 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test381"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setAddress("hi!");
    java.lang.String str12 = user5.getContactNumber();
    boolean b13 = user5.verifyEmailAddress();
    java.lang.String str14 = user5.getEmail();
    java.lang.String str15 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test382"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setUsername("hi!");
    java.lang.String str24 = user5.getEmail();
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    java.lang.String str29 = user5.getPassword();
    boolean b30 = user5.verifyEmailAddress();
    boolean b31 = user5.verifyEmailAddress();
    user5.setAddress("");
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test383"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("hi!");
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test384"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    user5.setEmail("hi!");
    boolean b22 = user5.verifyEmailAddress();
    java.lang.String str23 = user5.getContactNumber();
    user5.setEmail("hi!");
    java.lang.String str26 = user5.getPassword();
    java.lang.String str27 = user5.getAddress();
    java.lang.String str28 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test385"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    user5.setPassword("");
    java.lang.String str13 = user5.getUsername();
    user5.setContactNumber("");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test386"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getContactNumber();
    java.lang.String str18 = user5.getEmail();
    user5.setContactNumber("");
    user5.setAddress("");
    user5.setEmail("");
    user5.setUsername("hi!");
    java.lang.String str27 = user5.getAddress();
    user5.setAddress("");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test387"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str12 = user5.getContactNumber();
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str17 = user5.getUsername();
    user5.setEmail("");
    java.lang.String str20 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test388"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setAddress("");
    user5.setAddress("");
    java.lang.String str19 = user5.getContactNumber();
    java.lang.String str20 = user5.getUsername();
    user5.setPassword("");
    boolean b23 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    java.lang.String str28 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test389"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setUsername("hi!");
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getEmail();
    java.lang.String str10 = user5.getAddress();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test390"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getContactNumber();
    boolean b14 = user5.verifyPhoneNumber();
    user5.setEmail("");
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getPassword();
    user5.setAddress("hi!");
    java.lang.String str21 = user5.getContactNumber();
    user5.setEmail("");
    user5.setEmail("");
    boolean b26 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test391"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    user5.setContactNumber("");
    java.lang.String str13 = user5.getContactNumber();
    user5.setUsername("");
    java.lang.String str16 = user5.getEmail();
    user5.setEmail("hi!");
    java.lang.String str19 = user5.getAddress();
    java.lang.String str20 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test392"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setEmail("hi!");
    boolean b8 = user5.verifyPhoneNumber();
    java.lang.String str9 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str12 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test393"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    user5.setAddress("");
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    user5.setUsername("");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test394"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    user5.setContactNumber("");
    java.lang.String str13 = user5.getContactNumber();
    user5.setUsername("");
    user5.setAddress("");
    java.lang.String str18 = user5.getPassword();
    user5.setAddress("");
    boolean b21 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test395"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("hi!");
    java.lang.String str17 = user5.getAddress();
    java.lang.String str18 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test396"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "hi!", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    java.lang.String str7 = user5.getAddress();
    user5.setUsername("hi!");
    java.lang.String str10 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test397"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test398"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setEmail("");
    user5.setAddress("");
    boolean b12 = user5.verifyPhoneNumber();
    user5.setPassword("hi!");
    user5.setContactNumber("");
    user5.setContactNumber("hi!");
    boolean b19 = user5.verifyPhoneNumber();
    boolean b20 = user5.verifyEmailAddress();
    boolean b21 = user5.verifyEmailAddress();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test399"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getPassword();
    java.lang.String str21 = user5.getUsername();
    java.lang.String str22 = user5.getUsername();
    java.lang.String str23 = user5.getContactNumber();
    user5.setUsername("hi!");
    java.lang.String str26 = user5.getUsername();
    java.lang.String str27 = user5.getPassword();
    java.lang.String str28 = user5.getUsername();
    java.lang.String str29 = user5.getEmail();
    boolean b30 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test400"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    user5.setAddress("hi!");
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getUsername();
    java.lang.String str17 = user5.getPassword();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test401"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getContactNumber();
    java.lang.String str18 = user5.getEmail();
    user5.setContactNumber("");
    user5.setAddress("");
    user5.setEmail("");
    user5.setAddress("");
    user5.setUsername("hi!");
    boolean b29 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test402"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "hi!", "");
    java.lang.String str6 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test403"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getPassword();
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test404"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getContactNumber();
    user5.setUsername("");
    java.lang.String str12 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test405"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    user5.setEmail("");
    boolean b18 = user5.verifyEmailAddress();
    java.lang.String str19 = user5.getUsername();
    java.lang.String str20 = user5.getAddress();
    boolean b21 = user5.verifyEmailAddress();
    java.lang.String str22 = user5.getPassword();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test406"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    user5.setPassword("");
    boolean b19 = user5.verifyPhoneNumber();
    java.lang.String str20 = user5.getPassword();
    boolean b21 = user5.verifyPhoneNumber();
    user5.setPassword("");
    boolean b24 = user5.verifyEmailAddress();
    java.lang.String str25 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test407"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setPassword("hi!");
    user5.setPassword("");
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test408"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getContactNumber();
    boolean b16 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    java.lang.String str19 = user5.getPassword();
    user5.setEmail("hi!");
    java.lang.String str22 = user5.getAddress();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test409"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    user5.setPassword("hi!");
    boolean b18 = user5.verifyPhoneNumber();
    java.lang.String str19 = user5.getEmail();
    user5.setAddress("hi!");
    java.lang.String str22 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test410"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test411"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    boolean b17 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    java.lang.String str20 = user5.getContactNumber();
    boolean b21 = user5.verifyPhoneNumber();
    boolean b22 = user5.verifyPhoneNumber();
    java.lang.String str23 = user5.getAddress();
    java.lang.String str24 = user5.getUsername();
    java.lang.String str25 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test412"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getUsername();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getEmail();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test413"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getAddress();
    java.lang.String str12 = user5.getPassword();
    user5.setContactNumber("");
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getPassword();
    user5.setPassword("hi!");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test414"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getUsername();
    user5.setAddress("");
    java.lang.String str12 = user5.getPassword();
    java.lang.String str13 = user5.getContactNumber();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test415"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    boolean b10 = user5.verifyEmailAddress();
    user5.setEmail("hi!");
    boolean b13 = user5.verifyEmailAddress();
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test416"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    user5.setEmail("hi!");
    java.lang.String str22 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test417"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str19 = user5.getPassword();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test418"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setContactNumber("");
    user5.setUsername("");
    java.lang.String str12 = user5.getEmail();
    user5.setUsername("");
    user5.setContactNumber("");
    user5.setAddress("hi!");
    boolean b19 = user5.verifyPhoneNumber();
    boolean b20 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test419"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getAddress();
    user5.setContactNumber("hi!");
    java.lang.String str17 = user5.getAddress();
    boolean b18 = user5.verifyEmailAddress();
    java.lang.String str19 = user5.getAddress();
    java.lang.String str20 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test420"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    user5.setPassword("");
    user5.setContactNumber("");
    user5.setContactNumber("");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test421"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    boolean b11 = user5.verifyEmailAddress();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getPassword();
    java.lang.String str15 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test422"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    user5.setUsername("");
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test423"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getEmail();
    java.lang.String str17 = user5.getUsername();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test424"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getAddress();
    user5.setAddress("");
    boolean b19 = user5.verifyPhoneNumber();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test425"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    user5.setAddress("");
    java.lang.String str19 = user5.getAddress();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str24 = user5.getUsername();
    user5.setAddress("hi!");
    java.lang.String str27 = user5.getContactNumber();
    java.lang.String str28 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test426"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getAddress();
    boolean b15 = user5.verifyEmailAddress();
    java.lang.String str16 = user5.getUsername();
    boolean b17 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test427"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("hi!");
    user5.setUsername("hi!");
    user5.setEmail("");
    java.lang.String str21 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test428"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str12 = user5.getEmail();
    user5.setContactNumber("");
    user5.setAddress("hi!");
    boolean b17 = user5.verifyPhoneNumber();
    user5.setEmail("");
    boolean b20 = user5.verifyPhoneNumber();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test429"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    java.lang.String str7 = user5.getPassword();
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getUsername();
    boolean b10 = user5.verifyEmailAddress();
    java.lang.String str11 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test430"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setUsername("");
    boolean b10 = user5.verifyPhoneNumber();
    boolean b11 = user5.verifyPhoneNumber();
    boolean b12 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test431"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str12 = user5.getContactNumber();
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test432"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    user5.setEmail("");
    user5.setAddress("");
    java.lang.String str10 = user5.getPassword();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test433"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getUsername();
    boolean b17 = user5.verifyEmailAddress();
    boolean b18 = user5.verifyEmailAddress();
    boolean b19 = user5.verifyPhoneNumber();
    user5.setEmail("");
    java.lang.String str22 = user5.getPassword();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test434"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getAddress();
    boolean b12 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    boolean b15 = user5.verifyEmailAddress();
    java.lang.String str16 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test435"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    user5.setPassword("");
    boolean b15 = user5.verifyEmailAddress();
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getAddress();
    java.lang.String str18 = user5.getPassword();
    user5.setUsername("hi!");
    java.lang.String str21 = user5.getUsername();
    java.lang.String str22 = user5.getUsername();
    java.lang.String str23 = user5.getUsername();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test436"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getContactNumber();
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    user5.setAddress("hi!");
    boolean b22 = user5.verifyPhoneNumber();
    boolean b23 = user5.verifyEmailAddress();
    java.lang.String str24 = user5.getPassword();
    java.lang.String str25 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test437"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getUsername();
    user5.setUsername("");
    java.lang.String str13 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test438"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    java.lang.String str7 = user5.getEmail();
    java.lang.String str8 = user5.getAddress();
    user5.setContactNumber("");
    user5.setContactNumber("");
    boolean b13 = user5.verifyEmailAddress();
    java.lang.String str14 = user5.getEmail();
    user5.setPassword("");
    boolean b17 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test439"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setAddress("");
    boolean b11 = user5.verifyPhoneNumber();
    user5.setPassword("hi!");
    java.lang.String str14 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test440"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getAddress();
    java.lang.String str12 = user5.getPassword();
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getUsername();
    boolean b16 = user5.verifyEmailAddress();
    java.lang.String str17 = user5.getAddress();
    user5.setEmail("");
    java.lang.String str20 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
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
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test441"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str19 = user5.getUsername();
    user5.setEmail("");
    java.lang.String str22 = user5.getAddress();
    boolean b23 = user5.verifyPhoneNumber();
    boolean b24 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test442"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getUsername();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getEmail();
    user5.setEmail("");
    
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
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test443"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setUsername("");
    java.lang.String str17 = user5.getEmail();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test444"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
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
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test445"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getUsername();
    java.lang.String str9 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test446"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setPassword("");
    user5.setUsername("");
    user5.setUsername("hi!");
    java.lang.String str16 = user5.getContactNumber();
    user5.setEmail("");
    user5.setPassword("hi!");
    java.lang.String str21 = user5.getAddress();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test447"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    user5.setAddress("");
    java.lang.String str19 = user5.getAddress();
    user5.setContactNumber("");
    user5.setAddress("hi!");
    java.lang.String str24 = user5.getUsername();
    java.lang.String str25 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str28 = user5.getContactNumber();
    user5.setAddress("");
    java.lang.String str31 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test448"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    user5.setAddress("");
    java.lang.String str19 = user5.getAddress();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str24 = user5.getUsername();
    user5.setEmail("");
    user5.setContactNumber("hi!");
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test449"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getContactNumber();
    boolean b14 = user5.verifyPhoneNumber();
    user5.setEmail("");
    java.lang.String str17 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test450"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getUsername();
    java.lang.String str11 = user5.getPassword();
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    java.lang.String str16 = user5.getPassword();
    boolean b17 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test451"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str20 = user5.getContactNumber();
    java.lang.String str21 = user5.getUsername();
    user5.setEmail("hi!");
    user5.setEmail("");
    java.lang.String str26 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setPassword("");
    java.lang.String str31 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test452"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("hi!");
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getAddress();
    boolean b11 = user5.verifyPhoneNumber();
    java.lang.String str12 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str19 = user5.getPassword();
    java.lang.String str20 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test453"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getUsername();
    user5.setUsername("");
    user5.setAddress("");
    java.lang.String str18 = user5.getAddress();
    java.lang.String str19 = user5.getUsername();
    boolean b20 = user5.verifyEmailAddress();
    java.lang.String str21 = user5.getAddress();
    java.lang.String str22 = user5.getPassword();
    java.lang.String str23 = user5.getContactNumber();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test454"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setEmail("");
    user5.setUsername("");
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    java.lang.String str16 = user5.getUsername();
    user5.setAddress("hi!");
    java.lang.String str19 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test455"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    user5.setContactNumber("");
    java.lang.String str13 = user5.getContactNumber();
    java.lang.String str14 = user5.getPassword();
    boolean b15 = user5.verifyPhoneNumber();
    boolean b16 = user5.verifyEmailAddress();
    java.lang.String str17 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test456"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getEmail();
    java.lang.String str19 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test457"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getPassword();
    user5.setPassword("hi!");
    boolean b16 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    user5.setAddress("");
    java.lang.String str21 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test458"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    java.lang.String str16 = user5.getUsername();
    java.lang.String str17 = user5.getEmail();
    user5.setAddress("");
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test459"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setPassword("");
    user5.setEmail("");
    boolean b21 = user5.verifyEmailAddress();
    boolean b22 = user5.verifyEmailAddress();
    boolean b23 = user5.verifyPhoneNumber();
    java.lang.String str24 = user5.getEmail();
    user5.setAddress("");
    boolean b27 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test460"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    user5.setEmail("hi!");
    java.lang.String str18 = user5.getPassword();
    java.lang.String str19 = user5.getUsername();
    user5.setPassword("");
    user5.setPassword("");
    user5.setAddress("hi!");
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test461"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setContactNumber("");
    user5.setEmail("");
    boolean b12 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str15 = user5.getUsername();
    boolean b16 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test462"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str18 = user5.getAddress();
    java.lang.String str19 = user5.getAddress();
    user5.setAddress("");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test463"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str12 = user5.getContactNumber();
    user5.setUsername("");
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setContactNumber("hi!");
    java.lang.String str19 = user5.getContactNumber();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test464"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getEmail();
    java.lang.String str18 = user5.getEmail();
    java.lang.String str19 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test465"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str12 = user5.getPassword();
    boolean b13 = user5.verifyPhoneNumber();
    user5.setAddress("");
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getAddress();
    java.lang.String str19 = user5.getUsername();
    boolean b20 = user5.verifyPhoneNumber();
    java.lang.String str21 = user5.getAddress();
    boolean b22 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test466"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    user5.setEmail("hi!");
    boolean b18 = user5.verifyEmailAddress();
    java.lang.String str19 = user5.getUsername();
    boolean b20 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    boolean b23 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str28 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test467"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    boolean b8 = user5.verifyEmailAddress();
    boolean b9 = user5.verifyPhoneNumber();
    java.lang.String str10 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test468"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str14 = user5.getUsername();
    boolean b15 = user5.verifyEmailAddress();
    user5.setEmail("");
    java.lang.String str18 = user5.getPassword();
    user5.setAddress("");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test469"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "");
    user5.setPassword("");
    java.lang.String str8 = user5.getPassword();
    user5.setAddress("");
    user5.setPassword("");
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test470"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setUsername("");
    java.lang.String str17 = user5.getEmail();
    java.lang.String str18 = user5.getEmail();
    boolean b19 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test471"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    user5.setEmail("");
    java.lang.String str16 = user5.getAddress();
    java.lang.String str17 = user5.getAddress();
    user5.setPassword("");
    boolean b20 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test472"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    boolean b11 = user5.verifyEmailAddress();
    boolean b12 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    java.lang.String str15 = user5.getUsername();
    user5.setPassword("");
    java.lang.String str18 = user5.getUsername();
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test473"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getUsername();
    java.lang.String str16 = user5.getUsername();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test474"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    user5.setPassword("hi!");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test475"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    java.lang.String str16 = user5.getContactNumber();
    user5.setContactNumber("");
    user5.setContactNumber("hi!");
    user5.setPassword("");
    java.lang.String str23 = user5.getUsername();
    java.lang.String str24 = user5.getContactNumber();
    user5.setContactNumber("");
    java.lang.String str27 = user5.getAddress();
    boolean b28 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test476"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    java.lang.String str16 = user5.getAddress();
    boolean b17 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test477"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    user5.setAddress("");
    user5.setPassword("hi!");
    user5.setPassword("hi!");
    java.lang.String str12 = user5.getUsername();
    user5.setAddress("");
    boolean b15 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test478"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    java.lang.String str15 = user5.getPassword();
    user5.setEmail("hi!");
    boolean b18 = user5.verifyEmailAddress();
    java.lang.String str19 = user5.getUsername();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test479"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getContactNumber();
    boolean b16 = user5.verifyEmailAddress();
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getUsername();
    user5.setEmail("hi!");
    java.lang.String str21 = user5.getContactNumber();
    java.lang.String str22 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test480"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    boolean b10 = user5.verifyPhoneNumber();
    boolean b11 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test481"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getUsername();
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    java.lang.String str12 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test482"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getAddress();
    boolean b11 = user5.verifyPhoneNumber();
    java.lang.String str12 = user5.getAddress();
    java.lang.String str13 = user5.getAddress();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test483"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getPassword();
    user5.setUsername("");
    java.lang.String str23 = user5.getUsername();
    user5.setEmail("hi!");
    user5.setAddress("");
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    java.lang.String str34 = user5.getEmail();
    boolean b35 = user5.verifyEmailAddress();
    java.lang.String str36 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test484"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    java.lang.String str7 = user5.getPassword();
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getUsername();
    user5.setUsername("");
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test485"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    user5.setContactNumber("hi!");
    java.lang.String str18 = user5.getContactNumber();
    boolean b19 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test486"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getUsername();
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test487"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getEmail();
    user5.setEmail("");
    user5.setAddress("");
    java.lang.String str21 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test488"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    user5.setPassword("");
    user5.setAddress("");
    java.lang.String str20 = user5.getContactNumber();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test489"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    boolean b11 = user5.verifyPhoneNumber();
    java.lang.String str12 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test490"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getPassword();
    user5.setUsername("");
    java.lang.String str23 = user5.getUsername();
    user5.setEmail("hi!");
    user5.setAddress("");
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    java.lang.String str40 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test491"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    user5.setUsername("hi!");
    boolean b16 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    user5.setEmail("");
    java.lang.String str25 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test492"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    boolean b10 = user5.verifyEmailAddress();
    user5.setEmail("hi!");
    boolean b13 = user5.verifyEmailAddress();
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("hi!");
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getPassword();
    java.lang.String str19 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test493"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getAddress();
    user5.setContactNumber("hi!");
    java.lang.String str22 = user5.getAddress();
    user5.setAddress("hi!");
    java.lang.String str25 = user5.getUsername();
    user5.setAddress("");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test494"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    user5.setPassword("");
    boolean b19 = user5.verifyPhoneNumber();
    java.lang.String str20 = user5.getPassword();
    boolean b21 = user5.verifyPhoneNumber();
    java.lang.String str22 = user5.getContactNumber();
    user5.setAddress("");
    user5.setAddress("hi!");
    user5.setEmail("");
    boolean b29 = user5.verifyPhoneNumber();
    user5.setPassword("");
    java.lang.String str32 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test495"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getPassword();
    user5.setUsername("");
    java.lang.String str23 = user5.getUsername();
    user5.setEmail("hi!");
    user5.setPassword("hi!");
    user5.setUsername("");
    java.lang.String str30 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test496"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    user5.setEmail("hi!");
    java.lang.String str22 = user5.getUsername();
    user5.setUsername("hi!");
    java.lang.String str25 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test497"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getContactNumber();
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("hi!");
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getEmail();
    user5.setContactNumber("hi!");
    user5.setEmail("");
    java.lang.String str23 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test498"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    user5.setPassword("");
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test499"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    user5.setContactNumber("");
    java.lang.String str13 = user5.getContactNumber();
    java.lang.String str14 = user5.getPassword();
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getUsername();
    java.lang.String str17 = user5.getAddress();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test500"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("hi!");
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getAddress();
    boolean b11 = user5.verifyPhoneNumber();
    java.lang.String str12 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setContactNumber("");
    java.lang.String str17 = user5.getPassword();
    boolean b18 = user5.verifyPhoneNumber();
    boolean b19 = user5.verifyPhoneNumber();
    java.lang.String str20 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

}
