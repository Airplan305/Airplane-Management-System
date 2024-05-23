
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test001"); }

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
    user5.setEmail("hi!");
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test002"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setAddress("hi!");
    java.lang.String str12 = user5.getContactNumber();
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getContactNumber();
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test003"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    user5.setAddress("");
    user5.setAddress("hi!");
    boolean b10 = user5.verifyEmailAddress();
    java.lang.String str11 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test004"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    user5.setEmail("hi!");
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getUsername();
    boolean b20 = user5.verifyPhoneNumber();
    user5.setEmail("");
    user5.setAddress("hi!");
    boolean b25 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test005"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str16 = user5.getAddress();
    user5.setAddress("hi!");
    java.lang.String str19 = user5.getAddress();
    user5.setAddress("");
    java.lang.String str22 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test006"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    boolean b8 = user5.verifyPhoneNumber();
    boolean b9 = user5.verifyEmailAddress();
    java.lang.String str10 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test007"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    java.lang.String str15 = user5.getUsername();
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyPhoneNumber();
    boolean b18 = user5.verifyPhoneNumber();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test008"); }

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
    java.lang.String str21 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str24 = user5.getUsername();
    java.lang.String str25 = user5.getContactNumber();
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test009"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "hi!", "", "");
    java.lang.String str6 = user5.getContactNumber();
    java.lang.String str7 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test010"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str10 = user5.getAddress();
    java.lang.String str11 = user5.getAddress();
    boolean b12 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test011"); }

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
    boolean b21 = user5.verifyPhoneNumber();
    user5.setAddress("");
    java.lang.String str24 = user5.getContactNumber();
    user5.setEmail("");
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
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test012"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getPassword();
    user5.setUsername("");
    java.lang.String str21 = user5.getUsername();
    boolean b22 = user5.verifyEmailAddress();
    java.lang.String str23 = user5.getAddress();
    java.lang.String str24 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str27 = user5.getContactNumber();
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test013"); }

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
    java.lang.String str22 = user5.getPassword();
    java.lang.String str23 = user5.getEmail();
    java.lang.String str24 = user5.getUsername();
    boolean b25 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test014"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getUsername();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getContactNumber();
    user5.setUsername("");
    user5.setAddress("");
    java.lang.String str22 = user5.getAddress();
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test015"); }

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
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getAddress();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test016"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    java.lang.String str18 = user5.getEmail();
    boolean b19 = user5.verifyPhoneNumber();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test017"); }

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
    boolean b30 = user5.verifyEmailAddress();
    java.lang.String str31 = user5.getPassword();
    boolean b32 = user5.verifyEmailAddress();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test018"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str12 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test019"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getEmail();
    user5.setAddress("");
    user5.setUsername("");
    user5.setContactNumber("hi!");
    boolean b17 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test020"); }

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
    user5.setAddress("");
    user5.setAddress("");
    java.lang.String str23 = user5.getEmail();
    boolean b24 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test021"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getContactNumber();
    user5.setAddress("hi!");
    java.lang.String str12 = user5.getPassword();
    user5.setAddress("");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test022"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    boolean b12 = user5.verifyEmailAddress();
    java.lang.String str13 = user5.getEmail();
    boolean b14 = user5.verifyPhoneNumber();
    java.lang.String str15 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test023"); }

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
    java.lang.String str17 = user5.getEmail();
    user5.setUsername("");
    user5.setAddress("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test024"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    java.lang.String str16 = user5.getContactNumber();
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test025"); }

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
    java.lang.String str22 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    boolean b25 = user5.verifyPhoneNumber();
    java.lang.String str26 = user5.getContactNumber();
    user5.setUsername("hi!");
    java.lang.String str29 = user5.getContactNumber();
    
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
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test026"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getContactNumber();
    user5.setUsername("");
    user5.setEmail("hi!");
    java.lang.String str15 = user5.getAddress();
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test027"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    user5.setAddress("");
    java.lang.String str17 = user5.getUsername();
    java.lang.String str18 = user5.getUsername();
    user5.setEmail("");
    user5.setUsername("");
    java.lang.String str23 = user5.getPassword();
    java.lang.String str24 = user5.getUsername();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
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
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test028"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    boolean b9 = user5.verifyEmailAddress();
    java.lang.String str10 = user5.getUsername();
    user5.setEmail("hi!");
    user5.setContactNumber("");
    java.lang.String str15 = user5.getContactNumber();
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test029"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    java.lang.String str16 = user5.getContactNumber();
    user5.setContactNumber("");
    user5.setPassword("");
    java.lang.String str21 = user5.getEmail();
    java.lang.String str22 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test030"); }

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
    user5.setPassword("");
    java.lang.String str22 = user5.getAddress();
    boolean b23 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test031"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    java.lang.String str19 = user5.getContactNumber();
    java.lang.String str20 = user5.getContactNumber();
    java.lang.String str21 = user5.getPassword();
    boolean b22 = user5.verifyPhoneNumber();
    java.lang.String str23 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test032"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getEmail();
    java.lang.String str15 = user5.getAddress();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test033"); }

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
    java.lang.String str20 = user5.getEmail();
    user5.setAddress("");
    java.lang.String str23 = user5.getEmail();
    boolean b24 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    java.lang.String str27 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test034"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setPassword("hi!");
    user5.setUsername("");
    user5.setContactNumber("hi!");
    boolean b20 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    boolean b23 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test035"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    user5.setEmail("hi!");
    user5.setPassword("");
    user5.setPassword("");
    java.lang.String str22 = user5.getAddress();
    java.lang.String str23 = user5.getAddress();
    java.lang.String str24 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test036"); }

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
    java.lang.String str22 = user5.getUsername();
    boolean b23 = user5.verifyPhoneNumber();
    boolean b24 = user5.verifyPhoneNumber();
    user5.setAddress("");
    user5.setContactNumber("hi!");
    java.lang.String str29 = user5.getUsername();
    
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test037"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    user5.setAddress("hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str19 = user5.getUsername();
    boolean b20 = user5.verifyEmailAddress();
    user5.setEmail("");
    java.lang.String str23 = user5.getContactNumber();
    user5.setEmail("hi!");
    java.lang.String str26 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test038"); }

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
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    boolean b26 = user5.verifyPhoneNumber();
    
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
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test039"); }

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
    user5.setPassword("");
    
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

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test040"); }

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
    user5.setContactNumber("hi!");
    boolean b22 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test041"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    java.lang.String str8 = user5.getAddress();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getUsername();
    java.lang.String str11 = user5.getContactNumber();
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    user5.setAddress("");
    java.lang.String str17 = user5.getAddress();
    boolean b18 = user5.verifyEmailAddress();
    boolean b19 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test042"); }

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
    java.lang.String str19 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test043"); }

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
    user5.setPassword("");
    user5.setEmail("");
    boolean b26 = user5.verifyEmailAddress();
    boolean b27 = user5.verifyPhoneNumber();
    boolean b28 = user5.verifyPhoneNumber();
    java.lang.String str29 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test044"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setAddress("hi!");
    java.lang.String str12 = user5.getContactNumber();
    java.lang.String str13 = user5.getAddress();
    user5.setPassword("hi!");
    user5.setEmail("");
    boolean b18 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test045"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setContactNumber("");
    user5.setEmail("");
    user5.setPassword("");
    user5.setContactNumber("");
    java.lang.String str16 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test046"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    java.lang.String str7 = user5.getPassword();
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getUsername();
    boolean b10 = user5.verifyPhoneNumber();
    user5.setAddress("");
    user5.setPassword("hi!");
    user5.setPassword("hi!");
    
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

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test047"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getAddress();
    java.lang.String str18 = user5.getAddress();
    java.lang.String str19 = user5.getUsername();
    java.lang.String str20 = user5.getPassword();
    user5.setPassword("hi!");
    user5.setUsername("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test048"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setEmail("hi!");
    java.lang.String str17 = user5.getAddress();
    boolean b18 = user5.verifyPhoneNumber();
    user5.setPassword("");
    
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
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test049"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    boolean b18 = user5.verifyEmailAddress();
    java.lang.String str19 = user5.getEmail();
    user5.setEmail("");
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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test050"); }

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
    java.lang.String str32 = user5.getContactNumber();
    user5.setAddress("");
    java.lang.String str35 = user5.getUsername();
    boolean b36 = user5.verifyEmailAddress();
    boolean b37 = user5.verifyPhoneNumber();
    java.lang.String str38 = user5.getPassword();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test051"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getPassword();
    user5.setEmail("");
    boolean b12 = user5.verifyEmailAddress();
    boolean b13 = user5.verifyPhoneNumber();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test052"); }

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
    java.lang.String str21 = user5.getContactNumber();
    java.lang.String str22 = user5.getAddress();
    user5.setAddress("");
    user5.setUsername("");
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test053"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getAddress();
    java.lang.String str15 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setAddress("");
    java.lang.String str20 = user5.getAddress();
    boolean b21 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test054"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getUsername();
    user5.setAddress("");
    java.lang.String str12 = user5.getEmail();
    user5.setAddress("hi!");
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test055"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setEmail("hi!");
    boolean b8 = user5.verifyPhoneNumber();
    user5.setEmail("");
    java.lang.String str11 = user5.getEmail();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getContactNumber();
    user5.setUsername("hi!");
    boolean b20 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test056"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    java.lang.String str17 = user5.getEmail();
    java.lang.String str18 = user5.getPassword();
    user5.setAddress("");
    boolean b21 = user5.verifyEmailAddress();
    boolean b22 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test057"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setContactNumber("");
    user5.setEmail("");
    boolean b12 = user5.verifyEmailAddress();
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getPassword();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test058"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getEmail();
    java.lang.String str8 = user5.getAddress();
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    user5.setPassword("");
    java.lang.String str15 = user5.getEmail();
    boolean b16 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test059"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    user5.setPassword("");
    java.lang.String str13 = user5.getPassword();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test060"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getEmail();
    boolean b10 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    user5.setContactNumber("");
    user5.setUsername("");
    java.lang.String str17 = user5.getUsername();
    java.lang.String str18 = user5.getEmail();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test061"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyEmailAddress();
    user5.setPassword("");
    java.lang.String str18 = user5.getEmail();
    java.lang.String str19 = user5.getEmail();
    user5.setContactNumber("");
    boolean b22 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test062"); }

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
    boolean b25 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    user5.setContactNumber("");
    
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
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test063"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getEmail();
    user5.setAddress("hi!");
    user5.setPassword("");
    java.lang.String str15 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test064"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setAddress("");
    boolean b16 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    java.lang.String str19 = user5.getContactNumber();
    boolean b20 = user5.verifyPhoneNumber();
    user5.setContactNumber("hi!");
    java.lang.String str23 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test065"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setEmail("");
    user5.setContactNumber("");
    user5.setContactNumber("hi!");
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test066"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getUsername();
    user5.setPassword("");
    user5.setContactNumber("");
    java.lang.String str14 = user5.getContactNumber();
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    user5.setContactNumber("");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test067"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setEmail("");
    boolean b10 = user5.verifyEmailAddress();
    java.lang.String str11 = user5.getPassword();
    user5.setPassword("hi!");
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test068"); }

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
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getUsername();
    user5.setEmail("");
    java.lang.String str23 = user5.getAddress();
    boolean b24 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test069"); }

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
    user5.setPassword("");
    java.lang.String str26 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test070"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    boolean b20 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    user5.setEmail("hi!");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test071"); }

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
    user5.setPassword("");
    java.lang.String str25 = user5.getPassword();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test072"); }

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
    boolean b22 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test073"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    user5.setAddress("");
    java.lang.String str17 = user5.getUsername();
    java.lang.String str18 = user5.getUsername();
    boolean b19 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test074"); }

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
    boolean b18 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    
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
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test075"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    boolean b11 = user5.verifyEmailAddress();
    boolean b12 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getAddress();
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test076"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    user5.setAddress("");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test077"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    user5.setUsername("hi!");
    boolean b9 = user5.verifyEmailAddress();
    user5.setUsername("");
    java.lang.String str12 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test078"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "", "hi!");
    boolean b6 = user5.verifyEmailAddress();
    user5.setAddress("");
    boolean b9 = user5.verifyEmailAddress();
    java.lang.String str10 = user5.getUsername();
    boolean b11 = user5.verifyEmailAddress();
    java.lang.String str12 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test079"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    java.lang.String str11 = user5.getPassword();
    java.lang.String str12 = user5.getContactNumber();
    user5.setAddress("");
    boolean b15 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test080"); }

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
    java.lang.String str21 = user5.getAddress();
    java.lang.String str22 = user5.getAddress();
    java.lang.String str23 = user5.getAddress();
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test081"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setUsername("");
    java.lang.String str17 = user5.getUsername();
    user5.setUsername("");
    user5.setPassword("hi!");
    java.lang.String str22 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test082"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    user5.setPassword("");
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getContactNumber();
    user5.setAddress("hi!");
    boolean b17 = user5.verifyEmailAddress();
    user5.setEmail("hi!");
    user5.setUsername("");
    user5.setContactNumber("hi!");
    user5.setEmail("");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test083"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getAddress();
    java.lang.String str18 = user5.getAddress();
    user5.setPassword("");
    java.lang.String str21 = user5.getContactNumber();
    java.lang.String str22 = user5.getContactNumber();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test084"); }

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
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test085"); }

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
    user5.setUsername("hi!");
    boolean b29 = user5.verifyEmailAddress();
    user5.setEmail("hi!");
    java.lang.String str32 = user5.getContactNumber();
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
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test086"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    user5.setPassword("hi!");
    java.lang.String str16 = user5.getEmail();
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getPassword();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test087"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getAddress();
    user5.setAddress("");
    java.lang.String str19 = user5.getUsername();
    java.lang.String str20 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test088"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str21 = user5.getUsername();
    java.lang.String str22 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test089"); }

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
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setPassword("");
    user5.setContactNumber("");
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test090"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getAddress();
    java.lang.String str12 = user5.getPassword();
    user5.setContactNumber("");
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getPassword();
    boolean b17 = user5.verifyPhoneNumber();
    user5.setEmail("");
    user5.setEmail("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test091"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    boolean b10 = user5.verifyEmailAddress();
    user5.setEmail("hi!");
    boolean b13 = user5.verifyEmailAddress();
    boolean b14 = user5.verifyPhoneNumber();
    java.lang.String str15 = user5.getUsername();
    java.lang.String str16 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test092"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getAddress();
    java.lang.String str17 = user5.getPassword();
    user5.setPassword("hi!");
    boolean b20 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test093"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setEmail("hi!");
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test094"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "hi!", "");
    java.lang.String str6 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    user5.setAddress("");
    boolean b14 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test095"); }

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
    user5.setPassword("");
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
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test096"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getContactNumber();
    user5.setPassword("");
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test097"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getEmail();
    boolean b10 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test098"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getUsername();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test099"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    boolean b11 = user5.verifyEmailAddress();
    java.lang.String str12 = user5.getAddress();
    boolean b13 = user5.verifyEmailAddress();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test100"); }

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
    java.lang.String str28 = user5.getUsername();
    java.lang.String str29 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test101"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getPassword();
    java.lang.String str10 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    java.lang.String str13 = user5.getEmail();
    user5.setEmail("");
    user5.setUsername("hi!");
    java.lang.String str18 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
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
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test102"); }

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
    java.lang.String str18 = user5.getPassword();
    user5.setContactNumber("");
    java.lang.String str21 = user5.getContactNumber();
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test103"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getPassword();
    user5.setPassword("");
    user5.setUsername("hi!");
    java.lang.String str20 = user5.getContactNumber();
    java.lang.String str21 = user5.getEmail();
    java.lang.String str22 = user5.getContactNumber();
    java.lang.String str23 = user5.getEmail();
    user5.setContactNumber("hi!");
    java.lang.String str26 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test104"); }

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
    java.lang.String str21 = user5.getAddress();
    user5.setContactNumber("");
    boolean b24 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test105"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setEmail("");
    user5.setEmail("");
    boolean b19 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test106"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    boolean b9 = user5.verifyEmailAddress();
    java.lang.String str10 = user5.getContactNumber();
    boolean b11 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test107"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setPassword("hi!");
    java.lang.String str11 = user5.getPassword();
    user5.setAddress("");
    user5.setContactNumber("hi!");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test108"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    user5.setAddress("hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setPassword("");
    boolean b21 = user5.verifyPhoneNumber();
    
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
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test109"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    boolean b9 = user5.verifyEmailAddress();
    java.lang.String str10 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str13 = user5.getContactNumber();
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
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
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test110"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    user5.setPassword("");
    boolean b15 = user5.verifyEmailAddress();
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    boolean b22 = user5.verifyPhoneNumber();
    boolean b23 = user5.verifyEmailAddress();
    boolean b24 = user5.verifyEmailAddress();
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
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test111"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    boolean b9 = user5.verifyEmailAddress();
    user5.setEmail("");
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyPhoneNumber();
    boolean b15 = user5.verifyPhoneNumber();
    user5.setUsername("");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
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
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test112"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    user5.setContactNumber("");
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str17 = user5.getUsername();
    user5.setContactNumber("");
    user5.setAddress("hi!");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test113"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setContactNumber("hi!");
    user5.setEmail("hi!");
    java.lang.String str18 = user5.getAddress();
    user5.setPassword("hi!");
    java.lang.String str21 = user5.getAddress();
    java.lang.String str22 = user5.getPassword();
    boolean b23 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test114"); }

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
    user5.setPassword("");
    java.lang.String str21 = user5.getUsername();
    user5.setPassword("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str28 = user5.getPassword();
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
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test115"); }

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
    boolean b30 = user5.verifyEmailAddress();
    boolean b31 = user5.verifyEmailAddress();
    java.lang.String str32 = user5.getUsername();
    java.lang.String str33 = user5.getUsername();
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test116"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setContactNumber("hi!");
    user5.setEmail("hi!");
    boolean b10 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    user5.setContactNumber("");
    user5.setPassword("hi!");
    user5.setPassword("");
    java.lang.String str19 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test117"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setContactNumber("");
    user5.setUsername("");
    user5.setContactNumber("hi!");
    user5.setEmail("");
    java.lang.String str16 = user5.getUsername();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test118"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    user5.setAddress("");
    java.lang.String str14 = user5.getEmail();
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str19 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test119"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getUsername();
    user5.setEmail("hi!");
    java.lang.String str19 = user5.getPassword();
    user5.setEmail("hi!");
    java.lang.String str22 = user5.getContactNumber();
    boolean b23 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test120"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getAddress();
    java.lang.String str15 = user5.getAddress();
    user5.setPassword("");
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test121"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    user5.setContactNumber("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    boolean b19 = user5.verifyPhoneNumber();
    java.lang.String str20 = user5.getEmail();
    boolean b21 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test122"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getEmail();
    java.lang.String str17 = user5.getPassword();
    java.lang.String str18 = user5.getAddress();
    user5.setUsername("");
    boolean b21 = user5.verifyEmailAddress();
    user5.setEmail("");
    user5.setEmail("hi!");
    boolean b26 = user5.verifyEmailAddress();
    java.lang.String str27 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test123"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str12 = user5.getContactNumber();
    user5.setUsername("");
    java.lang.String str15 = user5.getEmail();
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test124"); }

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
    java.lang.String str22 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test125"); }

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
    user5.setContactNumber("hi!");
    java.lang.String str34 = user5.getContactNumber();
    java.lang.String str35 = user5.getUsername();
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
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test126"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getEmail();
    boolean b10 = user5.verifyEmailAddress();
    boolean b11 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test127"); }

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
    java.lang.String str27 = user5.getPassword();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test128"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getEmail();
    java.lang.String str11 = user5.getPassword();
    user5.setContactNumber("");
    user5.setAddress("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    user5.setEmail("");
    boolean b19 = user5.verifyEmailAddress();
    
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
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test129"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getEmail();
    user5.setAddress("hi!");
    java.lang.String str17 = user5.getAddress();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test130"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getPassword();
    user5.setUsername("");
    user5.setUsername("hi!");
    java.lang.String str20 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test131"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test132"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    user5.setPassword("hi!");
    java.lang.String str12 = user5.getContactNumber();
    boolean b13 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test133"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getUsername();
    java.lang.String str16 = user5.getContactNumber();
    user5.setContactNumber("");
    boolean b19 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test134"); }

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
    user5.setContactNumber("");
    java.lang.String str23 = user5.getAddress();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test135"); }

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
    java.lang.String str20 = user5.getAddress();
    java.lang.String str21 = user5.getPassword();
    java.lang.String str22 = user5.getPassword();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test136"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    user5.setPassword("");
    java.lang.String str13 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setEmail("");
    user5.setPassword("");
    java.lang.String str20 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test137"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    user5.setContactNumber("");
    java.lang.String str13 = user5.getContactNumber();
    user5.setUsername("");
    java.lang.String str16 = user5.getEmail();
    user5.setEmail("hi!");
    user5.setPassword("");
    java.lang.String str21 = user5.getAddress();
    boolean b22 = user5.verifyPhoneNumber();
    java.lang.String str23 = user5.getUsername();
    java.lang.String str24 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test138"); }

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
    user5.setAddress("");
    
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
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test139"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str12 = user5.getEmail();
    user5.setContactNumber("");
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    java.lang.String str19 = user5.getUsername();
    user5.setUsername("");
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test140"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setContactNumber("hi!");
    user5.setPassword("hi!");
    java.lang.String str18 = user5.getPassword();
    java.lang.String str19 = user5.getAddress();
    user5.setAddress("");
    java.lang.String str22 = user5.getPassword();
    boolean b23 = user5.verifyPhoneNumber();
    java.lang.String str24 = user5.getPassword();
    
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

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test141"); }

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
    java.lang.String str21 = user5.getEmail();
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test142"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getUsername();
    user5.setPassword("");
    user5.setUsername("");
    java.lang.String str14 = user5.getEmail();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getPassword();
    user5.setUsername("hi!");
    java.lang.String str19 = user5.getPassword();
    java.lang.String str20 = user5.getUsername();
    java.lang.String str21 = user5.getPassword();
    java.lang.String str22 = user5.getUsername();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test143"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    user5.setAddress("");
    user5.setPassword("hi!");
    java.lang.String str10 = user5.getPassword();
    user5.setUsername("");
    java.lang.String str13 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test144"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setEmail("");
    user5.setAddress("");
    user5.setEmail("");
    boolean b14 = user5.verifyPhoneNumber();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getUsername();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test145"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    boolean b8 = user5.verifyPhoneNumber();
    boolean b9 = user5.verifyEmailAddress();
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getEmail();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test146"); }

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
    boolean b20 = user5.verifyPhoneNumber();
    java.lang.String str21 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test147"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setUsername("");
    java.lang.String str17 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str20 = user5.getContactNumber();
    boolean b21 = user5.verifyPhoneNumber();
    java.lang.String str22 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test148"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    java.lang.String str16 = user5.getPassword();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test149"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getAddress();
    user5.setEmail("");
    user5.setPassword("");
    user5.setEmail("");
    user5.setAddress("hi!");
    boolean b19 = user5.verifyPhoneNumber();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test150"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getEmail();
    user5.setPassword("hi!");
    boolean b11 = user5.verifyPhoneNumber();
    boolean b12 = user5.verifyPhoneNumber();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test151"); }

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
    java.lang.String str23 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test152"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getUsername();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getContactNumber();
    user5.setAddress("");
    boolean b19 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test153"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getAddress();
    boolean b11 = user5.verifyPhoneNumber();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test154"); }

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
    java.lang.String str19 = user5.getContactNumber();
    java.lang.String str20 = user5.getEmail();
    user5.setUsername("");
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test155"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    boolean b10 = user5.verifyEmailAddress();
    user5.setEmail("hi!");
    boolean b13 = user5.verifyEmailAddress();
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("hi!");
    java.lang.String str17 = user5.getUsername();
    user5.setUsername("");
    java.lang.String str20 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test156"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setAddress("hi!");
    java.lang.String str12 = user5.getContactNumber();
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getEmail();
    java.lang.String str17 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test157"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    boolean b6 = user5.verifyEmailAddress();
    boolean b7 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    java.lang.String str10 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test158"); }

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
    user5.setAddress("hi!");
    boolean b22 = user5.verifyEmailAddress();
    user5.setEmail("");
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
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test159"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getAddress();
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    user5.setPassword("hi!");
    java.lang.String str12 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test160"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    user5.setEmail("");
    boolean b8 = user5.verifyPhoneNumber();
    boolean b9 = user5.verifyPhoneNumber();
    boolean b10 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test161"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("");
    java.lang.String str9 = user5.getUsername();
    java.lang.String str10 = user5.getUsername();
    java.lang.String str11 = user5.getAddress();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test162"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    java.lang.String str11 = user5.getAddress();
    boolean b12 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test163"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("");
    user5.setUsername("");
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    user5.setAddress("");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test164"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    boolean b14 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test165"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getContactNumber();
    java.lang.String str14 = user5.getAddress();
    java.lang.String str15 = user5.getEmail();
    user5.setEmail("hi!");
    boolean b18 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    java.lang.String str21 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test166"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getUsername();
    java.lang.String str12 = user5.getUsername();
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
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
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test167"); }

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
    java.lang.String str20 = user5.getEmail();
    user5.setPassword("hi!");
    java.lang.String str23 = user5.getContactNumber();
    java.lang.String str24 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test168"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setEmail("");
    user5.setEmail("");

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test169"); }

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

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test170"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str20 = user5.getEmail();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test171"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "", "hi!");
    boolean b6 = user5.verifyEmailAddress();
    user5.setAddress("");
    boolean b9 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    java.lang.String str12 = user5.getEmail();
    user5.setAddress("hi!");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test172"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getContactNumber();
    user5.setEmail("hi!");
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test173"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    user5.setContactNumber("");
    java.lang.String str13 = user5.getContactNumber();
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getUsername();
    java.lang.String str16 = user5.getUsername();
    boolean b17 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test174"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    boolean b11 = user5.verifyEmailAddress();
    user5.setPassword("");
    java.lang.String str14 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test175"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    user5.setUsername("hi!");
    boolean b16 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str19 = user5.getAddress();
    java.lang.String str20 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test176"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getAddress();
    user5.setContactNumber("hi!");
    user5.setAddress("");
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getAddress();
    java.lang.String str21 = user5.getUsername();
    user5.setEmail("");
    java.lang.String str24 = user5.getPassword();
    java.lang.String str25 = user5.getEmail();
    java.lang.String str26 = user5.getUsername();
    java.lang.String str27 = user5.getUsername();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test177"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getUsername();
    user5.setEmail("hi!");
    boolean b19 = user5.verifyEmailAddress();
    user5.setPassword("");
    
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

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test178"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    boolean b10 = user5.verifyEmailAddress();
    user5.setEmail("hi!");
    boolean b13 = user5.verifyEmailAddress();
    boolean b14 = user5.verifyPhoneNumber();
    java.lang.String str15 = user5.getUsername();
    java.lang.String str16 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test179"); }

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
    java.lang.String str19 = user5.getPassword();
    boolean b20 = user5.verifyEmailAddress();
    java.lang.String str21 = user5.getEmail();
    boolean b22 = user5.verifyPhoneNumber();
    java.lang.String str23 = user5.getContactNumber();
    java.lang.String str24 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test180"); }

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
    user5.setUsername("");
    java.lang.String str22 = user5.getEmail();
    boolean b23 = user5.verifyEmailAddress();
    java.lang.String str24 = user5.getPassword();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test181"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    java.lang.String str12 = user5.getPassword();
    user5.setAddress("hi!");
    boolean b15 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test182"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getUsername();
    user5.setEmail("");
    user5.setContactNumber("hi!");
    java.lang.String str21 = user5.getEmail();
    java.lang.String str22 = user5.getUsername();
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test183"); }

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
    java.lang.String str21 = user5.getEmail();
    java.lang.String str22 = user5.getEmail();
    user5.setEmail("");
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test184"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getAddress();
    java.lang.String str18 = user5.getAddress();
    boolean b19 = user5.verifyEmailAddress();
    boolean b20 = user5.verifyEmailAddress();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test185"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    boolean b7 = user5.verifyEmailAddress();
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getEmail();
    user5.setEmail("");
    user5.setUsername("");
    
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

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test186"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    java.lang.String str17 = user5.getContactNumber();
    boolean b18 = user5.verifyEmailAddress();
    java.lang.String str19 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
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

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test187"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getUsername();
    boolean b18 = user5.verifyPhoneNumber();
    java.lang.String str19 = user5.getUsername();
    java.lang.String str20 = user5.getPassword();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test188"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    user5.setAddress("");
    java.lang.String str17 = user5.getUsername();
    boolean b18 = user5.verifyPhoneNumber();
    user5.setAddress("");
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test189"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "", "hi!");
    java.lang.String str6 = user5.getUsername();
    user5.setPassword("hi!");
    boolean b9 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test190"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getPassword();
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test191"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    boolean b14 = user5.verifyEmailAddress();
    boolean b15 = user5.verifyEmailAddress();
    boolean b16 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test192"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getAddress();
    user5.setAddress("");
    java.lang.String str19 = user5.getAddress();
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str24 = user5.getAddress();
    java.lang.String str25 = user5.getUsername();
    user5.setAddress("hi!");
    boolean b28 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test193"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str17 = user5.getUsername();
    boolean b18 = user5.verifyEmailAddress();
    boolean b19 = user5.verifyPhoneNumber();
    boolean b20 = user5.verifyEmailAddress();
    java.lang.String str21 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test194"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    java.lang.String str16 = user5.getPassword();
    user5.setPassword("");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test195"); }

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
    java.lang.String str19 = user5.getPassword();
    boolean b20 = user5.verifyEmailAddress();
    user5.setEmail("");
    java.lang.String str23 = user5.getEmail();
    user5.setAddress("hi!");
    user5.setEmail("");
    java.lang.String str28 = user5.getPassword();
    boolean b29 = user5.verifyEmailAddress();
    
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
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test196"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setEmail("hi!");
    boolean b8 = user5.verifyPhoneNumber();
    user5.setEmail("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getUsername();
    user5.setEmail("");
    java.lang.String str15 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test197"); }

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
    user5.setAddress("hi!");
    java.lang.String str29 = user5.getContactNumber();
    java.lang.String str30 = user5.getAddress();
    user5.setAddress("");
    java.lang.String str33 = user5.getContactNumber();
    user5.setEmail("hi!");
    java.lang.String str36 = user5.getEmail();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test198"); }

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
    java.lang.String str23 = user5.getAddress();
    java.lang.String str24 = user5.getUsername();
    boolean b25 = user5.verifyEmailAddress();
    user5.setEmail("");
    user5.setContactNumber("");
    boolean b30 = user5.verifyEmailAddress();
    
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
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test199"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str11 = user5.getUsername();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test200"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getEmail();
    user5.setUsername("");
    user5.setEmail("");
    java.lang.String str19 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test201"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    boolean b10 = user5.verifyPhoneNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setEmail("");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setPassword("hi!");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test202"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getAddress();
    user5.setContactNumber("hi!");
    user5.setAddress("");
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getAddress();
    java.lang.String str21 = user5.getUsername();
    user5.setEmail("");
    user5.setAddress("hi!");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test203"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    user5.setAddress("");
    boolean b14 = user5.verifyEmailAddress();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    boolean b19 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test204"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    java.lang.String str11 = user5.getPassword();
    java.lang.String str12 = user5.getContactNumber();
    user5.setAddress("hi!");
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getAddress();
    java.lang.String str17 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test205"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    user5.setEmail("hi!");
    java.lang.String str17 = user5.getContactNumber();
    user5.setUsername("");
    user5.setContactNumber("");
    java.lang.String str22 = user5.getAddress();
    user5.setUsername("hi!");
    java.lang.String str25 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test206"); }

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
    java.lang.String str20 = user5.getEmail();
    boolean b21 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    java.lang.String str24 = user5.getPassword();
    boolean b25 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test207"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getEmail();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    user5.setPassword("hi!");
    user5.setUsername("");
    java.lang.String str22 = user5.getPassword();
    java.lang.String str23 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test208"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("");
    java.lang.String str12 = user5.getEmail();
    user5.setEmail("hi!");
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getUsername();
    boolean b17 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test209"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "", "hi!");
    user5.setAddress("");
    java.lang.String str8 = user5.getEmail();
    boolean b9 = user5.verifyEmailAddress();
    user5.setEmail("");
    boolean b12 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test210"); }

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
    java.lang.String str19 = user5.getUsername();
    boolean b20 = user5.verifyEmailAddress();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test211"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setContactNumber("hi!");
    user5.setPassword("hi!");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getUsername();
    java.lang.String str21 = user5.getPassword();
    java.lang.String str22 = user5.getAddress();
    java.lang.String str23 = user5.getPassword();
    java.lang.String str24 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test212"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test213"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "hi!", "", "");
    user5.setUsername("hi!");
    java.lang.String str8 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test214"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    boolean b8 = user5.verifyEmailAddress();
    boolean b9 = user5.verifyPhoneNumber();
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test215"); }

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
    java.lang.String str33 = user5.getEmail();
    java.lang.String str34 = user5.getAddress();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test216"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("hi!");
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getAddress();
    boolean b11 = user5.verifyPhoneNumber();
    java.lang.String str12 = user5.getContactNumber();
    user5.setEmail("");
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str19 = user5.getContactNumber();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test217"); }

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
    user5.setAddress("hi!");
    user5.setEmail("");
    
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
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test218"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getPassword();
    user5.setEmail("");
    user5.setContactNumber("hi!");
    
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
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test219"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getEmail();
    user5.setContactNumber("hi!");
    java.lang.String str12 = user5.getPassword();
    user5.setPassword("hi!");
    user5.setContactNumber("");
    java.lang.String str17 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test220"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getAddress();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test221"); }

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
    java.lang.String str29 = user5.getUsername();
    boolean b30 = user5.verifyPhoneNumber();
    user5.setUsername("");
    user5.setUsername("");
    
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
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test222"); }

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
    user5.setContactNumber("hi!");
    java.lang.String str31 = user5.getUsername();
    java.lang.String str32 = user5.getContactNumber();
    user5.setAddress("hi!");
    java.lang.String str35 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test223"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "hi!");
    user5.setEmail("");
    java.lang.String str8 = user5.getAddress();
    user5.setUsername("hi!");
    boolean b11 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    java.lang.String str14 = user5.getEmail();
    java.lang.String str15 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test224"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getPassword();
    java.lang.String str19 = user5.getEmail();
    user5.setContactNumber("");
    user5.setAddress("hi!");
    user5.setContactNumber("");
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test225"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getEmail();
    java.lang.String str17 = user5.getContactNumber();
    boolean b18 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test226"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str14 = user5.getPassword();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getEmail();
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getEmail();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
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

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test227"); }

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
    java.lang.String str19 = user5.getEmail();
    boolean b20 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test228"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    java.lang.String str7 = user5.getAddress();
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getPassword();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test229"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    boolean b11 = user5.verifyEmailAddress();
    boolean b12 = user5.verifyEmailAddress();
    boolean b13 = user5.verifyPhoneNumber();
    user5.setContactNumber("hi!");
    user5.setEmail("");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test230"); }

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
    user5.setEmail("");
    java.lang.String str24 = user5.getAddress();
    java.lang.String str25 = user5.getEmail();
    user5.setContactNumber("");
    user5.setEmail("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test231"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("hi!");
    java.lang.String str17 = user5.getUsername();
    user5.setAddress("hi!");
    user5.setAddress("hi!");
    user5.setAddress("");
    user5.setAddress("");
    java.lang.String str26 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test232"); }

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
    user5.setPassword("hi!");
    user5.setAddress("");
    boolean b24 = user5.verifyEmailAddress();
    user5.setAddress("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test233"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    boolean b7 = user5.verifyPhoneNumber();
    java.lang.String str8 = user5.getPassword();
    boolean b9 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test234"); }

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
    user5.setEmail("");
    user5.setEmail("");
    java.lang.String str25 = user5.getContactNumber();
    java.lang.String str26 = user5.getContactNumber();
    java.lang.String str27 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test235"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str10 = user5.getAddress();
    java.lang.String str11 = user5.getAddress();
    boolean b12 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    java.lang.String str15 = user5.getEmail();
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    boolean b20 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test236"); }

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
    java.lang.String str20 = user5.getUsername();
    java.lang.String str21 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test237"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setContactNumber("");
    user5.setUsername("");
    user5.setContactNumber("hi!");
    user5.setEmail("");
    java.lang.String str16 = user5.getUsername();
    user5.setPassword("hi!");
    java.lang.String str19 = user5.getAddress();
    java.lang.String str20 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test238"); }

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
    java.lang.String str19 = user5.getUsername();
    java.lang.String str20 = user5.getPassword();
    user5.setAddress("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test239"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str12 = user5.getEmail();
    user5.setContactNumber("");
    user5.setEmail("hi!");
    boolean b17 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str20 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test240"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getContactNumber();
    java.lang.String str14 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
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
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test241"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setPassword("");
    user5.setAddress("hi!");
    user5.setUsername("hi!");
    java.lang.String str23 = user5.getEmail();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test242"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    user5.setAddress("");
    user5.setPassword("hi!");
    java.lang.String str10 = user5.getPassword();
    user5.setUsername("");
    java.lang.String str13 = user5.getPassword();
    user5.setUsername("");
    java.lang.String str16 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str19 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test243"); }

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
    user5.setAddress("");
    boolean b26 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test244"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    java.lang.String str7 = user5.getEmail();
    java.lang.String str8 = user5.getAddress();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test245"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    user5.setEmail("hi!");
    user5.setPassword("");
    boolean b20 = user5.verifyEmailAddress();
    boolean b21 = user5.verifyPhoneNumber();
    java.lang.String str22 = user5.getContactNumber();
    user5.setEmail("hi!");
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test246"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    user5.setAddress("");

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test247"); }

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
    user5.setAddress("hi!");
    java.lang.String str29 = user5.getContactNumber();
    java.lang.String str30 = user5.getAddress();
    user5.setAddress("hi!");
    user5.setEmail("hi!");
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
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test248"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setContactNumber("");
    user5.setEmail("hi!");
    java.lang.String str12 = user5.getUsername();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test249"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getEmail();
    java.lang.String str10 = user5.getAddress();
    java.lang.String str11 = user5.getUsername();
    
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
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test250"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    boolean b17 = user5.verifyEmailAddress();
    boolean b18 = user5.verifyEmailAddress();
    boolean b19 = user5.verifyEmailAddress();
    java.lang.String str20 = user5.getAddress();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test251"); }

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
    boolean b24 = user5.verifyEmailAddress();
    boolean b25 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test252"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "", "hi!");
    boolean b6 = user5.verifyEmailAddress();
    boolean b7 = user5.verifyEmailAddress();
    boolean b8 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test253"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    java.lang.String str13 = user5.getContactNumber();
    boolean b14 = user5.verifyPhoneNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getAddress();
    user5.setUsername("");
    user5.setPassword("hi!");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test254"); }

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
    user5.setUsername("hi!");
    user5.setUsername("");
    user5.setAddress("");
    user5.setUsername("");
    java.lang.String str37 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test255"); }

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
    user5.setPassword("hi!");
    java.lang.String str23 = user5.getEmail();
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test256"); }

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
    user5.setEmail("");
    boolean b23 = user5.verifyPhoneNumber();
    boolean b24 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test257"); }

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
    java.lang.String str21 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str24 = user5.getAddress();
    user5.setPassword("");
    user5.setPassword("");
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test258"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    user5.setContactNumber("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setPassword("");
    java.lang.String str21 = user5.getUsername();
    boolean b22 = user5.verifyPhoneNumber();
    boolean b23 = user5.verifyPhoneNumber();
    java.lang.String str24 = user5.getEmail();
    user5.setEmail("hi!");
    java.lang.String str27 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test259"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getAddress();
    user5.setContactNumber("hi!");
    user5.setAddress("");
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getAddress();
    java.lang.String str21 = user5.getUsername();
    user5.setEmail("");
    java.lang.String str24 = user5.getPassword();
    java.lang.String str25 = user5.getEmail();
    java.lang.String str26 = user5.getUsername();
    java.lang.String str27 = user5.getUsername();
    boolean b28 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test260"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    user5.setContactNumber("hi!");
    user5.setAddress("");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test261"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setEmail("hi!");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getAddress();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test262"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    user5.setEmail("");
    user5.setContactNumber("");
    user5.setPassword("");
    boolean b20 = user5.verifyPhoneNumber();
    java.lang.String str21 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test263"); }

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
    java.lang.String str25 = user5.getUsername();
    user5.setEmail("");
    java.lang.String str28 = user5.getAddress();
    java.lang.String str29 = user5.getContactNumber();
    boolean b30 = user5.verifyPhoneNumber();
    java.lang.String str31 = user5.getUsername();
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test264"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getUsername();
    java.lang.String str16 = user5.getUsername();
    java.lang.String str17 = user5.getPassword();
    
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

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test265"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    java.lang.String str8 = user5.getAddress();
    user5.setEmail("hi!");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getUsername();
    boolean b13 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test266"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setAddress("hi!");
    java.lang.String str12 = user5.getContactNumber();
    java.lang.String str13 = user5.getAddress();
    user5.setPassword("hi!");
    user5.setUsername("hi!");
    java.lang.String str18 = user5.getEmail();
    user5.setPassword("hi!");
    java.lang.String str21 = user5.getAddress();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test267"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    boolean b6 = user5.verifyEmailAddress();
    boolean b7 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    user5.setEmail("hi!");
    java.lang.String str12 = user5.getUsername();
    java.lang.String str13 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test268"); }

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
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getUsername();
    java.lang.String str21 = user5.getEmail();
    user5.setUsername("");
    user5.setEmail("");
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test269"); }

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
    java.lang.String str28 = user5.getContactNumber();
    java.lang.String str29 = user5.getUsername();
    user5.setUsername("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test270"); }

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
    boolean b19 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    java.lang.String str22 = user5.getContactNumber();
    user5.setUsername("");
    
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
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test271"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    user5.setContactNumber("");
    java.lang.String str13 = user5.getContactNumber();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test272"); }

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
    java.lang.String str25 = user5.getUsername();
    boolean b26 = user5.verifyEmailAddress();
    java.lang.String str27 = user5.getUsername();
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test273"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    user5.setEmail("");
    java.lang.String str16 = user5.getAddress();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    java.lang.String str23 = user5.getContactNumber();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test274"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getPassword();
    java.lang.String str11 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test275"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    user5.setPassword("");
    user5.setUsername("hi!");
    boolean b21 = user5.verifyPhoneNumber();
    java.lang.String str22 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test276"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setUsername("");
    user5.setEmail("hi!");
    user5.setUsername("");
    user5.setEmail("hi!");
    java.lang.String str23 = user5.getEmail();
    user5.setContactNumber("hi!");
    boolean b26 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test277"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    user5.setAddress("");
    java.lang.String str17 = user5.getUsername();
    boolean b18 = user5.verifyPhoneNumber();
    java.lang.String str19 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test278"); }

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
    user5.setAddress("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setEmail("");
    boolean b24 = user5.verifyEmailAddress();
    user5.setAddress("");
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test279"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("");
    user5.setAddress("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    user5.setAddress("");
    java.lang.String str19 = user5.getUsername();
    java.lang.String str20 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test280"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setEmail("hi!");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getAddress();
    java.lang.String str13 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test281"); }

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
    user5.setUsername("hi!");
    java.lang.String str34 = user5.getUsername();
    user5.setUsername("");
    
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
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test282"); }

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
    user5.setEmail("");
    user5.setEmail("hi!");
    java.lang.String str27 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test283"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test284"); }

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
    java.lang.String str23 = user5.getUsername();
    user5.setEmail("");
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test285"); }

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
    java.lang.String str20 = user5.getEmail();
    java.lang.String str21 = user5.getAddress();
    java.lang.String str22 = user5.getUsername();
    boolean b23 = user5.verifyEmailAddress();
    user5.setUsername("");
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test286"); }

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
    java.lang.String str22 = user5.getPassword();
    java.lang.String str23 = user5.getUsername();
    java.lang.String str24 = user5.getEmail();
    java.lang.String str25 = user5.getAddress();
    java.lang.String str26 = user5.getUsername();
    boolean b27 = user5.verifyEmailAddress();
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test287"); }

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
    boolean b34 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setUsername("");
    
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
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test288"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getAddress();
    user5.setAddress("");
    user5.setEmail("");
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str26 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test289"); }

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
    user5.setContactNumber("");
    user5.setPassword("hi!");
    java.lang.String str27 = user5.getUsername();
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test290"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    java.lang.String str15 = user5.getUsername();
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test291"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getUsername();
    user5.setPassword("");
    java.lang.String str19 = user5.getEmail();
    user5.setEmail("");
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test292"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    boolean b10 = user5.verifyPhoneNumber();
    user5.setPassword("");
    user5.setAddress("hi!");
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getUsername();
    java.lang.String str17 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test293"); }

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
    user5.setEmail("hi!");
    java.lang.String str27 = user5.getUsername();
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test294"); }

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
    java.lang.String str18 = user5.getPassword();
    java.lang.String str19 = user5.getAddress();
    boolean b20 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test295"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("");
    user5.setUsername("");
    user5.setContactNumber("");
    user5.setUsername("");
    java.lang.String str20 = user5.getUsername();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test296"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str12 = user5.getEmail();
    user5.setContactNumber("");
    user5.setPassword("");
    java.lang.String str17 = user5.getEmail();
    java.lang.String str18 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test297"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getAddress();
    user5.setContactNumber("hi!");
    user5.setAddress("");
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getAddress();
    java.lang.String str21 = user5.getUsername();
    user5.setEmail("");
    java.lang.String str24 = user5.getPassword();
    java.lang.String str25 = user5.getEmail();
    user5.setUsername("hi!");
    java.lang.String str28 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test298"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b13 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setUsername("");
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test299"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    user5.setContactNumber("hi!");
    boolean b9 = user5.verifyPhoneNumber();
    java.lang.String str10 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

}
