
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test001"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test002"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerNumber(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test003"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerAddress(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test004"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test005"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerPassword(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test006"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerNumber(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test007"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerAddress(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test008"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerAddress(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test009"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerAddress(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test010"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerNumber(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test011"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerEmail(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test012"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b29 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b35 = customerSupport3.AnswerEmail("hi!");
    boolean b37 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user40 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str41 = customerSupport3.FindCustomerNumber(user40);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test013"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerPassword(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test014"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test015"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerPassword(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test016"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerUsername(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test017"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test018"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerPassword(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test019"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerPassword(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test020"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerUsername(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test021"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerPassword(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test022"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerPassword(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test023"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerAddress(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test024"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerEmail(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test025"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerAddress(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test026"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = customerSupport3.FindCustomerUsername(user32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test027"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("");
    boolean b27 = customerSupport3.ReceiveEmail("hi!");
    boolean b29 = customerSupport3.AnswerEmail("hi!");
    boolean b31 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = customerSupport3.FindCustomerUsername(user32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test028"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerEmail(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test029"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerAddress(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test030"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerAddress(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test031"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerNumber(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test032"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerUsername(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test033"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerPassword(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test034"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b27 = customerSupport3.AnswerEmail("hi!");
    boolean b29 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = customerSupport3.FindCustomerPassword(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test035"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = customerSupport3.FindCustomerPassword(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test036"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b23 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerAddress(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test037"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b27 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerEmail(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test038"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerNumber(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test039"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerUsername(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test040"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = customerSupport3.FindCustomerEmail(user8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test041"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerAddress(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test042"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerAddress(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test043"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerAddress(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test044"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerAddress(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test045"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b23 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b27 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerAddress(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test046"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerNumber(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test047"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerNumber(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test048"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerAddress(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test049"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test050"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test051"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerUsername(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test052"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerUsername(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test053"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerPassword(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test054"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerNumber(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test055"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerNumber(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test056"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerAddress(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test057"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test058"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerPassword(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test059"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerPassword(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test060"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerNumber(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test061"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerPassword(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test062"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerNumber(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test063"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerUsername(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test064"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerAddress(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test065"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerPassword(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test066"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b27 = customerSupport3.AnswerEmail("");
    boolean b29 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = customerSupport3.FindCustomerUsername(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test067"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerEmail(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test068"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerEmail(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test069"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerEmail(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test070"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerPassword(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test071"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerEmail(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test072"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerPassword(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test073"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b23 = customerSupport3.AnswerEmail("");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerEmail(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test074"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerNumber(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test075"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerPassword(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test076"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b27 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerPassword(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test077"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerPassword(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test078"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerEmail(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test079"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test080"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("");
    boolean b23 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerAddress(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test081"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerNumber(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test082"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerAddress(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test083"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerAddress(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test084"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = customerSupport3.FindCustomerAddress(user6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test085"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerAddress(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test086"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = customerSupport3.FindCustomerPassword(user8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test087"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerPassword(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test088"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerUsername(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test089"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test090"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerUsername(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test091"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("hi!");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerEmail(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test092"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test093"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = customerSupport3.FindCustomerUsername(user32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test094"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerAddress(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test095"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test096"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = customerSupport3.FindCustomerPassword(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test097"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerEmail(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test098"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerAddress(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test099"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerEmail(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test100"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerPassword(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test101"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = customerSupport3.FindCustomerAddress(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test102"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerNumber(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test103"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test104"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerNumber(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test105"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerPassword(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test106"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerPassword(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test107"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test108"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test109"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerUsername(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test110"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    boolean b27 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerEmail(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test111"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerNumber(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test112"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("");
    boolean b23 = customerSupport3.AnswerEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    boolean b27 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerPassword(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test113"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerEmail(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test114"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerPassword(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test115"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerUsername(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test116"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerEmail(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test117"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerAddress(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test118"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerAddress(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test119"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test120"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerPassword(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test121"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test122"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test123"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerAddress(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test124"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerUsername(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test125"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerEmail(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test126"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    boolean b25 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test127"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerPassword(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test128"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test129"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerPassword(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test130"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerUsername(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test131"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerUsername(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test132"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerAddress(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test133"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerPassword(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test134"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test135"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerNumber(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test136"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerNumber(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test137"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test138"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerUsername(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test139"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerNumber(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test140"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerEmail(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test141"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerAddress(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test142"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerPassword(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test143"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerPassword(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test144"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    boolean b25 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerUsername(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test145"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerUsername(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test146"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerEmail(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test147"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerPassword(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test148"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerNumber(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test149"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    boolean b27 = customerSupport3.AnswerEmail("");
    boolean b29 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = customerSupport3.FindCustomerPassword(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test150"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerAddress(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test151"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b27 = customerSupport3.AnswerEmail("hi!");
    boolean b29 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = customerSupport3.FindCustomerAddress(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test152"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerUsername(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test153"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test154"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerAddress(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test155"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerUsername(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test156"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerAddress(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test157"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerPassword(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test158"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    boolean b27 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b31 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = customerSupport3.FindCustomerAddress(user32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test159"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerUsername(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test160"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerAddress(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test161"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerEmail(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test162"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test163"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerAddress(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test164"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test165"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerPassword(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test166"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerPassword(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test167"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerEmail(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test168"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerUsername(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test169"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerNumber(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test170"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test171"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerPassword(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test172"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerPassword(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test173"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerEmail(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test174"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b25 = customerSupport3.AnswerEmail("");
    boolean b27 = customerSupport3.AnswerEmail("");
    boolean b29 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = customerSupport3.FindCustomerAddress(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test175"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerNumber(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test176"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerEmail(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test177"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test178"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test179"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerPassword(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test180"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test181"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerPassword(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test182"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerUsername(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test183"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerEmail(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test184"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerEmail(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test185"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerPassword(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test186"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerPassword(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test187"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerUsername(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test188"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerNumber(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test189"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerAddress(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test190"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerPassword(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test191"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerAddress(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test192"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b27 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerUsername(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test193"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerEmail(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test194"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerNumber(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test195"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerAddress(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test196"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test197"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = customerSupport3.FindCustomerAddress(user8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test198"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test199"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerAddress(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test200"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.AnswerEmail("");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerPassword(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test201"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerPassword(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test202"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerPassword(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test203"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerUsername(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test204"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    boolean b25 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerEmail(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test205"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerAddress(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test206"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerEmail(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test207"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerNumber(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test208"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test209"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerUsername(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test210"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerAddress(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test211"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerNumber(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test212"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerPassword(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test213"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerAddress(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test214"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerEmail(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test215"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerEmail(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test216"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerEmail(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test217"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerNumber(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test218"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test219"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerUsername(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test220"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerAddress(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test221"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerEmail(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test222"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerNumber(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test223"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerAddress(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test224"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerNumber(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test225"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerEmail(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test226"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerAddress(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test227"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerEmail(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test228"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "hi!", "hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerAddress(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test229"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    boolean b25 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b29 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b33 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user34 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str35 = customerSupport3.FindCustomerNumber(user34);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test230"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerPassword(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test231"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerUsername(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test232"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerEmail(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test233"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    boolean b25 = customerSupport3.AnswerEmail("");
    boolean b27 = customerSupport3.AnswerEmail("");
    boolean b29 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = customerSupport3.FindCustomerAddress(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test234"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerAddress(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test235"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerAddress(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test236"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerNumber(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test237"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerAddress(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test238"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerEmail(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test239"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test240"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test241"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerPassword(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test242"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerEmail(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test243"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerNumber(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test244"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerAddress(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test245"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerAddress(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test246"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerNumber(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test247"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerPassword(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test248"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test249"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerAddress(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test250"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerUsername(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test251"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerEmail(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test252"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerUsername(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test253"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerNumber(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test254"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerNumber(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test255"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerAddress(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test256"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerAddress(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test257"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test258"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerNumber(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test259"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerNumber(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test260"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerPassword(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test261"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    boolean b25 = customerSupport3.AnswerEmail("");
    boolean b27 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerPassword(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test262"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerUsername(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test263"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerAddress(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test264"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerUsername(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test265"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerNumber(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test266"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b23 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerAddress(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test267"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerNumber(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test268"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test269"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test270"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerNumber(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test271"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b27 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerUsername(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test272"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerPassword(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test273"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerNumber(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test274"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test275"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test276"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerEmail(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test277"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerEmail(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test278"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerPassword(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test279"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerEmail(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test280"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test281"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerAddress(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test282"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerEmail(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test283"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.AnswerEmail("");
    boolean b27 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerUsername(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test284"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerEmail(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test285"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test286"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerPassword(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test287"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerEmail(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test288"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerEmail(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test289"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerUsername(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test290"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    boolean b27 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b31 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = customerSupport3.FindCustomerEmail(user32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test291"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b27 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerNumber(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test292"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test293"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerUsername(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test294"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerAddress(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test295"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test296"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerUsername(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test297"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test298"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b27 = customerSupport3.ReceiveEmail("");
    boolean b29 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = customerSupport3.FindCustomerUsername(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test299"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerNumber(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test300"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test301"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerPassword(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test302"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = customerSupport3.FindCustomerPassword(user32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test303"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerAddress(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test304"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerNumber(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test305"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerEmail(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test306"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test307"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerAddress(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test308"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerUsername(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test309"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerAddress(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test310"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b23 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerAddress(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test311"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerNumber(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test312"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test313"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerEmail(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test314"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test315"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerAddress(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test316"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerUsername(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test317"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerPassword(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test318"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerNumber(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test319"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerAddress(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test320"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerPassword(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test321"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test322"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b27 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = customerSupport3.FindCustomerUsername(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test323"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test324"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerNumber(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test325"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test326"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerNumber(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test327"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerPassword(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test328"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerPassword(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test329"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerAddress(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test330"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerNumber(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test331"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    boolean b27 = customerSupport3.AnswerEmail("");
    boolean b29 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = customerSupport3.FindCustomerEmail(user32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test332"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerNumber(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test333"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test334"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test335"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test336"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test337"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerEmail(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test338"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test339"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test340"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b31 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = customerSupport3.FindCustomerAddress(user32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test341"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerNumber(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test342"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerAddress(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test343"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerEmail(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test344"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerNumber(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test345"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerNumber(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test346"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    boolean b25 = customerSupport3.AnswerEmail("");
    boolean b27 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b31 = customerSupport3.ReceiveEmail("hi!");
    boolean b33 = customerSupport3.ReceiveEmail("hi!");
    boolean b35 = customerSupport3.AnswerEmail("");
    boolean b37 = customerSupport3.AnswerEmail("");
    boolean b39 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user40 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str41 = customerSupport3.FindCustomerAddress(user40);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test347"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test348"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerEmail(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test349"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    boolean b25 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b29 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b33 = customerSupport3.AnswerEmail("hi!");
    boolean b35 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user38 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str39 = customerSupport3.FindCustomerUsername(user38);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test350"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("");
    boolean b23 = customerSupport3.AnswerEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    boolean b27 = customerSupport3.AnswerEmail("");
    boolean b29 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = customerSupport3.FindCustomerPassword(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test351"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test352"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerNumber(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test353"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerNumber(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test354"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerAddress(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test355"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerEmail(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test356"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test357"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    boolean b27 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerAddress(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test358"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerPassword(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test359"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = customerSupport3.FindCustomerPassword(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test360"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerEmail(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test361"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerNumber(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test362"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerAddress(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test363"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b27 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerUsername(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test364"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b27 = customerSupport3.AnswerEmail("hi!");
    boolean b29 = customerSupport3.AnswerEmail("hi!");
    boolean b31 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = customerSupport3.FindCustomerAddress(user32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test365"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test366"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerUsername(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test367"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.AnswerEmail("");
    boolean b27 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = customerSupport3.FindCustomerNumber(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test368"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerAddress(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test369"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test370"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test371"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerUsername(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test372"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    boolean b27 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerNumber(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test373"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerNumber(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test374"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b27 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user30 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = customerSupport3.FindCustomerEmail(user30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test375"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerUsername(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test376"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerPassword(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test377"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerNumber(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test378"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    boolean b27 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerEmail(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test379"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerNumber(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test380"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerUsername(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test381"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("hi!");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerUsername(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test382"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    boolean b27 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerAddress(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test383"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test384"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerNumber(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test385"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerPassword(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test386"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test387"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerUsername(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test388"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    boolean b27 = customerSupport3.ReceiveEmail("");
    boolean b29 = customerSupport3.ReceiveEmail("");
    boolean b31 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = customerSupport3.FindCustomerNumber(user32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test389"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerUsername(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test390"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerUsername(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test391"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerPassword(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test392"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerNumber(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test393"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerEmail(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test394"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerEmail(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test395"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "hi!", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerPassword(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test396"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerPassword(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test397"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerNumber(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test398"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerAddress(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test399"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test400"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test401"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerAddress(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test402"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "hi!", "hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerEmail(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test403"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerEmail(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test404"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test405"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerAddress(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test406"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerAddress(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test407"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    boolean b27 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerPassword(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test408"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerNumber(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test409"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerUsername(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test410"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerAddress(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test411"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.AnswerEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerUsername(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test412"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = customerSupport3.FindCustomerAddress(user8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test413"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.AnswerEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerNumber(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test414"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerPassword(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test415"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerPassword(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test416"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerNumber(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test417"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerNumber(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test418"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerUsername(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test419"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test420"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerEmail(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test421"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerNumber(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test422"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerUsername(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test423"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerUsername(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test424"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerNumber(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test425"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerUsername(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test426"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerAddress(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test427"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerPassword(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test428"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerPassword(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test429"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerNumber(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test430"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerPassword(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test431"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerPassword(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test432"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerAddress(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test433"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerPassword(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test434"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test435"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerNumber(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test436"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerPassword(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test437"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerAddress(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test438"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerUsername(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test439"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerPassword(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test440"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test441"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerPassword(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test442"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerPassword(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test443"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerPassword(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test444"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test445"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b29 = customerSupport3.AnswerEmail("");
    boolean b31 = customerSupport3.ReceiveEmail("hi!");
    boolean b33 = customerSupport3.AnswerEmail("hi!");
    boolean b35 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user36 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str37 = customerSupport3.FindCustomerUsername(user36);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test446"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerPassword(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test447"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerAddress(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test448"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("");
    boolean b25 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerNumber(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test449"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    boolean b27 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerEmail(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test450"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerNumber(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test451"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerUsername(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test452"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = customerSupport3.FindCustomerNumber(user12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test453"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b23 = customerSupport3.AnswerEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerPassword(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test454"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerEmail(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test455"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerAddress(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test456"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b25 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerUsername(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test457"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = customerSupport3.FindCustomerEmail(user8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test458"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerUsername(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test459"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerPassword(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test460"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b23 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerEmail(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test461"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "hi!", "hi!");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerPassword(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test462"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerPassword(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test463"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerEmail(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test464"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerNumber(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test465"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerNumber(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test466"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test467"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerAddress(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test468"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("");
    boolean b27 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user28 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = customerSupport3.FindCustomerAddress(user28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test469"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerEmail(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test470"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerPassword(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test471"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerNumber(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test472"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerEmail(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test473"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerEmail(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test474"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerAddress(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test475"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    UseCase1And4.business.User user26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = customerSupport3.FindCustomerUsername(user26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test476"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b29 = customerSupport3.AnswerEmail("");
    boolean b31 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = customerSupport3.FindCustomerPassword(user32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test477"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerUsername(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test478"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerNumber(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test479"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerAddress(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test480"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b19 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerPassword(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test481"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerAddress(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test482"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerNumber(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test483"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = customerSupport3.FindCustomerNumber(user22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test484"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.AnswerEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerEmail(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test485"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerAddress(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test486"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    boolean b19 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerPassword(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test487"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.AnswerEmail("");
    boolean b17 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerNumber(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test488"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerAddress(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test489"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "hi!");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = customerSupport3.FindCustomerPassword(user14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test490"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.AnswerEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = customerSupport3.FindCustomerEmail(user20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test491"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("");
    boolean b13 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b17 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b21 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b31 = customerSupport3.AnswerEmail("hi!");
    UseCase1And4.business.User user32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = customerSupport3.FindCustomerUsername(user32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test492"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerPassword(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test493"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerPassword(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test494"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("hi!");
    boolean b19 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b25 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("");
    boolean b29 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    boolean b33 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b37 = customerSupport3.AnswerEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user40 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str41 = customerSupport3.FindCustomerUsername(user40);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test495"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "hi!", "hi!");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    UseCase1And4.business.User user10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = customerSupport3.FindCustomerUsername(user10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test496"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("hi!");
    boolean b11 = customerSupport3.AnswerEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    boolean b17 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerAddress(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test497"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("");
    boolean b15 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customerSupport3.FindCustomerNumber(user16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test498"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "", "");
    customerSupport3.SendEmail("");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    customerSupport3.SendEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("hi!");
    boolean b13 = customerSupport3.ReceiveEmail("hi!");
    boolean b15 = customerSupport3.ReceiveEmail("hi!");
    boolean b17 = customerSupport3.AnswerEmail("");
    UseCase1And4.business.User user18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = customerSupport3.FindCustomerPassword(user18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test499"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("", "hi!", "");
    boolean b5 = customerSupport3.AnswerEmail("hi!");
    boolean b7 = customerSupport3.ReceiveEmail("hi!");
    boolean b9 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("hi!");
    boolean b13 = customerSupport3.AnswerEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test500"); }

    UseCase3.presentation.CustomerSupport customerSupport3 = new UseCase3.presentation.CustomerSupport("hi!", "", "");
    boolean b5 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b9 = customerSupport3.AnswerEmail("hi!");
    boolean b11 = customerSupport3.ReceiveEmail("");
    customerSupport3.SendEmail("");
    boolean b15 = customerSupport3.AnswerEmail("hi!");
    customerSupport3.SendEmail("");
    customerSupport3.SendEmail("");
    boolean b21 = customerSupport3.AnswerEmail("");
    boolean b23 = customerSupport3.ReceiveEmail("");
    UseCase1And4.business.User user24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customerSupport3.FindCustomerNumber(user24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

}
