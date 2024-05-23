
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test001"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getContactNumber();
    user5.setUsername("hi!");
    java.lang.String str19 = user5.getPassword();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test002"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "hi!", "");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test003"); }

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
    user5.setUsername("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str28 = user5.getEmail();
    boolean b29 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test004"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("hi!");
    java.lang.String str17 = user5.getUsername();
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test005"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getPassword();
    user5.setEmail("hi!");
    java.lang.String str18 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test006"); }

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
    user5.setEmail("hi!");
    java.lang.String str31 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test007"); }

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
    user5.setUsername("");
    java.lang.String str22 = user5.getEmail();
    java.lang.String str23 = user5.getAddress();
    boolean b24 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test008"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "", "", "");
    java.lang.String str6 = user5.getAddress();
    user5.setAddress("hi!");
    java.lang.String str9 = user5.getPassword();
    java.lang.String str10 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test009"); }

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
    java.lang.String str23 = user5.getUsername();
    java.lang.String str24 = user5.getPassword();
    java.lang.String str25 = user5.getUsername();
    java.lang.String str26 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setUsername("hi!");
    user5.setContactNumber("");
    user5.setContactNumber("hi!");
    java.lang.String str35 = user5.getEmail();
    user5.setUsername("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test010"); }

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
    java.lang.String str22 = user5.getContactNumber();
    java.lang.String str23 = user5.getEmail();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test011"); }

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
    java.lang.String str18 = user5.getEmail();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test012"); }

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
    user5.setUsername("hi!");
    java.lang.String str23 = user5.getEmail();
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test013"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getContactNumber();
    boolean b14 = user5.verifyPhoneNumber();
    boolean b15 = user5.verifyEmailAddress();
    user5.setAddress("");
    user5.setPassword("hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("");
    
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
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test014"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    user5.setEmail("");
    user5.setPassword("hi!");
    user5.setContactNumber("");
    java.lang.String str14 = user5.getUsername();
    boolean b15 = user5.verifyEmailAddress();
    user5.setAddress("");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test015"); }

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
    boolean b24 = user5.verifyPhoneNumber();
    boolean b25 = user5.verifyPhoneNumber();
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
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test016"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b13 = user5.verifyEmailAddress();
    user5.setPassword("");
    
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
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test017"); }

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
    boolean b20 = user5.verifyPhoneNumber();
    java.lang.String str21 = user5.getEmail();
    user5.setAddress("");
    java.lang.String str24 = user5.getEmail();
    
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
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test018"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getUsername();
    user5.setAddress("");
    java.lang.String str12 = user5.getEmail();
    user5.setContactNumber("");
    user5.setContactNumber("");
    boolean b17 = user5.verifyEmailAddress();
    boolean b18 = user5.verifyEmailAddress();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test019"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getUsername();
    boolean b18 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    user5.setAddress("");
    user5.setAddress("hi!");
    java.lang.String str25 = user5.getContactNumber();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test020"); }

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
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str26 = user5.getEmail();
    java.lang.String str27 = user5.getContactNumber();
    java.lang.String str28 = user5.getUsername();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test021"); }

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
    java.lang.String str20 = user5.getContactNumber();
    boolean b21 = user5.verifyEmailAddress();
    
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
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test022"); }

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
    boolean b19 = user5.verifyEmailAddress();
    boolean b20 = user5.verifyEmailAddress();
    user5.setUsername("");
    java.lang.String str23 = user5.getEmail();
    user5.setPassword("hi!");
    boolean b26 = user5.verifyPhoneNumber();
    java.lang.String str27 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test023"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getAddress();
    boolean b17 = user5.verifyEmailAddress();
    java.lang.String str18 = user5.getUsername();
    boolean b19 = user5.verifyPhoneNumber();
    java.lang.String str20 = user5.getPassword();
    user5.setUsername("");
    java.lang.String str23 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test024"); }

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
    boolean b18 = user5.verifyPhoneNumber();
    java.lang.String str19 = user5.getAddress();
    java.lang.String str20 = user5.getContactNumber();
    
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
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test025"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getEmail();
    user5.setContactNumber("hi!");
    java.lang.String str12 = user5.getAddress();
    boolean b13 = user5.verifyEmailAddress();
    java.lang.String str14 = user5.getPassword();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test026"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    boolean b10 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    boolean b13 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test027"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    boolean b11 = user5.verifyEmailAddress();
    java.lang.String str12 = user5.getEmail();
    user5.setUsername("hi!");
    java.lang.String str15 = user5.getPassword();
    user5.setContactNumber("");
    boolean b18 = user5.verifyPhoneNumber();
    boolean b19 = user5.verifyPhoneNumber();
    boolean b20 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test028"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str14 = user5.getUsername();
    user5.setContactNumber("hi!");
    java.lang.String str17 = user5.getEmail();
    java.lang.String str18 = user5.getEmail();
    java.lang.String str19 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test029"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    java.lang.String str15 = user5.getUsername();
    user5.setAddress("hi!");
    boolean b18 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test030"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    user5.setPassword("");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getContactNumber();
    user5.setEmail("hi!");
    boolean b23 = user5.verifyPhoneNumber();
    user5.setPassword("hi!");
    boolean b26 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test031"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    user5.setPassword("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    user5.setEmail("");
    java.lang.String str24 = user5.getEmail();
    user5.setContactNumber("");
    user5.setAddress("");
    boolean b29 = user5.verifyEmailAddress();
    boolean b30 = user5.verifyPhoneNumber();
    java.lang.String str31 = user5.getEmail();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test032"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setEmail("hi!");
    user5.setUsername("");
    user5.setUsername("hi!");
    user5.setUsername("");
    user5.setUsername("hi!");

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test033"); }

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
    boolean b23 = user5.verifyPhoneNumber();
    java.lang.String str24 = user5.getEmail();
    java.lang.String str25 = user5.getAddress();
    user5.setUsername("");
    user5.setContactNumber("");
    java.lang.String str30 = user5.getContactNumber();
    java.lang.String str31 = user5.getEmail();
    
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
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test034"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    java.lang.String str7 = user5.getPassword();
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str12 = user5.getEmail();
    user5.setUsername("");
    java.lang.String str15 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
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
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test035"); }

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
    java.lang.String str20 = user5.getAddress();
    java.lang.String str21 = user5.getEmail();
    user5.setEmail("");
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test036"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    java.lang.String str16 = user5.getPassword();
    user5.setContactNumber("hi!");
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test037"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setContactNumber("");
    user5.setUsername("");
    user5.setContactNumber("hi!");
    user5.setEmail("");
    java.lang.String str16 = user5.getUsername();
    user5.setPassword("");
    user5.setContactNumber("");
    user5.setContactNumber("");
    boolean b23 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test038"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("hi!");
    user5.setPassword("");
    boolean b22 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test039"); }

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
    user5.setUsername("");
    user5.setUsername("hi!");
    java.lang.String str24 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test040"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getAddress();
    user5.setPassword("");
    java.lang.String str14 = user5.getUsername();
    boolean b15 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    java.lang.String str18 = user5.getEmail();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test041"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    boolean b9 = user5.verifyPhoneNumber();
    java.lang.String str10 = user5.getAddress();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test042"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    java.lang.String str14 = user5.getUsername();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test043"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    user5.setContactNumber("");
    java.lang.String str16 = user5.getAddress();
    java.lang.String str17 = user5.getUsername();
    user5.setUsername("hi!");
    user5.setPassword("hi!");
    java.lang.String str22 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test044"); }

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
    java.lang.String str33 = user5.getUsername();
    java.lang.String str34 = user5.getContactNumber();
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

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test045"); }

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
    java.lang.String str29 = user5.getContactNumber();
    user5.setUsername("");
    user5.setPassword("");
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
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test046"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    user5.setEmail("");
    java.lang.String str18 = user5.getPassword();
    user5.setAddress("hi!");
    boolean b21 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test047"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    user5.setEmail("");
    user5.setUsername("hi!");
    java.lang.String str13 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test048"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getUsername();
    user5.setEmail("hi!");
    boolean b19 = user5.verifyPhoneNumber();
    java.lang.String str20 = user5.getUsername();
    boolean b21 = user5.verifyEmailAddress();
    java.lang.String str22 = user5.getPassword();
    user5.setAddress("");
    java.lang.String str25 = user5.getUsername();
    java.lang.String str26 = user5.getUsername();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test049"); }

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
    boolean b24 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    java.lang.String str27 = user5.getUsername();
    user5.setContactNumber("hi!");
    user5.setPassword("");
    boolean b32 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    java.lang.String str35 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test050"); }

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
    user5.setEmail("");
    boolean b22 = user5.verifyEmailAddress();
    java.lang.String str23 = user5.getContactNumber();
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
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test051"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    java.lang.String str15 = user5.getUsername();
    boolean b16 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    java.lang.String str19 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test052"); }

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
    java.lang.String str27 = user5.getUsername();
    java.lang.String str28 = user5.getUsername();
    user5.setPassword("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test053"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getAddress();
    user5.setPassword("hi!");
    boolean b12 = user5.verifyEmailAddress();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test054"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getAddress();
    
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
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test055"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    user5.setEmail("hi!");
    user5.setPassword("");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test056"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getUsername();
    user5.setAddress("");
    java.lang.String str19 = user5.getAddress();
    boolean b20 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test057"); }

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
    user5.setEmail("hi!");
    user5.setUsername("");
    java.lang.String str24 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    user5.setContactNumber("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test058"); }

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
    java.lang.String str28 = user5.getAddress();
    
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
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test059"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str12 = user5.getContactNumber();
    user5.setUsername("");
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getEmail();
    user5.setContactNumber("hi!");
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getAddress();
    java.lang.String str21 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test060"); }

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
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str27 = user5.getEmail();
    java.lang.String str28 = user5.getContactNumber();
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test061"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    java.lang.String str14 = user5.getPassword();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getUsername();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test062"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setAddress("");
    user5.setAddress("");
    user5.setContactNumber("hi!");
    java.lang.String str21 = user5.getPassword();
    boolean b22 = user5.verifyPhoneNumber();
    java.lang.String str23 = user5.getUsername();
    java.lang.String str24 = user5.getPassword();
    boolean b25 = user5.verifyPhoneNumber();
    java.lang.String str26 = user5.getEmail();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test063"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getUsername();
    user5.setUsername("");
    java.lang.String str10 = user5.getEmail();
    boolean b11 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test064"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    java.lang.String str7 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test065"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    boolean b15 = user5.verifyPhoneNumber();
    user5.setPassword("hi!");
    java.lang.String str18 = user5.getContactNumber();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test066"); }

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
    user5.setAddress("");
    user5.setUsername("");
    boolean b25 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test067"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str10 = user5.getUsername();
    user5.setUsername("");
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    user5.setPassword("");
    user5.setPassword("");
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test068"); }

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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test069"); }

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
    java.lang.String str20 = user5.getPassword();
    user5.setAddress("hi!");
    boolean b23 = user5.verifyEmailAddress();
    boolean b24 = user5.verifyEmailAddress();
    
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test070"); }

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
    java.lang.String str19 = user5.getContactNumber();
    user5.setEmail("");
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test071"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setUsername("hi!");
    java.lang.String str14 = user5.getEmail();
    user5.setUsername("");
    user5.setUsername("");
    java.lang.String str19 = user5.getEmail();
    boolean b20 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test072"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    java.lang.String str16 = user5.getContactNumber();
    user5.setUsername("");
    java.lang.String str19 = user5.getPassword();
    java.lang.String str20 = user5.getContactNumber();
    user5.setUsername("");
    boolean b23 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test073"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str18 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test074"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    user5.setEmail("");
    user5.setEmail("");
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test075"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    java.lang.String str12 = user5.getPassword();
    user5.setPassword("");
    user5.setUsername("hi!");
    java.lang.String str17 = user5.getPassword();
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test076"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "hi!", "");
    java.lang.String str6 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    user5.setAddress("");
    boolean b14 = user5.verifyEmailAddress();
    user5.setPassword("");
    java.lang.String str17 = user5.getUsername();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test077"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "hi!", "");
    boolean b6 = user5.verifyEmailAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test078"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getPassword();
    java.lang.String str10 = user5.getUsername();
    java.lang.String str11 = user5.getUsername();
    java.lang.String str12 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
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

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test079"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setEmail("");
    java.lang.String str10 = user5.getEmail();
    user5.setContactNumber("hi!");
    boolean b13 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test080"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getUsername();
    user5.setAddress("");
    user5.setUsername("");
    java.lang.String str21 = user5.getUsername();
    user5.setEmail("");
    user5.setContactNumber("");
    user5.setEmail("");
    
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

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test081"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    boolean b11 = user5.verifyEmailAddress();
    user5.setPassword("");
    user5.setAddress("");
    boolean b16 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test082"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    boolean b7 = user5.verifyEmailAddress();
    java.lang.String str8 = user5.getEmail();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getUsername();
    java.lang.String str12 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test083"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    user5.setPassword("hi!");
    java.lang.String str18 = user5.getAddress();
    user5.setEmail("");
    user5.setPassword("hi!");
    java.lang.String str23 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test084"); }

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
    user5.setAddress("hi!");
    java.lang.String str27 = user5.getContactNumber();
    java.lang.String str28 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test085"); }

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
    java.lang.String str22 = user5.getPassword();
    java.lang.String str23 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test086"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str10 = user5.getUsername();
    user5.setUsername("");
    user5.setUsername("hi!");
    boolean b15 = user5.verifyPhoneNumber();
    user5.setUsername("");
    user5.setUsername("hi!");
    java.lang.String str20 = user5.getPassword();
    java.lang.String str21 = user5.getEmail();
    user5.setPassword("");
    java.lang.String str24 = user5.getUsername();
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test087"); }

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
    boolean b33 = user5.verifyEmailAddress();
    java.lang.String str34 = user5.getUsername();
    boolean b35 = user5.verifyEmailAddress();
    
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
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test088"); }

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
    java.lang.String str20 = user5.getPassword();
    user5.setAddress("");
    
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
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test089"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    user5.setEmail("");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    java.lang.String str22 = user5.getPassword();
    java.lang.String str23 = user5.getAddress();
    java.lang.String str24 = user5.getUsername();
    boolean b25 = user5.verifyPhoneNumber();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test090"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getAddress();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test091"); }

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
    java.lang.String str24 = user5.getUsername();
    java.lang.String str25 = user5.getUsername();
    boolean b26 = user5.verifyEmailAddress();
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test092"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    user5.setPassword("");
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getEmail();
    boolean b17 = user5.verifyEmailAddress();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test093"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setAddress("");

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test094"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "hi!", "hi!");
    user5.setUsername("");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test095"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setAddress("");
    user5.setAddress("");
    user5.setContactNumber("hi!");
    user5.setEmail("hi!");
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test096"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    user5.setAddress("");
    java.lang.String str14 = user5.getEmail();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getUsername();
    user5.setPassword("");
    user5.setAddress("");
    
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
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test097"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setUsername("");
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    user5.setPassword("hi!");
    java.lang.String str23 = user5.getAddress();
    user5.setAddress("hi!");
    boolean b26 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test098"); }

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
    java.lang.String str24 = user5.getEmail();
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
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test099"); }

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
    user5.setAddress("");
    
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

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test100"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setContactNumber("");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setPassword("");
    user5.setPassword("hi!");
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test101"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setContactNumber("hi!");
    user5.setPassword("hi!");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getUsername();
    java.lang.String str21 = user5.getEmail();
    java.lang.String str22 = user5.getAddress();
    java.lang.String str23 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test102"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setAddress("");
    user5.setAddress("");
    user5.setContactNumber("hi!");
    java.lang.String str21 = user5.getPassword();
    boolean b22 = user5.verifyPhoneNumber();
    java.lang.String str23 = user5.getUsername();
    java.lang.String str24 = user5.getEmail();
    java.lang.String str25 = user5.getUsername();
    user5.setContactNumber("");
    boolean b28 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test103"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getAddress();
    java.lang.String str12 = user5.getPassword();
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str17 = user5.getEmail();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test104"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    user5.setUsername("");
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getEmail();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test105"); }

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
    java.lang.String str18 = user5.getContactNumber();
    user5.setEmail("");
    user5.setPassword("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test106"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    user5.setContactNumber("");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test107"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setContactNumber("");
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test108"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setContactNumber("");
    java.lang.String str12 = user5.getPassword();
    user5.setContactNumber("");
    java.lang.String str15 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test109"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    java.lang.String str7 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str10 = user5.getPassword();
    java.lang.String str11 = user5.getUsername();
    java.lang.String str12 = user5.getContactNumber();
    
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
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test110"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    boolean b10 = user5.verifyPhoneNumber();
    java.lang.String str11 = user5.getPassword();
    boolean b12 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test111"); }

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
    user5.setUsername("hi!");
    user5.setPassword("");
    boolean b24 = user5.verifyPhoneNumber();
    java.lang.String str25 = user5.getUsername();
    java.lang.String str26 = user5.getUsername();
    java.lang.String str27 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str30 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test112"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    java.lang.String str6 = user5.getContactNumber();
    java.lang.String str7 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setPassword("");
    java.lang.String str12 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test113"); }

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
    boolean b20 = user5.verifyPhoneNumber();
    java.lang.String str21 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test114"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setAddress("");
    java.lang.String str17 = user5.getEmail();
    user5.setAddress("hi!");
    java.lang.String str20 = user5.getEmail();
    boolean b21 = user5.verifyPhoneNumber();
    java.lang.String str22 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test115"); }

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
    java.lang.String str20 = user5.getPassword();
    user5.setEmail("");
    java.lang.String str23 = user5.getUsername();
    user5.setUsername("");
    user5.setPassword("");
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test116"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getUsername();
    user5.setEmail("");
    boolean b12 = user5.verifyEmailAddress();
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test117"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test118"); }

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
    java.lang.String str19 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test119"); }

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
    user5.setUsername("hi!");
    boolean b23 = user5.verifyPhoneNumber();
    boolean b24 = user5.verifyPhoneNumber();
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test120"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getEmail();
    user5.setContactNumber("hi!");
    java.lang.String str12 = user5.getAddress();
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    java.lang.String str17 = user5.getEmail();
    user5.setContactNumber("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test121"); }

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
    user5.setAddress("");
    boolean b25 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test122"); }

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
    user5.setPassword("");
    java.lang.String str26 = user5.getUsername();
    
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test123"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str12 = user5.getPassword();
    boolean b13 = user5.verifyPhoneNumber();
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getUsername();
    user5.setUsername("");
    java.lang.String str19 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test124"); }

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
    java.lang.String str24 = user5.getAddress();
    
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
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test125"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getPassword();
    java.lang.String str13 = user5.getAddress();
    user5.setUsername("");
    java.lang.String str16 = user5.getEmail();
    java.lang.String str17 = user5.getUsername();
    java.lang.String str18 = user5.getEmail();
    boolean b19 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test126"); }

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
    user5.setAddress("hi!");
    user5.setUsername("hi!");
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test127"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setUsername("");
    java.lang.String str17 = user5.getEmail();
    java.lang.String str18 = user5.getAddress();
    java.lang.String str19 = user5.getAddress();
    user5.setAddress("hi!");
    java.lang.String str22 = user5.getContactNumber();
    java.lang.String str23 = user5.getContactNumber();
    java.lang.String str24 = user5.getAddress();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test128"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "hi!");
    user5.setEmail("");
    java.lang.String str8 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    java.lang.String str13 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test129"); }

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
    user5.setEmail("hi!");
    java.lang.String str23 = user5.getAddress();
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
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test130"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str10 = user5.getUsername();
    user5.setUsername("");
    user5.setUsername("hi!");
    user5.setEmail("");
    boolean b17 = user5.verifyEmailAddress();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test131"); }

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
    java.lang.String str21 = user5.getEmail();
    boolean b22 = user5.verifyPhoneNumber();
    java.lang.String str23 = user5.getContactNumber();
    java.lang.String str24 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test132"); }

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
    user5.setEmail("hi!");
    
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
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test133"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getUsername();
    user5.setAddress("");
    user5.setEmail("hi!");
    user5.setAddress("");
    java.lang.String str18 = user5.getEmail();
    user5.setContactNumber("hi!");
    boolean b21 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test134"); }

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
    boolean b19 = user5.verifyPhoneNumber();
    java.lang.String str20 = user5.getContactNumber();
    user5.setAddress("hi!");
    java.lang.String str23 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test135"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    user5.setAddress("");
    java.lang.String str14 = user5.getEmail();
    user5.setAddress("hi!");
    boolean b17 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test136"); }

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
    boolean b25 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test137"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    user5.setUsername("");
    boolean b13 = user5.verifyPhoneNumber();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test138"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("hi!");
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getAddress();
    boolean b11 = user5.verifyPhoneNumber();
    java.lang.String str12 = user5.getPassword();
    boolean b13 = user5.verifyEmailAddress();
    user5.setUsername("");
    boolean b16 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test139"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getAddress();
    java.lang.String str15 = user5.getAddress();
    user5.setContactNumber("hi!");
    boolean b18 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test140"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("");
    user5.setAddress("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    user5.setAddress("");
    user5.setUsername("");
    user5.setPassword("");
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test141"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "", "hi!");
    boolean b6 = user5.verifyEmailAddress();
    user5.setAddress("");
    boolean b9 = user5.verifyPhoneNumber();
    java.lang.String str10 = user5.getAddress();
    boolean b11 = user5.verifyPhoneNumber();
    java.lang.String str12 = user5.getUsername();
    user5.setEmail("");
    boolean b15 = user5.verifyEmailAddress();
    boolean b16 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test142"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getEmail();
    user5.setUsername("");
    user5.setPassword("hi!");
    user5.setAddress("");
    java.lang.String str21 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test143"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    user5.setUsername("hi!");
    boolean b19 = user5.verifyEmailAddress();
    java.lang.String str20 = user5.getContactNumber();
    user5.setUsername("hi!");
    boolean b23 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test144"); }

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
    user5.setContactNumber("hi!");
    boolean b30 = user5.verifyEmailAddress();
    boolean b31 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test145"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    boolean b8 = user5.verifyPhoneNumber();
    boolean b9 = user5.verifyEmailAddress();
    java.lang.String str10 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test146"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setUsername("");
    user5.setAddress("hi!");
    boolean b18 = user5.verifyEmailAddress();
    boolean b19 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test147"); }

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
    java.lang.String str20 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setPassword("");
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test148"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    user5.setPassword("");
    boolean b12 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test149"); }

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
    java.lang.String str23 = user5.getAddress();
    user5.setContactNumber("");
    java.lang.String str26 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test150"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyPhoneNumber();
    user5.setPassword("hi!");
    user5.setPassword("");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test151"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    java.lang.String str15 = user5.getUsername();
    user5.setAddress("hi!");
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test152"); }

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
    java.lang.String str23 = user5.getAddress();
    boolean b24 = user5.verifyPhoneNumber();
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test153"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    java.lang.String str7 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str10 = user5.getPassword();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("hi!");
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test154"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    java.lang.String str15 = user5.getUsername();
    java.lang.String str16 = user5.getEmail();
    java.lang.String str17 = user5.getContactNumber();
    user5.setEmail("");
    boolean b20 = user5.verifyEmailAddress();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test155"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    user5.setEmail("");
    user5.setAddress("");
    java.lang.String str10 = user5.getPassword();
    java.lang.String str11 = user5.getEmail();
    boolean b12 = user5.verifyPhoneNumber();
    user5.setAddress("");
    java.lang.String str15 = user5.getPassword();
    user5.setEmail("");
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test156"); }

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
    boolean b31 = user5.verifyEmailAddress();
    
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

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test157"); }

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
    user5.setUsername("");
    java.lang.String str25 = user5.getEmail();
    java.lang.String str26 = user5.getUsername();
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test158"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getEmail();
    user5.setUsername("");
    boolean b10 = user5.verifyEmailAddress();
    boolean b11 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test159"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setContactNumber("hi!");
    user5.setPassword("hi!");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getUsername();
    user5.setPassword("hi!");
    boolean b23 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test160"); }

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
    boolean b21 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str24 = user5.getContactNumber();
    user5.setAddress("");
    
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
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test161"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    user5.setEmail("");
    java.lang.String str16 = user5.getAddress();
    user5.setPassword("");
    boolean b19 = user5.verifyPhoneNumber();
    java.lang.String str20 = user5.getUsername();
    boolean b21 = user5.verifyEmailAddress();
    java.lang.String str22 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test162"); }

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
    user5.setEmail("");
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test163"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    boolean b9 = user5.verifyEmailAddress();
    java.lang.String str10 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test164"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test165"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    user5.setPassword("hi!");
    boolean b13 = user5.verifyEmailAddress();
    java.lang.String str14 = user5.getPassword();
    user5.setContactNumber("");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test166"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "hi!");
    user5.setEmail("");
    java.lang.String str8 = user5.getEmail();
    user5.setContactNumber("");
    boolean b11 = user5.verifyPhoneNumber();
    user5.setUsername("");
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getPassword();
    
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
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test167"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    java.lang.String str14 = user5.getPassword();
    java.lang.String str15 = user5.getContactNumber();
    boolean b16 = user5.verifyPhoneNumber();
    boolean b17 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test168"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    user5.setContactNumber("");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getPassword();
    boolean b21 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test169"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getUsername();
    java.lang.String str11 = user5.getPassword();
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test170"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setPassword("");
    user5.setUsername("");
    user5.setUsername("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setUsername("hi!");
    boolean b22 = user5.verifyEmailAddress();
    java.lang.String str23 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test171"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setContactNumber("");
    user5.setEmail("hi!");
    user5.setEmail("");
    java.lang.String str14 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test172"); }

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
    user5.setEmail("hi!");
    
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

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test173"); }

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
    boolean b26 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    java.lang.String str29 = user5.getEmail();
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
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test174"); }

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
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    
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

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test175"); }

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
    user5.setContactNumber("");
    user5.setUsername("");
    java.lang.String str26 = user5.getEmail();
    
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test176"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setContactNumber("");
    java.lang.String str8 = user5.getAddress();
    java.lang.String str9 = user5.getUsername();
    java.lang.String str10 = user5.getUsername();
    java.lang.String str11 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test177"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getUsername();
    user5.setAddress("");
    java.lang.String str12 = user5.getEmail();
    user5.setContactNumber("");
    user5.setContactNumber("");
    java.lang.String str17 = user5.getEmail();
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test178"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getEmail();
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
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test179"); }

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
    boolean b31 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    
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
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test180"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getUsername();
    user5.setAddress("");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test181"); }

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
    user5.setEmail("hi!");
    java.lang.String str23 = user5.getPassword();
    java.lang.String str24 = user5.getAddress();
    user5.setAddress("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test182"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    java.lang.String str12 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    
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
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test183"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    java.lang.String str13 = user5.getContactNumber();
    user5.setAddress("hi!");
    java.lang.String str16 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    user5.setEmail("");
    java.lang.String str21 = user5.getContactNumber();
    boolean b22 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test184"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "");
    java.lang.String str6 = user5.getContactNumber();
    boolean b7 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str10 = user5.getEmail();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test185"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "hi!", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    java.lang.String str7 = user5.getEmail();
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getPassword();
    
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
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test186"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    java.lang.String str17 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test187"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    boolean b14 = user5.verifyEmailAddress();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test188"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    boolean b9 = user5.verifyEmailAddress();
    java.lang.String str10 = user5.getPassword();
    boolean b11 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    user5.setContactNumber("");
    java.lang.String str16 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test189"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setPassword("");
    user5.setUsername("");
    user5.setUsername("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    boolean b22 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test190"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getAddress();
    user5.setAddress("hi!");
    boolean b19 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str22 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test191"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getUsername();
    user5.setAddress("");
    user5.setUsername("");
    boolean b21 = user5.verifyPhoneNumber();
    user5.setUsername("");
    
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
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test192"); }

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
    user5.setEmail("");
    user5.setEmail("hi!");
    java.lang.String str30 = user5.getAddress();
    java.lang.String str31 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test193"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    user5.setEmail("");
    java.lang.String str16 = user5.getAddress();
    user5.setPassword("");
    boolean b19 = user5.verifyPhoneNumber();
    java.lang.String str20 = user5.getUsername();
    java.lang.String str21 = user5.getUsername();
    java.lang.String str22 = user5.getUsername();
    java.lang.String str23 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test194"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getEmail();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getEmail();
    java.lang.String str19 = user5.getEmail();
    user5.setPassword("");
    user5.setAddress("hi!");
    boolean b24 = user5.verifyEmailAddress();
    java.lang.String str25 = user5.getAddress();
    java.lang.String str26 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test195"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getEmail();
    boolean b17 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test196"); }

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
    boolean b30 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    java.lang.String str33 = user5.getUsername();
    boolean b34 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test197"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    java.lang.String str15 = user5.getContactNumber();
    user5.setContactNumber("");
    java.lang.String str18 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
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
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test198"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    user5.setContactNumber("");
    boolean b13 = user5.verifyPhoneNumber();
    boolean b14 = user5.verifyPhoneNumber();
    java.lang.String str15 = user5.getPassword();
    user5.setContactNumber("hi!");
    user5.setEmail("");
    user5.setContactNumber("hi!");
    java.lang.String str22 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test199"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    user5.setEmail("");
    user5.setContactNumber("");
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test200"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getEmail();
    java.lang.String str10 = user5.getPassword();
    java.lang.String str11 = user5.getPassword();
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setAddress("");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test201"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    user5.setPassword("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    user5.setEmail("");
    boolean b24 = user5.verifyPhoneNumber();
    user5.setUsername("");
    user5.setContactNumber("");
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test202"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    user5.setEmail("");
    user5.setPassword("hi!");
    user5.setContactNumber("");
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getEmail();
    user5.setEmail("hi!");
    java.lang.String str18 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test203"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    user5.setPassword("");
    java.lang.String str20 = user5.getEmail();
    java.lang.String str21 = user5.getEmail();
    user5.setEmail("");
    user5.setContactNumber("hi!");
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test204"); }

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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test205"); }

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
    user5.setAddress("");
    
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
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test206"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    user5.setContactNumber("");
    java.lang.String str13 = user5.getContactNumber();
    java.lang.String str14 = user5.getContactNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getContactNumber();
    user5.setEmail("hi!");
    
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

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test207"); }

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
    java.lang.String str25 = user5.getAddress();
    user5.setEmail("hi!");
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test208"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    user5.setAddress("");
    user5.setUsername("hi!");
    java.lang.String str21 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test209"); }

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
    boolean b21 = user5.verifyPhoneNumber();
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test210"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    java.lang.String str14 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test211"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str14 = user5.getAddress();
    user5.setContactNumber("hi!");
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
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test212"); }

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
    boolean b19 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    java.lang.String str22 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test213"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    user5.setUsername("");
    user5.setContactNumber("");
    user5.setEmail("");
    boolean b22 = user5.verifyPhoneNumber();
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
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test214"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    java.lang.String str7 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str10 = user5.getPassword();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("hi!");
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test215"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("hi!");
    java.lang.String str9 = user5.getAddress();
    boolean b10 = user5.verifyEmailAddress();
    java.lang.String str11 = user5.getPassword();
    user5.setPassword("hi!");
    user5.setEmail("");
    user5.setAddress("");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test216"); }

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
    boolean b25 = user5.verifyPhoneNumber();
    java.lang.String str26 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test217"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    user5.setEmail("");
    user5.setPassword("hi!");
    user5.setContactNumber("");
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test218"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    boolean b9 = user5.verifyEmailAddress();
    java.lang.String str10 = user5.getUsername();
    user5.setEmail("hi!");
    java.lang.String str13 = user5.getAddress();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test219"); }

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
    user5.setPassword("hi!");
    boolean b24 = user5.verifyEmailAddress();
    java.lang.String str25 = user5.getAddress();
    boolean b26 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test220"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "hi!", "hi!", "");
    java.lang.String str6 = user5.getPassword();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test221"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    user5.setPassword("");
    user5.setEmail("hi!");
    java.lang.String str20 = user5.getContactNumber();
    user5.setPassword("");
    user5.setAddress("hi!");
    java.lang.String str25 = user5.getContactNumber();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test222"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    java.lang.String str15 = user5.getUsername();
    user5.setEmail("hi!");
    user5.setPassword("");
    java.lang.String str20 = user5.getEmail();
    java.lang.String str21 = user5.getContactNumber();
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test223"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str10 = user5.getContactNumber();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test224"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getUsername();
    user5.setAddress("");
    user5.setEmail("hi!");
    user5.setAddress("");
    boolean b18 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    java.lang.String str21 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test225"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "");
    user5.setUsername("hi!");
    boolean b8 = user5.verifyEmailAddress();
    boolean b9 = user5.verifyEmailAddress();
    boolean b10 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test226"); }

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
    boolean b20 = user5.verifyPhoneNumber();
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test227"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getUsername();
    user5.setUsername("");
    boolean b10 = user5.verifyPhoneNumber();
    java.lang.String str11 = user5.getUsername();
    java.lang.String str12 = user5.getEmail();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test228"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str18 = user5.getUsername();
    boolean b19 = user5.verifyEmailAddress();
    boolean b20 = user5.verifyEmailAddress();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test229"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    boolean b11 = user5.verifyEmailAddress();
    boolean b12 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    java.lang.String str15 = user5.getEmail();
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getAddress();
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getEmail();
    boolean b20 = user5.verifyEmailAddress();
    boolean b21 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test230"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setAddress("hi!");
    java.lang.String str12 = user5.getContactNumber();
    java.lang.String str13 = user5.getAddress();
    user5.setPassword("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test231"); }

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
    java.lang.String str20 = user5.getContactNumber();
    boolean b21 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test232"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str14 = user5.getAddress();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test233"); }

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
    java.lang.String str20 = user5.getContactNumber();
    java.lang.String str21 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test234"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setAddress("");
    user5.setContactNumber("");
    user5.setContactNumber("");
    java.lang.String str21 = user5.getAddress();
    boolean b22 = user5.verifyPhoneNumber();
    user5.setAddress("");
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test235"); }

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
    java.lang.String str20 = user5.getPassword();
    java.lang.String str21 = user5.getPassword();
    user5.setUsername("");
    user5.setUsername("hi!");
    java.lang.String str26 = user5.getUsername();
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test236"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    java.lang.String str7 = user5.getEmail();
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getAddress();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test237"); }

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
    java.lang.String str19 = user5.getUsername();
    user5.setUsername("");
    java.lang.String str22 = user5.getUsername();
    java.lang.String str23 = user5.getEmail();
    java.lang.String str24 = user5.getUsername();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test238"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "hi!", "");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getContactNumber();
    boolean b8 = user5.verifyPhoneNumber();
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test239"); }

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
    user5.setPassword("hi!");
    java.lang.String str20 = user5.getContactNumber();
    boolean b21 = user5.verifyEmailAddress();
    java.lang.String str22 = user5.getUsername();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test240"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getAddress();
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test241"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("hi!");
    java.lang.String str9 = user5.getAddress();
    boolean b10 = user5.verifyEmailAddress();
    java.lang.String str11 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test242"); }

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
    user5.setContactNumber("");
    java.lang.String str26 = user5.getAddress();
    
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
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test243"); }

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
    user5.setAddress("");
    java.lang.String str24 = user5.getAddress();
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test244"); }

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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test245"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getUsername();
    java.lang.String str17 = user5.getEmail();
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
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

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test246"); }

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
    user5.setUsername("hi!");
    java.lang.String str26 = user5.getContactNumber();
    boolean b27 = user5.verifyPhoneNumber();
    user5.setEmail("");
    
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test247"); }

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
    java.lang.String str22 = user5.getAddress();
    java.lang.String str23 = user5.getUsername();
    java.lang.String str24 = user5.getAddress();
    user5.setPassword("hi!");
    user5.setAddress("");
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test248"); }

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
    java.lang.String str19 = user5.getContactNumber();
    boolean b20 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    boolean b23 = user5.verifyEmailAddress();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test249"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setAddress("");
    user5.setAddress("");
    user5.setContactNumber("hi!");
    user5.setEmail("hi!");
    java.lang.String str23 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str26 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test250"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    user5.setUsername("");
    boolean b15 = user5.verifyEmailAddress();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getPassword();
    java.lang.String str18 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test251"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test252"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str14 = user5.getUsername();
    boolean b15 = user5.verifyEmailAddress();
    user5.setEmail("");
    java.lang.String str18 = user5.getPassword();
    java.lang.String str19 = user5.getPassword();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test253"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setPassword("hi!");
    java.lang.String str11 = user5.getPassword();
    user5.setAddress("");
    user5.setAddress("");
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test254"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    user5.setPassword("");
    user5.setEmail("");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    user5.setAddress("");
    java.lang.String str24 = user5.getEmail();
    java.lang.String str25 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test255"); }

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
    java.lang.String str21 = user5.getPassword();
    java.lang.String str22 = user5.getContactNumber();
    java.lang.String str23 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
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
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test256"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getAddress();
    user5.setPassword("");
    boolean b16 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    java.lang.String str19 = user5.getUsername();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test257"); }

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
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    boolean b25 = user5.verifyEmailAddress();
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
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test258"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getEmail();
    java.lang.String str17 = user5.getUsername();
    java.lang.String str18 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test259"); }

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
    java.lang.String str21 = user5.getEmail();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test260"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setContactNumber("");
    java.lang.String str12 = user5.getPassword();
    boolean b13 = user5.verifyPhoneNumber();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test261"); }

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
    boolean b21 = user5.verifyEmailAddress();
    
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
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test262"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    java.lang.String str16 = user5.getContactNumber();
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test263"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setContactNumber("");
    user5.setUsername("");
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    java.lang.String str18 = user5.getAddress();
    user5.setPassword("hi!");
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test264"); }

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
    java.lang.String str24 = user5.getEmail();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test265"); }

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
    java.lang.String str18 = user5.getEmail();
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test266"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    user5.setContactNumber("");
    java.lang.String str16 = user5.getAddress();
    java.lang.String str17 = user5.getUsername();
    user5.setUsername("hi!");
    user5.setPassword("hi!");
    java.lang.String str22 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test267"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("");
    boolean b17 = user5.verifyPhoneNumber();
    user5.setPassword("");
    java.lang.String str20 = user5.getEmail();
    java.lang.String str21 = user5.getEmail();
    java.lang.String str22 = user5.getUsername();
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test268"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getEmail();
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test269"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setAddress("");
    boolean b16 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    java.lang.String str19 = user5.getPassword();
    java.lang.String str20 = user5.getPassword();
    java.lang.String str21 = user5.getContactNumber();
    user5.setPassword("");
    boolean b24 = user5.verifyPhoneNumber();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test270"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    user5.setUsername("");
    java.lang.String str17 = user5.getUsername();
    user5.setContactNumber("");
    user5.setPassword("hi!");
    java.lang.String str22 = user5.getEmail();
    boolean b23 = user5.verifyPhoneNumber();
    user5.setContactNumber("");
    boolean b26 = user5.verifyPhoneNumber();
    boolean b27 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test271"); }

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
    user5.setEmail("");
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test272"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getAddress();
    user5.setPassword("");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test273"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    user5.setPassword("hi!");
    boolean b15 = user5.verifyEmailAddress();
    boolean b16 = user5.verifyEmailAddress();
    java.lang.String str17 = user5.getUsername();
    user5.setContactNumber("hi!");
    java.lang.String str20 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test274"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    user5.setContactNumber("");
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str17 = user5.getUsername();
    java.lang.String str18 = user5.getAddress();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test275"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getContactNumber();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test276"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "hi!");
    user5.setEmail("");
    java.lang.String str8 = user5.getUsername();
    boolean b9 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test277"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getContactNumber();
    user5.setUsername("");
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
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test278"); }

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
    java.lang.String str20 = user5.getPassword();
    user5.setPassword("hi!");
    java.lang.String str23 = user5.getEmail();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test279"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    user5.setUsername("");
    boolean b13 = user5.verifyPhoneNumber();
    java.lang.String str14 = user5.getPassword();
    boolean b15 = user5.verifyPhoneNumber();
    user5.setPassword("hi!");
    user5.setUsername("");
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test280"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getAddress();
    boolean b15 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    user5.setEmail("");
    java.lang.String str20 = user5.getEmail();
    java.lang.String str21 = user5.getAddress();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test281"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getEmail();
    user5.setAddress("hi!");
    java.lang.String str16 = user5.getUsername();
    java.lang.String str17 = user5.getEmail();
    user5.setAddress("");
    java.lang.String str20 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test282"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getEmail();
    user5.setAddress("hi!");
    user5.setUsername("hi!");
    java.lang.String str15 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test283"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("");
    user5.setEmail("hi!");
    boolean b11 = user5.verifyEmailAddress();
    java.lang.String str12 = user5.getAddress();
    java.lang.String str13 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test284"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str12 = user5.getPassword();
    boolean b13 = user5.verifyPhoneNumber();
    java.lang.String str14 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    java.lang.String str19 = user5.getUsername();
    java.lang.String str20 = user5.getPassword();
    java.lang.String str21 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test285"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setAddress("");
    boolean b16 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    java.lang.String str19 = user5.getPassword();
    java.lang.String str20 = user5.getPassword();
    java.lang.String str21 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str24 = user5.getContactNumber();
    user5.setEmail("hi!");
    java.lang.String str27 = user5.getUsername();
    boolean b28 = user5.verifyEmailAddress();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test286"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    user5.setContactNumber("");
    user5.setEmail("hi!");
    user5.setUsername("");
    boolean b22 = user5.verifyEmailAddress();
    java.lang.String str23 = user5.getPassword();
    boolean b24 = user5.verifyPhoneNumber();
    java.lang.String str25 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test287"); }

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
    user5.setEmail("hi!");
    java.lang.String str26 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test288"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getContactNumber();
    user5.setContactNumber("");
    java.lang.String str18 = user5.getContactNumber();
    boolean b19 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test289"); }

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
    boolean b20 = user5.verifyPhoneNumber();
    java.lang.String str21 = user5.getAddress();
    java.lang.String str22 = user5.getPassword();
    user5.setAddress("hi!");
    java.lang.String str25 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test290"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    boolean b7 = user5.verifyPhoneNumber();
    user5.setPassword("");
    java.lang.String str10 = user5.getUsername();
    user5.setEmail("");
    user5.setAddress("");
    java.lang.String str15 = user5.getUsername();
    
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
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test291"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setContactNumber("");
    user5.setEmail("");
    java.lang.String str12 = user5.getUsername();
    user5.setContactNumber("hi!");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test292"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getUsername();
    user5.setPassword("");
    user5.setEmail("hi!");
    java.lang.String str16 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test293"); }

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
    java.lang.String str20 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test294"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setContactNumber("hi!");
    user5.setEmail("hi!");
    java.lang.String str10 = user5.getContactNumber();
    user5.setPassword("hi!");
    java.lang.String str13 = user5.getContactNumber();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test295"); }

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
    boolean b20 = user5.verifyEmailAddress();
    java.lang.String str21 = user5.getEmail();
    java.lang.String str22 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str25 = user5.getUsername();
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
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test296"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    java.lang.String str11 = user5.getAddress();
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
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test297"); }

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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test298"); }

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
    boolean b18 = user5.verifyPhoneNumber();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test299"); }

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
    java.lang.String str26 = user5.getAddress();
    boolean b27 = user5.verifyEmailAddress();
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test300"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("hi!");
    java.lang.String str17 = user5.getUsername();
    java.lang.String str18 = user5.getPassword();
    
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
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test301"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getAddress();
    java.lang.String str12 = user5.getPassword();
    java.lang.String str13 = user5.getAddress();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test302"); }

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
    java.lang.String str24 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test303"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    user5.setContactNumber("");
    java.lang.String str16 = user5.getAddress();
    java.lang.String str17 = user5.getUsername();
    user5.setAddress("");
    
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
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test304"); }

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
    java.lang.String str23 = user5.getAddress();
    user5.setPassword("hi!");
    user5.setUsername("");
    java.lang.String str28 = user5.getUsername();
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test305"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setPassword("");
    boolean b12 = user5.verifyPhoneNumber();
    user5.setAddress("");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test306"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    user5.setPassword("");
    boolean b13 = user5.verifyPhoneNumber();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test307"); }

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
    java.lang.String str23 = user5.getUsername();
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test308"); }

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
    java.lang.String str18 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str21 = user5.getEmail();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test309"); }

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
    user5.setEmail("");
    
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
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test310"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setContactNumber("");
    user5.setUsername("");
    user5.setContactNumber("hi!");
    user5.setEmail("");
    java.lang.String str16 = user5.getUsername();
    user5.setPassword("");
    user5.setContactNumber("");
    user5.setContactNumber("");
    java.lang.String str23 = user5.getUsername();
    java.lang.String str24 = user5.getEmail();
    java.lang.String str25 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test311"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test312"); }

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
    user5.setPassword("hi!");
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test313"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getUsername();
    boolean b19 = user5.verifyPhoneNumber();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test314"); }

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
    java.lang.String str25 = user5.getUsername();
    java.lang.String str26 = user5.getEmail();
    user5.setContactNumber("hi!");
    java.lang.String str29 = user5.getEmail();
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test315"); }

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
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test316"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test317"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    boolean b12 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    boolean b15 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test318"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getUsername();
    user5.setPassword("");
    user5.setPassword("hi!");
    boolean b16 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str21 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test319"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    boolean b13 = user5.verifyPhoneNumber();
    java.lang.String str14 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test320"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    user5.setUsername("");
    boolean b15 = user5.verifyEmailAddress();
    user5.setPassword("");
    boolean b18 = user5.verifyPhoneNumber();
    java.lang.String str19 = user5.getEmail();
    boolean b20 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test321"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("hi!");
    java.lang.String str11 = user5.getPassword();
    java.lang.String str12 = user5.getContactNumber();
    user5.setAddress("hi!");
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
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test322"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setContactNumber("");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getPassword();
    user5.setAddress("");
    user5.setAddress("hi!");
    user5.setUsername("hi!");
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    java.lang.String str22 = user5.getUsername();
    java.lang.String str23 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test323"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    user5.setAddress("");
    user5.setPassword("hi!");
    java.lang.String str10 = user5.getPassword();
    user5.setUsername("");
    boolean b13 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test324"); }

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
    boolean b19 = user5.verifyEmailAddress();
    user5.setUsername("");
    boolean b22 = user5.verifyPhoneNumber();
    
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
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test325"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    user5.setUsername("hi!");
    boolean b13 = user5.verifyEmailAddress();
    java.lang.String str14 = user5.getPassword();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test326"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setPassword("hi!");
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getUsername();
    user5.setPassword("hi!");
    user5.setPassword("hi!");
    user5.setAddress("");
    java.lang.String str21 = user5.getContactNumber();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test327"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("");
    boolean b16 = user5.verifyEmailAddress();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test328"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    boolean b11 = user5.verifyEmailAddress();
    java.lang.String str12 = user5.getAddress();
    java.lang.String str13 = user5.getContactNumber();
    java.lang.String str14 = user5.getEmail();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test329"); }

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
    java.lang.String str22 = user5.getUsername();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test330"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    boolean b9 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    java.lang.String str12 = user5.getPassword();
    java.lang.String str13 = user5.getAddress();
    user5.setAddress("");
    user5.setEmail("");
    
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
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test331"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getAddress();
    java.lang.String str12 = user5.getPassword();
    java.lang.String str13 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test332"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "", "hi!");
    boolean b6 = user5.verifyEmailAddress();
    user5.setAddress("");
    boolean b9 = user5.verifyEmailAddress();
    user5.setPassword("hi!");
    boolean b12 = user5.verifyEmailAddress();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test333"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str12 = user5.getContactNumber();
    user5.setUsername("");
    java.lang.String str15 = user5.getEmail();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getEmail();
    boolean b18 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test334"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    boolean b11 = user5.verifyEmailAddress();
    boolean b12 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    user5.setUsername("hi!");
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getAddress();
    boolean b19 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test335"); }

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
    java.lang.String str22 = user5.getAddress();
    java.lang.String str23 = user5.getUsername();
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test336"); }

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
    user5.setPassword("");
    user5.setEmail("");
    user5.setEmail("");
    user5.setPassword("");
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
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test337"); }

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
    user5.setEmail("hi!");
    java.lang.String str23 = user5.getEmail();
    java.lang.String str24 = user5.getContactNumber();
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test338"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "hi!");
    user5.setEmail("");
    user5.setEmail("");
    java.lang.String str10 = user5.getPassword();
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("");
    java.lang.String str14 = user5.getEmail();
    java.lang.String str15 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test339"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getContactNumber();
    boolean b10 = user5.verifyEmailAddress();
    user5.setPassword("");
    java.lang.String str13 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test340"); }

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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test341"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getAddress();
    boolean b7 = user5.verifyEmailAddress();
    boolean b8 = user5.verifyPhoneNumber();
    java.lang.String str9 = user5.getUsername();
    java.lang.String str10 = user5.getPassword();
    java.lang.String str11 = user5.getAddress();
    boolean b12 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test342"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str16 = user5.getEmail();
    user5.setContactNumber("hi!");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test343"); }

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
    java.lang.String str22 = user5.getAddress();
    java.lang.String str23 = user5.getUsername();
    java.lang.String str24 = user5.getUsername();
    user5.setAddress("");
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test344"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str12 = user5.getUsername();
    boolean b13 = user5.verifyEmailAddress();
    boolean b14 = user5.verifyPhoneNumber();
    boolean b15 = user5.verifyEmailAddress();
    boolean b16 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test345"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setUsername("");
    user5.setEmail("hi!");
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str23 = user5.getContactNumber();
    boolean b24 = user5.verifyEmailAddress();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test346"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getContactNumber();
    user5.setAddress("hi!");
    boolean b17 = user5.verifyEmailAddress();
    boolean b18 = user5.verifyPhoneNumber();
    
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

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test347"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "");
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    user5.setPassword("");
    user5.setAddress("");
    java.lang.String str14 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test348"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setPassword("");
    boolean b12 = user5.verifyEmailAddress();
    user5.setEmail("");
    user5.setContactNumber("");
    user5.setContactNumber("");
    user5.setAddress("");
    boolean b21 = user5.verifyEmailAddress();
    java.lang.String str22 = user5.getContactNumber();
    java.lang.String str23 = user5.getPassword();
    user5.setUsername("");
    boolean b26 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test349"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("");
    user5.setContactNumber("");
    user5.setPassword("");
    user5.setAddress("");
    java.lang.String str18 = user5.getContactNumber();
    user5.setPassword("");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test350"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    boolean b15 = user5.verifyPhoneNumber();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test351"); }

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
    user5.setAddress("");
    boolean b27 = user5.verifyEmailAddress();
    
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
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test352"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    user5.setUsername("");
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test353"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "hi!", "");
    java.lang.String str6 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    java.lang.String str9 = user5.getAddress();
    user5.setUsername("");
    java.lang.String str12 = user5.getEmail();
    user5.setAddress("");
    user5.setAddress("");
    java.lang.String str17 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test354"); }

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
    boolean b26 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    java.lang.String str29 = user5.getEmail();
    user5.setAddress("hi!");
    
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
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test355"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    user5.setPassword("");
    java.lang.String str10 = user5.getUsername();
    boolean b11 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    user5.setUsername("");
    user5.setUsername("");
    java.lang.String str18 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test356"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    boolean b10 = user5.verifyPhoneNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setEmail("");
    boolean b14 = user5.verifyPhoneNumber();
    java.lang.String str15 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str18 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test357"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setContactNumber("");
    user5.setEmail("");
    boolean b12 = user5.verifyEmailAddress();
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getPassword();
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test358"); }

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
    user5.setUsername("hi!");
    user5.setContactNumber("");
    boolean b24 = user5.verifyEmailAddress();
    
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
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test359"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getUsername();
    user5.setAddress("");
    java.lang.String str17 = user5.getPassword();
    java.lang.String str18 = user5.getUsername();
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    boolean b23 = user5.verifyPhoneNumber();
    user5.setEmail("");
    boolean b26 = user5.verifyEmailAddress();
    java.lang.String str27 = user5.getContactNumber();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test360"); }

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
    user5.setContactNumber("");
    user5.setPassword("hi!");
    user5.setContactNumber("");
    
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

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test361"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getContactNumber();
    java.lang.String str14 = user5.getAddress();
    java.lang.String str15 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test362"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    user5.setPassword("");
    java.lang.String str13 = user5.getUsername();
    boolean b14 = user5.verifyPhoneNumber();
    user5.setEmail("");
    java.lang.String str17 = user5.getPassword();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test363"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    user5.setUsername("");
    user5.setEmail("");
    boolean b19 = user5.verifyPhoneNumber();
    java.lang.String str20 = user5.getPassword();
    boolean b21 = user5.verifyPhoneNumber();
    boolean b22 = user5.verifyPhoneNumber();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test364"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getAddress();
    boolean b12 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    java.lang.String str15 = user5.getAddress();
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getUsername();
    boolean b19 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test365"); }

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
    user5.setAddress("hi!");
    java.lang.String str25 = user5.getContactNumber();
    boolean b26 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test366"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    boolean b17 = user5.verifyPhoneNumber();
    java.lang.String str18 = user5.getPassword();
    java.lang.String str19 = user5.getPassword();
    user5.setPassword("hi!");
    user5.setPassword("hi!");
    java.lang.String str24 = user5.getEmail();
    
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
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test367"); }

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
    boolean b22 = user5.verifyPhoneNumber();
    java.lang.String str23 = user5.getContactNumber();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test368"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "", "");
    user5.setContactNumber("");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setPassword("");
    boolean b13 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setContactNumber("hi!");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test369"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "hi!", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    user5.setUsername("hi!");
    java.lang.String str9 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test370"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getContactNumber();
    java.lang.String str10 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    java.lang.String str15 = user5.getUsername();
    java.lang.String str16 = user5.getUsername();
    user5.setUsername("hi!");
    java.lang.String str19 = user5.getContactNumber();
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test371"); }

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
    user5.setPassword("hi!");
    java.lang.String str25 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test372"); }

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
    java.lang.String str17 = user5.getContactNumber();
    java.lang.String str18 = user5.getAddress();
    java.lang.String str19 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test373"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getAddress();
    java.lang.String str12 = user5.getPassword();
    java.lang.String str13 = user5.getAddress();
    user5.setUsername("hi!");
    boolean b16 = user5.verifyEmailAddress();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test374"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    java.lang.String str18 = user5.getUsername();
    user5.setEmail("hi!");
    java.lang.String str21 = user5.getAddress();
    java.lang.String str22 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test375"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    user5.setEmail("");
    java.lang.String str16 = user5.getAddress();
    java.lang.String str17 = user5.getAddress();
    java.lang.String str18 = user5.getEmail();
    user5.setUsername("hi!");
    java.lang.String str21 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test376"); }

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
    user5.setEmail("");
    boolean b28 = user5.verifyPhoneNumber();
    java.lang.String str29 = user5.getContactNumber();
    user5.setAddress("");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test377"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "hi!");
    java.lang.String str6 = user5.getContactNumber();
    user5.setAddress("hi!");
    java.lang.String str9 = user5.getUsername();
    java.lang.String str10 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test378"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setEmail("hi!");
    java.lang.String str12 = user5.getEmail();
    user5.setUsername("");
    java.lang.String str15 = user5.getUsername();
    user5.setEmail("");
    java.lang.String str18 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test379"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    boolean b11 = user5.verifyEmailAddress();
    java.lang.String str12 = user5.getAddress();
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getEmail();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test380"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setContactNumber("hi!");
    java.lang.String str14 = user5.getPassword();
    java.lang.String str15 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setPassword("");
    java.lang.String str20 = user5.getAddress();
    java.lang.String str21 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test381"); }

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
    boolean b20 = user5.verifyPhoneNumber();
    java.lang.String str21 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test382"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getAddress();
    boolean b17 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test383"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    boolean b8 = user5.verifyPhoneNumber();
    boolean b9 = user5.verifyEmailAddress();
    java.lang.String str10 = user5.getContactNumber();
    user5.setAddress("hi!");
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test384"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyPhoneNumber();
    user5.setUsername("");
    java.lang.String str17 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test385"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setAddress("");
    java.lang.String str14 = user5.getUsername();
    java.lang.String str15 = user5.getAddress();
    java.lang.String str16 = user5.getPassword();
    user5.setUsername("");
    boolean b19 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test386"); }

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
    boolean b20 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    user5.setEmail("hi!");
    
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
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test387"); }

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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test388"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getAddress();
    boolean b15 = user5.verifyEmailAddress();
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getPassword();
    user5.setAddress("hi!");
    java.lang.String str20 = user5.getEmail();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test389"); }

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
    boolean b27 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    boolean b30 = user5.verifyEmailAddress();
    java.lang.String str31 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test390"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setEmail("");
    user5.setUsername("");
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    java.lang.String str16 = user5.getUsername();
    user5.setAddress("hi!");
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test391"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getAddress();
    user5.setEmail("");
    user5.setPassword("");
    java.lang.String str15 = user5.getUsername();
    user5.setAddress("");
    user5.setPassword("");
    user5.setAddress("hi!");
    user5.setContactNumber("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test392"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    user5.setPassword("hi!");
    user5.setEmail("hi!");
    user5.setAddress("");
    java.lang.String str18 = user5.getContactNumber();
    user5.setEmail("");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test393"); }

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
    boolean b20 = user5.verifyPhoneNumber();
    boolean b21 = user5.verifyPhoneNumber();
    java.lang.String str22 = user5.getContactNumber();
    java.lang.String str23 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test394"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "", "");
    java.lang.String str6 = user5.getContactNumber();
    boolean b7 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    java.lang.String str10 = user5.getPassword();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test395"); }

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
    boolean b29 = user5.verifyPhoneNumber();
    java.lang.String str30 = user5.getUsername();
    java.lang.String str31 = user5.getContactNumber();
    
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
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test396"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getUsername();
    user5.setAddress("");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test397"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    user5.setPassword("");
    boolean b13 = user5.verifyPhoneNumber();
    user5.setEmail("");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test398"); }

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
    java.lang.String str21 = user5.getPassword();
    java.lang.String str22 = user5.getEmail();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test399"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    boolean b9 = user5.verifyEmailAddress();
    java.lang.String str10 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test400"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setContactNumber("");
    user5.setUsername("");
    boolean b12 = user5.verifyEmailAddress();
    user5.setAddress("");
    java.lang.String str15 = user5.getContactNumber();
    user5.setUsername("");
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test401"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    java.lang.String str9 = user5.getEmail();
    boolean b10 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    user5.setContactNumber("");
    user5.setAddress("");
    user5.setContactNumber("");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test402"); }

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
    java.lang.String str21 = user5.getContactNumber();
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test403"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    boolean b9 = user5.verifyPhoneNumber();
    user5.setUsername("hi!");
    java.lang.String str12 = user5.getAddress();
    java.lang.String str13 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test404"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("");
    user5.setEmail("hi!");
    java.lang.String str11 = user5.getEmail();
    user5.setContactNumber("");
    user5.setContactNumber("");
    boolean b16 = user5.verifyEmailAddress();
    java.lang.String str17 = user5.getContactNumber();
    boolean b18 = user5.verifyPhoneNumber();
    java.lang.String str19 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test405"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "hi!", "hi!", "hi!");
    user5.setContactNumber("hi!");
    java.lang.String str8 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test406"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str10 = user5.getUsername();
    user5.setUsername("");
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    java.lang.String str17 = user5.getUsername();
    boolean b18 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test407"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setAddress("");
    user5.setUsername("hi!");
    boolean b14 = user5.verifyEmailAddress();
    user5.setEmail("hi!");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test408"); }

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
    boolean b21 = user5.verifyEmailAddress();
    boolean b22 = user5.verifyEmailAddress();
    boolean b23 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test409"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getAddress();
    boolean b7 = user5.verifyEmailAddress();
    user5.setEmail("");
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test410"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    user5.setPassword("hi!");
    user5.setEmail("hi!");
    user5.setEmail("");
    user5.setEmail("");
    boolean b24 = user5.verifyPhoneNumber();
    user5.setUsername("");
    user5.setContactNumber("");
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test411"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setPassword("");
    user5.setUsername("");
    user5.setUsername("hi!");
    boolean b16 = user5.verifyPhoneNumber();
    user5.setUsername("");
    java.lang.String str19 = user5.getContactNumber();
    user5.setAddress("hi!");
    boolean b22 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test412"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "", "");
    java.lang.String str6 = user5.getContactNumber();
    boolean b7 = user5.verifyPhoneNumber();
    user5.setEmail("hi!");
    user5.setContactNumber("");
    java.lang.String str12 = user5.getEmail();
    boolean b13 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test413"); }

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
    user5.setPassword("hi!");
    java.lang.String str23 = user5.getUsername();
    java.lang.String str24 = user5.getEmail();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test414"); }

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
    java.lang.String str23 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test415"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "", "hi!");
    user5.setUsername("");
    boolean b8 = user5.verifyPhoneNumber();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test416"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getUsername();
    java.lang.String str11 = user5.getPassword();
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getContactNumber();
    java.lang.String str14 = user5.getPassword();
    user5.setEmail("");
    java.lang.String str17 = user5.getUsername();
    user5.setEmail("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test417"); }

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
    user5.setEmail("hi!");
    java.lang.String str23 = user5.getAddress();
    java.lang.String str24 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test418"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    java.lang.String str11 = user5.getUsername();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("");
    java.lang.String str17 = user5.getPassword();
    boolean b18 = user5.verifyEmailAddress();
    
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

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test419"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("");
    java.lang.String str12 = user5.getEmail();
    user5.setEmail("hi!");
    user5.setAddress("hi!");
    user5.setAddress("hi!");
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getEmail();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test420"); }

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
    boolean b21 = user5.verifyEmailAddress();
    
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
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test421"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setPassword("");
    boolean b10 = user5.verifyPhoneNumber();
    user5.setAddress("");
    boolean b13 = user5.verifyEmailAddress();
    java.lang.String str14 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test422"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getPassword();
    java.lang.String str17 = user5.getUsername();
    user5.setUsername("");
    java.lang.String str20 = user5.getContactNumber();
    user5.setContactNumber("");
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test423"); }

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
    user5.setAddress("");
    java.lang.String str22 = user5.getPassword();
    java.lang.String str23 = user5.getPassword();
    
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

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test424"); }

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
    user5.setUsername("hi!");
    boolean b23 = user5.verifyPhoneNumber();
    java.lang.String str24 = user5.getPassword();
    java.lang.String str25 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test425"); }

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
    user5.setAddress("");
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
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test426"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    user5.setEmail("hi!");
    user5.setEmail("");
    user5.setEmail("");
    java.lang.String str14 = user5.getAddress();
    user5.setContactNumber("");
    java.lang.String str17 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test427"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "");
    boolean b6 = user5.verifyPhoneNumber();
    java.lang.String str7 = user5.getUsername();
    user5.setEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test428"); }

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
    java.lang.String str29 = user5.getEmail();
    user5.setContactNumber("hi!");
    java.lang.String str32 = user5.getContactNumber();
    
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
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test429"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str14 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("hi!");
    java.lang.String str19 = user5.getUsername();
    java.lang.String str20 = user5.getEmail();
    java.lang.String str21 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test430"); }

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
    java.lang.String str20 = user5.getEmail();
    boolean b21 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test431"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "hi!", "");
    java.lang.String str6 = user5.getContactNumber();
    user5.setPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test432"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    user5.setPassword("hi!");
    user5.setPassword("hi!");
    user5.setEmail("hi!");
    boolean b20 = user5.verifyEmailAddress();
    java.lang.String str21 = user5.getAddress();
    java.lang.String str22 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test433"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setPassword("");
    boolean b12 = user5.verifyEmailAddress();
    java.lang.String str13 = user5.getAddress();
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test434"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    java.lang.String str11 = user5.getAddress();
    user5.setPassword("");
    boolean b14 = user5.verifyPhoneNumber();
    user5.setEmail("");
    user5.setAddress("");
    java.lang.String str19 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test435"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    boolean b15 = user5.verifyPhoneNumber();
    java.lang.String str16 = user5.getAddress();
    
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

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test436"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    java.lang.String str10 = user5.getAddress();
    user5.setEmail("");
    user5.setPassword("");
    java.lang.String str15 = user5.getUsername();
    user5.setAddress("");
    java.lang.String str18 = user5.getContactNumber();
    java.lang.String str19 = user5.getEmail();
    user5.setPassword("hi!");
    user5.setUsername("");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test437"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getPassword();
    user5.setContactNumber("hi!");
    java.lang.String str18 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str21 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test438"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setAddress("hi!");
    java.lang.String str13 = user5.getPassword();
    boolean b14 = user5.verifyEmailAddress();
    user5.setEmail("");
    user5.setContactNumber("hi!");
    java.lang.String str19 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test439"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    java.lang.String str9 = user5.getAddress();
    user5.setEmail("");
    boolean b12 = user5.verifyPhoneNumber();
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test440"); }

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
    java.lang.String str23 = user5.getEmail();
    user5.setEmail("");
    user5.setContactNumber("");
    java.lang.String str28 = user5.getEmail();
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
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test441"); }

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
    java.lang.String str20 = user5.getPassword();
    user5.setEmail("");
    java.lang.String str23 = user5.getContactNumber();
    user5.setUsername("hi!");
    java.lang.String str26 = user5.getPassword();
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test442"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    java.lang.String str6 = user5.getEmail();
    user5.setAddress("");
    user5.setEmail("");
    java.lang.String str11 = user5.getAddress();
    user5.setEmail("hi!");
    user5.setEmail("");
    user5.setUsername("");
    user5.setEmail("");
    user5.setPassword("hi!");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test443"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    boolean b9 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    java.lang.String str12 = user5.getContactNumber();
    user5.setEmail("");
    java.lang.String str15 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test444"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    user5.setUsername("hi!");
    user5.setAddress("");
    boolean b14 = user5.verifyEmailAddress();
    user5.setPassword("");
    user5.setContactNumber("hi!");
    java.lang.String str19 = user5.getPassword();
    boolean b20 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test445"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    user5.setUsername("hi!");
    java.lang.String str16 = user5.getPassword();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test446"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setPassword("");
    boolean b14 = user5.verifyEmailAddress();
    user5.setUsername("");
    user5.setUsername("hi!");
    java.lang.String str19 = user5.getAddress();
    java.lang.String str20 = user5.getAddress();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test447"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getPassword();
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getPassword();
    java.lang.String str16 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setAddress("");
    boolean b21 = user5.verifyEmailAddress();
    java.lang.String str22 = user5.getAddress();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test448"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    java.lang.String str11 = user5.getPassword();
    user5.setUsername("hi!");
    boolean b14 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test449"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setAddress("");
    user5.setPassword("");

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test450"); }

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
    user5.setPassword("");
    user5.setContactNumber("hi!");
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

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test451"); }

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
    java.lang.String str19 = user5.getAddress();
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test452"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "", "hi!");
    user5.setPassword("");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test453"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    java.lang.String str7 = user5.getPassword();
    java.lang.String str8 = user5.getContactNumber();
    java.lang.String str9 = user5.getUsername();
    boolean b10 = user5.verifyPhoneNumber();
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str18 = user5.getPassword();
    java.lang.String str19 = user5.getUsername();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test454"); }

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
    java.lang.String str20 = user5.getUsername();
    java.lang.String str21 = user5.getUsername();
    boolean b22 = user5.verifyEmailAddress();
    boolean b23 = user5.verifyPhoneNumber();
    java.lang.String str24 = user5.getAddress();
    java.lang.String str25 = user5.getUsername();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test455"); }

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
    java.lang.String str21 = user5.getPassword();
    java.lang.String str22 = user5.getEmail();
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
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test456"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getEmail();
    user5.setAddress("hi!");
    java.lang.String str16 = user5.getAddress();
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test457"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getContactNumber();
    boolean b9 = user5.verifyEmailAddress();
    boolean b10 = user5.verifyPhoneNumber();
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test458"); }

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
    user5.setAddress("hi!");
    java.lang.String str26 = user5.getContactNumber();
    user5.setAddress("hi!");
    java.lang.String str29 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test459"); }

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
    user5.setUsername("");
    user5.setEmail("");
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test460"); }

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
    boolean b18 = user5.verifyPhoneNumber();
    boolean b19 = user5.verifyPhoneNumber();
    user5.setPassword("hi!");
    user5.setUsername("hi!");
    user5.setAddress("");
    java.lang.String str26 = user5.getEmail();
    user5.setAddress("");
    java.lang.String str29 = user5.getContactNumber();
    
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
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test461"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setAddress("hi!");
    user5.setUsername("");
    java.lang.String str14 = user5.getAddress();
    user5.setAddress("");
    java.lang.String str17 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test462"); }

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
    user5.setEmail("hi!");
    user5.setContactNumber("");
    
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

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test463"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    user5.setUsername("hi!");
    java.lang.String str14 = user5.getPassword();
    user5.setEmail("");
    boolean b17 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test464"); }

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
    java.lang.String str18 = user5.getAddress();
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test465"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    java.lang.String str8 = user5.getEmail();
    java.lang.String str9 = user5.getEmail();
    java.lang.String str10 = user5.getPassword();
    user5.setContactNumber("hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("");
    java.lang.String str17 = user5.getAddress();
    boolean b18 = user5.verifyPhoneNumber();
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test466"); }

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
    java.lang.String str20 = user5.getContactNumber();
    user5.setPassword("");
    java.lang.String str23 = user5.getAddress();
    user5.setPassword("");
    user5.setPassword("hi!");
    
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

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test467"); }

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
    user5.setPassword("hi!");
    user5.setContactNumber("");
    
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

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test468"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyPhoneNumber();
    java.lang.String str9 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test469"); }

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
    user5.setUsername("");
    
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

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test470"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "hi!", "", "");
    java.lang.String str6 = user5.getContactNumber();
    boolean b7 = user5.verifyPhoneNumber();
    java.lang.String str8 = user5.getPassword();
    user5.setEmail("");
    user5.setContactNumber("");
    user5.setPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test471"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getEmail();
    user5.setUsername("");
    user5.setUsername("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test472"); }

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
    java.lang.String str22 = user5.getContactNumber();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test473"); }

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
    user5.setAddress("");
    user5.setEmail("");
    
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
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test474"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    java.lang.String str10 = user5.getUsername();
    user5.setUsername("");
    user5.setUsername("hi!");
    java.lang.String str15 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test475"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getPassword();
    user5.setPassword("hi!");
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getContactNumber();
    user5.setPassword("hi!");
    java.lang.String str19 = user5.getAddress();
    user5.setUsername("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
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
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test476"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    java.lang.String str13 = user5.getContactNumber();
    user5.setAddress("hi!");
    java.lang.String str16 = user5.getContactNumber();
    java.lang.String str17 = user5.getAddress();
    user5.setPassword("hi!");
    java.lang.String str20 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test477"); }

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
    java.lang.String str23 = user5.getPassword();
    java.lang.String str24 = user5.getPassword();
    boolean b25 = user5.verifyEmailAddress();
    
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
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test478"); }

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
    java.lang.String str17 = user5.getContactNumber();
    user5.setPassword("hi!");
    user5.setEmail("");
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test479"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getUsername();
    boolean b14 = user5.verifyEmailAddress();
    user5.setUsername("hi!");
    java.lang.String str17 = user5.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test480"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setAddress("hi!");
    user5.setPassword("");
    boolean b12 = user5.verifyEmailAddress();
    user5.setEmail("");
    user5.setUsername("hi!");
    java.lang.String str17 = user5.getPassword();
    user5.setContactNumber("hi!");
    boolean b20 = user5.verifyPhoneNumber();
    java.lang.String str21 = user5.getUsername();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test481"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    java.lang.String str7 = user5.getEmail();
    user5.setEmail("");
    boolean b10 = user5.verifyEmailAddress();
    java.lang.String str11 = user5.getEmail();
    user5.setAddress("");
    java.lang.String str14 = user5.getPassword();
    user5.setAddress("");
    java.lang.String str17 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test482"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "hi!", "", "", "");
    java.lang.String str6 = user5.getUsername();
    user5.setAddress("");
    user5.setAddress("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test483"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    java.lang.String str6 = user5.getEmail();
    user5.setContactNumber("");
    boolean b9 = user5.verifyEmailAddress();
    java.lang.String str10 = user5.getPassword();
    user5.setUsername("");
    java.lang.String str13 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test484"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    boolean b11 = user5.verifyEmailAddress();
    user5.setPassword("");
    java.lang.String str14 = user5.getUsername();
    user5.setAddress("hi!");
    java.lang.String str17 = user5.getContactNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test485"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    user5.setContactNumber("hi!");
    java.lang.String str10 = user5.getContactNumber();
    boolean b11 = user5.verifyEmailAddress();
    boolean b12 = user5.verifyEmailAddress();
    user5.setContactNumber("");
    user5.setUsername("hi!");
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test486"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    user5.setPassword("");
    java.lang.String str19 = user5.getEmail();
    java.lang.String str20 = user5.getEmail();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test487"); }

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
    java.lang.String str19 = user5.getPassword();
    boolean b20 = user5.verifyPhoneNumber();
    user5.setContactNumber("hi!");
    user5.setUsername("hi!");
    user5.setEmail("hi!");
    boolean b27 = user5.verifyPhoneNumber();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test488"); }

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
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test489"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "hi!", "", "hi!");
    boolean b6 = user5.verifyPhoneNumber();
    java.lang.String str7 = user5.getUsername();
    java.lang.String str8 = user5.getAddress();
    boolean b9 = user5.verifyPhoneNumber();
    user5.setUsername("");
    
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
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test490"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setContactNumber("");
    user5.setUsername("");
    user5.setUsername("");
    boolean b13 = user5.verifyPhoneNumber();
    user5.setPassword("");
    java.lang.String str16 = user5.getAddress();
    boolean b17 = user5.verifyEmailAddress();
    user5.setEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test491"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "");
    user5.setEmail("");
    boolean b8 = user5.verifyPhoneNumber();
    boolean b9 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test492"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    user5.setAddress("hi!");
    user5.setEmail("hi!");
    boolean b12 = user5.verifyPhoneNumber();
    java.lang.String str13 = user5.getEmail();
    java.lang.String str14 = user5.getEmail();
    user5.setContactNumber("hi!");
    java.lang.String str17 = user5.getUsername();
    java.lang.String str18 = user5.getUsername();
    java.lang.String str19 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test493"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    java.lang.String str9 = user5.getAddress();
    user5.setPassword("");
    user5.setAddress("");
    boolean b14 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test494"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("");
    user5.setEmail("");
    boolean b11 = user5.verifyPhoneNumber();
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
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test495"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "hi!", "", "hi!", "hi!");
    java.lang.String str6 = user5.getUsername();
    java.lang.String str7 = user5.getPassword();
    user5.setAddress("hi!");
    boolean b10 = user5.verifyPhoneNumber();
    boolean b11 = user5.verifyEmailAddress();
    java.lang.String str12 = user5.getAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test496"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    java.lang.String str6 = user5.getAddress();
    user5.setUsername("hi!");
    user5.setPassword("hi!");
    java.lang.String str11 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getEmail();
    boolean b16 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test497"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("", "", "", "hi!", "");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyPhoneNumber();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test498"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    java.lang.String str12 = user5.getEmail();
    java.lang.String str13 = user5.getUsername();
    boolean b14 = user5.verifyEmailAddress();
    java.lang.String str15 = user5.getUsername();
    boolean b16 = user5.verifyPhoneNumber();
    java.lang.String str17 = user5.getUsername();
    java.lang.String str18 = user5.getAddress();
    boolean b19 = user5.verifyEmailAddress();
    
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
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test499"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setUsername("");
    java.lang.String str8 = user5.getPassword();
    user5.setPassword("");
    java.lang.String str11 = user5.getEmail();
    user5.setContactNumber("");
    java.lang.String str14 = user5.getContactNumber();
    java.lang.String str15 = user5.getContactNumber();
    java.lang.String str16 = user5.getUsername();
    java.lang.String str17 = user5.getContactNumber();
    boolean b18 = user5.verifyPhoneNumber();
    java.lang.String str19 = user5.getContactNumber();
    java.lang.String str20 = user5.getPassword();
    user5.setUsername("");
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test500"); }

    UseCase1And4.business.User user5 = new UseCase1And4.business.User("hi!", "", "", "hi!", "hi!");
    user5.setPassword("hi!");
    boolean b8 = user5.verifyEmailAddress();
    user5.setAddress("hi!");
    user5.setAddress("");
    java.lang.String str13 = user5.getAddress();
    boolean b14 = user5.verifyEmailAddress();
    user5.setContactNumber("hi!");
    user5.setContactNumber("hi!");
    boolean b19 = user5.verifyEmailAddress();
    boolean b20 = user5.verifyEmailAddress();
    boolean b21 = user5.verifyEmailAddress();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

}
